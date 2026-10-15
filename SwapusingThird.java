//Swap two numbers using a third variable.

import java.util.Scanner;

public class SwapusingThird {

    public void Swap(int a,int b){

        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("a swapped = " + a + ", b swapped = " + b);



    }


    
}

class Main {
    public  static  void main(String args[]){
        SwapusingThird sw = new SwapusingThird();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sw.Swap(a,b);

        sc.close();


    }
}
