package br.org.gestao.atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.gestao.atena.entities.Reports;

public interface ReportRepository extends JpaRepository<UUID, Reports> {

}
