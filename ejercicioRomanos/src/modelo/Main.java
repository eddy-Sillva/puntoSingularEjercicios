package modelo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Main {
	 public static Map<String, Integer> map = new LinkedHashMap<String, Integer>(); //Ingresa los elementos como se van metiendo, vuelve un poco mas lenta la busqueda creo
	public static void main(String[] args) throws Exception {
		try {
		       int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a convertir a romano"));
		        meterDatosMapa(); //mando llamar el metodo para insertar los datos en el mapa
		        if(dato<1000 && dato>0) {
		        	 System.out.println("El numero: "+dato+" Convertido a romano es: "+convertirRomano(dato)); // imprimo el resultado
		        }else {
		        	JOptionPane.showMessageDialog(null, "Ingrese un numero menor a mil y mayor a 0");
		        }
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error");
		}
    }
    
    
    private static String convertirRomano(int valor){
        String resultado = "";
        while(valor > 0){
            Iterator<Map.Entry<String, Integer>> iterador = map.entrySet().iterator(); // devuelve un conjunto de datos clave, valor obteniendo un iterador
            while(iterador.hasNext()){
            	//System.out.println(iterador.next());
                Map.Entry<String, Integer> entrada = iterador.next();
                if(valor >= entrada.getValue()){
                    valor -= entrada.getValue();
                    resultado += entrada.getKey();
                    break;
                }
            }
        }
        return resultado;
    }
    //Inserta los datos adentro de un mapa
    private static void meterDatosMapa(){
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
    }
}
