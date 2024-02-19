package linearisFunkcionalis;

public class GenerikusFunkcionalisFullAltalanos {

	public static <T extends Number> int elsoBarmilyenTulajdonsagu(Iterable<T> adatok,
			ILinearisKeresesFunkcionalisan funkcio) {

		int i = 0;
		for (T adat : adatok) {
			if (funkcio.tulajdonsagnakMegfeleles(adat.doubleValue())) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
