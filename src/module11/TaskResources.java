package module11;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskResources {
    public static String readFile(String path) throws IOException {

        String thisLine, result = "";

        try  (
                FileReader fileReader = new FileReader(path);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        )
        {
            while ((thisLine = bufferedReader.readLine()) != null) {
                result = result + thisLine + ("\r\n");
            }
        }

        return result;
    }

    public static String replacer(String string, Map<String,String> mapWords)
    {
        for (HashMap.Entry<String, String> entry : mapWords.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            string = string.replaceAll("\\b"+key+"\\b", value);
        }

        return string;
    }

    public static void fileContentReplacer (String filepath, String data,Map<String,String> mapWords) throws IOException {


        try (
                FileWriter fileWriter = new FileWriter(new File(filepath));
                BufferedWriter bufferedReader = new BufferedWriter(fileWriter);
        )
        {
            bufferedReader.write(replacer(data,mapWords));
        }
    }

    public static void fileContentMerger (String filepath, String data,Map<String,String> mapWords) throws IOException {


        try (
                FileWriter fileWriter = new FileWriter(new File(filepath),true);
                BufferedWriter bufferedReader = new BufferedWriter(fileWriter);
        )
        {
            bufferedReader.write(replacer(data,mapWords));
        }
    }

    public static int checkWord(String data, String word){
        int i = data.indexOf(word);
        int count=0;

        while (i >= 0) {
            count++;
            i = data.indexOf(word, i + 1);
        }
        return count;
    }


    public static void main(String[] args) throws IOException {

        String data,filePath, newfilePath, word;
        int countWords = 0;
        Map<String, String> mapWords = new HashMap<>();

        mapWords.put("Hell", "Hello");
        mapWords.put("Hel", "Hello");
        mapWords.put("Wo", "World");
        mapWords.put("Word", "World");

        System.out.println("Task 1: Enter the path to the file to read it.");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        data = readFile(scanner.next());
        System.out.println("Some words were replaced to:");
        System.out.println(replacer(data,mapWords));
        System.out.println("Task 1: ----- Done ------");

        System.out.println("Task 2: Enter the path to the file to read it.");
        filePath = scanner.next();
        data = readFile(filePath);
        fileContentReplacer(filePath,data,mapWords);
        System.out.println("Task 2: ----- Done ------");

        System.out.println("Task 3: Enter the path to the file to read it.");
        data = readFile(scanner.next());
        System.out.println("Task 3: Enter the path to the file to write it.");
        newfilePath = scanner.next();
        fileContentMerger(newfilePath,data,mapWords);
        System.out.println("Task 3: ----- Done ------");

        System.out.println("Task 4: Enter the path to the file to read it.");
        filePath = scanner.next();
        System.out.println("Task 4: Enter the word to try find it in data.");
        word = scanner.next();
        countWords = checkWord(readFile(filePath),word);
        System.out.println("Task 4: Count of words is: " + countWords);
        System.out.println("Task 4: ----- Done ------");

        scanner.close();
    }

}