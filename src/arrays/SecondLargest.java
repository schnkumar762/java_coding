package src.arrays;
public class SecondLargest {

    public static  void main(String args[]){

        int arr1[]= {2,3,4};

        SecondLargest obj = new SecondLargest();

       int ans= obj.sl(arr1);
       System.out.println(ans);





    }

    int sl(int arr[]){
        int largest = Integer.MIN_VALUE;
        int sec_lar= Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }


        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec_lar && arr[i] != largest){
                sec_lar=arr[i];
            }
        }



        return sec_lar;
    }




}