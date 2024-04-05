package com.example.whyjasypt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class WhyJasyptApplication {

    public static String one;

    @Autowired
    public WhyJasyptApplication(@Value("${mysecret_two}") String one) {
        this.one = one;
    }


    public static void main(String[] args) {

        SpringApplication.run(WhyJasyptApplication.class, args);
        printOne();

    }

    private static void printOne() {
        System.out.println(one);
    }


}
