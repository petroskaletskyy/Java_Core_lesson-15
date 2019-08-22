package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Zooclub club = new Zooclub();
		Scanner sc = new Scanner(System.in);
		// Loop for data entry
		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				club.addMember();
				break;
			}
			case "2": {
				club.addPet();
				break;
			}
			case "3": {
				club.deletePetFromEnteredMember();
				break;
			}
			case "4": {
				club.deleteMember();
				break;
			}
			case "5": {
				club.deletePetFromAllMember();
				break;
			}
			case "6": {
				club.printClub();
				break;
			}
			case "7": {
				System.exit(0);
				break;
			}
			}
		}

	}

	public static void menu() {
		System.out.println("Введіть 1 щоб додати учасника клубу:");
		System.out.println("Введіть 2 щоб додати тваринку учаснику клубу:");
		System.out.println("Введіть 3 щоб видалити тваринку в учасника клубу:");
		System.out.println("Введіть 4 щоб видалити учасника з клубу:");
		System.out.println("Введіть 5 щоб видалити конкретну тваринку у всіх учасників:");
		System.out.println("Введіть 6 щоб вивести на екран зооклуб:");
		System.out.println("Введіть 7 щоб вийти з програми:");
	}

}
