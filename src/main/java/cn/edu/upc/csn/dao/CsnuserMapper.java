package cn.edu.upc.csn.dao;

import cn.edu.upc.csn.model.Csnuser;

public interface CsnuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table csnuser
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table csnuser
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    int insert(Csnuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table csnuser
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    int insertSelective(Csnuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table csnuser
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    int updateByPrimaryKeySelective(Csnuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table csnuser
     *
     * @mbg.generated Sat Aug 22 21:58:17 CST 2020
     */
    int updateByPrimaryKey(Csnuser record);
}