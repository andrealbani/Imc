package br.com.unigran.imc;

import java.util.Scanner;

public class Imc {

	private static Double altura;
	private static Double peso; 
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite Altura:");
			altura = Double.parseDouble(sc.nextLine());
			System.out.println("Digite Peso:");
			peso = Double.parseDouble(sc.nextLine());

			System.out.println("IMC:"+ (peso/(altura*altura) ) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
}
