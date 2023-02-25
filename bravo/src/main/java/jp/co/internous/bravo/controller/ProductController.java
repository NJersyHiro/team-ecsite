package jp.co.internous.bravo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.bravo.model.domain.MstProduct;
import jp.co.internous.bravo.model.mapper.MstProductMapper;
import jp.co.internous.bravo.model.session.LoginSession;


@Controller
@RequestMapping("/bravo/product")  // URL(localhost:8080/bravo/product)　でアクセスできるようにする。
public class ProductController {	
	
	@Autowired
	private LoginSession loginSession;
	
	@Autowired
	private MstProductMapper productMapper;

	
	@RequestMapping("/{id}")  //　リクエストを受け取った際に、受けっとったidの商品情報を引出しproduct_detailに返す。
	public String index(@PathVariable("id") int productId, Model m) {
		List<MstProduct> product = productMapper.findByProductId(productId);
		m.addAttribute("product", product);
		m.addAttribute("loginSession", loginSession);
		return "product_detail";
		}

	}
	


