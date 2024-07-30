package atena.dtos;

import java.time.LocalDateTime;

import atena.entities.Tasks;

public record TimeEntryCreateDto(
		LocalDateTime tempoGasto,
		LocalDateTime dataRegistro,
		Tasks task) {

}
