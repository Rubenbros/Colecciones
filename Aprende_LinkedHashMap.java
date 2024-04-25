import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

/*
 * Un mapa almacena pares clave-valor. Tanto las claves como los valores son objetos.
 * Usando una clave puedes encontrar su valor. Las claves deben ser únicas, pero
 * los valores pueden contener duplicados.
 */

public class Aprende_LinkedHashMap {

	public static void main(String[] args) {

		/*
		 * La interfaz 'Map' mapea claves únicas a valores. Una clave es un objeto que
		 * se puede usar para recuperar su valor correspondiente. La clase 'AbstractMap'
		 * implementa la mayor parte de la interfaz 'Map' y sirve como superclase para
		 * todas las implementaciones concretas de mapas.
		 *
		 * La clase 'LinkedHashMap' extiende la clase 'HashMap'. Mantiene una lista
		 * enlazada de las entradas en el mapa, en el orden en que fueron insertadas.
		 * Esto permite la iteración en el orden de inserción sobre el mapa, es decir,
		 * el orden en el que los elementos se agregan a un mapa hash es el orden en
		 * el que son accedidos por un iterador.
		 */

		Map<Integer, String> studentMap = new LinkedHashMap<>();

		/*
		 * Agregar elementos a LinkedHashMap
		 *
		 * V put(K k, V v): Declarado en la interfaz 'Map'. Agrega una entrada en el
		 * mapa invocador, sobrescribiendo cualquier valor previo asociado con la clave.
		 * 'k' es la clave y 'v' es el valor. Devuelve null si la clave no existía
		 * previamente. De lo contrario, se devuelve el valor anterior asociado con la clave.
		 *
		 * void putAll(Map m): Declarado en la interfaz 'Map'. Agrega todas las
		 * entradas de 'm' al mapa.
		 *
		 * V putIfAbsent(K k, V v): Declarado en la interfaz 'Map'. Inserta el par
		 * clave-valor en el mapa invocador si esta entrada aún no está presente o si
		 * el valor existente para la clave 'k' es null. Devuelve el valor antiguo o
		 * null si la clave 'k' no estaba presente en el mapa.
		 */

		studentMap.put(1, "Naman");
		studentMap.put(2, "Vivek");
		studentMap.put(3, "Payal");

		System.out.println("studentMap = " + studentMap);
		// studentMap = {1=Naman, 2=Vivek, 3=Payal}

		Map<Integer, String> newStudents = new LinkedHashMap<>();

		newStudents.put(4, "Neha");
		newStudents.put(5, "Anupam");

		studentMap.putAll(newStudents);

		System.out.println("studentMap = " + studentMap);
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 4=Neha, 5=Anupam}

		String existingStudent = studentMap.putIfAbsent(5, "Rohan");

		System.out.println("existingStudent = " + existingStudent);
		// existingStudent = Anupam

		existingStudent = studentMap.putIfAbsent(6, "Sumit");

		System.out.println("existingStudent = " + existingStudent);
		// existingStudent = null

		/*
		 * Eliminar elementos de LinkedHashMap
		 *
		 * V remove(K k): Declarado en la interfaz 'Map'. Elimina la entrada cuya clave
		 * es igual a 'k'.
		 *
		 * boolean remove(K k, V v): Declarado en la interfaz 'Map'. Elimina esa
		 * entrada del mapa invocador si la clave es igual a 'k' y el valor es igual a 'v'
		 * y devuelve true. De lo contrario, devuelve false.
		 */

