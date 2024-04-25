import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Una cola de prioridad es una lista ordenada de objetos que se procesan según la prioridad.
 * La prioridad de un elemento se basa en el comparador de la cola.
 *
 * Si no se especifica un comparador cuando se construye una PriorityQueue, entonces el comparador
 * predeterminado para el tipo de datos almacenado en la cola se utiliza. Por defecto, el comparador
 * ordenará la cola en orden ascendente, es decir, la cabeza de la cola siempre será el
 * elemento con el valor más pequeño (menor prioridad).
 */

public class Aprende_PriorityQueue {

	public static void main(String[] args) {

		/*
		 * La clase 'PriorityQueue' extiende la clase 'AbstractQueue' e implementa la
		 * interfaz 'Queue'.
		 */

		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
		// el elemento de la cabeza será el valor más pequeño (min-heap)

		/*
		 * Agregar un elemento a la cola de prioridad
		 *
		 * boolean add(E obj): Declarado en la interfaz Collection. Agrega un objeto a la
		 * colección. Retorna true si el objeto fue agregado, de lo contrario retorna false.
		 *
		 * boolean offer(E obj): Declarado en la interfaz Queue. Agrega un objeto a la
		 * cola. Retorna true si el objeto fue agregado, de lo contrario retorna false.
		 */

		minQueue.add(30);
		minQueue.add(20);
		minQueue.add(50);

		System.out.println("minQueue = " + minQueue); // minQueue = [20, 30, 50]

		minQueue.offer(10);
		minQueue.offer(40);

		System.out.println("minQueue = " + minQueue); // minQueue = [10, 20, 50, 30, 40]

		PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
		// el elemento de la cabeza será el valor más grande (max-heap)

		maxQueue.add(30);
		maxQueue.add(20);
		maxQueue.add(50);

		System.out.println("maxQueue = " + maxQueue); // maxQueue = [50, 20, 30]

		maxQueue.offer(10);
		maxQueue.offer(40);

		System.out.println("maxQueue = " + maxQueue); // maxQueue = [50, 40, 30, 10, 20]

		/*
		 * Eliminar un elemento de la cola
		 *
		 * E remove(): Declarado en la interfaz Queue. Elimina el elemento en la cabeza
		 * de la cola y retorna el elemento en el proceso. Lanza
		 * NoSuchElementException si la cola está vacía.
		 *
		 * boolean remove(Object obj): Declarado en la interfaz Collection. Elimina
		 * una instancia de obj de la cola. Retorna true si el elemento fue eliminado.
		 * De lo contrario, retorna false.
		 */

		// minQueue = [10, 20, 50, 30, 40]
		minQueue.remove();
		// minQueue = [20, 30, 50, 40]

		System.out.println("minQueue = " + minQueue); // minQueue = [20, 30, 50, 40]

		// minQueue = [20, 30, 50, 40]
		int elementoEliminado = minQueue.remove();
		// minQueue = [30, 40, 50]

		System.out.println("Elemento eliminado = " + elementoEliminado); // Elemento eliminado = 20

		// minQueue = [30, 40, 50]
		minQueue.remove(40);
		// minQueue = [30, 50]

		System.out.println("minQueue = " + minQueue); // minQueue = [30, 50]

		/*
		 * Obtener el elemento en la cabeza de la cola
		 *
		 * E peek(): Declarado en la interfaz Queue. Retorna el elemento en la cabeza
		 * de la cola. Retorna null si la cola está vacía.
		 */

		// maxQueue = [50, 40, 30, 10, 20]
		int elementoCabeza = maxQueue.peek();

		System.out.println("Elemento de la cabeza = " + elementoCabeza); // Elemento de la cabeza = 50

		/*
		 * Obtener y eliminar el elemento en la cabeza de la cola
		 *
		 * E poll(): Declarado en la interfaz Queue. Retorna el elemento en la cabeza
		 * de la cola, eliminando el elemento en el proceso. Retorna null si la
		 * cola está vacía.
		 */

		// maxQueue = [50, 40, 30, 10, 20]
		elementoCabeza = maxQueue.poll();
		// maxQueue = [40, 20, 30, 10]

		System.out.println("Elemento de la cabeza = " + elementoCabeza); // Elemento de la cabeza = 50

		// maxQueue = [40, 20, 30, 10]
		maxQueue.poll();
		// maxQueue = [30, 20, 10]

		System.out.println("maxQueue = " + maxQueue); // maxQueue = [30, 20, 10]

		/*
		 * Obtener el conteo de elementos presentes en la cola
		 *
		 * int size(): Declarado en la interfaz Collection. Retorna el número de
		 * elementos contenidos en la colección invocadora.
		 */

		// maxQueue = [30, 20, 10]
		int tamañoCola = maxQueue.size();

		System.out.println("Tamaño = " + tamañoCola); // Tamaño = 3

		/*
		 * Verificar si la cola está vacía o no
		 *
		 * boolean isEmpty(): Declarado en la interfaz Collection. Retorna true si la
		 * colección invocadora está vacía. De lo contrario, retorna false.
		 */

		if (maxQueue.isEmpty())
			System.out.println("¡La cola está vacía!");
		else
			System.out.println("¡La cola no está vacía!");

		/*
		 * Verificar si un objeto está presente en la cola
		 *
		 * boolean contains(Object obj): Declarado en la interfaz Collection. Retorna
		 * true si obj es un elemento de la colección invocadora. De lo contrario, retorna
		 * false.
		 */

		int valor = 20;

		// maxQueue = [30, 20, 10]
		if (maxQueue.contains(valor))
			System.out.println("La cola contiene " + valor);
		else
			System.out.println("La cola no contiene " + valor);

		/*
		 * Limpiar la cola
		 *
		 * void clear(): Declarado en la interfaz Collection. Elimina todos los elementos
		 * de la colección invocadora.
		 */

		// minQueue = [30, 50]
		minQueue.clear();
		// minQueue = []

		System.out.println("minQueue = " + minQueue); // minQueue = []

		/*
		 * Construir una cola a partir de un array
		 */

		Integer nums[] = { 40, 10, 50, 20, 30 };

		PriorityQueue<Integer> numsMinQueue = new PriorityQueue<>();

		Collections.addAll(numsMinQueue, nums);

		System.out.println("numsMinQueue = " + numsMinQueue); // numsQueue = [10, 20, 50, 40, 30]

		PriorityQueue<Integer> numsMaxQueue = new PriorityQueue<>(Comparator.reverseOrder());

		Collections.addAll(numsMaxQueue, nums);

		System.out.println("numsMaxQueue = " + numsMaxQueue); // numsMaxQueue = [50, 30, 40, 10, 20]

		/*
		 * Construir un array a partir de una cola
		 */

		Integer numArr[] = numsMinQueue.toArray(new Integer[numsMinQueue.size()]);

		System.out.println("numArr = " + Arrays.toString(numArr)); // numArr = [10, 20, 50, 40, 30]

		/*
		 * Iterar sobre el contenido de una cola
		 */

		Iterator itr = numsMinQueue.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		for (int num : numsMinQueue) {
			System.out.print(num + " ");
		}

	}

}