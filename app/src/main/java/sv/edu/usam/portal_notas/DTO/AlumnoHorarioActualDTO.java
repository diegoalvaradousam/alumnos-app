package sv.edu.usam.portal_notas.DTO;

import java.util.List;

public class AlumnoHorarioActualDTO {
	private AlumnoDTO alumno;
	private List<HorarioDTO> horarios;

	public AlumnoHorarioActualDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoHorarioActualDTO(AlumnoDTO alumno, List<HorarioDTO> horarios) {
		super();
		this.alumno = alumno;
		this.horarios = horarios;
	}

	public AlumnoDTO getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoDTO alumno) {
		this.alumno = alumno;
	}

	public List<HorarioDTO> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorarioDTO> horarios) {
		this.horarios = horarios;
	}

}
