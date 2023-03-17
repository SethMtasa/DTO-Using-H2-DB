package seth.practice.dtojavaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seth.practice.dtojavaguides.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
