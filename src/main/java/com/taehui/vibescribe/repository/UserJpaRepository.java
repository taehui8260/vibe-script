package com.taehui.vibescribe.repository;

import com.taehui.vibescribe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User,Integer> {
}
