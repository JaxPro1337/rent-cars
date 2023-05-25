package kg.mega.rentcars.repository;

import kg.mega.rentcars.models.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepo extends JpaRepository<Cars, Long> {

    List<Cars> findAllByIsActiveTrue();
}
