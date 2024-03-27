package curs4;
/*
 * scriem un program de tip calculator care calculeaza TVA pt o suma
 * TVA poate avea multiple valori, o sa il atribuim cand facem obiectul
 * afisam calculul pentru valori diferite
 * Afisam numarul total de calcule TVA pe care le facem
 */
public class CalculatorTVA {

	private double tvaDouble;
	private static int nrCalculTotal =0;
	//19 --> 19/100
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100.0;
		System.out.println("TVA :" + tvaDouble);
	}
	
	
	public double adunaTVA(double suma) {
		nrCalculTotal++; // nrCalculTotal = nrCalculTotal +1;
		return suma * (1 + tvaDouble);
	}
	
	public static int getNrCalculTotal() {
		return nrCalculTotal;
	}
	
}