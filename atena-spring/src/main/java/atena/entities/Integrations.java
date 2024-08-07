package atena.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Integrations(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String configuracao,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) 
{

}
