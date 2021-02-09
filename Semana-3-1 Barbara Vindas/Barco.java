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
		private String protección;
		private int Velocidad;
		
		//getters Setters 
		
		public void setArmamento(String armamento) {
			this.armamento = armamento;
		}

		public String getProtección() {
			return protección;
		}

		public void setProtección(String protección) {
			this.protección = protección;
		}

		public int getVelocidad() {
			return Velocidad;
		}

		public void setVelocidad(int Velocidad) {
			Velocidad = Velocidad;
		}
		
	//Constructor
		
		
			public Barco(String armamento, String protección, int Velocidad) {
			super();
			this.armamento = armamento;
			this.protección = protección;
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
		return "Barco: armamento= " + armamento + "protección" + protección + "Velocidad" + Velocidad;
		}

				
	
		@Override
		protected void finalize() throws Throwable 
		{ 
	
		System.out.println("Velocidad destruida");
		System.out.println("armamento destruido");
		}
}
		

	
		