import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Un conjunto es una colección no ordenada de elementos que no permite duplicados,
 * es decir, todos los elementos en un conjunto son únicos.
 */

public class Aprende_LinkedHashSet {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Set' extiende la interfaz 'Collection' y especifica el
		 * comportamiento de una colección que no permite elementos duplicados.
		 *
		 * La clase 'LinkedHashSet' extiende la clase 'HashSet' y no agrega miembros
		 * propios. Mantiene una lista enlazada de las entradas en el conjunto, en el
		 * orden en que fueron insertadas. Por lo tanto, la iteración sobre los elementos
		 * del conjunto se realiza según el orden de inserción de los elementos.
		 */

		Set<Integer> demoSet = new LinkedHashSet<>();

		/*
		 * Agregar elementos a LinkedHashSet
		 *
		 * boolean add(E obj): Declarado en la interfaz Collection. Agrega el objeto a
		 * la colección. Devuelve true si el objeto fue agregado a la colección.
		 * Devuelve false si obj ya es miembro de la colección y la colección no permite
		 * duplicados.
		 *
		 * boolean addAll(Collection c): Declarado en la interfaz Collection. Agrega
		 * todos los elementos de c a la colección invocadora. Devuelve true si los
		 * elementos fueron agregados a la colección invocadora. De lo contrario, devuelve
		 * false.
		 */

		demoSet.add(7);
		// demoSet = [7]

		demoSet.add(5);
		// demoSet = [7, 5]

		demoSet.add(3);
		// demoSet = [7, 5, 3]

		demoSet.add(9);
		// demoSet = [7, 5, 3, 9]

		demoSet.add(5); // 5 ya existe en demoSet, por lo que no se agrega
		// demoSet = [7, 5, 3, 9]

		if (demoSet.add(3)) // 3 ya existe en demoSet, por lo que no se agrega
			System.out.println("Elemento agregado al conjunto");
		else
			System.out.println("No se puede agregar elemento duplicado al conjunto");

		System.out.println("demoSet = " + demoSet); // demoSet = [7, 5, 3, 9]

		Set<Integer> numsSet = new LinkedHashSet<>(Arrays.asList(4, 7, 3, 6, 8));
		// numsSet = [3, 4, 6, 7, 8]

		numsSet.addAll(Arrays.asList(5, 7, 2, 8, 1, 3)); // los elementos duplicados no se agregan
		// numsSet = [1, 2, 3, 4, 5, 6, 7, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [1, 2, 3, 4, 5, 6, 7, 8]

		/*
		 * Eliminar elementos de LinkedHashSet
		 *
		 * boolean remove(Object obj): Declarado en la interfaz Collection. Elimina una
		 * instancia de obj de la colección invocadora. Devuelve true si el elemento fue
		 * eliminado. De lo contrario, devuelve false.
		 *
		 * boolean removeAll(Collection c): Declarado en la interfaz Collection. Elimina
		 * todos los elementos de c de la colección invocadora. Devuelve true si los
		 * elementos fueron eliminados de la colección invocadora. De lo contrario, devuelve false.
		 *
		 * boolean retainAll(Collection c): Declarado en la interfaz Collection. Elimina
		 * todos los elementos de la colección invocadora excepto aquellos en c. Devuelve
		 * true si los elementos fueron eliminados de la colección invocadora. De lo
		 * contrario, devuelve false.
		 */

		// demoSet = [7, 5, 3, 9]
		demoSet.remove(7);
		// demoSet = [5, 3, 9]

		System.out.println("demoSet = " + demoSet); // demoSet = [5, 3, 9]

		// numsSet = [1, 2, 3, 4, 5, 6, 7, 8]
		numsSet.removeAll(Arrays.asList(1, 3, 5, 7));
		// numsSet = [2, 4, 6, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [2, 4, 6, 8]

		// numsSet = [2, 4, 6, 8]
		numsSet.retainAll(Arrays.asList(4, 8));
		// numsSet = [4, 8]

		System.out.println("numsSet = " + numsSet); // numsSet = [4, 8]

		/*
		 * Obtener el recuento de elementos presentes en LinkedHashSet
		 *
		 * int size(): Declarado en la interfaz Collection. Devuelve el número de
		 * elementos contenidos en la colección invocadora.
		 */

		// demoSet = [5, 3, 9]
		int setSize = demoSet.size();

		System.out.println("Tamaño = " + setSize); // Tamaño = 3

		/*
		 * Comprobar si LinkedHashSet está vacío o no
		 *
		 * boolean isEmpty(): Declarado en la interfaz Collection. Devuelve true si la
		 * colección invocadora está vacía. De lo contrario, devuelve false.
		 */

		// demoSet = [5, 3, 9]
		if (demoSet.isEmpty())
			System.out.println("¡El conjunto está vacío!");
		else
			System.out.println("¡El conjunto no está vacío!");

		/*
		 * Comprobar si un objeto está presente en LinkedHashSet
		 *
		 * boolean contains(Object obj): Declarado en la interfaz Collection. Devuelve
		 * true si obj es un elemento de la colección invocadora. De lo contrario, devuelve false.
		 */

		int valor = 9;

		// demoSet = [5, 3, 9]
		if (demoSet.contains(valor))
			System.out.println("El conjunto contiene " + valor);
		else
			System.out.println("El conjunto no contiene " + valor);

		/*
		 * Limpiar el LinkedHashSet
		 *
		 * void clear(): Declarado en la interfaz Collection. Elimina todos los
		 * elementos de la colección invocadora.
		 */

		// demoSet = [5,

		3, 9]
		demoSet.clear();
		// demoSet = []

		System.out.println("demoSet = " + demoSet); // demoSet = []

		/*
		 * Construir LinkedHashSet desde array
		 */

		String frutas[] = { "manzana", "uva", "plátano", "naranja", "uva" };

		LinkedHashSet<String> fruitSet = new LinkedHashSet<>();

		Collections.addAll(fruitSet, frutas);

		System.out.println("fruitSet = " + fruitSet); // fruitSet = [manzana, uva, plátano, naranja]

		/*
		 * Construir array desde LinkedHashSet
		 */

		String fruitArr[] = fruitSet.toArray(new String[fruitSet.size()]);

		System.out.println("fruitArr = " + Arrays.toString(fruitArr)); // fruitArr = [manzana, uva, plátano, naranja]

		/*
		 * Iterar sobre el contenido de un LinkedHashSet
		 *
		 * Iterator<E> iterator(): Declarado en la interfaz Collection. Devuelve un
		 * iterador para la colección invocadora.
		 */

		Iterator<String> itr = fruitSet.iterator();

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