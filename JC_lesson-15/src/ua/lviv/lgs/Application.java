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
		System.out.println("������ 1 ��� ������ �������� �����:");
		System.out.println("������ 2 ��� ������ �������� �������� �����:");
		System.out.println("������ 3 ��� �������� �������� � �������� �����:");
		System.out.println("������ 4 ��� �������� �������� � �����:");
		System.out.println("������ 5 ��� �������� ��������� �������� � ��� ��������:");
		System.out.println("������ 6 ��� ������� �� ����� �������:");
		System.out.println("������ 7 ��� ����� � ��������:");
	}

}
