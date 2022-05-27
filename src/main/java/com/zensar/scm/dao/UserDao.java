package com.zensar.scm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.scm.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
