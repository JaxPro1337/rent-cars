package kg.mega.rentcars.repository;

import kg.mega.rentcars.models.entity.Orders;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<Orders,Long> {

    @Query(value = "select o from Orders o join OrderHistories oh on oh.ordersId.id=o.id where oh.status = 'NEW'")
    List<Orders> findActiveOrders(Pageable pageable);

}
