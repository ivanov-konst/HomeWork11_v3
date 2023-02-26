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
        int line_1;
        for (int i = 1; i < 11; i++) {
            line_1 = i;
            System.out.print(line_1 + " ");
        }
        System.out.println();
        int line_2;
        for (int i = 1; i < 11; i++) {
            line_2 = i*2;
            System.out.print(line_2 + " ");
        }
        System.out.println();
        int line_3;
        for (int i = 1; i < 11; i++) {
            line_3 = i*3;
            System.out.print(line_3 + " ");
        }
        System.out.println();
        int line_4;
        for (int i = 1; i < 11; i++) {
            line_4 = i*4;
            System.out.print(line_4 + " ");
        }
        System.out.println();
        int line_5;
        for (int i = 1; i < 11; i++) {
            line_5 = i*5;
            System.out.print(line_5 + " ");
        }
        System.out.println();
        int line_6;
        for (int i = 1; i < 11; i++) {
            line_6 = i*6;
            System.out.print(line_6 + " ");
        }
        System.out.println();
        int line_7;
        for (int i = 1; i < 11; i++) {
            line_7 = i*7;
            System.out.print(line_7 + " ");
        }
        System.out.println();
        int line_8;
        for (int i = 1; i < 11; i++) {
            line_8 = i*8;
            System.out.print(line_8 + " ");
        }
        System.out.println();
        int line_9;
        for (int i = 1; i < 11; i++) {
            line_9 = i*9;
            System.out.print(line_9 + " ");
        }
        System.out.println();
        int line_10;
        for (int i = 1; i < 11; i++) {
            line_10 = i*10;
            System.out.print(line_10 + " ");
        }
    }
}
