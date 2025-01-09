package com.taehui.vibescribe.user;

import com.taehui.vibescribe.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

@JdbcTest
@Import(UserRepository.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void test(){
        // 사용자 추가
        userRepository.createUser("testuser", "oass");

        // 사용자 수 확인
        int userCount = userRepository.countUsers();
        //assertThat(userCount).isEqualTo(1);
    }
}
