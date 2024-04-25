import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * El Framework de Colecciones define varios algoritmos que pueden aplicarse a colecciones
 * y mapas. Estos algoritmos están definidos como métodos estáticos dentro de la clase 'Collections'.
 */

class Compare implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return (b - a);
	}

}

public class Aprende_Algoritmos {

	public static void main(String[] args) {

		ArrayList<Integer> demoList = new ArrayList<>();

		demoList.add(7);
		demoList.add(4);
		demoList.add(2);
		demoList.add(5);
		demoList.add(2);
		demoList.add(3);

		System.out.println("demoList = " + demoList);
		// demoList = [7, 4, 2, 5, 2, 3]

		/*
		 * void sort(List<T> list) : Ordena los elementos de una lista, que debe implementar
		 * la interfaz Comparable. El orden es determinado por el orden natural del tipo de elementos
		 * tal como es implementado por el método compareTo de su clase. El método
		 * compareTo está declarado en la interfaz Comparable.
		 */

		// demoList = [7, 4, 2, 5, 2, 3]
		Collections.sort(demoList);

		System.out.println("demoList = " + demoList);
		// demoList = [2, 2, 3, 4, 5, 7]

		/*
		 * void sort(List<T> list, Comparator<T> comp) : Ordena los elementos de una lista según
		 * lo determine el comparador.
		 */

		// demoList = [2, 2, 3, 4, 5, 7]
		Collections.sort(demoList, new Compare());

		System.out.println("demoList = " + demoList);
		// demoList = [7, 5, 4, 3, 2, 2]

		/*
		 * void reverse(List<T> list) : Invierte la secuencia de objetos en la lista.
		 */

		// demoList = [7, 5, 4, 3, 2, 2]
		Collections.reverse(demoList);

		System.out.println("demoList = " + demoList);
		// demoList = [2, 2, 3, 4, 5, 7]

		/*
		 * Comparator<T> reverseOrder() : Retorna un comparador inverso, que es un
		 * comparador que invierte el resultado de una comparación entre dos elementos.
		 */

		// demoList = [2, 2, 3, 4, 5, 7]
		Collections.sort(demoList, Collections.reverseOrder());

		System.out.println("demoList = " + demoList);
		// demoList = [7, 5, 4, 3, 2, 2]

		/*
		 * void shuffle(List<T> list) : Reordena aleatoriamente los elementos de la lista.
		 */

		Collections.shuffle(demoList);

		System.out.println("demoList = " + demoList);
		// demoList = [2, 3, 2, 7, 4, 5] (la salida puede variar ya que el barajado es aleatorio)

		Collections.sort(demoList);
		// demoList = [2, 2, 3, 4, 5, 7]

		/*
		 * void rotate(List<T> list, int n) : Rota una lista en n lugares hacia la derecha.
		 * Para rotar a la izquierda, use un valor negativo para n.
		 */

		// demoList = [2, 2, 3, 4, 5, 7]
		Collections.rotate(demoList, 4);

		System.out.println("demoList = " + demoList);
		// demoList = [3, 4, 5, 7, 2, 2]

		/*
		 * void swap(List<T> list, int idx1, int idx2) : Intercambia los elementos en la lista
		 * en los índices idx1 e idx2.
		 */

		// demoList = [3, 4, 5, 7, 2, 2]
		Collections.swap(demoList, 4, 1);

		System.out.println("demoList = " + demoList);
		// demoList = [3, 2, 5, 7, 4, 2]

		/*
		 * boolean replaceAll(List<T> list, T oldValue, T newValue) : Reemplaza todas
		 * las ocurrencias de oldValue en la lista con newValue. Retorna true si incluso una
		 * ocurrencia de oldValue fue reemplazada con newValue, de lo contrario retorna false.
		 */

		// demoList = [3, 2, 5, 7, 4, 2]
		Collections.replaceAll(demoList, 2, 1);

		System.out.println("demoList = " + demoList);
		// demoList = [3, 1, 5, 7, 4, 1]

		/*
		 * T min(Collection<T> c) : Retorna el elemento mínimo en la colección c como
		 * determinado por el orden natural. La colección no necesita estar preordenada.
		 */

		// demoList = [3, 1, 5, 7, 4, 1]
		int minElement = Collections.min(demoList);

		System.out.println("minElement = " + minElement);
		// minElement = 1

		/*
		 * T max(Collection<T> c) : Retorna el elemento máximo en la colección c como
		 * determinado por el orden natural. La colección no necesita estar preordenada.
		 */

		// demoList = [3, 1, 5, 7, 4, 1]
		int maxElement = Collections.max(demoList);

		System.out.println("maxElement = " + maxElement);
		// minElement = 7

		/*
		 * int frequency(Collection<T> c, Object obj) : Retorna el conteo del número
		 * de ocurrencias de obj en la colección c.
		 */

		// demoList = [3, 1, 5, 7, 4, 1]
		int occurrenceCount = Collections.frequency(demoList, 1);

		System.out.println("occurrenceCount = " + occurrenceCount);
		// occurrenceCount = 2

		/*
		 * boolean disjoint(Collection<T> a, Collection<T> b) : Compara los elementos en
		 * a con los elementos en b. Retorna true si las dos colecciones no contienen elementos comunes.


		 * De lo contrario, retorna false.
		 */

		ArrayList<String> fruitList1 = new ArrayList<>(Arrays.asList("naranja", "plátano", "mango"));
		ArrayList<String> fruitList2 = new ArrayList<>(Arrays.asList("piña", "uva"));

		boolean isDisjoint = Collections.disjoint(fruitList1, fruitList2);

		if (isDisjoint)
			System.out.println("Disjuntos");
		else
			System.out.println("No Disjuntos");

		/*
		 * void copy (List<T> a, List<T> b) : Copia los elementos de la lista b en la lista a.
		 */

		// fruitList1 = [naranja, plátano, mango]
		// fruitList2 = [piña, uva]
		Collections.copy(fruitList1, fruitList2);

		System.out.println("fruitList1 = " + fruitList1);
		// fruitList1 = [piña, uva, mango]

		System.out.println("fruitList2 = " + fruitList2);
		// fruitList2 = [piña, uva]

		/*
		 * void fill(List<T> list, T obj) : Asigna obj a cada elemento de la lista.
		 */

		// demoList = [3, 1, 5, 7, 4, 1]
		Collections.fill(demoList, 5);

		System.out.println("demoList = " + demoList);
		// demoList = [5, 5, 5, 5, 5, 5]

		/*
		 * int binarySearch(List<T> list, T value) : Busca value en la lista. La
		 * lista debe estar ordenada en orden ascendente según el orden natural de
		 * sus elementos. Si la lista contiene la clave de búsqueda, se devuelve su índice. Si
		 * no, el valor de retorno es (-(punto de inserción) - 1), donde el punto de inserción
		 * es el punto en el que se insertaría el valor en la lista, o el índice
		 * del primer elemento mayor que el valor o list.size() si todos los elementos en
		 * la lista son menores que el valor especificado.
		 */

		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 6, 9, 12, 17));

		// nums = [5, 6, 9, 12, 17]
		int foundIndex = Collections.binarySearch(nums, 12);

		System.out.println("foundIndex = " + foundIndex);
		// foundIndex = 3

		// nums = [5, 6, 9, 12, 17]
		foundIndex = Collections.binarySearch(nums, 15);

		System.out.println("foundIndex = " + foundIndex);
		// foundIndex = -5

		nums.add(-foundIndex - 1, 15); // inserta el elemento faltante en la posición apropiada

		System.out.println("nums = " + nums);
		// nums = [5, 6, 9, 12, 15, 17]

	}

}