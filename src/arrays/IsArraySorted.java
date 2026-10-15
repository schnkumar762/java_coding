package src.arrays;

public class IsArraySorted {


    public  static  void main(String args[]){

        IsArraySorted obj = new IsArraySorted();
        int [] arrr={3,6,7,1};

       boolean ans = obj.isSorted(arrr);

       System.out.println(ans);
        

    }

    boolean isSorted(int arr[]){

        
        int num = arr[0];
        boolean ans = true;
        for (int i=1;i<arr.length;i++){
            if(arr[i]<num){
                ans= false;
                num=arr[i];
                return ans;





            } else {
                num=arr[i];






            }




            

        }
        return ans;
    }
    
}
