import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

/*
 * Un deque (doble cola) funciona como una cola (primero en entrar, primero en salir) o
 * como una pila (último en entrar, primero en salir).
 */

public class Aprender_Deque {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Deque' extiende la interfaz 'Queue' y declara el comportamiento de
		 * una cola de doble extremo. 'Deque' siendo una interfaz necesita una clase que proporcione
		 * la implementación de sus métodos y también que podamos crear objetos de esa
		 * clase. La clase 'ArrayDeque' se usa al crear un objeto deque.
		 *
		 * La clase 'ArrayDeque' extiende la clase 'AbstractCollection' e implementa la
		 * interfaz 'Deque'. 'ArrayDeque' crea una matriz dinámica y no tiene restricciones
		 * de capacidad.
		 */

		Deque<Integer> demoDeque = new ArrayDeque<>();

		/*
		 * Agregar elementos al deque
		 *
		 * boolean add(E obj): Declarado en la interfaz Collection. Agrega el objeto a la
		 * colección. Devuelve true si el objeto fue agregado, de lo contrario devuelve false.
		 *
		 * boolean offer(E obj): Declarado en la interfaz Queue. Agrega el objeto a la
		 * cola. Devuelve true si el objeto fue agregado, de lo contrario devuelve false.
		 *
		 * void addFirst(E obj): Declarado en la interfaz Deque. Agrega obj al inicio
		 * del deque. Lanza IllegalStateException si un deque de capacidad restringida
		 * se queda sin espacio.
		 *
		 * void addLast(E obj): Declarado en la interfaz Deque. Agrega obj al final del
		 * deque. Lanza IllegalStateException si un deque de capacidad restringida se
		 * queda sin espacio.
		 *
		 * boolean offerFirst(E obj): Declarado en la interfaz Deque. Intenta agregar obj
		 * al inicio del deque. Devuelve true si obj fue agregado y false en caso
		 * contrario.
		 *
		 * boolean offerLast(E obj): Declarado en la interfaz Deque. Intenta agregar obj
		 * al final del deque. Devuelve true si obj fue agregado y false en caso
		 * contrario.
		 *
		 * void push(E obj): Declarado en la interfaz Deque. Agrega obj al inicio del
		 * deque. Lanza IllegalStateException si un deque de capacidad restringida se
		 * queda sin espacio.
		 */

		demoDeque.add(10);
		// demoDeque = [10]

		demoDeque.offer(20);
		// demoDeque = [10, 20]

		demoDeque.addFirst(30);
		// demoDeque = [30, 10, 20]

		demoDeque.addLast(40);
		// demoDeque = [30, 10, 20, 40]

		demoDeque.offerFirst(50);
		// demoDeque = [50, 30, 10, 20, 40]

		demoDeque.offerLast(60);
		// demoDeque = [50, 30, 10, 20, 40, 60]

		demoDeque.push(70);
		// demoDeque = [70, 50, 30, 10, 20, 40, 60]

		System.out.println("demoDeque = " + demoDeque); // demoDeque = [70, 50, 30, 10, 20, 40, 60]

		/*
		 * Eliminar elementos del deque
		 *
		 * E remove(): Declarado en la interfaz Queue. Elimina el elemento al inicio
		 * de la cola devolviendo el elemento en el proceso. Lanza NoSuchElementException si
		 * la cola está vacía.
		 *
		 * boolean remove(Object obj): Declarado en la interfaz Collection. Elimina
		 * una instancia de obj de la cola. Devuelve true si el elemento fue eliminado.
		 * De lo contrario, devuelve false.
		 *
		 * E removeFirst(): Declarado en la interfaz Deque. Elimina el elemento al
		 * inicio del deque devolviendo el elemento en el proceso. Lanza NoSuchElementException si
		 * el deque está vacío.
		 *
		 * E removeLast(): Declarado en la interfaz Deque. Elimina el elemento al
		 * final del deque devolviendo el elemento en el proceso. Lanza NoSuchElementException si
		 * el deque está vacío.
		 *
		 * boolean removeFirstOccurrence(Object obj): Declarado en la interfaz Deque.
		 * Elimina la primera ocurrencia de obj del deque. Devuelve true si es exitoso
		 * y false si el deque no contenía obj.
		 *
		 * boolean removeLastOccurrence(Object obj): Declarado en la interfaz Deque.
		 * Elimina la última ocurrencia de obj del deque. Devuelve true si es exitoso
		 * y false si el deque no contenía obj.
		 */

