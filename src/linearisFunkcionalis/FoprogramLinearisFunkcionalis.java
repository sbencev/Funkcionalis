package linearisFunkcionalis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoprogramLinearisFunkcionalis {

	public static void main(String[] args) {

		List<Integer> szamok = new ArrayList<Integer>(Arrays.asList(45, 81, -44, 58, 12, 3));

		int eredmeny = GenerikusFunkcionalisFullAltalanos.elsoBarmilyenTulajdonsagu(szamok, x -> Math.sqrt(x) % 1 == 0);
		if (eredmeny > -1) {
			System.out.println("Az elso negyzetszam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs negyzetszam az adatok kozott!");
		}
		System.out.println();

		eredmeny = GenerikusFunkcionalisFullAltalanos.elsoBarmilyenTulajdonsagu(szamok, x -> x < 0);
		if (eredmeny > -1) {
			System.out.println("Az elso negativ szam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs negativ szam az adatok kozott!");
		}
		System.out.println();

		eredmeny = GenerikusFunkcionalisFullAltalanos.elsoBarmilyenTulajdonsagu(szamok, x -> x % 4 == 0);
		if (eredmeny > -1) {
			System.out.println("Az elso neggyel oszthato szam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs neggyel oszthato szam az adatok kozott!");
		}
		System.out.println();

		// lambda helyett anonymous osztaly alkalmazhato:

		eredmeny = GenerikusFunkcionalisFullAltalanos.elsoBarmilyenTulajdonsagu(szamok,
				new ILinearisKeresesFunkcionalisan() {

					@Override
					public boolean tulajdonsagnakMegfeleles(double ertek) {
						return ertek % 2 != 0;
					}
				});
		if (eredmeny > -1) {
			System.out.println("Az elso paratlan szam indexe: " + eredmeny);
		} else {
			System.out.println("Nincs paratlan szam az adatok kozott!");
		}
		System.out.println();

	}

}
