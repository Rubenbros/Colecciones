import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Un ArrayList es un array de tamaño dinámico. Crece y decrece de tamaño dinámicamente al agrequar o eliminar elementos.
 */

public class Aprende_ArrayList {

	public static void main(String[] args) {


		/*
		 * La interfaz "List" extiende de "Collection" y declara el comportamiento de una
		 * colección que almacena una secuencia de elementos. Los elementos pueden ser
		 * agregados o accedidos por su índice en la lista, usando un índice base cero. Una
		 * lista puede contener elementos duplicados. La clase 'ArrayList' extiende de la
		 * clase 'AbstractList' y implementa la interfaz 'List'.
		 */

		List<Integer> numList = new ArrayList<>();

		/*
		 * Añadiendo elementos a un ArrayList
		 *
		 * boolean add(E obj) : Declarado en la interfaz Collection. Agrega el objeto
		 * a la colección. Devuelve true si el objeto fue agregado, de lo contrario
		 *
		 * void add(int index, E obj) : Declarado en la interfaz List. Agrega el objeto obj
		 * a la lista invocada en el índice especificado. Cualquier elemento previamente existente en el índice
		 * o despues del índice son desplazados hacia arriba. Por lo tanto, no se sobrescriben elementos.
		 *
		 * boolean addAll(Collection c) : Declarado en la interfaz Collection. Agrega todos los elementos
		 * de la colección c a la colección invocada. Devuelve true si elementos fueron agregados a la colección
		 * de lo contrario devuelve false.
		 *
		 * boolean addAll(Collection c) : Declarado en la interfaz List. Agrega todos los elementos
		 * de la colección c a la lista invocada en el índice especificado. Cualquier elemento previamente existente en el índice
		 * o despues del índice son desplazados hacia arriba. Por lo tanto, no se sobrescriben elementos.
		 * Devuelve true si elementos fueron agregados a la lista de lo contrario devuelve false.
		 */

		numList.add(7);
		// numList = [7]

		numList.add(5);
		// numList = [7, 5]

		numList.add(1, 3);
		// numList = [7, 3, 5]

		List<Integer> nums = new ArrayList<>(Arrays.asList(6, 3, 1));

		numList.addAll(nums);
		// numList = [7, 3, 5, 6, 3, 1]

		nums = new ArrayList<>(Arrays.asList(4, 7));

		numList.addAll(4, nums);
		// numList = [7, 3, 5, 6, 4, 7, 3, 1]

		System.out.println("numList = " + numList);
		// numList = [7, 3, 5, 6, 4, 7, 3, 1]

		/*
		 * Eliminando elementos de un ArrayList
		 *
		 * boolean remove(Object obj) : Declarado en la interfaz Collection. Elimina una instancia de obj de la colección.
		 * Devuelve true si el elemento fue eliminado, de lo contrario devuelve false.
		 *
		 * boolean removeAll(Collection c) : Declarado en la interfaz Collection. Elimina todos los elementos de c de la colección.
		 * Devuelve true si todos los elementos fueron eliminados de la colección de lo contrario devuelve false.
		 *
		 * E remove(int index) : Declarado en la interfaz List. Elimina el elemento en el índice especificado de la lista invocada,
		 * Devolviendo el elemento en el proceso. Los índices de los elementos siguientes se decrementan en uno.
		 *
		 * boolean retainAll(Collection c) : Declarado en la interfaz Collection. Elimina todos los elementos de la colección
		 * excepto los elementos de c. Devuelve true si elementos fueron eliminados de la colección de lo contrario devuelve false.
		 */

		// numList = [7, 3, 5, 6, 4, 7, 3, 1]
		numList.remove(Integer.valueOf(3));
		// numList = [7, 5, 6, 4, 7, 3, 1]

		nums = new ArrayList<>(Arrays.asList(6, 7));

		// elimina todas las apariciones de cada elemento de nums de numList
		numList.removeAll(nums);
		// numList = [5, 4, 3, 1]

		int removedElement = numList.remove(1);
		System.out.println("removedElement = " + removedElement); // removedElement = 4

		System.out.println("numList = " + numList);
		// numList = [5, 3, 1]

		numList.addAll(Arrays.asList(4, 7, 3, 1, 5));
		// numList = [5, 3, 1, 4, 7, 3, 1, 5]

		nums.addAll(Arrays.asList(5, 1));
		// nums = [6, 7, 5, 1]

		numList.retainAll(nums); // Elements [3, 4] are removed from numList
		// numList = [5, 1, 7, 1, 5]

		System.out.println("numList = " + numList);
		// numList = [5, 1, 7, 1, 5]

		/*
		 * Comprobar si ArrayList contiene un objeto
		 *
		 * booleano contiene (Objeto obj): declarado en la interfaz de Colección. Devoluciones
		 * verdadero si obj es un elemento de la colección que invoca. De lo contrario, regresa
		 * FALSO.
		 *
		 * booleano contieneTodo(Colección c): Declarado en la interfaz de Colección.
		 * Devuelve verdadero si la colección que invoca contiene todos los elementos de c.
		 * En caso contrario, devuelve falso.
		 */

		int value = 5;

		// numList = [5, 1, 7, 1, 5]
		if (numList.contains(value))
			System.out.println("numList contiene " + value);
		else
			System.out.println("numList no contiene " + value);

		nums = new ArrayList<>(Arrays.asList(5, 7));

		// numList = [5, 1, 7, 1, 5]
		if (numList.containsAll(nums))
			System.out.println("numList contiene todos los elementos de nums");
		else
			System.out.println("numList no contiene todos los elementos de nums");

		/*
		 * Obtener el elemento en un índice en ArrayList
		 *
		 * E get(int index): declarado en la interfaz Lista. Devuelve el objeto almacenado
		 * en el índice especificado dentro de la colección que invoca.
		 */

		// numList = [5, 1, 7, 1, 5]
		int element = numList.get(2);

		System.out.println("element = " + element); // element = 7

		/*
		 * Obtener el índice de un elemento en ArrayList
		 *
		 * int indexOf(Object obj): declarado en la interfaz Lista. Devuelve el índice
		 * de la primera instancia de obj en la lista de invocación. Si obj no está presente en
		 * la lista, se devuelve -1.
		 *
		 * int lastIndexOf(Object obj): declarado en la interfaz Lista. Devuelve el
		 * índice de la última instancia de obj en la lista de invocación. Si obj no está presente
		 * en la lista, se devuelve -1.
		 */

		// numList = [5, 1, 7, 1, 5]
		int lastIndex = numList.lastIndexOf(5);

		System.out.println("lastIndex = " + lastIndex); // lastIndex = 4

		/*
		 * Establecer el elemento en un índice en ArrayList
		 *
		 * E set(int index, E obj): declarado en la interfaz Lista. Asigna objeto a la
		 * ubicación especificada por índice dentro de la lista de invocación. Devuelve el valor anterior.
		 */

		// numList = [5, 1, 7, 1, 5]
		int oldValue = numList.set(3, 9);

		System.out.println("oldValue = " + oldValue); // oldValue = 1

		System.out.println("numList = " + numList); // numList = [5, 1, 7, 9, 5]

		/*
		 * Comprueba si ArrayList está vacío o no
		 *
		 * booleano isEmpty(): Declarado en la interfaz de Colección. Devuelve verdadero si
		 * La colección que invoca está vacía. De lo contrario, devuelve falso.
		 */

		// numList = [5, 1, 7, 9, 5]
		if (numList.isEmpty())
			System.out.println("ArrayList está vacía");
		else
			System.out.println("ArrayList no está vacía");

		/*
		 * Obtener el recuento de elementos presentes en ArrayList
		 *
		 * int size(): Declarado en la interfaz de Colección. Devuelve el número de
		 * elementos contenidos en la colección que invoca.
		 */

		// numList = [5, 1, 7, 9, 5]
		int listSize = numList.size();

		System.out.println("Size = " + listSize); // Size = 5

		/*
		 * Obtener sublista de un ArrayList
		 *
		 * Lista<E> subList(int startIndex, int endIndex): Declarado en la Lista
		 * interfaz. Devuelve una lista que incluye elementos desde startIndex hasta (endIndex
		 * - 1) en la lista de invocación. También se hace referencia a los elementos de la lista devuelta
		 * por el objeto que invoca.
		 */

		// numList = [5, 1, 7, 9, 5]
		List<Integer> subArrayList = new ArrayList<Integer>();

		subArrayList = numList.subList(1, 4);

		System.out.println("subArrayList = " + subArrayList); // subArrayList = [1, 7, 9]

		/*
		 * Borrar la lista de matrices
		 *
		 * void clear(): Declarado en la interfaz de Colección. Elimina todos los elementos
		 * de la colección que invoca.
		 */

		// numList = [5, 1, 7, 9, 5]
		numList.clear();

		System.out.println("numList = " + numList); // numList = []

		/*
		 * Construir ArrayList a partir de un array
		 */

		String fruits[] = { "apple", "grape", "banana", "orange", "grape" };

		List<String> fruitList = new ArrayList<>();

		Collections.addAll(fruitList, fruits);

		System.out.println("fruitList = " + fruitList); // fruitList = [apple, grape, banana, orange, grape]

		/*
		 * Construir array a partir de ArrayList
		 */

		String fruitArr[] = fruitList.toArray(new String[fruitList.size()]);

		System.out.println("fruitArr = " + Arrays.toString(fruitArr)); // fruitArr = [apple, grape, banana, orange,
																		// grape]

		/*
		 * Iterando sobre el contenido de un ArrayList
		 *
		 * Iterator<E> iterator(): Declarado en la interfaz de Colección. Devuelve un
		 * iterador de la colección que invoca.
		 */

		// fruitList = [apple, grape, banana, orange, grape]
		Iterator itr = fruitList.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		// Iterar usando el bucle for-each

		// fruitList = [apple, grape, banana, orange, grape]
		for (String fruit : fruitList) {
			System.out.print(fruit + " ");
		}

		System.out.println();

		/*
		 * ListIterator<E> listIterator(): Declarado en la interfaz Lista. Devuelve un
		 * iterador para invocar la lista comenzando desde el primer elemento.
		 */

		// fruitList = [apple, grape, banana, orange, grape]
		ListIterator listItr = fruitList.listIterator();

		while (listItr.hasNext()) {
			System.out.print(listItr.next() + " ");
		}

		System.out.println();

		/*
		 * ListIterator<E> listIterator(int index): declarado en la interfaz List.
		 * Devuelve un iterador para invocar la lista comenzando desde el elemento en el
		 * índice especificado.
		 */

		// fruitList = [apple, grape, banana, orange, grape]
		ListIterator listIndexItr = fruitList.listIterator(2);

		while (listIndexItr.hasNext()) {
			System.out.print(listIndexItr.next() + " ");
		}

		System.out.println();

	}

}
