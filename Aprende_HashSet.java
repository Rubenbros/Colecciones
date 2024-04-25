import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Un conjunto es una colección desordenada de elementos que no permite duplicados,
 * es decir, todos los elementos en un conjunto son únicos.
 */

public class Aprende_HashSet {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Set' extiende la interfaz 'Collection' y especifica el
		 * comportamiento de una colección que no permite elementos duplicados.
		 *
		 * La clase 'HashSet' extiende la clase 'AbstractSet' e implementa la interfaz 'Set'.
		 * Crea una colección que utiliza una tabla hash para el almacenamiento. Además,
		 * HashSet no garantiza el orden de sus elementos.
		 */

		Set<Integer> demoSet = new HashSet<>();

		/*
		 * Agregar elementos a HashSet
		 *
		 * boolean add(E obj): Declarado en la interfaz Collection. Agrega un objeto a la
		 * colección. Devuelve true si el objeto se agregó a la colección. Devuelve false
		 * si obj ya es un miembro de la colección y la colección no permite duplicados.
		 *
		 * boolean addAll(Collection c): Declarado en la interfaz Collection. Agrega todos
		 * los elementos de c a la colección invocadora. Devuelve true si los elementos
		 * se agregaron a la colección invocadora. De lo contrario, devuelve false.
		 */

		demoSet.add(7);
		// demoSet = [7]

		demoSet.add(5);
		// demoSet = [5, 7]

		demoSet.add(3);
		// demoSet = [3, 5, 7]

		demoSet.add(9);
		// demoSet = [3, 5, 7, 9]

		demoSet.add(5); // 5 ya existe en demoSet por lo que no se agrega
		// demoSet = [3, 5, 7, 9]

		if (demoSet.add(3)) // 3 ya existe en demoSet por lo que no se agrega
			System.out.println("Elemento agregado al conjunto");
		else
			System.out.println("No se puede agregar un elemento duplicado al conjunto");

		System.out.println("demoSet = " + demoSet); // demoSet = [3, 5, 7, 9]

		Set<Integer> numsSet = new HashSet<>(Arrays.asList(4, 7, 3, 6, 8));
		// numsSet = [3, 4, 6, 7, 8]

		numsSet.addAll(Arrays.asList(5, 7, 2, 8, 1, 3)); // los elementos duplicados no se agregan
		// numsSet = [1, 2, 3, 4, 5, 6, 7, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [1, 2, 3, 4, 5, 6, 7, 8]

		/*
		 * Eliminar elementos de HashSet
		 *
		 * boolean remove(Object obj): Declarado en la interfaz Collection. Elimina
		 * una instancia de obj de la colección invocadora. Devuelve true si el elemento
		 * fue removido. De lo contrario, devuelve false.
		 *
		 * boolean removeAll(Collection c): Declarado en la interfaz Collection.
		 * Elimina todos los elementos de c de la colección invocadora. Devuelve true si
		 * los elementos fueron removidos de la colección invocadora. De lo contrario,
		 * devuelve false.
		 *
		 * boolean retainAll(Collection c): Declarado en la interfaz Collection.
		 * Elimina todos los elementos de la colección invocadora excepto aquellos en c.
		 * Devuelve true si los elementos fueron removidos de la colección invocadora.
		 * De lo contrario, devuelve false.
		 */

		// demoSet = [3, 5, 7, 9]
		demoSet.remove(7);
		// demoSet = [3, 5, 9]

		System.out.println("demoSet = " + demoSet); // demoSet = [3, 5, 9]

		// numsSet = [1, 2, 3, 4, 5, 6, 7, 8]
		numsSet.removeAll(Arrays.asList(1, 3, 5, 7));
		// numsSet = [2, 4, 6, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [2, 4, 6, 8]

		// numsSet = [2, 4, 6, 8]
		numsSet.retainAll(Arrays.asList(4, 8));
		// numsSet = [4, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [4, 8]

		/*
		 * Obtener el recuento de elementos presentes en HashSet
		 *
		 * int size(): Declarado en la interfaz Collection. Devuelve el número de
		 * elementos contenidos en la colección invocadora.
		 */

		// demoSet = [3, 5, 9]
		int setSize = demoSet.size();

		System.out.println("Tamaño = " + setSize); // Tamaño = 3

		/*
		 * Comprobar si HashSet está vacío o no
		 *
		 * boolean isEmpty(): Declarado en la interfaz Collection. Devuelve true si la
		 * colección invocadora está vacía. De lo contrario, devuelve false.
		 */

		// demoSet = [3, 5, 9]
		if (demoSet.isEmpty())
			System.out.println("¡El conjunto está vacío!");
		else
			System.out.println("¡El conjunto no está vacío!");

		/*
		 * Comprobar si un objeto está presente en HashSet
		 *
		 * boolean contains(Object obj): Declarado en la interfaz Collection. Devuelve
		 * true si obj es un elemento de la colección invocadora. De lo contrario,
		 * devuelve false.
		 */

		int valor = 9;

		// demoSet = [3, 5, 9]
		if (demoSet.contains(valor))
			System.out.println("El conjunto contiene " + valor);
		else
			System.out.println("El conjunto no contiene " + valor);

		/*
		 * Limpiar el HashSet
		 *
		 * void clear(): Declarado en la interfaz Collection. Elimina todos los elementos
		 * de la colección invocadora.
		 */

		// demoSet = [3, 5, 9]
		demoSet.clear();
		// demoSet = []

		System.out.println("demoSet = " + demoSet); // demoSet = []

        /*
         * Construir

 HashSet a partir de un array
         */

		String fruits[] = { "manzana", "uva", "plátano", "naranja", "uva" };

		HashSet<String> fruitSet = new HashSet<>();

		Collections.addAll(fruitSet, fruits);

		System.out.println("fruitSet = " + fruitSet); // fruitSet = [plátano, naranja, manzana, uva]

		/*
		 * Construir un array a partir de HashSet
		 */

		String fruitArr[] = fruitSet.toArray(new String[fruitSet.size()]);

		System.out.println("fruitArr = " + Arrays.toString(fruitArr)); // fruitArr = [plátano, naranja, manzana, uva]

		/*
		 * Iterar sobre el contenido de un HashSet
		 *
		 * Iterator<E> iterator(): Declarado en la interfaz Collection. Devuelve un
		 * iterador para la colección invocadora.
		 */

		Iterator itr = fruitSet.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		// Iterar usando un bucle for-each

		for (String fruta : fruitSet) {
			System.out.print(fruta + " ");
		}

	}

}