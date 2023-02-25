package jp.co.internous.bravo.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.bravo.model.domain.MstUser;
import jp.co.internous.bravo.model.form.UserForm;

@Mapper
public interface MstUserMapper {
	
	/**
	 * ユーザー名の検索
	 */
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName}")
	MstUser findByUserName(@Param("userName") String userName);
	
	/**
	 * ユーザーの検索
	 */
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword(
			@Param("userName") String userName,
			@Param("password") String password);
	
	@Select("SLECT * FROM mst_user")
	List<MstUser> findAll();
	
	/**
	 * 新規ユーザー登録
	 */
	@Insert("INSERT INTO mst_user (user_name, password, family_name, first_name, family_name_kana, first_name_kana, gender) " +
			"VALUES (#{userName}, #{password}, #{familyName}, #{firstName}, #{familyNameKana}, #{firstNameKana}, #{gender})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(MstUser users);
	
	/**
	 * パスワードの更新
	 */
	@Update("UPDATE mst_user SET password = #{newPassword}, updated_at = now() WHERE user_name = #{userName}")
	void updatePassword(
			@Param("userName") String userName,
			@Param("newPassword") String newPassword);
	
}
