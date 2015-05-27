import java.util.ArrayList;


public class GrupoNoUnitario extends Grupo {
	private ArrayList<Grupo> integrantes;
	
	public GrupoNoUnitario(String nombre, Usuario creador){
		
		this.integrantes = new ArrayList<Grupo>();
		this.integrantes.add(creador);
		this.id = nombre; 
		this.coordinador = creador.getCoordinador();
		this.archivos = new ArrayList<Archivo>();
		this.gruposAccesibles = new ArrayList<GrupoNoUnitario>();
		
	}
	
	public void addIntegrante(Grupo grupo){
		this.integrantes.add(grupo);
	}
	
	
}
