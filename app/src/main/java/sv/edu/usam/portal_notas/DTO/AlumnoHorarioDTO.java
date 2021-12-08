package sv.edu.usam.portal_notas.DTO;

public class AlumnoHorarioDTO {
	private Integer id;
	private boolean estado;
	private AlumnoDTO alumno;
	private HorarioDTO horario;

	public AlumnoHorarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoHorarioDTO(Integer id, boolean estado, AlumnoDTO alumno, HorarioDTO horario) {
		super();
		this.id = id;
		this.estado = estado;
		this.alumno = alumno;
		this.horario = horario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public AlumnoDTO getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoDTO alumno) {
		this.alumno = alumno;
	}

	public HorarioDTO getHorario() {
		return horario;
	}

	public void setHorario(HorarioDTO horario) {
		this.horario = horario;
	}

}
