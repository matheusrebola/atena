package atena.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import atena.entities.Projects;
import jakarta.validation.constraints.NotNull;

public record CalendarDto(
		@NotNull UUID id,
		String titulo,
		String descricao,
		LocalDateTime dataEvento,
		Projects project) {

}
