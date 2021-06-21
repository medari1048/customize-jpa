package com.example.custom.springbootjpacustom.repository;

import com.example.custom.springbootjpacustom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>, UserCustomRepository {

}
