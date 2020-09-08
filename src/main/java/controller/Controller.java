package controller;

import model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

@RestController
public class Controller {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderDTO orderDTO;

    @PostMapping(path = "/completeOrder")
    public void completeOrderStatus (OrderService orderService) {
        orderService.completeOrder(orderDTO);
        
    }


}
