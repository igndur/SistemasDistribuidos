import java.util.ArrayList;


public class Archivo {
	private Usuario propietario;
	private ArrayList<Grupo> holders;
	
	public Archivo(Usuario creador){
		this.propietario = creador;
		holders = new ArrayList<Grupo>();
		holders.add(creador);
	}
	
	
}
