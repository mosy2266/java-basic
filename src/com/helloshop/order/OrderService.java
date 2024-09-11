package com.helloshop.order;

//다른 패키지(product, user)의 클래스가 필요 -> import
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {
    public void Order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
