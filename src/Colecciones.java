import java.util.HashSet;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		// Las colecciones nos sirven para almacenar un conjunto
		// de objetos
		// La diferencia de las colecciones y los objetos
		// es que las colecciones son dinamicas, pueden crecer.
		
		
		// Set tiene 3 implementaciones:
		// No puede contener elementos repetidos.
		
		// HashSet
		// Los elementos no mantienen un orden
		// Es la implementacion mas rapida
		
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		
		// for each, puede recorrer una coleccion y en cada
		// recorrido recupera el valor y lo podemos almacenar
		// en una variable
		// Sintaxis
		// for(tipoDeDatoElemento variable : elementoARecorrer)
		for ( String fruta : frutas ) {
			System.out.println(fruta);
		}
		
		
		// TreeSet
		// LinkedHashSet
		
		
		
		
		
		
	}
}
