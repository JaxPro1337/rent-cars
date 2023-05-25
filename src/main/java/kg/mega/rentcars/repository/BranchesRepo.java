package kg.mega.rentcars.repository;

import kg.mega.rentcars.models.entity.Branches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchesRepo extends JpaRepository<Branches,Long> {
    List<Branches> findAllByIsActiveTrue();
}
