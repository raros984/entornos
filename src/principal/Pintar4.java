package principal; 
import java.util.Scanner;
//Ponemos el import Scanner para poder escanear
public class Pintar4 {

Scanner scanner;

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
//System.out.println(); Lo ponemos para indicarle a el usuario que use el programa que tiene q hacer

int max = scanner.nextInt();

int i=0,j=0;
// Le asigna el valor 0 a j e i
if(max > 0) {
//Si el max es mayor que 0 se le asigna 
        for(i=1;i<=max;i=i+1)

        {

            // Mostramos los asteriscos en cada fila

            for(j=0;j<i;j++)

            {

                System.out.print("*");

            }

            System.out.println();

        }

}

else if(max < 0) {

for(i=max;i>0;i--)
//i debe ser menor que 0 cosa que no se cumple en el for
        {

            // Mostramos los asteriscos en cada fila

            for(j=0;j<i;j++)

            {

                System.out.print("*");

            }

            System.out.println();

        }

}

}

}
