package com.edu.bidlab.weshareiotservice.dao;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_type
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    private Byte categoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.variable
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    private String variable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_type
     *
     * @return the value of category.category_type
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public Byte getCategoryType() {
        return categoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_type
     *
     * @param categoryType the value for category.category_type
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public void setCategoryType(Byte categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.variable
     *
     * @return the value of category.variable
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public String getVariable() {
        return variable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.variable
     *
     * @param variable the value for category.variable
     *
     * @mbggenerated Tue Apr 07 10:36:47 CST 2020
     */
    public void setVariable(String variable) {
        this.variable = variable;
    }
}