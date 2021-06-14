package main;
import familia.familia;
public class App {

	public static void main(String[] args) {
		familia FamiliaMartinez = new familia("José","Mateo","Luis","Victor","Angela","Juana","Rachel","Susana",42,65,17,40,40,62,7,37);
		familia FamiliaSanchez = new familia("Manuel","Cristopher","Samuel","Pedro","Glenys","Dorila","Nicol","Manuela",42,65,7,40,40,62,17,37);
		FamiliaMartinez.CenaFamiliar();
		FamiliaSanchez.TardeFamiliar();
		FamiliaMartinez.novios(FamiliaMartinez, FamiliaSanchez);
		FamiliaMartinez.Individual();
		FamiliaSanchez.Individual();
		
	}

}
