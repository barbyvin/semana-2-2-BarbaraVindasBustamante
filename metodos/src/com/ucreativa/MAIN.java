/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
public class MAIN {

	/**
	 * 
	 */
	public MAIN() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televisor televisor1 = new Televisor("Negro", "Samsung", 60);
		
		System.out.println("Instancia 1");
		System.out.println(televisor1.toString());
		System.out.println("=========");

Telefono telefono1 = new Telefono("Platino", "Samsung", 1920);
		
		System.out.println("Instancia 1");
		System.out.println(telefono1.toString());
		System.out.println("=========");

Computadora computadora1 = new Computadora("Solido","Ergonomico",8);
		
		System.out.println("Instancia 1");
		System.out.println(computadora1.toString());
		System.out.println("=========");

		
		
		
	}
	
	
	
	
	
	

}
