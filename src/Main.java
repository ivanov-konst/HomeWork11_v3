import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {


// Задание 1:
        File f1 = new File("Урок 6. Collections Framework (скачан).txt"); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        int count = 0;
        while ((s = br.readLine()) != null) { //Reading Content from the file
            words = s.split(" ");  //Split the word using space
            for (String word : words) {
                Pattern input = Pattern.compile("страда\\D", Pattern.CASE_INSENSITIVE);
                Matcher mc = input.matcher(word);
                if (mc.find()) {  //Search for the given word
                    count++;    //If Present increase the count by one
                }
            }
        }
        if (count != 0)  //Check for count not equal to zero
        {
            System.out.println("Cлово Страдание присутствует " + count + " раз в файле");
        } else {
            System.out.println("Cлово Страдание отсутствует в файле");
        }

        fr.close();

// Задание 2:
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое слово:");
        String text = sc.nextLine();

        File f2 = new File("Урок 6. Collections Framework (скачан).txt"); //Creation of File Descriptor for input file
        String[] words2 = null;  //Intialize the word Array
        FileReader fr2 = new FileReader(f2);  //Creation of File Reader object
        BufferedReader br2 = new BufferedReader(fr2); //Creation of BufferedReader object

        String s2;
        String input = text;   // Input word to be searched
        int count2=0;   //Intialize the word to zero
        while((s2=br2.readLine())!=null)   //Reading Content from the file
        {
            words=s2.split(" ");  //Split the word using space
            for (String word : words)
            {
                if (word.equals(input))   //Search for the given word
                {
                    count2++;    //If Present increase the count by one
                }
            }
        }
        if(count2!=0)  //Check for count not equal to zero
        {
            System.out.println("Cлово " +input+ " присутствует " + count2 + " раз в файле");
        } else {
            System.out.println("Cлово отсутствует в файле");
        }

        fr2.close();


// Задание 3:
      for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
