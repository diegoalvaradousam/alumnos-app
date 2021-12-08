package sv.edu.usam.portal_notas.DTO;

public class MateriaDTO {

	private Integer id;
	private String nombre;
	private boolean estado;

	public MateriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MateriaDTO(Integer id, String nombre, boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
