package com.taehui.vibescribe.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private final JdbcTemplate jdbcTemplate;

    // 생성자 주입
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createUser(String username, String pass) {
        String sql = "INSERT INTO user (username, pass) VALUES (?, ?)";
        jdbcTemplate.update(sql, username, pass);
    }

    public int countUsers() {
        String sql = "SELECT COUNT(*) FROM user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}