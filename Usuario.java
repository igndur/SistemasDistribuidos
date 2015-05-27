import java.util.ArrayList;


public class Usuario extends Grupo {
	private String publicKey;
	private String privateKey;
	private ArrayList<Dispositivo> Dispositivos;
	
	public String getPublicKey() {
		return publicKey;
	}
	public ArrayList<Dispositivo> getDispositivos() {
		return Dispositivos;
	}
	public void addDispositivo(Dispositivo dispositivo) {
		Dispositivos.add(dispositivo);
	}
	public void crearArchivo(String path, Dispositivo dispositivo){
		Archivo archivo = new Archivo(this);
		ArchivoHold archivoHold = new ArchivoHold(path,archivo);
		dispositivo.addArchivo(archivoHold);
	}
	
}
