package atena.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atena.entities.Reports;

@Repository
public interface ReportRepository extends JpaRepository<Reports, UUID> {

}
