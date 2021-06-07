package modelo;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Main {
	private static final String letras[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R"
			,"S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};
	private static final String valores[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-"
			,"...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
	
	public static void main(String[] args) {
		try {
			do {
				String op=JOptionPane.showInputDialog(null,"Por favor seleccione una opcion:\n"
						+"1.- Convertir palabra a codigo morse\n"
						+"2.- Convertir codigo morse a palabra \n"
						+"3.- Salir \n");
				switch (Integer.parseInt(op)) {
				case 1:
					Hashtable<?, ?> valoresBuscar=crearTablaHash(letras, valores);
					String palabra=JOptionPane.showInputDialog("Ingrese la palabras a transformar");
					System.out.println(buscarCoincidencias(palabra.toUpperCase().toCharArray(), valoresBuscar));
				break;
				case 2:
					Hashtable<?, ?> valoresBuscarMorse=crearTablaHash(valores, letras);
					String palabraMorse=JOptionPane.showInputDialog("Ingrese la palabra a transformar, recuerde que necesita dejar un espacio entre cada caracter y dos espacios entre cada palabra");
					System.out.println(buscarCoincidenciasMorse(palabraMorse.toUpperCase().split(" "), valoresBuscarMorse));
				break;
				case 3:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida cerrando el menu");
					System.exit(0);
				}
			} while (true);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Parece que algo salio mal vuelve a intentarlo");
		}

	}
	private static Hashtable<String, String> crearTablaHash(String keys[],String val[]) {
		Hashtable<String, String> tabla=new Hashtable<String, String>();
		for (int i = 0; i < keys.length; i++) {
			tabla.put(keys[i], val[i]);
		}
		return tabla;
	}
	
	private static String buscarCoincidencias(char palabra[], Hashtable<?, ?> tabla) {
		String palabraFinal="";
		for (int i = 0; i < palabra.length; i++) {
			if(Character.compare(palabra[i], ' ')==0) {
				palabraFinal+="  ";
			}else {
				palabraFinal+=tabla.get(String.valueOf(palabra[i])).toString()+" ";
			}
		}
		return palabraFinal;
	}
	private static String buscarCoincidenciasMorse(String palabra[], Hashtable<?, ?> tabla) {
		String palabraFinal="";
		for (int i = 0; i < palabra.length; i++) {
			if(tabla.get(palabra[i])==null) {
					palabraFinal+=" ";
			}else {
					palabraFinal+=tabla.get(palabra[i]);
			}
		}
		return palabraFinal;
	}
	
	
	

}
