package atena.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import atena.entities.Projects;
import atena.entities.TipoRelatorio;
import jakarta.validation.constraints.NotNull;

public record ReportDto(
		@NotNull UUID id,
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo,
		Projects project) {

}
