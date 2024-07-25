package atena.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, UUID> {

}
