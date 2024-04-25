import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Un mapa almacena pares clave-valor. Tanto las claves como los valores son objetos.
 * Usando una clave puedes encontrar su valor correspondiente. Las claves deben ser únicas, pero
 * los valores pueden contener duplicados.
 */

public class Aprende_TreeMap {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Map' mapea claves únicas a valores. Una clave es un objeto que puede
		 * ser usado para recuperar su valor correspondiente. La clase 'AbstractMap'
		 * implementa la mayor parte de la interfaz 'Map' y sirve como una superclase para todos
		 * las implementaciones de mapas concretas.
		 *
		 * La interfaz 'SortedMap' extiende la interfaz 'Map' y asegura que las entradas del mapa
		 * estén ordenadas en orden ascendente según las claves.
		 *
		 * La interfaz 'NavigableMap' extiende la interfaz 'SortedMap' y declara el comportamiento de un
		 * mapa que admite la recuperación de entradas basadas en la coincidencia más cercana con una clave o claves dadas.
		 *
		 * La clase 'TreeMap' extiende la clase 'AbstractMap' e implementa la interfaz 'NavigableMap'.
		 * Un TreeMap almacena pares clave-valor ordenados en orden ascendente de las claves, lo que nos permite
		 * recuperar entradas de manera eficiente.
		 */

		TreeMap<Integer, String> studentMap = new TreeMap<>();

		/*
		 * Agregando elementos a TreeMap
		 *
		 * V put(K k, V v): Declarado en la interfaz 'Map'. Pone una entrada en el
		 * mapa invocador, sobrescribiendo cualquier valor anterior asociado con la clave. 'k' es
		 * la clave y 'v' es el valor. Retorna null si la clave no existía anteriormente.
		 * De lo contrario, se devuelve el valor anterior vinculado a la clave.
		 *
		 * void putAll(Map m): Declarado en la interfaz 'Map'. Coloca todas las entradas
		 * de m en el mapa.
		 *
		 * V putIfAbsent(K k, V v): Declarado en la interfaz 'Map'. Inserta el
		 * par clave-valor en el mapa invocador si esta entrada aún no está presente o
		 * si el valor existente para la clave k es nulo. Retorna el valor anterior o null si el
		 * clave k no estaba presente anteriormente en el mapa.
		 */

		studentMap.put(2, "Vivek");
		studentMap.put(1, "Naman");
		studentMap.put(3, "Payal");

		System.out.println("studentMap = " + studentMap);
		// studentMap = {1=Naman, 2=Vivek, 3=Payal}

		Map<Integer, String> newStudents = new TreeMap<>();

		newStudents.put(5, "Anupam");
		newStudents.put(4, "Neha");

		studentMap.putAll(newStudents);

