package sv.edu.usam.portal_notas.DTO;

public class PagosDTO {
	private Integer id;
	private Integer numMes;
	private String fechaPago;
	private Boolean estaPagado;
	private Double cuota;
	private AlumnoDTO alumno;
	private CicloDTO ciclo;

	public PagosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagosDTO(Integer id, Integer numMes, String fechaPago, Boolean estaPagado, Double cuota, AlumnoDTO alumno,
			CicloDTO ciclo) {
		super();
		this.id = id;
		this.numMes = numMes;
		this.fechaPago = fechaPago;
		this.estaPagado = estaPagado;
		this.cuota = cuota;
		this.alumno = alumno;
		this.ciclo = ciclo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumMes() {
		return numMes;
	}

	public void setNumMes(Integer numMes) {
		this.numMes = numMes;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Boolean getEstaPagado() {
		return estaPagado;
	}

	public void setEstaPagado(Boolean estaPagado) {
		this.estaPagado = estaPagado;
	}

	public Double getCuota() {
		return cuota;
	}

	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}

	public AlumnoDTO getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoDTO alumno) {
		this.alumno = alumno;
	}

	public CicloDTO getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloDTO ciclo) {
		this.ciclo = ciclo;
	}
}
