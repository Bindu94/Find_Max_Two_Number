/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internpractice;

import java.util.Random;

/**
 *
 * @author Toshiba
 */
public class TwoMaxNumInArray {
    public int[] arr=new int[50];
    
    public void assignValue(){
        Random r =new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(1000);
        }
    }
    
    public void sortInsertion(int ar[]){
        this.arr=ar;
        boolean b=false;
        for(int i=1;i<arr.length;i++){
            int k=arr[i];
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }
            }
        }
    }
    
    public void disply(int ar[]){
        System.out.println("Maximum Number is : "+ar[ar.length-1]);
        System.out.println("Maximum 2nd Number is : "+ar[ar.length-2]);
        
        for(int i=0;i<ar.length;i++){
            System.out.print(" ,"+ar[i]);
            if((i+1)%10==0){
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        TwoMaxNumInArray t=new TwoMaxNumInArray();
        t.assignValue();
        t.sortInsertion(t.arr);
        t.disply(t.arr);
    }
    
}
