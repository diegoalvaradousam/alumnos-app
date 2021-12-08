package sv.edu.usam.portal_notas.DTO;

public class CicloDTO {
	private Integer id;
	private String nombre;
	private Integer numero;
	private Integer anio;

	public CicloDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CicloDTO(Integer id, String nombre, Integer numero, Integer anio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero= numero;
		this.anio = anio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnio() {
		return anio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}
}