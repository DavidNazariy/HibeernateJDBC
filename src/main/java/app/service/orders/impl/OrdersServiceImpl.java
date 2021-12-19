package app.service.orders.impl;

import app.dao.Orders;
import app.dto.OrdersDto;
import app.repository.orders.OrdersRepository;
import app.service.orders.OrdersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static app.mapper.DaoOrders.getOrder;

@Slf4j
@Service
@AllArgsConstructor
public class OrdersServiceImpl implements OrdersService {
    private final OrdersRepository ordersRepository;

    @Override
    public void save(OrdersDto orderDto) {
        ordersRepository.save(getOrder(orderDto));
    }

    @Override
    public Orders findById(Long id) {
        return null;
    }

}



