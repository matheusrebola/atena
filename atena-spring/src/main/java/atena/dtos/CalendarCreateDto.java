package atena.dtos;

import java.time.LocalDateTime;

import atena.entities.Projects;

public record CalendarCreateDto(
		String titulo,
		String descricao,
		LocalDateTime dataEvento,
		Projects project) {

}
