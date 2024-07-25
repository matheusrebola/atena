package atena.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.TimeEntries;

@Repository
public interface TimeEntryRepository extends JpaRepository<TimeEntries, UUID> {

}
