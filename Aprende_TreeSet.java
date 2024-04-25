import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Un conjunto es una colección desordenada de elementos que no permite duplicados,
 * es decir, todos los elementos en un conjunto son únicos.
 */

public class Aprende_TreeSet {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Set' extiende la interfaz 'Collection' y especifica el
		 * comportamiento de una colección que no permite elementos duplicados.
		 *
		 * La clase 'TreeSet' extiende la clase 'AbstractSet' e implementa la interfaz
		 * 'NavigableSet'. Crea una colección que utiliza un árbol para
		 * almacenamiento. Los objetos se almacenan en orden ordenado, ascendente.
		 */

		Set<Integer> demoSet = new TreeSet<>();

		/*
		 * Agregar elementos a TreeSet
		 *
		 * boolean add(E obj): Declarado en la interfaz Collection. Agrega un objeto a la
		 * colección. Retorna true si el objeto fue agregado a la colección. Retorna false
		 * si obj ya es un miembro de la colección y la colección no
		 * permite duplicados.
		 *
		 * boolean addAll(Collection c): Declarado en la interfaz Collection. Agrega todos
		 * los elementos de c a la colección invocadora. Retorna true si los elementos fueron
		 * agregados a la colección invocadora. De lo contrario, retorna false.
		 */

		demoSet.add(7);
		// demoSet = [7]

		demoSet.add(5);
		// demoSet = [5, 7]

		demoSet.add(3);
		// demoSet = [3, 5, 7]

		demoSet.add(9);
		// demoSet = [3, 5, 7, 9]

		demoSet.add(5); // 5 ya existe en demoSet, por lo tanto no se agrega
		// demoSet = [3, 5, 7, 9]

		if (demoSet.add(3)) // 3 ya existe en demoSet, por lo tanto no se agrega
			System.out.println("Elemento agregado al conjunto");
		else
			System.out.println("No se puede agregar un elemento duplicado al conjunto");

		System.out.println("demoSet = " + demoSet); // demoSet = [3, 5, 7, 9]

		Set<Integer> numsSet = new TreeSet<>(Arrays.asList(4, 7, 3, 6, 8));
		// numsSet = [3, 4, 6, 7, 8]

		numsSet.addAll(Arrays.asList(5, 7, 2, 8, 1, 3)); // los elementos duplicados no se agregan
		// numsSet = [1, 2, 3, 4, 5, 6, 7, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [1, 2, 3, 4, 5, 6, 7, 8]

		/*
		 * Eliminar elementos de TreeSet
		 *
		 * boolean remove(Object obj): Declarado en la interfaz Collection. Elimina
		 * una instancia de obj de la colección invocadora. Retorna true si el elemento
		 * fue eliminado. De lo contrario, retorna false.
		 *
		 * boolean removeAll(Collection c): Declarado en la interfaz Collection.
		 * Elimina todos los elementos de c de la colección invocadora. Retorna true si
		 * los elementos fueron eliminados de la colección invocadora. De lo contrario,
		 * retorna false.
		 *
		 * boolean retainAll(Collection c): Declarado en la interfaz Collection.
		 * Elimina todos los elementos de la colección invocadora excepto aquellos en c.
		 * Retorna true si los elementos fueron eliminados de la colección invocadora. De lo contrario,
		 * retorna false.
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
		 * Obtener la cantidad de elementos presentes en TreeSet
		 *
		 * int size(): Declarado en la interfaz Collection. Retorna el número de
		 * elementos en la colección invocadora.
		 */

		// demoSet = [3, 5, 9]
		int setSize = demoSet.size();

		System.out.println("Tamaño = " + setSize); // Tamaño = 3

		/*
		 * Verificar si TreeSet está vacío o no
		 *
		 * boolean isEmpty(): Declarado en la interfaz Collection. Retorna true si la
		 * colección invocadora está vacía. De lo contrario, retorna false.
		 */

		// demoSet = [3, 5, 9]
		if (demoSet.isEmpty())
			System.out.println("¡El conjunto está vacío!");
		else
			System.out.println("¡El conjunto no está vacío!");

		/*
		 * Verificar si un objeto está presente en TreeSet
		 *
		 * boolean contains(Object obj): Declarado en la interfaz Collection. Retorna
		 * true si obj es un elemento de la colección invocadora. De lo contrario, retorna
		 * false.
		 */

		int value = 9;

		// demoSet = [3, 5, 9]
		if (demoSet.contains(value))
			System.out.println("El conjunto contiene " + value);
		else
			System.out.println("El conjunto no contiene " + value);

		/*
		 * Limpiar el TreeSet
		 *
		 * void clear(): Declarado en la interfaz Collection. Elimina todos los
		 * elementos de la colección invocadora.
		 */

		// demoSet = [3, 5, 9]
		demoSet.clear();
		// demoSet = []

		System.out.println("demoSet = " + demoSet); // demoSet = []

		/*
		 * Construir TreeSet a partir de un array
		 */

		String fruits[] = { "manzana", "uva", "plátano", "naranja", "uva" };

		TreeSet<String> fruitSet = new TreeSet<>();

		Collections.addAll(fruitSet, fruits);

		System.out.println("fruitSet = " + fruitSet); // fruitSet = [manzana, uva, plátano, naranja]

		/*
		 * Construir un array a partir de TreeSet
		 */

		String fruitArr[] = fruitSet.toArray(new String[fruitSet.size()]);

		System.out.println("fruitArr = " + Arrays.toString(fruitArr)); // fruitArr = [manzana, uva, plátano, naranja]

		/*
		 * Iterar sobre el contenido de un TreeSet
		 *
		 * Iterator<E> iterator(): Declarado en la interfaz Collection. Retorna un
		 * iterador para la colección invocadora.
		 */

		Iterator itr = fruitSet.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		// Iterar usando un bucle for-each

		for (String fruit : fruitSet) {
			System.out.print(fruit + " ");
		}

	}

}