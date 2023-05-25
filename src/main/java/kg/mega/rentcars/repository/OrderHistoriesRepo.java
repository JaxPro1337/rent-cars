package kg.mega.rentcars.repository;

import kg.mega.rentcars.models.entity.OrderHistories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoriesRepo extends JpaRepository<OrderHistories, Long> {
}
