package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Zooclub {

	Map<Person, List<Pet>> map = new HashMap<>();

	public void addMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть імя учасника:");
		String name = scanner.nextLine();
		System.out.println("Введіть вік учасника:");
		int age = scanner.nextInt();
		map.put(new Person(name, age), new ArrayList<Pet>());
	}

	public void addPet() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть імя учасника:");
		String name = scanner.nextLine();
		System.out.println("Введіть тип тваринки:");
		String type = scanner.nextLine();
		System.out.println("Введіть імя тваринки:");
		String namePet = scanner.nextLine();

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				List<Pet> value = next.getValue();
				value.add(new Pet(type, namePet));
				next.setValue(value);
			}
		}
	}

	public void deletePetFromEnteredMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть імя учасника:");
		String name = scanner.nextLine();
		System.out.println("Введіть тип тваринки:");
		String type = scanner.nextLine();
		boolean isDeleted = false;

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				List<Pet> value = next.getValue();
				Iterator<Pet> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					Pet next2 = iterator2.next();
					if (next2.getType().equalsIgnoreCase(type)) {
						iterator2.remove();
						isDeleted = true;
					}
				}
			}
		}
		if (!isDeleted) {
			System.out.println("На жаль, такої тваринки немає");
		} else {
			System.out.println("Тваринка видалена");
		}
	}

	public void deleteMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть імя учасника:");
		String name = scanner.nextLine();
		boolean isDeleted = false;

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
				isDeleted = true;
			}
		}
		if (!isDeleted) {
			System.out.println("На жаль, такого учасника клубу немає");
		} else {
			System.out.println("Учасник клубу видалений");
		}

	}

	public void deletePetFromAllMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть тип тваринки:");
		String type = scanner.nextLine();
		boolean isDeleted = false;

		Iterator<java.util.Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			List<Pet> value = next.getValue();
			Iterator<Pet> iterator2 = value.iterator();
			while (iterator2.hasNext()) {
				Pet next2 = iterator2.next();
				if (next2.getType().equalsIgnoreCase(type)) {
					iterator2.remove();
					isDeleted = true;
				}
			}
		}
		if (!isDeleted) {
			System.out.println("На жаль, такої тваринки немає");
		} else {
			System.out.println("Тваринка видалена");
		}
	}

	public void printClub() {
		System.out.println(map);
	}

}
