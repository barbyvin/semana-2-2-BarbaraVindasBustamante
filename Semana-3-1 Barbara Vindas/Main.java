/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Barco barco1 = new Barco("cohetes y lanzadores de misiles ","Protección marítima y piratería", 511);
					
					System.out.println("Instancia 1");
					System.out.println(barco1.toString());
					System.out.println("=========");
				
					
					barco1= null;
					System.gc();
					
	
			Bicicleta Bicicleta1 = new Bicicleta("Montana ","BMX", 26);
					
					System.out.println("Instancia 1");
					System.out.println(Bicicleta1.toString());
					System.out.println("=========");
				
					
					Bicicleta1= null;
					System.gc();		
		
					
			Avion Avion1 = new Avion("tipo ancho ", 70, 550);
					
					System.out.println("Instancia 1");
					System.out.println(Avion1.toString());
					System.out.println("=========");
				
					
					Avion1= null;
					System.gc();		

					
					
				}

	}


