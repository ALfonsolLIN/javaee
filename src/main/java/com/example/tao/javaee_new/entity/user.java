package com.example.tao.javaee_new.entity;

import javax.persistence.*;

//配置JPA注解映射关系
@Entity//告诉JPA 这是一个实体类用于（数据表映射）
@Table(name = "usr")//制定数据库对应表
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto incretmt
    private Integer id;
    @Column(name = "last_name",length = 50)
    private String last_name;
//    @Column(name = "email")
    @Column//上下两句是一样的
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
