package app.repository.orders.impl;

import app.dao.Orders;
import app.repository.orders.OrdersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Slf4j
@Service
@AllArgsConstructor
public class OrdersRepositoryImpl implements OrdersRepository {
    private final EntityManager entityManager;
    @Override
    public void save(Orders order) {
            entityManager.getTransaction().begin();
            entityManager.persist(order);
            entityManager.getTransaction().commit();
            log.info("Order saved :",order);
    }

    @Override
    public Orders findById(Long id) {
        return null;
    }

}

