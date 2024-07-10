package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue
    private Long id;
    private Address address;
    private String name;
    @OneToMany
    private List<Order> orders = new ArrayList<>();

}
