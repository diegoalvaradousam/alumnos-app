package sv.edu.usam.portal_notas.DTO;

public class HorarioDTO {
	private Integer id;
	private String horaInicio;
	private String horaFin;
	private String dia;
	private MateriaDTO materia;
	private CicloDTO ciclo;

	public HorarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HorarioDTO(Integer id, String horaInicio, String horaFin, String dia, MateriaDTO materia, CicloDTO ciclo) {
		super();
		this.id = id;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dia = dia;
		this.materia = materia;
		this.ciclo = ciclo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public MateriaDTO getMateria() {
		return materia;
	}

	public void setMateria(MateriaDTO materia) {
		this.materia = materia;
	}

	public CicloDTO getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloDTO ciclo) {
		this.ciclo = ciclo;
	}
}
