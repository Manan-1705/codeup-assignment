//We are expanding the string according to the number given after each character of string
//Name : Manan Agrawal
//Date Of Completion : 27 Nov 2024

import java.util.Scanner;

public class Expand_the_string {
    public static void main(String[] args) {

        System.out.print("Enter the string : ") ;
        Scanner scanner = new Scanner(System.in) ;
        String input = scanner.nextLine() ;

        for(int initial = 0 ; initial < input.length() ; initial += 2){
            char character = input.charAt(initial) ;
            int start = initial + 1 ;
            int condition = input.charAt(start)-48 ;
            while(condition > 0){
                System.out.print(character);
                condition--;
            }
        }
    }
}