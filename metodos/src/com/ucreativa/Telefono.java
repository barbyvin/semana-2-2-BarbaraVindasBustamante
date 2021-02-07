/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
//Class

public class Telefono {
	private String color;
	private String marca;
	private int resolucion;


	//getters Setters 

public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	

	//Constructor
	
		public Telefono(String color, String marca, int resolucion) {
			this.color = color;
			this.marca = marca;
			this.resolucion = resolucion;
				}
		
		
		//Overwrite
		
		public String toString() {
			return "Telefono: color= " + color + "marca" + marca + "resolucion" + resolucion;
		}
	}




