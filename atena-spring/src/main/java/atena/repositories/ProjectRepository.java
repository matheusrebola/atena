package atena.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.Projects;

@Repository
public interface ProjectRepository extends JpaRepository<Projects, UUID> {

}
