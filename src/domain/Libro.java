package domain;

public class Libro {
	
	private String nombreLibro,autor;
	private int ISBN;
	
	public Libro(String nom,String autor,int isbn) {
		this.nombreLibro=nom;
		this.autor=autor;
		this.ISBN=isbn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Libro) {
			Libro otroLibro = (Libro)obj; //enmascaramiento
			if(this.ISBN==otroLibro.ISBN) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public String getDatos() {
		return "Nombre del libro: "+this.nombreLibro+" Autor: "+
		this.autor+" ISBN: "+this.ISBN;
	}
	
	public String getNombreLibro() {
		return this.nombreLibro;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getISBN() {
		return this.ISBN;
	}

}
