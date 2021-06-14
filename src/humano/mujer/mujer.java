package humano.mujer;

import humano.humano;

public class mujer extends humano implements niña, adolescente, adulta{
	public String nombre;
	public final String genero="femenino";
	public int edad;
	public mujer(){
		super();
		System.out.println("Se le ha asignado el genero femenino");
	}
	public void respirar() {
		System.out.println(nombre+" está respirando.");
	}
	public void caminar() {
		System.out.println("Una mujer está caminando.");
	}
	public void comer() {
		System.out.println(nombre+" está comiendo.");
	}
	
	public void genero() {
		System.out.println(nombre+" pertenece al género "+genero);
	}
	@Override
	public void Trabajar() {
		System.out.println("Trabajando como toda una dama");		
		
	}
	@Override
	public void CuidarNiños() {
		System.out.println("Cuidando a los niños");
	}
	@Override
	public void JugarMuñecas() {
		System.out.println("Jugando con muñecas");
		
	}
	@Override
	public void ColorFavorito() {
		System.out.println("El color favorito es rosado");
		
	}
	@Override
	public void Volleyball() {
		System.out.println("Jugando volleyball");		
	}
	@Override
	public void LeerNovelas() {
		System.out.println("Leyendo novelas");
		
	}
}
