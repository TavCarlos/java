package desafios.desafiosStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Car c1 = new Car("Tucson", 229990, true);
		Car c2 = new Car("Kwid", 68990, true);
		Car c3 = new Car("Argo", 89800, true);
		Car c4 = new Car("Versa", 70990, false);
		Car c5 = new Car("Picanto", 58900, false);
		
		List<Car> cars = Arrays.asList(c1, c2, c3, c4, c5);
		
		Predicate<Car> isCheap = car -> car.price <= 100000.00;
		Predicate<Car> isNacional = car -> car.isNacional;
		Function<Car, String> cheapAndNacionalCar = car -> car.nome + " is a nacional and cheap car!"; 
		
		//pipeLine de execução
		cars.stream()
			.filter(isCheap)
			.filter(isNacional)
			.map(cheapAndNacionalCar)
			.forEach(System.out::println);
		
	}
}
