package app.mapper;

import app.dao.Orders;
import app.dto.OrdersDto;

public class DaoOrders {
  public static Orders getOrder(OrdersDto ordersDto){
      return Orders.builder()
              .book(ordersDto.getBook())
              .user(ordersDto.getUser())
              .status(ordersDto.getStatus())
              .toDate(ordersDto.getToDate())
              .fromDate(ordersDto.getFromDate())
              .build();
  }
}