		studentMap.remove(4);
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam}

		studentMap.remove(6, "Sumit");
		// studentMap = {1=Naman, 2=Vivek, 3=Payal, 5=Anupam}

		/*
		 * Obtener valores de LinkedHashMap
		 *
		 * V get(K k): Declarado en la interfaz 'Map'. Devuelve el valor asociado con
		 * la clave 'k'. Devuelve null si la clave no se encuentra.
		 */

		String studentName = studentMap.get(2);

		System.out.println("studentName = " + studentName);
		// studentName = Vivek

		studentName = studentMap.get(4);

		System.out.println("studentName = " + studentName);
		// studentName = null

		/*
		 * Comprobar si LinkedHashMap contiene una clave / valor
		 *
		 * boolean containsKey(K k): Declarado en la interfaz 'Map'. Devuelve true si
		 * la clave 'k' está presente en el mapa invocador. De lo contrario, devuelve false.
		 *
		 * boolean containsValue(V v): Declarado en la interfaz 'Map'. Devuelve true si
		 * el valor 'v' está presente en el mapa invocador. De lo contrario, devuelve false.
		 */

		if (studentMap.containsKey(3))
			System.out.println("Clave encontrada");
		else
			System.out.println("Clave no encontrada");

		if (studentMap.containsValue("Pankaj"))
			System.out.println("Valor encontrado");
		else
			System.out.println("Valor no encontrado");

		/*
		 * Reemplazar clave / valor en LinkedHashMap
		 *
		 * boolean replace(K k, V oldV, V newV): Declarado en la interfaz 'Map'. Si
		 * el par clave-valor especificado por 'k' y 'oldV' está presente en el mapa
		 * invocador, el valor es reemplazado por 'newV' y se devuelve true. De lo
		 * contrario, se devuelve false.
		 *
		 * V replace(K k, V v): Declarado en la interfaz 'Map'. Si la clave 'k' está
		 * presente en el mapa invocador, su valor correspondiente se establece en 'v'
		 * y se devuelve el valor anterior. De lo contrario, se devuelve null.
		 */

		studentMap.replace(3, "Ronit");
		// studentMap = {1=Naman, 2=Vivek, 3=Ronit, 5=Anupam}

		String oldName = studentMap.replace(3, "Sejal");

		System.out.println("oldName = " + oldName); // oldName = Ronit

		System.out.println("studentMap = " + studentMap);
		// studentMap = {1=Naman, 2=Vivek

, 3=Sejal, 5=Anupam}

	/*
	 * Obtener el recuento de pares clave-valor en LinkedHashMap
	 *
	 * int size(): Declarado en la interfaz 'Map'. Devuelve el número de pares
	 * clave-valor en el mapa.
	 */

	int mapSize = studentMap.size();

        System.out.println("mapSize = " + mapSize); // mapSize = 4

	/*
	 * Comprobar si LinkedHashMap está vacío o no
	 *
	 * boolean isEmpty(): Declarado en la interfaz 'Map'. Devuelve true si el
	 * mapa invocador está vacío. De lo contrario, devuelve false.
	 */

        if (studentMap.isEmpty())
				System.out.println("El mapa está vacío");
        else
				System.out.println("El mapa no está vacío");

	/*
	 * Iterar sobre las entradas de LinkedHashMap
	 *
	 * Set<Map.Entry<K, V>> entrySet(): Declarado en la interfaz 'Map'. Devuelve
	 * un conjunto que contiene las entradas en el mapa. El conjunto contiene
	 * objetos de tipo Map.Entry, es decir, este método proporciona una vista de
	 * conjunto del mapa invocador.
	 */

	Set<Map.Entry<Integer, String>> mapSet = studentMap.entrySet();

        for (Map.Entry<Integer, String> kv : mapSet) {
		System.out.print(kv.getKey() + " -> " + kv.getValue() + " ");
	}
	// 1 -> Naman 2 -> Vivek 3 -> Sejal 5 -> Anupam

        System.out.println();

        for (Map.Entry kv : studentMap.entrySet()) {
		System.out.print(kv.getKey() + " -> " + kv.getValue() + " ");
	}
	// 1 -> Naman 2 -> Vivek 3 -> Sejal 5 -> Anupam

        System.out.println();

	/*
	 * Eliminar todos los pares clave-valor de LinkedHashMap
	 *
	 * void clear(): Declarado en la interfaz 'Map'. Elimina todos los pares
	 * clave-valor del mapa invocador.
	 */

        studentMap.clear();

        System.out.println("studentMap = " + studentMap);
	// studentMap = {}

}