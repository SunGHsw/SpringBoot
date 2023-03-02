package com.sun;

import com.sun.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot01YamlApplicationTests {
    @Autowired
    private User users;

    @Test
    void contextLoads() {
        System.out.println(users);
    }

}
