package kg.mega.rentcars.service;

import kg.mega.rentcars.models.dto.OrderDto;
import kg.mega.rentcars.models.entity.Orders;
import org.springframework.data.domain.Page;

import java.util.List;


public interface OrdersService {
    Orders appendOrder(OrderDto orderDto);

    Page<Orders> getOrdersList(Integer pageNo, Integer pageSize);

    List<Orders> getActiveOrdersList(Integer pageNo, Integer pageSize);
}
