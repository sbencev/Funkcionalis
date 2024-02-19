package linearisKereses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearisKereses {

	public static void main(String[] args) {

		List<Integer> szamok = new ArrayList<Integer>(Arrays.asList(45, 81, -44, 58, 12, 3));

		int eredmeny = elsoNegyzetSzam(szamok);
		if (eredmeny > -1) {
			System.out.println("Az elso negyzetszam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs negyzetszam az adatok kozott!");
		}
		System.out.println();

		eredmeny = elsoNegativSzam(szamok);
		if (eredmeny > -1) {
			System.out.println("Az elso negativ szam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs negativ szam az adatok kozott!");
		}
		System.out.println();


		eredmeny = elsoNeggyelOszthatoSzam(szamok);
		if (eredmeny > -1) {
			System.out.println("Az elso neggyel oszthato szam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs neggyel oszthato szam az adatok kozott!");
		}
		System.out.println();

	}

	static int elsoNegyzetSzam(List<Integer> adatok) {

		int i = 0;
		for (Integer szam : adatok) {
			if (Math.sqrt(szam) % 1 == 0) {
				return i;
			}
			i++;
		}
		return -1;
	}

	static int elsoNegativSzam(List<Integer> adatok) {

		int i = 0;
		for (Integer szam : adatok) {
			if (szam < 0) {
				return i;
			}
			i++;
		}
		return -1;
	}

	static int elsoNeggyelOszthatoSzam(List<Integer> adatok) {

		int i = 0;
		for (Integer szam : adatok) {
			if (szam % 4 == 0) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
