import java.io.Serializable;
import java.util.ArrayList;

public abstract class Grupo implements Serializable{
	protected String id;
	protected Dispositivo coordinador;
	protected ArrayList<GrupoNoUnitario> gruposAccesibles;
	protected ArrayList<Archivo> archivos;
	
	public Dispositivo getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(Dispositivo coordinador) {
		this.coordinador = coordinador;
	}
	public String getId() {
		return id;
	}
	public ArrayList<GrupoNoUnitario> getGruposAccesibles() {
		return gruposAccesibles;
	}
	public ArrayList<Archivo> getArchivos() {
		return archivos;
	}
	public void addArchivo(Archivo archivo){
		this.archivos.add(archivo);
	}
	public void addGrupo(GrupoNoUnitario grupo){
		this.gruposAccesibles.add(grupo);
	}
	
}