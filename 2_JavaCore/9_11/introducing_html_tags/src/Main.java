import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String file;
        String word = args[0];
        String text="";
        try (BufferedReader scanreader = new BufferedReader(new InputStreamReader(System.in))) {
            file = scanreader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while (reader.ready()){
                text+= reader.readLine();
            }
        }
        Pattern pattern = Pattern.compile("<"+"(?:.*?)?>.+?<.+?>.+?</.+?></"+word+">");
        Matcher matcher = pattern.matcher(text);
        Pattern pattern1 = Pattern.compile("<"+word+">.*?</"+word+">");
        Matcher matcher1 = pattern1.matcher(text);
        Map<Integer,String> list = new HashMap<>();
        while ((matcher1.find())){
            list.put(matcher1.start(),text.substring(matcher1.start(), matcher1.end()));
        }
        while (matcher.find()){
            list.put(matcher.start(),text.substring(matcher.start(), matcher.end()));
        }
        list.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry ->  System.out.println(entry.getValue()));
    }
}
