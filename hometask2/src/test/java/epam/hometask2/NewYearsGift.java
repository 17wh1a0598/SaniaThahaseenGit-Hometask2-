package epam.hometask2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NewYearsGift {
	

	public static void main(String args[]) {
		int weight,quantity,total_weight=0,total_sweets=0,total_candies=0;
		int candies; 
		Scanner sc = new Scanner(System.in);
		Boolean n = true;
		Sweets collect_sweets = null;
		
		System.out.println("select the choice of sweets you want");
		while(n) {
			System.out.println("1.Rasmalayi");
			System.out.println("2.Dairymilk");
			System.out.println("3.Darkchocolate");
			System.out.println("4.KajuKatli");
			System.out.println("5.Snickers");
			System.out.println("6.Candies");
			int choice = sc.next().charAt(0);
			char nextchoice;
			try {
			switch(choice) {
			case '1':
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Enter the weight");
				weight = sc.nextInt();
				collect_sweets = new Rasmalayi();
				total_sweets =collect_sweets.Sweets_weight(quantity, weight);
				total_weight += total_sweets;
				System.out.println("Enter the candies");
				candies = sc.nextInt();
				System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
				System.out.println("The total weight of the gift:" +total_weight);
				total_candies += candies;
				System.out.println("The total weight of gift is:");
				System.out.println(total_candies + total_sweets);
				
				break;
			case '2':
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Enter the weight");
				weight = sc.nextInt();
				collect_sweets =  new Dairymilk();
				total_weight += total_sweets;
				System.out.println("Enter the candies");
				candies = sc.nextInt();
				System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
				System.out.println("The total weight of the gift:" +total_weight);
				total_candies += candies;
				System.out.println("The total weight of gift is:");
				System.out.println(total_candies + total_sweets);
				break;
			case '3':
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Enter the weight");
				weight = sc.nextInt();
				collect_sweets =  new Darkchocolate();
				total_sweets =collect_sweets.Sweets_weight(quantity, weight);
				total_weight += total_sweets;
				System.out.println("Enter the candies");
				candies = sc.nextInt();
				System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
				System.out.println("The total weight of the gift:" +total_weight);
				total_candies += candies;
				System.out.println("The total weight of gift is:");
				System.out.println(total_candies + total_sweets);
				break;
			case '4':
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Enter the weight");
				weight = sc.nextInt();
				collect_sweets = new KajuKatli();
				total_sweets =collect_sweets.Sweets_weight(quantity, weight);
				total_weight += total_sweets;
				System.out.println("Enter the candies");
				candies = sc.nextInt();
				System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
				System.out.println("The total weight of the gift:" +total_weight);
				total_candies += candies;
				System.out.println("The total weight of gift is:");
				System.out.println(total_candies + total_sweets);
				break;
			case '5':
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Enter the weight");
				weight = sc.nextInt();
				collect_sweets =  new Snickers();
				total_sweets =collect_sweets.Sweets_weight(quantity, weight);
				total_weight += total_sweets;
				System.out.println("Enter the candies");
				candies = sc.nextInt();
				System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
				System.out.println("The total weight of the gift:" +total_weight);
				total_candies += candies;
				System.out.println("The total weight of gift is:");
				System.out.println(total_candies + total_sweets);
				break;
			case '6':
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Enter the weight");
				weight = sc.nextInt();
				collect_sweets =  new Candies();
				total_sweets =collect_sweets.Sweets_weight(quantity, weight);
				total_weight += total_sweets;
				System.out.println("Enter the candies");
				candies = sc.nextInt();
				System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
				System.out.println("The total weight of the gift:" +total_weight);
				total_candies += candies;
				System.out.println("The total weight of gift is:");
				System.out.println(total_candies + total_sweets);
				break;
						}
		}catch(Exception e) {
			System.out.println("Your choice is out of range");
		}
		}
		sc.close();
	}

	

}
