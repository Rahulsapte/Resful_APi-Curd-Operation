package com.nexus.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexus.main.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
