package tech.rovy.rovypicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("tech.rovy.rovypicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class RovyPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RovyPictureBackendApplication.class, args);
    }

}