		// demoDeque = [70, 50, 30, 10, 20, 40, 60]
		demoDeque.remove();
		// demoDeque = [50, 30, 10, 20, 40, 60]

		demoDeque.remove(10);
		// demoDeque = [50, 30, 20, 40, 60]

		demoDeque.removeFirst();
		// demoDeque = [30, 20, 40, 60]

		demoDeque.removeLast();
		// demoDeque = [30, 20, 40]

		demoDeque.addLast(20);
		// demoDeque = [30, 20, 40, 20]

		demoDeque.removeFirstOccurrence(20);
		// demoDeque = [30, 40, 20]

		demoDeque.addFirst(20);
		// demoDeque = [20, 30, 40, 20]

		demoDeque.removeLastOccurrence(20);
		// demoDeque = [20, 30, 40]

		System.out.println("demoDeque = " + demoDeque); // demoDeque = [20, 30, 40]

		/*
		 * Obtener el elemento de la cabeza / cola del deque
		 *
		 * E peek(): Declarado en la interfaz Queue. Devuelve el elemento al inicio
		 * de la cola. Devuelve null si la cola está vacía.
		 *
		 * E peekFirst(): Declarado en la interfaz Deque. Devuelve el elemento al
		 * inicio del deque. Devuelve null si el deque está vacío. El objeto no se
		 *

 elimina.
		 *
		 * E peekLast(): Declarado en la interfaz Deque. Devuelve el elemento al
		 * final del deque. Devuelve null si el deque está vacío. El objeto no se
		 * elimina.
		 *
		 * E getFirst(): Declarado en la interfaz Deque. Devuelve el primer elemento en
		 * el deque. El objeto no se elimina del deque. Lanza NoSuchElementException si
		 * el deque está vacío.
		 *
		 * E getLast(): Declarado en la interfaz Deque. Devuelve el último elemento en
		 * el deque. El objeto no se elimina del deque. Lanza NoSuchElementException si
		 * el deque está vacío.
		 */

		// demoDeque = [20, 30, 40]
		int headElement = demoDeque.peek();

		System.out.println("headElement = " + headElement); // headElement = 20

		headElement = demoDeque.peekFirst();

		System.out.println("headElement = " + headElement); // headElement = 20

		int tailElement = demoDeque.peekLast();

		System.out.println("tailElement = " + tailElement); // tailElement = 40

		headElement = demoDeque.getFirst();

		System.out.println("headElement = " + headElement); // headElement = 20

		tailElement = demoDeque.getLast();

		System.out.println("tailElement = " + tailElement); // tailElement = 40

		/*
		 * Obtener y eliminar el elemento de la cabeza / cola del deque
		 *
		 * E poll(): Declarado en la interfaz Queue. Devuelve el elemento al inicio
		 * de la cola, eliminando el elemento en el proceso. Devuelve null si la cola
		 * está vacía.
		 *
		 * E pop(): Declarado en la interfaz Deque. Devuelve el elemento al inicio del
		 * deque, eliminándolo en el proceso. Lanza NoSuchElementException si
		 * el deque está vacío.
		 *
		 * E pollFirst(): Declarado en la interfaz Deque. Devuelve el elemento al
		 * inicio del deque, eliminando el elemento en el proceso. Devuelve null si
		 * el deque está vacío.
		 *
		 * E pollLast(): Declarado en la interfaz Deque. Devuelve el elemento al
		 * final del deque, eliminando el elemento en el proceso. Devuelve null si
		 * el deque está vacío.
		 */

