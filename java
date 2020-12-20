Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.



***********************************************************************************************************************************************************************

import java.io.*;
import jva.util.*;
import java.math.*;
import java.util.regex.*;

public class Java{
static String whocanfit(numString)  // method
{
String answer ="";   // input class
try{
long num=Long.parseLong(numString);
answer =numString + "can be";
if((num<=Byte.MAX_VALUE))&&(num>=Byte.MIN_VALUE)){
 answer = answer.concat("* byte\n* short\n* int\n* long");
 }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    answer = answer.concat("* int\n* long");
            }else{
                    answer = answer.concat("* long");
                     }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
    }
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt() ;
        scanner.nextLine();
        for(int i=0; i<numTestCases;i++){
            String numString = scanner.nextLine();
            System.out.println(whoCanFitTheNumber(numString));
        }
    }
}







arraylist 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
         ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
         for(int i = 0;i<n;i++){
            int d = sc.nextInt(); 
             ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
            for(int j=0;j<d;j++){
                intArrayList.add(new Integer(sc.nextInt()));
            }
            listArray.add(intArrayList);
            sc.nextLine();
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                    System.out.println("ERROR!");
                }
