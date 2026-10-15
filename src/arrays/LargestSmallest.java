package src.arrays;

public class LargestSmallest {

    int largestElement (int [] arr){
        int largest= Integer.MIN_VALUE;

        for(int i=0; i< arr.length;i++){
            if(largest <arr[i]){
                largest =arr[i];

            }
            

        }
        return largest;
    }

    int smallestElement(int [] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        
        return smallest;
    }

    int [] largestSmallest (int [] arr){
        return new int []{largestElement(arr),smallestElement(arr)};
    }


    
}

class Main{
    public  static  void main(String args[]){

        LargestSmallest ls = new LargestSmallest();

        int [] arr = {4,5,6,7};

       int lar= ls.largestElement(arr);
        int sma =ls.smallestElement(arr);
       int ans[]= ls.largestSmallest(arr);

       System.out.println(lar);
        System.out.println(sma);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        



    }
}