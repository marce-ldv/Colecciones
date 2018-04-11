package domain;

public class Cliente {
	
	private String nombreCliente;
	private String num_cuenta;
	private double sueldo;
	
	public Cliente(String nombre, String num_cuenta, double sueldo) {
		this.nombreCliente = nombre;
		this.num_cuenta = num_cuenta;
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cliente) {
			Cliente otro = (Cliente)obj;
			if(this.num_cuenta==otro.num_cuenta) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
	
	
}
