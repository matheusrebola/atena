package atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.Tasks;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, UUID> {

}
