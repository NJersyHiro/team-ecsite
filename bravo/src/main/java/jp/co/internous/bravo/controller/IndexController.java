package jp.co.internous.bravo.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.bravo.model.domain.MstCategory;
import jp.co.internous.bravo.model.domain.MstProduct;
import jp.co.internous.bravo.model.form.SearchForm;
import jp.co.internous.bravo.model.mapper.MstCategoryMapper;
import jp.co.internous.bravo.model.mapper.MstProductMapper;
import jp.co.internous.bravo.model.session.LoginSession;

@Controller
@RequestMapping("/bravo")
public class IndexController {
	
	@Autowired
	LoginSession loginSession;
	
	@Autowired
	MstCategoryMapper mstCategoryMapper;
	
	@Autowired
	MstProductMapper mstProductMapper;
	

	@RequestMapping("/")
	public String index(Model m) {
		if(loginSession.isLogined() == false && loginSession.getTmpUserId() == 0 ) {
			Random rand = new Random();
			int tmpUserId = -rand.nextInt(900000000) - 100000000;
			loginSession.setTmpUserId(tmpUserId);
		}
		
		//DBからカテゴリ情報を取得しindexに渡す
		List<MstCategory> categoryList = mstCategoryMapper.findAll();
		//DBから商品一覧情報を取得しindexに渡す
		List<MstProduct> productList = mstProductMapper.findAll();
		m.addAttribute("categoryList", categoryList);
		m.addAttribute("productList", productList);
		m.addAttribute("selected", "未選択");
		m.addAttribute("loginSession", loginSession);
		return "index";
		
		
	}
	
	@RequestMapping("/searchItem")
	public String searchItem(SearchForm f, Model m) {
		List<MstProduct> productList = null;
		String keyword = f.getKeyword().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();
		if(f.getCategoryId() == 0) {
				productList = mstProductMapper.findByKeyword(keyword.split(" "));
		} else {
				productList = mstProductMapper.findByCategoryAndKeyword(f.getCategoryId(), keyword.split(" "));
		}
		
		List<MstCategory> categoryList = mstCategoryMapper.findAll();
	
		m.addAttribute("productList", productList);
		m.addAttribute("keyword", keyword);
		m.addAttribute("categoryList", categoryList);
		m.addAttribute("selected", f.getCategoryId());
		m.addAttribute("loginSession", loginSession);
		

		return "index";
		
	
	}
	
}