		demoDeque.addFirst(10);
		demoDeque.addLast(50);

		// demoDeque = [10, 20, 30, 40, 50]
		int removedElement = demoDeque.poll();

		System.out.println("removedElement = " + removedElement); // removedElement = 10

		// demoDeque = [20, 30, 40, 50]
		removedElement = demoDeque.pop();

		System.out.println("removedElement = " + removedElement); // removedElement = 20

		// demoDeque = [30, 40, 50]
		removedElement = demoDeque.pollFirst();

		System.out.println("removedElement = " + removedElement); // removedElement = 30

		// demoDeque = [40, 50]
		removedElement = demoDeque.pollLast();

		System.out.println("removedElement = " + removedElement); // removedElement = 50

		System.out.println("demoDeque = " + demoDeque); // demoDeque = [40]

		/*
		 * Obtener el número de elementos presentes en el deque
		 *
		 * int size(): Declarado en la interfaz Collection. Devuelve el número de
		 * elementos contenidos en la colección que invoca el método.
		 */

		// demoDeque = [40]
		int dequeSize = demoDeque.size();

		System.out.println("Size = " + dequeSize); // Size = 1

		/*
		 * Comprobar si el deque está vacío o no
		 *
		 * boolean isEmpty(): Declarado en la interfaz Collection. Devuelve true si la
		 * colección que invoca el método está vacía. De lo contrario, devuelve false.
		 */

		if (demoDeque.isEmpty())
			System.out.println("¡El deque está vacío!");
		else
			System.out.println("¡El deque no está vacío!");

		/*
		 * Comprobar si un objeto está presente en el deque
		 *
		 * boolean contains(Object obj): Declarado en la interfaz Collection. Devuelve
		 * true si obj es un elemento de la colección que invoca el método. De lo
		 * contrario, devuelve false.
		 */

		int valor = 40;

		if (demoDeque.contains(valor))
			System.out.println("El deque contiene " + valor);
		else
			System.out.println("El deque no contiene " + valor);

		/*
		 * Limpiar el deque
		 *
		 * void clear(): Declarado en la interfaz Collection. Elimina todos los elementos
		 * de la colección que invoca el método.
		 */

		demoDeque.clear();
		// demoDeque = []

		System.out.println("demoDeque = " + demoDeque); // demoDeque = []

		/*
		 * Construir un deque a partir de una matriz
		 */

		String frutas[] = { "manzana", "uva", "plátano", "naranja" };

		Deque<String> fruitDeque = new ArrayDeque<>();

		Collections.addAll(fruitDeque, frutas);

		System.out.println("fruitDeque = " + fruitDeque); // fruitDeque = [manzana, uva, plátano, naranja]

		/*
		 * Construir una matriz a partir de un deque
		 */

		String fruitArr[] = fruitDeque.toArray(new String[fruitDeque.size()]);

		System.out.println("fruitArr = " + Arrays.toString(fruitArr)); // fruitArr = [manzana, uva, plátano, naranja]

		/*
		 * Iterar sobre el contenido de una cola
		 *
		 * Iterator<E> iterator(): Declarado en la interfaz Collection. Devuelve un
		 * iterador para la colección que invoca el método.
		 *
		 * Iterator<E> descendingIterator(): Declarado en la interfaz Deque. Devuelve
		 * un iterador que se mueve desde la cola hasta la cabeza (iterador inverso) del
		 * deque.
		 */

		Iterator itr = fruitDeque.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		Iterator reverseItr = fruitDeque.descendingIterator();

		while (reverseItr.hasNext()) {
			System.out.print(reverseItr.next() + " ");
		}

		System.out.println();

		// Iterar usando el bucle for-each

		for (String fruta : fruitDeque) {
			System.out.print(fruta + " ");


		}
	}
}
