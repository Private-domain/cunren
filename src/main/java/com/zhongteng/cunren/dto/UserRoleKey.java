package com.zhongteng.cunren.dto;

public class UserRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.role_id
     *
     * @mbggenerated Wed Mar 29 18:36:59 CST 2017
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.user_id
     *
     * @mbggenerated Wed Mar 29 18:36:59 CST 2017
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.role_id
     *
     * @return the value of t_user_role.role_id
     *
     * @mbggenerated Wed Mar 29 18:36:59 CST 2017
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.role_id
     *
     * @param roleId the value for t_user_role.role_id
     *
     * @mbggenerated Wed Mar 29 18:36:59 CST 2017
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.user_id
     *
     * @return the value of t_user_role.user_id
     *
     * @mbggenerated Wed Mar 29 18:36:59 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.user_id
     *
     * @param userId the value for t_user_role.user_id
     *
     * @mbggenerated Wed Mar 29 18:36:59 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}