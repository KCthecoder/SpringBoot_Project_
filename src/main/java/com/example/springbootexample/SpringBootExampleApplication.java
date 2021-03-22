package com.example.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.io.IOException;

import static com.example.springbootexample.controller.PingRestController.getStatus;

@SpringBootApplication
@ServletComponentScan
public class SpringBootExampleApplication {

  public static void main(final String[] args) throws IOException {

    SpringApplication.run(SpringBootExampleApplication.class, args);


     }

}
