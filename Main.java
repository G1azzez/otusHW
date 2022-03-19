package ru.otus;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    final int lenght = 200000 ;
    final int base = Integer.MAX_VALUE;
        int[] toSort = new int[lenght];
        for (int i= 0; i<lenght; i++){
            toSort[i]= (int)(Math.random()*base);
        }
        System.out.println("bubble");
        long time = System.currentTimeMillis();
        for (int k= 0; k< toSort.length; k++){
            for (int i=0; i<toSort.length-1; i++){
                if (toSort[i]<toSort[i+1]){
                    int temp = toSort[i];
                    toSort[i]=toSort[i+1];
                    toSort[i+1]=temp;
                }
            }
        }
        System.out.println("Время выполнения "+((System.currentTimeMillis() - time)/1000)+ " секунд");
        System.out.println("selection");
        time = System.currentTimeMillis();
        for (int k =0; k< toSort.length-1; k++) {
            int targetNumber = k;
            int target=toSort[k];
            for (int i =k+1 ; i<toSort.length; i++ ){
                if (target > toSort[i]) {
                    target=toSort[i];
                    targetNumber=i;
                }
            }
            int temp=target;
            toSort[targetNumber] = toSort[k];
            toSort[k] = temp;
        }
        System.out.println("Время выполнения "+((System.currentTimeMillis() - time)/1000)+ " секунд");
           }
}
