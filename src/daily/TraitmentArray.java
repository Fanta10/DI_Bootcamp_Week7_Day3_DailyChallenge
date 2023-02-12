package daily;
/**
 * @author Kamate Fanta
 */

import java.util.Arrays;

public class TraitmentArray {

	public static final ArrayProcessor maximum = (array) -> {
		return Arrays.stream(array).max().getAsDouble();
	};
	public static final ArrayProcessor minimum = (array) -> {
		return Arrays.stream(array).min().getAsDouble();
	};

	public static final ArrayProcessor somme = (array) -> {
		return Arrays.stream(array).sum();
	};

	public static final ArrayProcessor moyenne = (array) -> {
		return Arrays.stream(array).average().getAsDouble();
	};

	public static ArrayProcessor counter(double value) {

		ArrayProcessor arrayFilter = (array) -> {
			return Arrays.stream(array).filter(data -> data == value).count();
		};
		return arrayFilter;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = { 10, 8, 45, 4.5, 3, 15, 41.6, 10.4, 18, -6.5, 10, -0.6, 10 };
		System.out.println("Le max est: " + TraitmentArray.maximum.apply(array));
		System.out.println("Le min est: " + TraitmentArray.minimum.apply(array));
		System.out.println("La somme est: " + TraitmentArray.somme.apply(array));
		System.out.println("La moyenne est: " + TraitmentArray.moyenne .apply(array));
		System.out.println("La valeur 10 apparait " + (int) TraitmentArray.counter(10).apply(array) + " fois");

	}

}