		System.out.println("studentMap = " + studentMap);
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 4=Neha, 5=Anupam}

		String existingStudent = studentMap.putIfAbsent(5, "Rohan");

		System.out.println("existingStudent = " + existingStudent);
		// existingStudent = Anupam

		existingStudent = studentMap.putIfAbsent(6, "Sumit");
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 4=Neha, 5=Anupam, 6=Sumit}

		System.out.println("existingStudent = " + existingStudent);
		// existingStudent = null

		/*
		 * Eliminando elementos de TreeMap
		 *
		 * V remove(K k): Declarado en la interfaz 'Map'. Elimina la entrada cuya clave
		 * es igual a k.
		 *
		 * boolean remove(K k, V v): Declarado en la interfaz 'Map'. Elimina esa
		 * entrada del mapa invocador si la clave es igual a k y el valor es igual a v y retorna
		 * verdadero. De lo contrario, retorna falso.
		 */

		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 4=Neha, 5=Anupam, 6=Sumit}
		studentMap.remove(4);
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam, 6=Sumit}

		studentMap.remove(6, "Sumit");
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam}

		/*
		 * Obtener valores de TreeMap
		 *
		 * V get(K k): Declarado en la interfaz 'Map'. Retorna el valor asociado
		 * con la clave k. Retorna null si la clave no se encuentra.
		 */

		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam}
		String studentName = studentMap.get(2);

		System.out.println("studentName = " + studentName);
		// studentName = Vivek

		studentName = studentMap.get(4);

		System.out.println("studentName = " + studentName);
		// studentName = null

		/*
		 * Comprobar si TreeMap contiene una clave / valor
		 *
		 * boolean containsKey(K k): Declarado en la interfaz 'Map'. Retorna verdadero si
		 * la clave k está presente en el mapa invocador. De lo contrario, retorna falso.
		 *
		 * boolean containsValue(V v): Declarado en la interfaz 'Map'. Retorna verdadero si
		 * el valor v está presente en el mapa invocador. De lo contrario, retorna falso.
		 */

		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam}

		if (studentMap.containsKey(3))
			System.out.println("Clave encontrada");
		else
			System.out.println("Clave no encontrada");

		if (studentMap.containsValue("Pankaj"))
			System.out.println("Valor encontrado");
		else
			System.out.println("

					Valor no encontrado");

					/*
					 * Reemplazar valores en TreeMap
					 *
					 * V replace(K k, V oldValue, V newValue): Declarado en la interfaz 'Map'.
					 * Reemplaza el valor antiguo asociado con la clave k con el nuevo valor
					 * (newValue) si y solo si el valor antiguo coincide con oldValue. Retorna verdadero si
					 * el valor se reemplaza con éxito. De lo contrario, retorna falso.
					 *
					 * V replace(K k, V v): Declarado en la interfaz 'Map'. Reemplaza el valor
					 * asociado con la clave k con el valor v. Retorna el valor anterior asociado con la clave k.
					 */

					// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam}

					String replacedStudent = studentMap.replace(3, "Rohan");

		System.out.println("replacedStudent = " + replacedStudent);
		// replacedStudent = Payal

		boolean isReplaced = studentMap.replace(5, "Anupam", "Pankaj");

		System.out.println("isReplaced = " + isReplaced);
		// isReplaced = true

		System.out.println("studentMap = " + studentMap);
		// studentMap = {1=Naman, 2=Vivek, 3=Rohan, 5=Pankaj}

		/*
		 * Obtener tamaño y comprobar si TreeMap está vacío
		 *
		 * int size(): Declarado en la interfaz 'Map'. Retorna el número de entradas
		 * (pares clave-valor) en el mapa.
		 *
		 * boolean isEmpty(): Declarado en la interfaz 'Map'. Retorna verdadero si
		 * el mapa invocador no contiene entradas. De lo contrario, retorna falso.
		 */

		// studentMap = {1=Naman, 2=Vivek, 3=Rohan, 5=Pankaj}

		int size = studentMap.size();

		System.out.println("size = " + size);
		// size = 4

		boolean isEmpty = studentMap.isEmpty();

		System.out.println("isEmpty = " + isEmpty);
		// isEmpty = false

		/*
		 * Iterar sobre entradas en TreeMap
		 *
		 * Set<Map.Entry<K, V>> entrySet(): Declarado en la interfaz 'Map'.
		 * Retorna una vista de conjunto de las entradas contenidas en el mapa invocador.
		 *
		 * for-each loop: Un bucle for-each (también conocido como bucle mejorado) se utiliza para
		 * recorrer elementos en una colección o un conjunto de elementos.
		 */

		// studentMap = {1=Naman, 2=Vivek, 3=Rohan, 5=Pankaj}

		Set<Map.Entry<Integer, String>> entrySet = studentMap.entrySet();

		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		/*
		 * Limpiar TreeMap
		 *
		 * void clear(): Declarado en la interfaz 'Map'. Elimina todas las
		 * entradas del mapa invocador.
		 */

		studentMap.clear();

		System.out.println("studentMap = " + studentMap);
		// studentMap = {}

		/*
		 * Otros métodos útiles en TreeMap
		 *
		 * K firstKey(): Declarado en la interfaz 'NavigableMap'. Retorna la primera clave
		 * en el mapa.
		 *
		 * K lastKey(): Declarado en la interfaz 'NavigableMap'. Retorna la última clave
		 * en el mapa.
		 *
		 * Map.Entry<K,V> pollFirstEntry(): Declarado en la interfaz 'NavigableMap'.
		 * Retorna y remueve una entrada mapeada con la clave más baja en este mapa, o retorna null
		 * si el mapa está vacío.
		 *
		 * Map.Entry<K,V> pollLastEntry(): Declarado en la interfaz 'NavigableMap'.
		 * Retorna y remueve una entrada mapeada con la clave más alta en este mapa, o retorna null
		 * si el mapa está vacío.
		 */

		// TreeMap vacío
		TreeMap<Integer, String> emptyTreeMap = new TreeMap<>();

		// Lanza NoSuchElementException porque el TreeMap está vacío
		// System.out.println("firstKey = " + emptyTreeMap.firstKey());

		// Retorna null porque el TreeMap está vacío
		System.out.println("firstKey = " + emptyTreeMap.pollFirstEntry());

		// Retorna null porque el TreeMap está vacío
		System.out.println("lastKey = " + emptyTreeMap.pollLastEntry());
	}

}