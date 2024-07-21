package br.org.gestao.atena.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.gestao.atena.entities.Integrations;

@Repository
public interface IntegrationRepository extends JpaRepository<UUID, Integrations> {

}
