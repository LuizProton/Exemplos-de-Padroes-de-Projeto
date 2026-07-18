package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.model.IPhoneX;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");

		IPhoneX cell = new IPhoneX();

		cell.getHardware();

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
	}
}
