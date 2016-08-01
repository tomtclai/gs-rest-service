package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tlai2 on 8/1/16.
 */


// @SpringBootApplication
// adds all of the following:
// @Configuration - tags the class as a source of bean definitions for the applciation context
// @EnableAutoConfiguration - tells Spring Boot to start adding beans
// @EnableWebMvc - Spring boot adds this when it sees spring-webmvc on the classpath
// @ComponentScan - Spring to look for other components

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
