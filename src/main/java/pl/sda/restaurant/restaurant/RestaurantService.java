package pl.sda.restaurant.restaurant;

import org.springframework.stereotype.Service;

@Service

public class RestaurantService {
    private RestaurantRepository restaurantRepository;
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Iterable<Restaurant> findAll() {
        return restaurantRepository.findAll();

    }
}
