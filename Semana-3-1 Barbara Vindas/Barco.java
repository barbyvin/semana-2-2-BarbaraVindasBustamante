/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
public class Barco {
	//Class
		private String armamento;
		private String protecci�n;
		private int Velocidad;
		
		//getters Setters 
		
		public void setArmamento(String armamento) {
			this.armamento = armamento;
		}

		public String getProtecci�n() {
			return protecci�n;
		}

		public void setProtecci�n(String protecci�n) {
			this.protecci�n = protecci�n;
		}

		public int getVelocidad() {
			return Velocidad;
		}

		public void setVelocidad(int Velocidad) {
			Velocidad = Velocidad;
		}
		
	//Constructor
		
		
			public Barco(String armamento, String protecci�n, int Velocidad) {
			super();
			this.armamento = armamento;
			this.protecci�n = protecci�n;
			this.Velocidad = Velocidad;
		}

		//Metodos
			
			public void navegar() {}
			public void transportar () {}
			
						
			
		//Overwrite
		
		public String getArmamento() {
			return armamento;
		}
		
		//Overwrite
			
		public String toString() {
		return "Barco: armamento= " + armamento + "protecci�n" + protecci�n + "Velocidad" + Velocidad;
		}

				
	
		@Override
		protected void finalize() throws Throwable 
		{ 
	
		System.out.println("Velocidad destruida");
		System.out.println("armamento destruido");
		}
}
		

	
		