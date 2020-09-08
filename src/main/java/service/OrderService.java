package service;

import model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderDTO orderDTO;

    public void completeOrder(OrderDTO orderDTO){

        orderDTO.setIsOrderComplete(true);

    }
}
