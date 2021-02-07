/**
 * 
 */
package com.ucreativa;

/**
 * @author barba
 *
 */
//Class

public class Computadora {
	
	private String discoduro;
	private String teclado;
	private int memoriaram;


	//getters Setters 

public String getColor() {
		return discoduro;
	}

	public void setDiscoduro(String discoduro) {
		this.discoduro = discoduro;
	}

	public String getTeclado() {
		return teclado;
	}

	public void seTeclado(String teclado) {
		this.teclado = teclado;
	}

	public int getMemoriaram() {
		return memoriaram;
	}

	public void setMemoriaram(int memoriaram) {
		this.memoriaram = memoriaram;
	}
	

	//Constructor
	
		public Computadora(String discoduro, String teclado, int memoriaram) {
			this.discoduro = discoduro;
			this.teclado = teclado;
			this.memoriaram = memoriaram;
				}
		
		
		//Overwrite
		
		public String toString() {
			return "Computadora: discoduro= " + discoduro + "teclado" + teclado + "memoriaram" + memoriaram;
		}
	}





