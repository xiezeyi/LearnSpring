package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//这里这个注解的意思，就是说明这个类被Spring接管了 也就是注册到容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("谢谢")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
