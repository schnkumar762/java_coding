package src.arrays;

public class LargestSmallest {

    int largestElement (int [] arr){
        return 2;
    }

    int smallestElement(int [] arr){
        return 4;
    }

    int [] largestSmallest (int [] arr){
        return new int []{1,2};
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