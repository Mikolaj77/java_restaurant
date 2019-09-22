package pl.sda.restaurant.restaurant;

import org.springframework.data.repository.CrudRepository;  // reposytoria to zawsze sa intrfejsy

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
}
