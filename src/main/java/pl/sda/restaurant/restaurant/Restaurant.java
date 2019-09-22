package pl.sda.restaurant.restaurant;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Restaurant {   // jedna z głównych klasa z jej polami
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private  String img;
    private RestaurantTag tag;   // przykład dla wielu private List<RestaurantTag> tags;
    @ManyToOne
    private Address address;
}
