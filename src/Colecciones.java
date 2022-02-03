import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		/*
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
		*/
		
		// TreeSet
		// Buscara ordenar sus valores, en este caso por abecedario
		// Ordenada elementos en funcion lenta
		// Es la implementacion mas lenta
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for ( String fruta : frutas ) {
			System.out.println(fruta);
		}
		*/
		
		
		// LinkedHashSet
		// Sigue el orden establecido.
		// Es mas costoso que el Hash
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for ( String fruta : frutas ) {
			System.out.println(fruta);
		}
		*/
		
		
		// List 
		// Se perimite elementos duplicados
		// Acceder a elementos especificos
		// buscar elementos
		
		// ArrayList
		/*
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("pikachu");
		pokemones.add("charizard");
		pokemones.add("new");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		pokemones.add(2, "Raychu");
		// add si agregamos un indice y un elemento, posiciona
		// el elemento en el indice y realiza un desplazamiento
		// es decir no borra en elemento en la posicion sino
		// que lo desplaza
		
		pokemones.remove(5); // elimina Gengar
		// elimina el elemento de la posicion especificada
		
		// set reemplaza el elemento en la posicion especificada
		pokemones.set(0, "Pidgeotto");
				
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("*****************");
		System.out.println(pokemones.get(4));
		
		///////////
		
		//  indexOf, nos va a devolver la posicion del elemento
		// y si el elemento no se encuentra, devuelve un -1
		
		System.out.println(pokemones.indexOf("new")); // devuelve la posicion, en este caso 3
		System.out.println(pokemones.lastIndexOf("new"));
		
		System.out.println("------------------------------------");
		*/
		
		
		
		//LinkedList, para carga de trabajos muy grandes en ese caso resulta mas eficiente  
		 //Es una lista doblemente enlazada 
		 // Es mas rapido para insertar y remover elementos 
		 List<String> digimones = new LinkedList<String>();
		 digimones.add("Agumon");
		 digimones.add("Patamon"); 
		 digimones.add("Angemon"); 
		 digimones.add("Andromon");
		 digimones.add("Greymon");
		 
		 //Colecciones Map 
		 //Asocia claves a valores, 
		 //No puede contener claves duplicadas
		 //Solo puede tener un valor asociado 
		 
		 //HashMap 
		 //Tiene mejor rendimiento, pero no garantiza un orden 
		 // a la hora de hacer iteraciones. 
		 
		 Map<Integer, String> usuarios = new HashMap<Integer, String>();
		 usuarios.put(1123, "Carlos Eduardo");
		 usuarios.put(3242, "Raul"); 
		 usuarios.put(3243, "Ro");
		
		 //HashMap no acepta claves duplicadas 
		 
		 System.out.println(usuarios.get(1123)); //clave con al que podemos llamar un elemento 
		 
		 //keySet
		 //Nos permite recuperar el nombre de la clave 
		 System.out.println(usuarios.keySet());
		 //values 
		 //Nos permite recuperar el valor directamente
		 System.out.println(usuarios.values());
		 
		
		 
		 //TreeMap 
		 Map<Integer, String> tamales = new TreeMap<Integer, String>();
		 tamales.put(6, "Mole Rojo");
		 tamales.put(2, "Mole verde");
		 tamales.put(10, "Gansito");
		 tamales.put(1, "Cochinita");
		 
		 System.out.println("***********************");
		 System.out.println(tamales.keySet());
		 System.out.println(tamales.values());
		
		 System.out.println(tamales);
		 
		 tamales.entrySet().forEach(elemento ->{ //funcion lambda
			 //System.out.println(elemento.getKey().toString() +
					 //elemento.getValue().toString());
			 System.out.println(elemento.getKey());
			 System.out.println(elemento.getValue());
		 });
		 
		 
		 //LinkedHashMap
		 Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		 //guarda los elementos, segun el orden en que se inserten
		 carros.put(1,"Volvo");
		 carros.put(5, "Pointer");
		 carros.put(3, "Mustang");
		 
		 
		 System.out.println("**********************");
		 System.out.print(carros.keySet());
		 System.out.print(carros.values());
		 
	}
}
