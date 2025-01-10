package com.taehui.vibescribe.integration.user;

import com.taehui.vibescribe.entity.User;
import com.taehui.vibescribe.repository.UserJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest {
    private UserJpaRepository userRepository;

    @Autowired
    public UserServiceTest(UserJpaRepository userRepository){
        this.userRepository = userRepository;
    }
    @Test
    void testCreateAndRetrieveUser(){
        User user = new User();
        //user.setId(123);
        user.setUsername("test01");
        user.setPass("test01pass");
        User savedUser = userRepository.save(user);

        //assertThat(savedUser.getId()).isNotNull();
        assertThat(savedUser.getUsername()).isEqualTo("test01");
        assertThat(savedUser.getPass()).isEqualTo("test01pass");
    }
}
