package jpabook.jpashop.domain;

<<<<<<< HEAD
public class Address {
=======
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address() {

    }
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
>>>>>>> 57482069c8310f45ee20a9e9d48e413b7df9045d
}
