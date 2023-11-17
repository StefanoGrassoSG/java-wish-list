package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Wishlist {
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		List<Gift> gifts = new ArrayList<>();
//		while(true) {
//			System.out.println("Dimmi il nome del regalo che vuoi mettere in lista: ");
//			String name = in.nextLine();
//			System.out.println("Per chi è questo regalo?: ");
//			String recipient = in.nextLine();
//			Gift g = new Gift(name, recipient);
//			gifts.add(g);
//			
//			System.out.println("Vuoi metterne ancora? [y][n]" + "\n"
//								+ "la lista è composta da " + gifts.size() + " regali");
//			String input = in.nextLine();
//			if(input.equals("y")) {
//				continue;
//			}
//			else {
//				System.out.println("programmata terminato, ecco la tua lista: " + "\n"
//								+ gifts);
//				in.close();
//				break;
//			}	
//		}
		
		Scanner in = new Scanner(System.in);
		Map<String, String> nameRecipient = new HashMap<>();
		while(true) {
			System.out.println("Dimmi il nome del regalo che vuoi mettere in lista: ");
			String name = in.nextLine();
			System.out.println("Per chi è questo regalo?: ");
			String recipient = in.nextLine();
			nameRecipient.put(name , recipient);
			
			System.out.println("Vuoi metterne ancora? [y][n]" + "\n"
								+ "la lista è composta da " + nameRecipient.size() + " regali");
			String input = in.nextLine();
			if(input.equals("y")) {
				continue;
			}
			else {
				System.out.println("Come vuoi ordinare la lista? [nome][destinatario]");
				String input2 = in.nextLine();
				if(input2.equals("nome")) {
					for (String key : nameRecipient.keySet()) {
						
						String value = nameRecipient.get(key);
						System.out.println(key + " --> " + value);
					}
				}
				else {
					for (String key : nameRecipient.keySet()) {
						
						String value = nameRecipient.get(key);
						System.out.println(value + " --> " + key);
					}
				}
				in.close();
				break;
			}	
		}
	}
}
