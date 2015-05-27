import java.util.ArrayList;

public class Dispositivo {
	private int puerto;
	private String ip;
	private ArrayList<ArchivoHold> archivos;
	
	public Dispositivo(int puerto, String ip){
		this.puerto = puerto;
		this.ip = ip;
		this.archivos = new ArrayList<ArchivoHold>();
	}
	
	public void addArchivo(ArchivoHold archivo){
		archivos.add(archivo);
	}
}
