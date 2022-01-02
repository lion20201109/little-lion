package com.jyc.lion.xsz;

import com.jyc.lion.xsz.controller.EchoController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@Slf4j
@SpringBootApplication
public class LionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LionApplication.class, args);
        String uuid = UUID.randomUUID().toString().substring(0,4);
        log.info("this application uuid is:{}",uuid);
        EchoController.uuid = uuid;
    }

}
