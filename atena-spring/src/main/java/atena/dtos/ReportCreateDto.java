package atena.dtos;

import java.time.LocalDateTime;

import atena.entities.Projects;
import atena.entities.TipoRelatorio;

public record ReportCreateDto(
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo,
		Projects project) {

}
