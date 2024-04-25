import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Una LinkedList es una estructura de datos lineal donde los elementos se almacenan en espacios no contiguos.
 * ubicaciones de memoria. Crece y disminuye de tamaño dinámicamente a medida que seguimos agregando o
 *eliminación de elementos. De manera más intuitiva, una lista enlazada es una cadena lineal de nodos, donde
 * cada nodo contiene los datos y la ubicación de memoria del siguiente o anterior o ambos
 * los nodos siguiente y anterior.
 */

public class Aprende_LinkedList {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Lista' extiende la interfaz 'Colección' y declara la
		 * comportamiento de una colección que almacena una secuencia de elementos. Los elementos pueden ser
		 * agregado o accedido por su posición en la lista, usando un índice de base cero. A
		 * la lista también puede contener elementos duplicados.
		 *
		 * La interfaz 'Cola' extiende la interfaz 'Colección' y declara la
		 * comportamiento de una cola. La interfaz 'Deque' extiende la interfaz 'Queue' y
		 * declara el comportamiento de una cola de doble extremo.
		 *
		 * La clase 'LinkedList' extiende la clase 'AbstractSequentialList' y
		 * implementa las interfaces 'List', 'Queue' y 'Deque'.
		 */

		List<Integer> numList = new LinkedList<>();

		/*
		 * Agregar elementos a LinkedList
		 *
		 * boolean add(E obj): Declarado en la interfaz de Colección. Agrega un objeto al
		 * recopilación. Devuelve verdadero si se agregó el objeto; de lo contrario, devuelve falso.
		 *
		 * void add(int index, E obj): declarado en la interfaz Lista. Agrega objeto obj
		 * a la lista de invocación en el índice pasado. Cualquier elemento preexistente en o
		 * más allá del índice se desplazan hacia arriba. Por tanto, no se sobrescribe ningún elemento.
		 *
		 * boolean addAll(Colección c): Declarado en la interfaz de Colección. Agrega todos
		 * los elementos de c a la colección que invoca. Devuelve verdadero si los elementos eran
		 * agregado a la colección de invocación. De lo contrario, devuelve falso.
		 *
		 * boolean addAll(int index, Collection c): declarado en la interfaz Lista.
		 * Agrega todos los elementos de c a la lista de invocación en el índice pasado. Cualquier
		 * los elementos preexistentes en el índice o más allá se desplazan hacia arriba. Por lo tanto, no hay elementos
		 * se sobrescriben. Devuelve verdadero si se agregaron elementos a la lista de invocación.
		 * En caso contrario, devuelve falso.
		 */

		numList.add(7);
		// numList = [7]

		numList.add(5);
		// numList = [7, 5]

		numList.add(1, 3);
		// numList = [7, 3, 5]

		List<Integer> nums = new LinkedList<>(Arrays.asList(6, 3, 1));

		numList.addAll(nums);
		// numList = [7, 3, 5, 6, 3, 1]

		nums = new LinkedList<>(Arrays.asList(4, 7));

		numList.addAll(4, nums);
		// numList = [7, 3, 5, 6, 4, 7, 3, 1]

		System.out.println("numList = " + numList);
		// numList = [7, 3, 5, 6, 4, 7, 3, 1]

		/*
		 * Eliminando elementos de LinkedList
		 *
		 * boolean remove(Object obj): declarado en la interfaz de Colección. Elimina
		 * una instancia de obj de la colección que invoca. Devuelve verdadero si el elemento
		 * fue removido. De lo contrario, devuelve falso.
		 *
		 * boolean removeAll(Colección c): Declarado en la interfaz de Colección.
		 * Elimina todos los elementos de c de la colección que invoca. Devuelve verdadero si
		 * Se eliminaron elementos de la colección que invoca. De lo contrario, devuelve falso.
		 *
		 * E remove(int index): Declarado en la interfaz Lista. Elimina el elemento en
		 * el índice especificado de la lista de invocación, devolviendo el elemento en el
		 * proceso. Los índices de los elementos siguientes se reducen en uno.
		 *
		 * booleano retenerTodo(Colección c): Declarado en la interfaz de Colección.
		 * Elimina todos los elementos de la colección que invoca excepto aquellos en c. Devoluciones
		 * verdadero si se eliminaron elementos de la colección que invoca. De lo contrario,
		 * devuelve falso.
		 */

