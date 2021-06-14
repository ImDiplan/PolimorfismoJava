package familia;
import humano.hombre.*;
import humano.mujer.*;
public class familia implements relacion{
	public familia(String nPadre, String nAbuelo,String nHijo,String nTio,String nMadre, String nAbuela,String nHija,String nTia, 
	int ePadre, int eAbuelo,int eHijo,int eTio,int eMadre, int eAbuela,int eHija,int eTia){
		padre.nombre = nPadre;
		padre.edad = ePadre;
		abuelo.nombre = nAbuelo;
		abuelo.edad = eAbuelo;
		hijo.nombre = nHijo;
		hijo.edad = eHijo;
		tio.nombre = nTio;
		tio.edad = eTio;
		madre.nombre = nMadre;
		madre.edad = eMadre;
		abuela.nombre = nAbuela;
		abuela.edad = eAbuela;
		hija.nombre = nHija;
		hija.edad = eHija;
		tia.nombre = nTia;
		tia.edad = eTia;
	}
	hombre padre = new hombre();
	hombre abuelo = new hombre();
	hombre hijo = new hombre();
	hombre tio = new hombre();
	mujer madre = new mujer();
	mujer abuela = new mujer();
	mujer hija = new mujer();
	mujer tia = new mujer();
	
	public void CenaFamiliar() {
		System.out.println("Estan cenando "+padre.nombre+" , "+abuelo.nombre+" , "+hijo.nombre+" , "+tio.nombre+" , "+madre.nombre+" , "+abuela.nombre+" , "+hija.nombre+" , "+tia.nombre);
		
	}
	public void TardeFamiliar() {
		System.out.println("Salieron al parque "+padre.nombre+" , "+abuelo.nombre+" , "+hijo.nombre+" , "+tio.nombre+" , "+madre.nombre+" , "+abuela.nombre+" , "+hija.nombre+" , "+tia.nombre);
		
	}
	public void Individual() {
		madre.CuidarNiños();
		padre.Trabajar();
		abuelo.comer();
		if(hijo.edad > 12) {
			hijo.JugarBaloncesto();
		} else {
			hijo.JugarCarritos();
		}
		if(hija.edad > 12) {
			hija.LeerNovelas();
		} else {
			hija.JugarMuñecas();
		}
		tio.Trabajar();
		tia.Trabajar();
		abuela.CuidarNiños();
	}
	@Override
	public void novios(familia familia1, familia familia2) {
		System.out.println(familia1.hijo.nombre+" y "+familia2.hija.nombre+" son novios.");
		
	}
	
}
