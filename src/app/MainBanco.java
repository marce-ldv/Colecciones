package app;

import domain.Cliente;
import java.util.Set;
import java.util.HashSet;

public class MainBanco {
	
	public static void main(String[] args) {
		
		Cliente c1=new Cliente("Marcelo Sanchez","0001",10000);
		Cliente c2=new Cliente("Guillermo Sanchez","0002",20000);
		Cliente c3=new Cliente("Pepe Muleiro","0003",5000);
		Cliente c4=new Cliente("Ariadna perez","0004",7000);
		
		Set<Cliente> coleccionClientes=new HashSet<>(); //0 ordenacion
		
		coleccionClientes.add(c1);
		coleccionClientes.add(c2);
		coleccionClientes.add(c3);
		coleccionClientes.add(c4);
		
		for(Cliente cliente: coleccionClientes) {
			System.out.println(cliente.getNombreCliente()+" "+
			cliente.getNum_cuenta()+" "+cliente.getSueldo());
		}
		
	}
}
