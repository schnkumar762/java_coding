package src.arrays;

public class ReverseArray {

    public  static  void main(String args[]){

        ReverseArray obj = new ReverseArray();

        int arr[]= {3,5,7,9};

        obj.reverseArray(arr);
        obj.printArray(arr);
        


    }
    
    void reverseArray(int [] arr){

        for (int i=0;i<arr.length/2;i++){
            swap(arr,i, arr.length-1-i);
            
        }







    }

    void swap(int [] arr,int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;



    }

    void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
               System.out.println(arr[i] + " ");


        }
     

    }
}
