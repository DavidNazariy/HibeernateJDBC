package app.repository.orders;


import app.dao.Orders;

public interface OrdersRepository {
    void save(Orders order);
    Orders findById(Long id);
}
