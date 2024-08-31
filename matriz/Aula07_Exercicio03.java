package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula07_Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat ("R$ #,##0.00");
		char[] lojas = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		char[] produtos = new char[] { 'W', 'X', 'Y', 'Z' };
		double[][]matriz = new double [4][8];
		
		for(int i=0;i<4;i++) {

			for(int j=0;j<8;j++) {
				matriz[i][j] = (double) (Math.random()*190);
			}
		}
		System.out.println("");
		System.out.println("----------------------------------------------------");
		System.out.println("--------------Produtos que custam menos de R$ 120,00--------------");
		System.out.println("----------------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println("Produto"+produtos[i]);
			for(int j=0;j<8;j++) {
				if(matriz[i][j]<120) {
					System.out.println("Loja "+ lojas[j]+ " - Preço:"+ fm.format(matriz[i][j]));
				}
			}
		}
	}// class

}// main
