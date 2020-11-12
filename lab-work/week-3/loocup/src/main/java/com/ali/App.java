package com.ali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user = context.getBean(User.class);
        Product product = context.getBean(Product.class);
        product.setName("moz");
        product.setPrice(20000);
        user.setName("ali");
        user.setLastName("piry");
        user.setProduct(product);
        System.out.println(product);
        System.out.println(user);
    }
}
