import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Урок 6. Collections Framework (скачан).txt");
        int counter = 0;
        String word;

        Scanner sc = new Scanner(file, StandardCharsets.UTF_8);
        while (sc.hasNextLine()) {
            word = sc.nextLine();
            if (word.contains("сострадание"))
                counter++;
        }

        System.out.println(counter);

        for (int x=1; x<=10; x++){
            System.out.print(x +" " + 2*x + " " +3*x + " ");


    }

}
}


