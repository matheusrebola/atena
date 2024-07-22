package atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.Integrations;

@Repository
public interface IntegrationRepository extends JpaRepository<Integrations, UUID> {

}
