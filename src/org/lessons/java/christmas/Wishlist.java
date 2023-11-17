package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wishlist {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Gift> gifts = new ArrayList<>();
		while(true) {
			System.out.println("Dimmi il nome del regalo che vuoi mettere in lista: ");
			String name = in.nextLine();
			System.out.println("Per chi è questo regalo?: ");
			String recipient = in.nextLine();
			Gift g = new Gift(name, recipient);
			gifts.add(g);
			
			System.out.println("Vuoi metterne ancora? [y][n]" + "\n"
								+ "la lista è composta da " + gifts.size() + " regali");
			String input = in.nextLine();
			if(input.equals("y")) {
				continue;
			}
			else {
				System.out.println("programmata terminato, ecco la tua lista: " + "\n"
								+ gifts);
				in.close();
				break;
			}	
		}
	}
}
