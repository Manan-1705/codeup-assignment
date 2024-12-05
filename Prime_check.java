//Check whether a given number is prime or not
//Name : Manan Agrawal
//Date Of Completion : 27 Nov 2024

import java.util.Scanner ;

public class Prime_check {
    public static void main(String[] args){

        System.out.print("Enter the number : ") ;
        Scanner scanner = new Scanner(System.in) ;
        int number = scanner.nextInt();
        boolean flag = true ;

        if(number == 0 || number == 1){
            flag = false ;
        }
        for(int start = 2 ; start<=number/2 ; start++){
            if(number % start == 0){
                flag = false ;
                break ;
            }
        }
        if(flag){
            System.out.print(number+" is a prime number") ;
        }
        else{
            System.out.print(number+" is not a prime number") ;
        }

    }
}
