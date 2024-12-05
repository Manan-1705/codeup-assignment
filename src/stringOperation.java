/*This code basically take an input string and perform some operations on the input string like append , count words and many more ...
Name : Manan Agrawal
Date of Completion : 04 December 2024*/

import java.util.Scanner;

public class stringOperation {

    //This function takes an another string and append that string in the given input string
    public static String append(String input , String toAppend){
        input = input + toAppend ;
        return input ;
    }

    //This function count the Words of the string which we are giving
    public static int count_Words(String input){//variable name
        int count = 1 ;
        for(int start = 0 ; start<input.length() ; start++){
            if(input.charAt(start)==' ')
                count++ ;
        }
        return count ;
    }

    //This function compare whether the two strings are equal or not
    public static boolean compare(String input , String toCompared){  // variable names
        if(input.length() != toCompared.length()){
            return false ;
        }
        for(int start = 0 ; start < input.length() ; start++){
            if(input.charAt(start) != toCompared.charAt(start)){
                return false ;
            }
        }
        return true ;
    }

    //This function replace all occurances of character a with character b in the input string
    public static String replace(String input , String first , String second){//variable
        String answer = "" ;
        boolean check = true ;
        for(int start = 0 ; start < input.length() ; start++){
            String dummy = "" ;
            if(input.charAt(start) == first.charAt(0) && check == true){
                dummy += input.charAt(start) ;
                int index = 1 ;
                int initial = start+1;
                while(index < first.length() && initial <= first.length()){
                    if(first.charAt(index) == input.charAt(initial) && check==true) {
                        dummy += first.charAt(index);
                        index++;
                        initial++;
                    }
                }
                if(compare(dummy , first)){
                    answer += second ;
                    start +=  first.length()-1  ;
                    check = false ;
                }
            }
            else{
                answer += input.charAt(start) ;
            }
        }
        return answer ;
    }

//    This function checks whether the input string is a palindrome or not
    public static boolean isPalindrome(String input){
        boolean check = true ;
        int initial = 0 ;
        int last = input.length()-1 ;
        while(initial!= input.length()-1 && last != 0 ){
            if(input.charAt(initial)!= input.charAt(last)){
                check = false ;
                break ;
            }
            initial++ ;
            last-- ;
        }
        return check ;
    }

//    This function removes a substring from the input string starting at index "start" and of length "length"
    public static String splice(String input, int start , int length){
        String dummy = "" ;
        for(int initial = 0; initial < input.length() ; initial++){
            if(initial >= start && initial <= start + length - 1){
                continue ;
            }
            dummy += input.charAt(initial) ;
        }
        return dummy ;
    }

//    This function splits the input string into the array of words
    public static void split(String pattern){
        int index = 0 ;
        String []dummy = new String[pattern.length()] ;
        for(int iterate = 0 ; iterate < pattern.length() ; iterate++){
            dummy[iterate] = "" ;
        }

        for(int start=0 ; start<pattern.length() ; start++){

            if(pattern.charAt(start) != ' '){
                dummy[index] += pattern.charAt(start);
            }
            else{
                index++ ;
            }
        }
        System.out.print("[") ;
        for(int start = 0 ; start<count_Words(pattern) ; start++){
            if(start==count_Words(pattern) - 1){
                System.out.print(dummy[start]) ;
            }
            else{
                System.out.print(dummy[start] +" , ") ;
            }
        }
        System.out.print("]") ;
    }

//    This function finds and returns the character that appears the most frequent in input string
    public static void maxRepeat(String input){
        int maximum = 1 ;

        for(int start = 0; start< input.length() ; start++){
            int count = 1 ;
            for(int ahead = start+1; ahead < input.length() ; ahead++) {
                char character = input.charAt(start);
                char character_ahead = input.charAt(ahead) ;
                if (character == character_ahead){
                    count++ ;
                }
            }
            if(count > maximum){
                maximum = count ;
            }
        }
        char[]repeat = new char[input.length()] ;
        int index = 0;

        for(int start = 0; start< input.length() ; start++){
            int count = 1 ;
            for(int ahead = start+1; ahead < input.length() ; ahead++) {
                char character = input.charAt(start);
                char character_ahead = input.charAt(ahead) ;
                if (character == character_ahead){
                    count++ ;
                }
            }
            if(count == maximum){
                repeat[index] = input.charAt(start) ;
                index++ ;
            }
        }
        if(maximum != 1){
            for(int start = 0 ; start<index ; start++){
                System.out.println("'"+repeat[start]+"' -> "+maximum) ;
            }
        }
        else{
            System.out.print("No character is repeating more than one time ") ;
        }

    }

//    this function 
    public static String sort(String string){
        char []character = new char[string.length()] ;
        for(int start = 0 ; start<string.length() ; start++){
            character[start] = string.charAt(start) ;
        }

        for(int start = 0 ; start < string.length()-1 ; start++){
            int smallestIndex = start ;
            for(int initial = start+1 ; initial < string.length() ; initial++){
                if(character[initial] < character[smallestIndex]){
                    smallestIndex = initial ;
                }
            }
            char temporary = character[smallestIndex] ;
            character[smallestIndex] = character[start] ;
            character[start] = temporary ;
        }
        String newString ="" ;
        for(int i=0 ; i<string.length() ; i++){
            newString += character[i] ;
        }
        return newString ;
    }

