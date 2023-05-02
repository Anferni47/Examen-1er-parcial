package examen;
import java.util.Scanner;
public class serie_de_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner x=new Scanner(System.in);
		int t;
System.out.print("Ingrese la cantidad de términos que desea calcular: ");
  t=x.nextInt();
  x.close();
  int n1=0, n2=1;
  System.out.print("Los iniciales " + t + " números de la serie Fibonacci son: ");
  for(int i=1;i<=t;i++) {
	  System.out.print(n1 + " + ");
	  int suma =n1 + n2;
	  n1=n2;
	  n2=suma;
  }
	}

}
