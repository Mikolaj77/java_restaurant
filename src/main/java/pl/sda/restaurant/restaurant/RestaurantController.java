package pl.sda.restaurant.restaurant;

import org.springframework.stereotype.Controller;  // Controller odpowiada za całą kontrole w naszym programie
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/restaurants")
                                        // w controllerze sa same servisy
public class RestaurantController {
    private RestaurantService restaurantService;
    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

    @GetMapping                              //
    public ModelAndView allRestaurants(){
        ModelAndView modelAndView = new ModelAndView("restaurant/allRestaurants");
        modelAndView.addObject("restaurants", restaurantService.findAll());
        return modelAndView;
    }
}
