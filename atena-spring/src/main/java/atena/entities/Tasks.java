package atena.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Tasks(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String titulo,
		String descricao,
		LocalDate prazo,
		StatusTarefa statusTarefa,
		LocalDateTime dataCricao,
		LocalDateTime dataAtualizacao,
		Projects project,
		Users user) 
{

}
