package com.sp.Admin.mapper;

import java.util.List;
import com.sp.Admin.pojo.ec_users;
import com.sp.Admin.pojo.ec_usersExample;

public interface ec_usersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    int insert(ec_users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    int insertSelective(ec_users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    List<ec_users> selectByExample(ec_usersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    ec_users selectByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ec_users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ec_users
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ec_users record);

	List<ec_users> getuser();
}