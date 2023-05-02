package examen;
import java.util.Scanner;
public class metodo_de_insercion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double[] arr= {100,-120,300,-0.4,50,170,115};
     int n= arr.length;
     for(int i=1; i<n;++i) {
    double key= arr[i];
    int j=i-1;
    while(j>=0 && arr[j]> key) {
    	arr[j + 1]= arr[j];
    	j-= 1;
    }
    arr[j+1]=key;
    }
     System.out.println("Método de inserción: ");
     for(int i=0;i<n;++i) {
    	 System.out.println(arr[i]+ " ");
     }
     
     
     
     }
     }
	