		// numList = [7, 3, 5, 6, 4, 7, 3, 1]
		numList.remove(Integer.valueOf(3));
		// numList = [7, 5, 6, 4, 7, 3, 1]

		nums = new LinkedList<>(Arrays.asList(6, 7));

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

		numList.retainAll(nums); // Elements [3, 4] se eliminan de la lista
		// numList = [5, 1, 7, 1, 5]

		System.out.println("numList = " + numList);
		// numList = [5, 1, 7, 1, 5]

		/*
		 * Comprobar si LinkedList contiene un objeto
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

		nums = new LinkedList<>(Arrays.asList(5, 7));

		// numList = [5, 1, 7, 1, 5]
		if (numList.containsAll(nums))
			System.out.println("numList contains all elements of nums");
		else
			System.out.println("numList does not contain all elements of nums");

		/*
		 * Obtener el elemento en un índice en LinkedList
		 *
		 * E get(int index): declarado en la interfaz Lista. Devuelve el objeto almacenado
		 * en el índice especificado dentro de la colección que invoca.
		 */

		// numList = [5, 1, 7, 1, 5]
		int element = numList.get(2);

		System.out.println("element = " + element); // element = 7

		/*
		 * Obtener el índice de un elemento en LinkedList
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
		 * Establecer el elemento en un índice en LinkedList
		 *
		 * E set(int index, E obj): declarado en la interfaz Lista. Asigna objeto a la
		 * ubicación especificada por índice dentro de la lista de invocación. Devuelve el valor anterior.
		 */

		// numList = [5, 1, 7, 1, 5]
		int oldValue = numList.set(3, 9);

		System.out.println("oldValue = " + oldValue); // oldValue = 1

		System.out.println("numList = " + numList); // numList = [5, 1, 7, 9, 5]

		/*
		 * Compruebe si LinkedList está vacío o no
		 *
		 * booleano isEmpty(): Declarado en la interfaz de Colección. Devuelve verdadero si
		 * La colección que invoca está vacía. De lo contrario, devuelve falso.
		 */

		// numList = [5, 1, 7, 9, 5]
		if (numList.isEmpty())
			System.out.println("LinkedList is empty");
		else
			System.out.println("LinkedList is not empty");

		/*
		 * Obtener el recuento de elementos presentes en LinkedList
		 *
		 * int size(): Declarado en la interfaz de Colección. Devuelve el número de
		 * elementos contenidos en la colección que invoca.
		 */

		// numList = [5, 1, 7, 9, 5]
		int listSize = numList.size();

		System.out.println("Size = " + listSize); // Size = 5

		/*
		 * Obtener sublista de una LinkedList
		 *
		 * List<E> subList(int startIndex, int endIndex): Declarado en la interfaz List
		 * Devuelve una lista que incluye elementos desde startIndex hasta (endIndex- 1)
		 * en la lista de invocación. También se hace referencia a los elementos de la lista devuelta.
		 * por el objeto que invoca.
		 */

		// numList = [5, 1, 7, 9, 5]
		List<Integer> subLinkedList = new LinkedList<Integer>();

		subLinkedList = numList.subList(1, 4);

		System.out.println("subLinkedList = " + subLinkedList); // subLinkedList = [1, 7, 9]

		/*
		 * Limpiar la LinkedList
		 *
		 * void clear(): Declarado en la interfaz de Colección. Elimina todos los elementos
		 * de la colección que invoca.
		 */

		// numList = [5, 1, 7, 9, 5]
		numList.clear();

		System.out.println("numList = " + numList); // numList = []

		/*
		 * Construir LinkedList a partir de un array
		 */

		String fruits[] = { "apple", "grape", "banana", "orange", "grape" };

		List<String> fruitList = new LinkedList<>();

		Collections.addAll(fruitList, fruits);

		System.out.println("fruitList = " + fruitList);
		// fruitList = [apple, grape, banana, orange, grape]

		/*
		 * Construir array a partir de LinkedList
		 */

