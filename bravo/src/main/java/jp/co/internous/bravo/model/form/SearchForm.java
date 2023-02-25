package jp.co.internous.bravo.model.form;

import java.io.Serializable;

public class SearchForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String keyword;
	private int categoryId;
	private String categoryName;
	
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


}
