package ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio2 {

    private static Map<String,Map<String,Map<String, Double>>> artistas = new HashMap<>();
    private static Map<String,Map<String,Map<String, Double>>> jueces = new HashMap<>();
    private static Map<String, List<Double>> media = new HashMap<>();
    private static Map<String,Map<String,Double>> mejorArtistaMetrica = new HashMap<>();

    public static void main(String[] args) {
        agregarNota("DjMotroco","Paco",  "rimas", 5.0);
        agregarNota("DjMotroco","Paco",  "ritmo", 5.0);
        agregarNota("Trueno","Paco",  "rimas", 7.0);
        agregarNota("Trueno","Paco",  "ritmo", 8.0);
        agregarNota("Trueno","Pepe",  "rimas", 7.0);
        agregarNota("Trueno","Pepe",  "ritmo", 3.0);
        printNotasPorArtista("Trueno");
        printNotasPorJuez("Pepe");
        printMediaCantante("Trueno");
        printMejorNotaMetrica("ritmo");
    }
    
    public static void agregarNota(String artista, String juez, String metrica, Double nota) {
        addArtista(artista,juez,metrica,nota);
        addJuez(artista,juez,metrica,nota);
        addMedia(artista,nota);
        addMejorArtista(artista,metrica,nota);
    }

    private static void addMejorArtista(String artista, String metrica, Double nota) {
        if(!mejorArtistaMetrica.containsKey(metrica))
            mejorArtistaMetrica.put(metrica, new HashMap<>());
        if(!mejorArtistaMetrica.get(metrica).containsKey(artista))
            if(mejorArtistaMetrica.get(metrica).get(artista) == null)
                mejorArtistaMetrica.get(metrica).put(artista,nota);
            else if (mejorArtistaMetrica.get(metrica).get(artista) < nota)
                mejorArtistaMetrica.get(metrica).put(artista,nota);
    }

    private static void addMedia(String artista, double nota) {
        if(!media.containsKey(artista))
            media.put(artista, new ArrayList<>());
        media.get(artista).add(nota);
    }

    private static void addJuez(String artista, String juez, String metrica, double nota) {
        if(!jueces.containsKey(juez))
            jueces.put(juez, new HashMap<>());
        if(!jueces.get(juez).containsKey(artista))
            jueces.get(juez).put(artista, new HashMap<>());
        jueces.get(juez).get(artista).put(metrica,nota);
    }

    private static void addArtista(String artista, String juez, String metrica, double nota) {
        if(!artistas.containsKey(artista))
            artistas.put(artista, new HashMap<>());
        if(!artistas.get(artista).containsKey(juez))
            artistas.get(artista).put(juez, new HashMap<>());
        artistas.get(artista).get(juez).put(metrica,nota);
    }

    private static void printMediaCantante(String artista) {
        Double suma = 0.0;
        for(Double nota : media.get(artista))
            suma += nota;
        System.out.println("La media de "+artista+" es "+(suma/media.get(artista).size()));
    }

    private static void printNotasPorArtista(String artista) {
        if(!artistas.containsKey(artista))
            System.out.println("El cantante "+artista+" no tiene notas");
        else{
            System.out.println("Las notas de "+artista+" son: ");
            for(String juez : artistas.get(artista).keySet()){
                System.out.println("Juez: "+juez);
                for(String metrica : artistas.get(artista).get(juez).keySet()){
                    System.out.println("\t"+metrica+": "+artistas.get(artista).get(juez).get(metrica));
                }
            }
        }
    }

    private static void printNotasPorJuez(String juez){
        if(!jueces.containsKey(juez))
            System.out.println("El juez "+juez+" no tiene notas");
        else{
            System.out.println("Las notas del juez " +juez+" son: ");
            for (String artista : jueces.get(juez).keySet()) {
                System.out.println("Cantante: "+artista);
                for (String metrica : jueces.get(juez).get(artista).keySet()) {
                    System.out.println("\t"+metrica+": "+jueces.get(juez).get(artista).get(metrica));
                }
            }
        }
    }

    private static void printMejorNotaMetrica(String metrica){
        if(!mejorArtistaMetrica.containsKey(metrica))
            System.out.println("La metrica "+metrica+" no existe");
        else{
            System.out.println("La mejor nota de la metrica "+metrica+" es: ");
            Double mejor = -1.0;
            String mejorArtista = "";
            for(String artista : mejorArtistaMetrica.get(metrica).keySet())
                if(mejorArtistaMetrica.get(metrica).get(artista) > mejor) {
                    mejor = mejorArtistaMetrica.get(metrica).get(artista);
                    mejorArtista = artista;
                }
            System.out.println("\t"+mejorArtista+": "+mejorArtistaMetrica.get(metrica).get(mejorArtista));
        }
    }


}
