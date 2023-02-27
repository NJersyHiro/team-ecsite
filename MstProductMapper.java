package jp.co.internous.bravo.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.bravo.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {
	
	@Select("SELECT * FROM mst_product")
	List<MstProduct> findAll();
	
	/**
	 * キーワード（商品名）を条件に商品情報を取得する
	 * @return 商品情報リスト
	 */
	List<MstProduct> findByKeyword(@Param("keyword") String[] keyword);
	
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	List<MstProduct> findByProductId(int productId);
	
	List<MstProduct> findByCategoryAndKeyword(@Param("categoryId") int categoryId, @Param("keyword") String[] keyword);
	
}
