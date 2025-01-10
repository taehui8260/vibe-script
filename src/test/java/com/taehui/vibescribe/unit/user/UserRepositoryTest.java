package com.taehui.vibescribe.unit.user;

import com.taehui.vibescribe.entity.User;
import com.taehui.vibescribe.repository.UserJpaRepository;
import com.taehui.vibescribe.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserRepositoryTest {

    @Mock
    private UserJpaRepository userRepository;

    @InjectMocks
    private UserService userService;
    @Test
    void testCreateAndRetrieveUser(){
        User user = new User();
        when(userRepository.save(user)).thenReturn(user);
        user.setUsername("test01");
        user.setPass("test01pass");
        User savedUser = userService.createUser(user);

        assertThat(savedUser.getUsername()).isEqualTo("test01");
        assertThat(savedUser.getPass()).isEqualTo("test01pass");
    }
}
