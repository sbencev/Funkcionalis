package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<String> edessegek = Arrays.asList("CSOKI", "BONBON", "KEKSZ", "CUKOR", "CSOKI", "CUKOR");

		Stream<String> edessegStream = edessegek.stream();

		@SuppressWarnings("unused")
		Stream<String> edessegStream2 = Stream.of("CSOKI", "BONBON", "KEKSZ", "CUKOR", "CSOKI", "CUKOR");

		// irassuk ki duplikacio nelkul azokat az elemeket, amelyek tartalmaznak 'K'
		// betut

		edessegStream.filter(str -> str.contains("K")).distinct().map(str -> str.toLowerCase())
				.forEach(str -> System.out.print(str + " "));

	}

}