    public static String shift(String string , int n){
        String newString = "" ;
        for(int start = n ; start < string.length() ; start++){
            newString += string.charAt(start) ;
        }
        for(int start = 0 ; start < n ; start++){
            newString += string.charAt(start) ;
        }
        return newString ;
    }

    public static String reverse(String string){
        String newString = "" ;
        for(int start = string.length()-1 ; start>=0 ; start--){
            newString += string.charAt(start) ;
        }
        return newString ;
    }

    public static void main(String[] args){
        int choice = 0;
        System.out.print("Enter the string : ") ;
        Scanner scanner = new Scanner(System.in) ;
        String string = scanner.nextLine() ;
        do {

            System.out.print("Following are the operations on string : \n");
            System.out.print("1.Append String\n");
            System.out.print("2.Count Words\n");
            System.out.print("3.Replace\n");
            System.out.print("4.Check Palindrome\n");
            System.out.print("5.Splice\n");
            System.out.print("6.Split\n");
            System.out.print("7.Max Repeating Character\n");
            System.out.print("8.Sort\n");
            System.out.print("9.Shift\n");
            System.out.print("10.Reverse\n");
            System.out.print("11.Exit\n");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    System.out.print("Enter string to be appended : ") ;
                    Scanner m = new Scanner(System.in) ;
                    String new_string = m.nextLine() ;
                    System.out.print(append(string,new_string)+"\n") ;
                    break ;

                case 2 :
                    System.out.print("No. of words in the given string is : "+count_Words(string)+"\n") ;
                    break ;

                case 3 :
                    System.out.print("Enter first string : ") ;
                    Scanner newScan = new Scanner(System.in) ;
                    String a = newScan.nextLine() ;
                    System.out.print("Enter second string : ") ;
                    String b = newScan.nextLine() ;
                    System.out.print(replace(string,a,b) + "\n");
                    break ;

                case 4 :
                    System.out.print(isPalindrome(string) + "\n") ;
                    break ;

                case 5 :
                    System.out.print("Enter the starting index : ");
                    int start = scanner.nextInt() ;
                    System.out.print("Enter the length of the string : ") ;
                    int length = scanner.nextInt() ;
                    System.out.print(splice(string , start , length)+"\n") ;
                    break ;

                case 6 :
                    split(string) ;
                    System.out.print("\n") ;
                    break ;

                case 7 :
                    maxRepeat(string) ;
                    System.out.print("\n") ;
                    break ;

                case 8 :
                    System.out.print("Sorted string : "+sort(string)+"\n") ;
                    break ;

                case 9 :
                    System.out.print("Enter the number of characters to be moved in end of string : ") ;
                    int number = scanner.nextInt() ;
                    System.out.print(shift(string , number) + "\n") ;
                    break ;

                case 10 :
                    System.out.print("Reverse order of the string : "+reverse(string)+"\n") ;
                    break ;

                case 11 :
                    System.out.print("Program is terminated") ;
                    break ;

                default :
                    System.out.print("Enter the valid choice\n");
            }

            if (choice != 11) {
                System.out.print("Do you want to continue(1 or 0) : ") ;
                int choose = scanner.nextInt() ;
                if (choose == 1){
                   continue ;
                }
                if(choose == 0 ) {
                    System.out.print("Program is terminated") ;
                    break ;
                }
                else {
                    System.out.print("Enter a valid choice\n");
                    continue;
                }

            }
        }while(choice!=11);

    }
}
