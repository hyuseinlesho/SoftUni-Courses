package bg.softuni.mobilelele.repository;

import bg.softuni.mobilelele.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    Model findByName(String name);
}
