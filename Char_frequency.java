//We are finding frequency of each character in a string
//Name : Manan Agrawal
//Date Of Completion : 27 Nov 2024

import java.util.Scanner;

public class Char_frequency {
    public static void main(String[] args){
        System.out.print("Enter the string : ");
        Scanner scanner = new Scanner(System.in) ;
        String input = scanner.nextLine() ;
        int initial = 0 ;

        while(initial < input.length()){
            int count = 0 ;
            char check = input.charAt(initial) ;
            int start = initial  ;

            while(input.charAt(start)==check){
                count++ ;
                start++ ;
                if(start>=input.length())
                    break ;
            }

            System.out.print(check+""+count) ;
            initial = initial+count  ;
        }
    }
}
