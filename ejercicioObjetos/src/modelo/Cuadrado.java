package modelo;

public class Cuadrado {
	public int calcularArea(int lado,int elevar) {
		return (int) Math.pow(lado, elevar);
	}
	public int calcularPerimetro(int lado,int valor) {
		return lado*valor;
	}

}
