//We are converting a given number into words
//Name : Manan Agrawal
//Date Of Completion : 27 Nov 2024

import java.util.Scanner;

public class Num_To_Word_Convertor {
    public static void main(String[] args){
        System.out.print("Enter the number : ") ;
        Scanner scanner = new Scanner(System.in) ;
        int number = scanner.nextInt() ;

        String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"} ;
        String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"} ;
        String[] others = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen",} ;
        int remainder ;

        int[] array = new int[3];
        int start = 0 ;
        while(number > 0){

            remainder = number % 10 ;
            array[start] = remainder ;
            number = number/10 ;
            start++ ;
        }
        if(start==3){
            String first = ones[array[start-1]] ;
            System.out.print(first + " Hundred ") ;
            start--;
        }
        boolean check = false ;
        if(start==2){
            if(array[start-1] ==1){
                System.out.print(others[array[start-2]]) ;
                check = true ;
            }
            else {
                String second = tens[array[start - 1]];
                System.out.print(second + " ");
                start--;
            }
        }
        if(start==1 && check==false){
            String third = ones[array[start-1]] ;
            System.out.print(third + " ") ;
            start-- ;
        }
    }
}
