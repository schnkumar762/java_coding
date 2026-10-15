// 28. [Easy] Remove duplicates from a sorted Array

package src.arrays;

import java.util.ArrayList;

public class RemoveDup {

    ArrayList<Integer> removeDup(int [] arr){

        ArrayList<Integer> ans =new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            if(!ans.isEmpty()  && arr[i] != ans.get(ans.size()-1)){
                ans.add(arr[i]);

            }
            if(ans.isEmpty()){
                ans.add(arr[i]);
            }
        }
        return ans;

    

       

    





        

    }

    void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    void printArray(ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i));
    }
}

    public static void main(String args[]){
        RemoveDup obj = new RemoveDup();
        int arr[]= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};

      //  obj.removeDup(arr);

        obj.printArray( obj.removeDup(arr));

      

       

       



    }
    
}
