package com.example.multimodule.application;

import com.example.multimodule.service.MyService;
import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    private MyService myService;

    @Test
    public void contextLoads() {

        ImmutableSet.of(1, 2, 3);
        assertThat(myService.message() + "meh").isNotNull();
    }

}