		String fruitArr[] = fruitList.toArray(new String[fruitList.size()]);

		System.out.println("fruitArr = " + Arrays.toString(fruitArr));
		// fruitArr = [apple, grape, banana, orange, grape]

		/*
		 * Iterando sobre el contenido de una LinkedList
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

		/*
		 * Métodos declarados por las interfaces 'Queue', 'Deque'
		 */

		LinkedList<Integer> demoList = new LinkedList<>();

		/*
		 * Añadiendo elementos a la LinkedList
		 *
		 * boolean offer(E obj) : Declarado en la interfaz Queue. Agrega objeto al la cola. Devuelve true si el objeto
		 * fue agregado, de lo contrario devuelve false.
		 *
		 * void addFirst(E obj) : Declarado en la interfaz Deque. Agrega objeto al primer elemento de la lista.
		 * Lanza una excepción IllegalStateException si la deque está llena.
		 *
		 * void addLast(E obj) : Declarado en la interfaz Deque. Agrega objeto al final de la lista. Lanza una excepción
		 * IllegalStateException si la deque está llena.
		 *
		 * void offerFirst(E obj) : Declarado en la interfaz Deque. Intenta agregar objeto al primer elemento de la lista.
		 * Devuelve true si el objeto fue agregado, de lo contrario devuelve false.
		 *
		 * void offerLast(E obj) : Declarado en la interfaz Deque. Intenta agregar objeto al final de la lista.
		 * Devuelve true si el objeto fue agregado, de lo contrario devuelve false.
		 *
		 * void push(E obj) : Declarado en la interfaz Deque. Agrega objeto al primer elemento de la lista. Lanza una excepción
		 * IllegalStateException si la deque está llena.
		 */

		demoList.add(10);
		// demoList = [10]

		demoList.offer(20);
		// demoList = [10, 20]

		demoList.addFirst(30);
		// demoList = [30, 10, 20]

		demoList.addLast(40);
		// demoList = [30, 10, 20, 40]

		demoList.offerFirst(50);
		// demoList = [50, 30, 10, 20, 40]

		demoList.offerLast(60);
		// demoList = [50, 30, 10, 20, 40, 60]

		demoList.push(70);
		// demoList = [70, 50, 30, 10, 20, 40, 60]

		System.out.println("demoList = " + demoList);
		// demoList = [70, 50, 30, 10, 20, 40, 60]

		/*
		 * Eliminando elementos de la LinkedList
		 *
		 * E remove() : Declarado en la interfaz Queue. Elimina el elemento en la cabeza de la cola. Devuelve el elemento
		 * en el proceso. Lanza una excepción NoSuchElementException si la cola esta vacía.
		 *
		 * E removeFirst() : Declarado en la interfaz Deque. Elimina el elemento en la cabeza de la deque. Devuelve el elemento
		 * en el proceso. Lanza una excepción NoSuchElementException si la deque esta vacía.
		 *
		 * boolean removeLast() : Declarado en la interfaz Deque. Elimina el elemento en la cola de la deque. Devuelve el elemento
		 * en el proceso. Lanza una excepción NoSuchElementException si la deque esta vacía.
		 *
		 * boolean removeFirstOccurrence(Object obj) : Declarado en la interfaz Deque. Elimina la primera ocurrencia del objeto
		 * obj de la deque. Devuelve true si se elimino exitosamente y false si la deque no contiene el objeto.
		 *
		 * boolean removeLastOccurrence(Object obj) : Declarado en la interfaz Deque. Elimina la ultima ocurrencia del objeto
		 * obj de la deque. Devuelve true si se elimino exitosamente y false si la deque no contiene el objeto.
		 *
		 */

		// demoList = [70, 50, 30, 10, 20, 40, 60]
		demoList.remove();
		// demoList = [50, 30, 10, 20, 40, 60]

		demoList.remove(2);
		// demoList = [50, 30, 20, 40, 60]

		demoList.removeFirst();
		// demoList = [30, 20, 40, 60]

		demoList.removeLast();
		// demoList = [30, 20, 40]

		demoList.addLast(20);
		// demoList = [30, 20, 40, 20]

