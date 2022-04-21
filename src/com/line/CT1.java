package com.line;

public class CT1 {
    public static void main(String[] args) {

        String[] strArr = new String[]{"4","the","eagle","eats","snakes"};


        int counter = 0;
        for (int i = 0; i<strArr.length-1; i++){
            if(i==0)
                continue;
            if(strArr[i].charAt(strArr[i].length()-1)==strArr[i+1].charAt(0))
                counter++;
            else
                break;
        }


        System.out.println(counter+1);



//        str.
        /*
        0   1     2    3
        the eagle eats snakes
         */


    }
}
/*
A word chain is a sequence of words in which every word except the first one starts with the last letter of the previous word.
You are given a sequence of words.
Output the length of the longest prefix of the sequence which forms a valid word chain. One-word chain is always valid.

The first line of the input contains an integer N - the number of words in the sequence. 1 <= N <= 10.
The following N lines contain the words of the sequence, one word per line. -> 1-10字元的小寫英文字
Each word is between 1 and 10 characters long and consists of lowercase letters of English alphabet.

Example

input

    4
    the
    eagle
    eats
    snakes

output

    4


input

    7
    snakes
    seldom
    munch
    on
    north
    highland
    ducks

output

    3

In the first example, the whole sequence is a valid word chain.
In the second example, the longest prefix which is a word chain is "snakeS SeldoM Munch".
The last four words of the sequence are a longer word chain
but they are not a prefix of the sequence.



  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String input = br.readLine();
//     System.out.println(input);

    String line;

        while ((line = br.readLine()) != null && line.length()!= 0) {
            String[] input = line.split(" ");

            for (String str : input){
              System.out.println(str);
            }
        }

  }
 */