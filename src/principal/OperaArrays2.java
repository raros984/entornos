package principal;

import java.util.Random;

public class OperaArrays2 {

	public static int TAMANO = 30;
	public static int MAXVAL = 40;
	public static int[] uno = new int[TAMANO];
	public static int[] dos = new int[TAMANO];
	public static int[] tres = new int[TAMANO];
	
	public static void main(String[] args) {
		// TODO Recorrer y operar con posiciones según valor de variable, y en ocasiones da null pointer exception
		rellena(uno);
		rellena(dos);
		tres = opera(uno,dos);
		muestra(uno);
		muestra(dos);
		muestra(tres);
	}

	public static void rellena(int[] a) {
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(MAXVAL);
		}
	}
	
	public static void rellena(int[] a, int v) {
		for(int i = 0; i < a.length; i++) {
			a[i] = v;
		}
	}
	
	public static int[] opera(int[] a, int[] b) {
		int[] c = new int[a.length];
		//rellena(c,0);
		for(int i = 0; i < b.length; i++) {
			c[i] += b[a[i]];
			//A la hora de usar expressions vemos que cuando incluimos la b da 37 numero el cual no contiene b.
		}
		return c;
	}
	
	public static void muestra(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println(a[a.length-1]+"]");
	}
}