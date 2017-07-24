package com.megalink.study.model.nochange;

import java.util.Date;

public class Hansen {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hansen02.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hansen02.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hansen02.birth
     *
     * @mbggenerated
     */
    private Date birth;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hansen02.id
     *
     * @return the value of hansen02.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hansen02.id
     *
     * @param id the value for hansen02.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hansen02.name
     *
     * @return the value of hansen02.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hansen02.name
     *
     * @param name the value for hansen02.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hansen02.birth
     *
     * @return the value of hansen02.birth
     *
     * @mbggenerated
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hansen02.birth
     *
     * @param birth the value for hansen02.birth
     *
     * @mbggenerated
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hansen02
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", birth=").append(birth);
        sb.append("]");
        return sb.toString();
    }
}