package mx.edu.utng.ws;

public class Vaso {
	private int id;
	private String nombre;
	private String color;
	private String tamanio;
	private String activo;
	
	public Vaso(int id, String nombre, String color, String tamanio, String activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.tamanio = tamanio;
		this.activo = activo;
	}
	
	public Vaso(){
		this(0,"","","","");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Vaso [id=" + id + ", nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + ", activo="
				+ activo + "]";
	}
	
	
	
}
