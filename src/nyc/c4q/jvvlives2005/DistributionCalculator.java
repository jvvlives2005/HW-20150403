package nyc.c4q.jvvlives2005;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by c4q-joshelynvivas on 4/3/15.
 *
 * Joshelyn Vivas
 *
 *Character Distributions
 *
 Create a class to calculate the distribution of characters in the contents of a text file.
 Your class called DistributionCalculator should implement a method calculate(File textFile) which accepts as input a Text file.
 It reads the contents of the file and returns an ArrayList which contains the distribution/percentage of characters (a-z) in
 the text file. You should lowercase lines before you do the calculation. Call the calculate method from main and print the
 distribution. You can ignore characters which do not belong in the range(a-z) for doing your calculation. Your program's
 output should look something like:
 *
 */

//Note: I am confused with this too!

public class DistributionCalculator
{
    public static ArrayList<Double> calculate(File textFile) throws FileNotFoundException{

     ArrayList<Double> percentages = new ArrayList<Double>();

     int totalNumberOfLetters = 0;

     HashMap<Character, Integer> percentageTable = new HashMap<Character, Integer>();

     for(int i = 0; i < 26; i++) {
      percentageTable.put((char)(i+97),0);
     }

     Scanner input = new Scanner(textFile);
     String word;
     while(input.hasNext())
     {
      word = input.next();

      for(int i = 0; i < word.length(); i++)
      {
       char c = word.toLowerCase().charAt(i);


      //gets only the letters; not spaces or " or ?
       if (Character.isLetter(c)){
         percentageTable.put(c,percentageTable.get(c)+1);
        totalNumberOfLetters ++;
       }
      }
     }


     for (int count : percentageTable.values()) {
      double percentage =  (count*100)/totalNumberOfLetters;
      percentages.add(percentage);
     }
     return percentages;
    }

 public static void main(String[] args) throws FileNotFoundException{
  File file = new File ("/Users/c4q-joshelynvivas/Desktop/AccessCode/HW-20150403/src/nyc/c4q/jvvlives2005/Alphabet.txt");
  ArrayList<Double> list = calculate(file);
 }


 //inout a textfile
    //}

    //an array list is made like ArrayList<Percent> alphabets
    //public static void main(String[] args){
    //something.getCalulate;

}
