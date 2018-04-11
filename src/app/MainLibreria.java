package app;

import domain.Libro;

public class MainLibreria {
	
	public static void main(String[] args) {
		
		Libro lib1=new Libro("Aprende Java EE", "Pildoras Informaticas", 0100);
		Libro lib2=new Libro("Aprende Java EE", "Pildoras Informaticas", 0100);
		Libro lib3=new Libro("Php para principiantes", "CodigoFacilito", 0200);
		
		if(lib1.equals(lib2)) {
			System.out.println("Son iguales ");
		}else {
			System.out.println("No son iguales ");
		}
	}

}
