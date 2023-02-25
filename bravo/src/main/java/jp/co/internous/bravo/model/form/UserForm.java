package jp.co.internous.bravo.model.form;

import java.io.Serializable;

// 新規ユーザー登録のフォーム情報

public class UserForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private byte gender;
	private String newPassword;
	private String newPasswordConfirm;
	
	// getter と setter
	
	// ユーザー名を取得
	public String getUserName() {
		return userName;
	}
	
	// ユーザー名を設定
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// パスワードを取得
	public String getPassword() {
		return password;
	}
	// パスワードを設定
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 名字を取得
	public String getFamilyName() {
		return familyName;
	}
	// 名字を設定
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	// 名前を取得
	public String getFirstName() {
		return firstName;
	}
	// 名前を設定
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// 名字のふりがなを取得
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	// 名字のふりがなを設定
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	// 名前のふりがなを取得
	public String getFirstNameKana() {
		return firstNameKana;
	}
	// 名前のふりがなを設定
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	// 性別を取得
	public byte getGender() {
		return gender;
	}
	// 性別を設定
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
	}
	public void setNewPasswordConfirm(String newPasswordConfirm) {
		this.newPasswordConfirm = newPasswordConfirm;
	}
	
	

}
