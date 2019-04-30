package com.example.tao.javaee_new.repository;

import com.example.tao.javaee_new.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository<user,Integer>完成对数据库操作
public interface UsrRepository extends JpaRepository<user,Integer> {

}
