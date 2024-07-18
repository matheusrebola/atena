package br.org.gestao.atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.gestao.atena.entities.Integrations;

public interface IntegrationRepository extends JpaRepository<UUID, Integrations> {

}
