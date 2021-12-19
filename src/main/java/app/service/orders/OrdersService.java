package app.service.orders;


import app.dao.Orders;
import app.dto.OrdersDto;

public interface OrdersService {
    void save(OrdersDto ordersDto);
    Orders findById(Long id);
}
