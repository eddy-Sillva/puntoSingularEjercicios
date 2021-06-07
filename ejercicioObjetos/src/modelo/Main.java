package modelo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cubo cubo=new Cubo();
		System.out.println(ejecutarMenu(cubo));
	}
	
	private static int ejecutarMenu(Cubo cubo) {
		System.out.println("No puedo hacer comm");
		int valor=0;
		try {
			valor=Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingresa el lado"));
			do {
				String op=JOptionPane.showInputDialog(null,"Por favor seleccione una opcion:\n"
						+"1.- Calcular area del cuadrado\n"
						+"2.- Calcular permitro del cuadrado \n"
						+"3.- Calcular volumen del cubo \n"
						+"4.- Calcular permitro del cubo \n"
						+"5.- volver a obtener dato  \n"
						+"6.- Salir \n"
						+"El dato con el que se realizaran las Operaciones es el numero: "+valor);
				switch (Integer.parseInt(op)) {
				case 1:
					System.out.println(cubo.calcularArea(valor,2));
					break;
				case 2:
					System.out.println(cubo.calcularPerimetro(4,valor));
					break;
				case 3:
					System.out.println(cubo.calcularArea(valor, 3));
					break;
				case 4:
					System.out.println(cubo.calcularPerimetro(12, valor));
					break;
				case 5:
					ejecutarMenu(cubo);
					break;
				case 6:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida cerrando el menu");
					System.exit(0);
				}
			} while (true);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
			ejecutarMenu(cubo);
		}
		return valor;
	}
}
