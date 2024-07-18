package jpabook.jpashop.domain;

<<<<<<< HEAD
=======
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
>>>>>>> 57482069c8310f45ee20a9e9d48e413b7df9045d
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
<<<<<<< HEAD
    @Id @GeneratedValue
    private Long id;
    private Address address;
    private String name;
    @OneToMany
=======
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
>>>>>>> 57482069c8310f45ee20a9e9d48e413b7df9045d
    private List<Order> orders = new ArrayList<>();

}
