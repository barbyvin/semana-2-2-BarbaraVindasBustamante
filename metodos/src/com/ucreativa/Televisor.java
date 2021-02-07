/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */

//Class
public class Televisor {
	private String color;
	private String marca;
	private int volumen;
	
	//getters Setters 

	/**
	 * 
	 */

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

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
//Constructor
	
	public Televisor(String color, String marca, int volumen) {
		this.color = color;
		this.marca = marca;
		this.volumen = volumen;
			}
	
	//Overwrite
	
	public String toString() {
		return "Televisor: color= " + color + "marca" + marca + "volumen" + volumen;
	}
}
	
	









