package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<OrderItem> orderItems = new ArrayList<>();

    private Delivery delivery;

    private Date orderDate;
    @ManyToOne
    private Member member;

    private OrderStatus orderStatus;
}
