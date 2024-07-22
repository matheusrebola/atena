package atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID>{

}
