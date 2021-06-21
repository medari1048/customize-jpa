package com.example.custom.springbootjpacustom.repository;

import com.example.custom.springbootjpacustom.model.User;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface UserCustomRepository {
    List<User> findByFirstName();
}
