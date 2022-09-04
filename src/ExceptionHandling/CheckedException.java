package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.util.Locale.ROOT;

public class CheckedException {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        FileReader fileReader = new FileReader("Users\\draji\\OneDrive\\Documents\\pokemon_data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());

    }
}