		demoList.removeFirstOccurrence(20);
		// demoList = [30, 40, 20]

		demoList.addFirst(20);
		// demoList = [20, 30, 40, 20]

		demoList.removeLastOccurrence(20);
		// demoList = [20, 30, 40]

		System.out.println("demoList = " + demoList); // demoList = [20, 30, 40]

		/*
		 * Obtener el elemento de la cabeza / cola de LinkedList
		 *
		 * E peek() : Declarado en la interfaz Queue. Retorna el elemento en la cabeza de la cola.
		 * Retorna null si la cola está vacía.
		 *
		 * E peekFirst() : Declarado en la interfaz Deque. Retorna el elemento en la cabeza del deque.
		 * Retorna null si el deque está vacío. El objeto no es removido.
		 *
		 * E peekLast() : Declarado en la interfaz Deque. Retorna el elemento en la cola del deque.
		 * Retorna null si el deque está vacío. El objeto no es removido.
		 *
		 * E getFirst() : Declarado en la interfaz Deque. Retorna el primer elemento en el deque.
		 * El objeto no es removido del deque. Lanza NoSuchElementException si el deque está vacío.
		 *
		 * E getLast() : Declarado en la interfaz Deque. Retorna el último elemento en el deque.
		 * El objeto no es removido del deque. Lanza NoSuchElementException si el deque está vacío.
		 */


		// demoList = [20, 30, 40]
		int headElement = demoList.peek();

		System.out.println("headElement = " + headElement); // headElement = 20

		headElement = demoList.peekFirst();

		System.out.println("headElement = " + headElement); // headElement = 20

		int tailElement = demoList.peekLast();

		System.out.println("tailElement = " + tailElement); // tailElement = 40

		headElement = demoList.getFirst();

		System.out.println("headElement = " + headElement); // headElement = 20

		tailElement = demoList.getLast();

		System.out.println("tailElement = " + tailElement); // tailElement = 40

		/*
		 * Obtener y remover el elemento de la cabeza / cola de LinkedList
		 *
		 * E poll() : Declarado en la interfaz Queue. Retorna el elemento en la cabeza de la cola,
		 * removiendo el elemento en el proceso. Retorna null si la cola está vacía.
		 *
		 * E pop() : Declarado en la interfaz Deque. Retorna el elemento en la cabeza del deque,
		 * removiéndolo en el proceso. Lanza NoSuchElementException si el deque está vacío.
		 *
		 * E pollFirst() : Declarado en la interfaz Deque. Retorna el elemento en la cabeza del deque,
		 * removiendo el elemento en el proceso. Retorna null si el deque está vacío.
		 *
		 * E pollLast() : Declarado en la interfaz Deque. Retorna el elemento en la cola del deque,
		 * removiendo el elemento en el proceso. Retorna null si el deque está vacío.
		 */

		demoList.addFirst(10);
		demoList.addLast(50);

		// demoList = [10, 20, 30, 40, 50]
		removedElement = demoList.poll();

		System.out.println("removedElement = " + removedElement); // removedElement = 10

		// demoList = [20, 30, 40, 50]
		removedElement = demoList.pop();

		System.out.println("removedElement = " + removedElement); // removedElement = 20

		// demoList = [30, 40, 50]
		removedElement = demoList.pollFirst();

		System.out.println("removedElement = " + removedElement); // removedElement = 30

		// demoList = [40, 50]
		removedElement = demoList.pollLast();

		System.out.println("removedElement = " + removedElement); // removedElement = 50

		System.out.println("demoList = " + demoList); // demoList = [40]

		/*
		 * Iteración en orden inverso sobre el contenido de un LinkedList
		 *
		 * Iterator<E> descendingIterator() : Declarado en la interfaz Deque.
		 * Retorna un iterador que se mueve desde la cola hasta la cabeza (iterador inverso) del deque.
		 */


		demoList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
		// demoList = [10, 20, 30, 40, 50]

		Iterator reverseItr = demoList.descendingIterator();

		while (reverseItr.hasNext()) {
			System.out.print(reverseItr.next() + " ");
		}
		// 50 40 30 20 10

	}

}
