package com.yc.demo.mapper;

import com.yc.demo.domain.TbPdfInfo;
import com.yc.demo.domain.TbPdfInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPdfInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    long countByExample(TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int deleteByExample(TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int insert(TbPdfInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int insertSelective(TbPdfInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    List<TbPdfInfo> selectByExampleWithBLOBs(TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    List<TbPdfInfo> selectByExample(TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    TbPdfInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int updateByExampleSelective(@Param("record") TbPdfInfo record, @Param("example") TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") TbPdfInfo record, @Param("example") TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int updateByExample(@Param("record") TbPdfInfo record, @Param("example") TbPdfInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int updateByPrimaryKeySelective(TbPdfInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(TbPdfInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_pdf_info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    int updateByPrimaryKey(TbPdfInfo record);
}