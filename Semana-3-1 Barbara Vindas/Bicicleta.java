/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
public class Bicicleta {
	//Class
		private String marca;
		private String tipo;
		private int tamano;
		
		//getters Setters 
		
		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTamano(int tamano) {
			this.tamano = tamano;
		}

	
				
	//Constructor
		
		
			public Bicicleta(String marca, String tipo, int tamano) {
			super();
			this.marca = marca;
			this.tipo = tipo;
			this.tamano = tamano;
		}

		//Metodos
			
			public void diversion() {}
			public void transportar () {}
			
						
			
		//Overwrite
		
		public String getMarca() {
			return marca;
		}
		
		//Overwrite
			
		public String toString() {
		return "bicicleta: marca= " + marca + "tipo" + tipo + "tamano" + tamano;
		}

				
	
		@Override
		protected void finalize() throws Throwable 
		{ 
	
		System.out.println("marca destruida");
		System.out.println("tipo destruido");
		}
}
		

	
		