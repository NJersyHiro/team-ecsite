package jp.co.internous.bravo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.bravo.model.domain.MstUser;
import jp.co.internous.bravo.model.form.UserForm;
import jp.co.internous.bravo.model.mapper.MstUserMapper;
import jp.co.internous.bravo.model.session.LoginSession;

@Controller
@RequestMapping("/bravo/user")
public class UserController {

	@Autowired
	private MstUserMapper mstUserMapper;

	@Autowired
	private LoginSession loginSession;

	@RequestMapping("/")
	public String index(Model m) {

		m.addAttribute("loginSession", loginSession);

		return "register_user";
	}
	
	/**
	 * ユーザー名の重複確認
	 */
	@RequestMapping("/duplicatedUserName")
	@ResponseBody
	public String duplicatedUserName(@RequestBody UserForm form) {
		
		 // DBに存在するユーザー名と同じものがあるか探す
		 MstUser users = mstUserMapper.findByUserName(form.getUserName());
		 
		 // 判定
		 if(null == users) {
			return "OK"; 
		} else {
			return "NG"; 
		}
		 
	}

	/**
	 * 新規ユーザー登録
	 */
	@RequestMapping("/register")
	@ResponseBody
	public String register(@RequestBody UserForm form) {

		// 新しくインスタンス作成
		MstUser u = new MstUser();

		// 受け取ったユーザー情報をそれぞれMstUserに入れる
		u.setUserName(form.getUserName());
		u.setPassword(form.getPassword());
		u.setFamilyName(form.getFamilyName());
		u.setFirstName(form.getFirstName());
		u.setFamilyNameKana(form.getFamilyNameKana());
		u.setFirstNameKana(form.getFirstNameKana());
		u.setGender(form.getGender());

		try {
			// 登録
			mstUserMapper.insert(u);
			
		} catch(IllegalStateException e) {
			
			System.out.println("IllegalStateException" + e.getMessage());
			
		} catch(Exception ee){
			
			System.out.println("Exception:" + ee.getMessage());
		}
		
		return "";
	}
}
