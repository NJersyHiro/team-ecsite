package jp.co.internous.bravo.model.domain;

import java.sql.Timestamp;
import jp.co.internous.bravo.model.form.UserForm;


public class MstUser {
	
	// フィールド
	private int id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private byte gender;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	// コンストラクタ
	public MstUser() {}
	
	public MstUser(int id, String userName, String password, String familyName, String firstName, String familyNameKana,
			String firstNameKana, byte gender, Timestamp createdAt, Timestamp updatedAt) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.familyName = familyName;
		this.firstName = firstName;
		this.familyNameKana = familyNameKana;
		this.firstNameKana = firstNameKana;
		this.gender = gender;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public MstUser(UserForm f) {
		userName = f.getUserName();
		password = f.getPassword();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		familyNameKana = f.getFamilyNameKana();
		firstNameKana = f.getFirstNameKana();
		gender = f.getGender();
	}
	
	// IDを取得する
	public int getId() {
		return id;
	}
	// IDを設定する
	public void setId(int id) {
		this.id = id;
	}
	
	// ユーザー名を取得する
	public String getUserName() {
		return userName;
	}
	// ユーザー名を設定する
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// パスワードを取得する
	public String getPassword() {
		return password;
	}
	// パスワードを設定する
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 名字を取得する
	public String getFamilyName() {
		return familyName;
	}
	// 名字を設定する
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	// 名前を取得する
	public String getFirstName() {
		return firstName;
	}
	// 名前を設定する
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// 名字のふりがなを取得する
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	// 名字のふりがなを設定する
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	
	// 名前のふりがなを取得する
	public String getFirstNameKana() {
		return firstNameKana;
	}
	// 名前のふりがなを設定する
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	// 性別を取得する
	public byte getGender() {
		return gender;
	}
	// 性別を設定する
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	// アカウトの作成日時を取得する
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	// アカウトの作成日時を設定する
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	// アカウトの更新日時を取得する
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	// アカウトの更新日時を設定する
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	

}
