import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Una cola es una lista ordenada de objetos que se procesan en un modo primero en entrar, primero en salir (FIFO),
 * es decir, los elementos se insertan en la cola al final o la cola trasera, mientras que
 * la eliminación de elementos ocurre al principio o la cola delantera de la cola.
 */

public class Aprende_Queue {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Queue' extiende la interfaz 'Collection' y declara el
		 * comportamiento de una cola. 'Queue' siendo una interfaz necesita una clase que proporcione
		 * implementación a sus métodos y también que podamos crear objetos de esa
		 * clase. 'LinkedList' y 'PriorityQueue' son las clases más comúnmente usadas
		 * al crear un objeto de cola.
		 */

		/*
		 * La clase 'LinkedList' extiende la clase 'AbstractSequentialList' e implementa las
		 * interfaces 'List', 'Queue' y 'Deque'.
		 */

		Queue<Integer> demoCola = new LinkedList<>();

		/*
		 * Agregar un elemento a la cola
		 *
		 * boolean add(E obj): Declarado en la interfaz Collection. Agrega un objeto a la
		 * colección. Retorna true si el objeto fue agregado, de lo contrario retorna false.
		 *
		 * boolean offer(E obj): Declarado en la interfaz Queue. Agrega un objeto a la
		 * cola. Retorna true si el objeto fue agregado, de lo contrario retorna false.
		 */

		demoCola.add(30);
		// demoCola = [30]

		demoCola.add(10);
		// demoCola = [30, 10]

		demoCola.add(50);
		// demoCola = [30, 10, 50]

		System.out.println("demoCola = " + demoCola); // demoCola = [30, 10, 50]

		demoCola.offer(20);
		// demoCola = [30, 10, 50, 20]

		demoCola.offer(40);
		// demoCola = [30, 10, 50, 20, 40]

		System.out.println("demoCola = " + demoCola); // demoCola = [30, 10, 50, 20, 40]

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

		demoCola.remove();
		// demoCola = [10, 50, 20, 40]

		System.out.println("demoCola = " + demoCola); // demoCola = [10, 50, 20, 40]

		int elementoEliminado = demoCola.remove();
		// demoCola = [50, 20, 40]

		System.out.println("Elemento eliminado = " + elementoEliminado); // Elemento eliminado = 10

		demoCola.add(10);
		// demoCola = [50, 20, 40, 10]

		demoCola.remove(10);
		// demoCola = [50, 20, 40]

		System.out.println("demoCola = " + demoCola); // demoCola = [50, 20, 40]

		/*
		 * Obtener el elemento en la cabeza de la cola
		 *
		 * E peek(): Declarado en la interfaz Queue. Retorna el elemento en la cabeza
		 * de la cola. Retorna null si la cola está vacía.
		 */

		int elementoCabeza = demoCola.peek();
		// demoCola = [50, 20, 40]

		System.out.println("Elemento de la cabeza = " + elementoCabeza); // Elemento de la cabeza = 50

		/*
		 * Obtener y eliminar el elemento en la cabeza de la cola
		 *
		 * E poll(): Declarado en la interfaz Queue. Retorna el elemento en la cabeza
		 * de la cola, eliminando el elemento en el proceso. Retorna null si la
		 * cola está vacía.
		 */

		elementoCabeza = demoCola.poll();
		// demoCola = [20, 40]

		System.out.println("Elemento de la cabeza = " + elementoCabeza); // Elemento de la cabeza = 50

		demoCola.poll();
		// demoCola = [40]

		System.out.println("demoCola = " + demoCola); // demoCola = [40]

		/*
		 * Obtener el conteo de elementos presentes en la cola
		 *
		 * int size(): Declarado en la interfaz Collection. Retorna el número de
		 * elementos contenidos en la colección invocadora.
		 */

		int tamañoCola = demoCola.size();

		System.out.println("Tamaño = " + tamañoCola); // Tamaño = 1

		/*
		 * Verificar si la cola está vacía o no
		 *
		 * boolean isEmpty(): Declarado en la interfaz Collection. Retorna true si la
		 * colección invocadora está vacía. De lo contrario, retorna false.
		 */

		if (demoCola.isEmpty())
			System.out.println("¡La cola está vacía!");
		else
			System.out.println("¡La cola no está vacía!");

		/*
		 * Verificar si un objeto está presente en la cola
		 *
		 * boolean contains(Object obj): Declarado en la interfaz Collection. Retorna
		 * true si obj es un elemento de la colección invocadora. De lo contrario,
		 * retorna false.
		 */

		int valor = 40;

		if (demoCola.contains(valor))
			System.out.println("La cola contiene " + valor);
		else
			System.out.println("La cola no contiene " + valor);

		/*
		 * Limpiar la cola
		 *
		 * void clear(): Declarado en la interfaz Collection. Elimina todos los elementos
		 * de la colección invocadora.
		 */

		demoCola.clear();
		// demoCola = []

		System.out.println("demoCola = " + demoCola); // demoCola = []

		/*
		 * Construir una cola a partir de un array
		 */

		String frutas[] = { "manzana", "uva", "plátano", "naranja" };

		Queue<String> colaFrutas = new LinkedList<>();

		Collections.addAll(colaFrutas, frutas);

		System.out.println("colaFrutas = " + colaFrutas); // colaFrutas = [manzana, uva, plátano, naranja]

		/*
		 * Construir un array a partir de una cola
		 */

		String arregloFrutas[] = colaFrutas.toArray(new String[colaFrutas.size()]);

		System.out.println("arregloFrutas = " + Arrays.toString(arregloFrutas)); // arregloFrutas = [manzana, uva, plátano, naranja]

		/*
		 * Iterar sobre el contenido de una cola
		 */

		Iterator itr = colaFrutas.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		for (String fruta : colaFrutas) {
			System.out.print(fruta + " ");
		}

	}

}