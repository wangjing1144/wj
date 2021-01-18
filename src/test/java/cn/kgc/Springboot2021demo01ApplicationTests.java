package cn.kgc;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class Springboot2021demo01ApplicationTests {
    @Autowired
    User user;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        System.out.println(user);
        userService.addUser();
    }

}
