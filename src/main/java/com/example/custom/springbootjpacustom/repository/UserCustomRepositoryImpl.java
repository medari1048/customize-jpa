package com.example.custom.springbootjpacustom.repository;

import com.example.custom.springbootjpacustom.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserCustomRepositoryImpl implements UserCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> findByFirstName() {
        String sql = "select e from User e";
        final TypedQuery<User> query = entityManager.createQuery(sql, User.class);
        return query.getResultList();
    }
}
