package br.org.gestao.atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.gestao.atena.entities.TimeEntries;

@Repository
public interface TimeEntryRepository extends JpaRepository<UUID, TimeEntries> {

}
