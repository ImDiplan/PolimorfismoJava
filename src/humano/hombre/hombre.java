package humano.hombre;
import humano.humano;

public class hombre extends humano implements niño, adolescente, adulto {
	public hombre(){
		super();
		System.out.println("Se le ha asignado el genero masculino");
	}
	public String nombre;
	public final String genero="masculino";
	public int edad;
	public void respirar() {
		System.out.println(nombre+" está respirando.");
	}
	public void caminar() {
		System.out.println("Un hombre está caminando.");
	}
	public void comer() {
		System.out.println(nombre+" está comiendo");
	}
	public void sexo() {
		System.out.println(nombre+" pertenece al sexo "+genero);
	}
	@Override
	public void Trabajar() {
	System.out.println("Trabajando como todo un hombre");	
	}
	@Override
	public void JugarBaloncesto() {
		System.out.println("Jungando baloncesto");	
	}
	@Override
	public void JugarCarritos() {
		System.out.println("Jugando con carritos");	
	}
	@Override
	public void ColorFavorito() {
		System.out.println("El color favorito es azul.");	
	}
}