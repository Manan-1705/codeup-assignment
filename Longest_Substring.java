//We are finding the longest length of substring of a string without repetition
//Name : Manan Agrawal
//Date Of Completion : 27 Nov 2024

import java.util.Scanner;

public class Longest_Substring {
    public static void main(String[] args){
        System.out.print("Enter the string : ") ;

        Scanner scanner = new Scanner(System.in) ;
        String input = scanner.nextLine() ;

        int maximum = 0 ;
        int last = 0 ;
        for(int start = 1 ; start < input.length() ; start++){
            int count = 1 ;
            for(int initial = start-1 ; initial >= last ; initial--){
                if(input.charAt(start) != input.charAt(initial))
                    count++ ;
                else
                    last = start ;
            }
            if(maximum < count)
                maximum = count ;
        }
        System.out.print(maximum) ;
    }
}
