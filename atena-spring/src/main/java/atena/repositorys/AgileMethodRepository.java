package atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.AgileMethods;

@Repository
public interface AgileMethodRepository extends JpaRepository<AgileMethods, UUID>{

}
