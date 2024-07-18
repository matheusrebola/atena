package br.org.gestao.atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.gestao.atena.entities.Calendar;

public interface CalendarRepository extends JpaRepository<UUID, Calendar> {

}
