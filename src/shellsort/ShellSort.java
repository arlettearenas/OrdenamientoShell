/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ShellSort {
   public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int array[]=new int [20];
        int num,i,j,k,incremento,auxi;
        System.out.print("Ingrese dimension del arreglo: ");
        num=teclado.nextInt();
     
        for(i=1;i<=num;i++){
            System.out.print("a["+i+"]= ");
            array[i]=teclado.nextInt();
        }
     
     
        incremento=num/2;
 
 while(incremento>0){
  for(i=incremento+1;i<=num;i++){
   j=i-incremento;
   while(j>0){
    if(array[j]>=array[j+incremento]){
     auxi = array[j];
     array[j] = array[j+incremento];
     array[j+incremento] = auxi;
    }
    else{
      j=0;
     }
    j=j-incremento;
   }
  }
  incremento=incremento/2;
 }
     
     
     System.out.println("El arreglo ordenado");
        for(i=1;i<=num;i++){
            System.out.print(" "+ array[i]);
         
        }
 
 
 
 
}
}   
