package principal;


public class Prueba {

	private int m;
	private int n;
	private int o;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polinomio p1 = new Polinomio(5);
		Polinomio p2 = new Polinomio(4,5);
		p1.addVariable(2, 2);
		System.out.println(p1);
		System.out.println(p2);
		Polinomio p3 = Polinomio.suma(p1, p2);
		System.out.println("Suma: " + p3);
		System.out.println("------------- Segunda ejecución --------------");
		p1 = new Polinomio(5,8);
		p2 = new Polinomio(4,4);
		p2.addVariable(5, 2);
		System.out.println(p1);
		System.out.println(p2);
		p3 = Polinomio.suma(p1, p2);
		System.out.println("Suma: " + p3);
	}
}