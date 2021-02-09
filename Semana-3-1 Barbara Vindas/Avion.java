/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
public class Avion {
	//Class
		private String fuselaje;
		private int Longitud;
		private int pasajeros;
		
		//getters Setters 
		
		public String getFuselaje() {
			return fuselaje;
		}

		public void setFuselaje(String fuselaje) {
			this.fuselaje = fuselaje;
		}

		public int getLongitud() {
			return Longitud;
		}

		public void setLongitud(int longitud) {
			Longitud = longitud;
		}

		public int getPasajeros() {
			return pasajeros;
		}

		public void setTamano(int pasajeros) {
			this.pasajeros = pasajeros;
		}
		

	
				
	//Constructor
		
		
			public Avion(String fuselaje, int longitud, int pasajeros) {
			super();
			this.fuselaje = fuselaje;
			this.Longitud = longitud;
			this.pasajeros = pasajeros;
		}

		//Metodos
			
			

			public void diversion() {}
			public void transportar () {}
			
						
			
		//Overwrite
		
		public String getFuselaje1() {
			return fuselaje;
		}
		
		//Overwrite
			
		public String toString() {
		return "Avion: fuselaje= " + fuselaje + "longitud" + Longitud + "pasajeros" + pasajeros;
		}

				
	
		@Override
		protected void finalize() throws Throwable 
		{ 
	
		System.out.println("fuselaje destruida");
		System.out.println("pasajeros destruido");
		}
}
		

	
		