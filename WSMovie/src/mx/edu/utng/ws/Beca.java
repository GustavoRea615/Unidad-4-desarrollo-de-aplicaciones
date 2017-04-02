package mx.edu.utng.ws;

public class Beca {
	private int id;
    private String persona;
    private String personal;
    private int tipo;
    private int cantidad;
	
	

	public Beca(int id, String persona, String personal, int tipo, int cantidad) {
		super();
		this.id = id;
		this.persona = persona;
		this.personal = personal;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public Beca() {
		this(0,"","",0,0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Beca [id=" + id + ", persona=" + persona + ", personal=" + personal + ", tipo=" + tipo + ", cantidad="
				+ cantidad + "]";
	}
	
	
}
