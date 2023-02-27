package com.lening.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: day-03
 * @author: 杨熠烜
 * @create: 2022-07-05 14:21
 **/

public class StudentBean implements Serializable {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private Date birthday;
    private String address;
    private String gradename;
    //这个eage是按照年龄范围查询的时候使用的，数据库不需要
    private Integer eage;

    public Integer getEage() {
        return eage;
    }

    public void setEage(Integer eage) {
        this.eage = eage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGradename() {
        return gradename;
    }

    public void setGradename(String gradename) {
        this.gradename = gradename;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", gradename='" + gradename + '\'' +
                ", eage=" + eage +
                '}';
    }

    public StudentBean() {
    }

    public StudentBean(Long id, String name, String sex, Integer age, Date birthday, String address, String gradename, Integer eage) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.gradename = gradename;
        this.eage = eage;
    }

    public StudentBean(Long id, String name, String sex, Integer age, Date birthday, String address, String gradename) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.gradename = gradename;
    }
}
