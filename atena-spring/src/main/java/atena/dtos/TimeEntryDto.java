package atena.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import atena.entities.Tasks;
import jakarta.validation.constraints.NotNull;

public record TimeEntryDto(
		@NotNull UUID id,
		LocalDateTime tempoGasto,
		LocalDateTime dataRegistro,
		Tasks task) {

}
