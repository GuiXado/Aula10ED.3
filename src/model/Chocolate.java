package model;

public class Chocolate {
	
	public int volumeMin;
	public int volumeMax;
	public int peso;
	public String tipoDoce;
	
	public Chocolate() {
	}

	public Chocolate(int volumeMin, int volumeMax, int peso, String tipoDoce) {
		this.volumeMin = volumeMin;
		this.volumeMax = volumeMax;
		this.peso = peso;
		this.tipoDoce = tipoDoce;
	}

	@Override
	public String toString() {
		return "Chocolate [tipo do Doce: " + tipoDoce + "peso: " + peso +  "]";
	}
	
}
