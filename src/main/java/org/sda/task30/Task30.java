package org.sda.task30;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Napisz program, który odczyta dowolny plik i zapisze go w tym samym folderze.
 * Zawartość jak i tytuł nowego pliku powinny być odwrócone (od tyłu).
 */
public class Task30 {

    public static void main(String[] args) {
        String filename = "zadanie30";
        List<String> lines = read(filename);
        System.out.println(lines);



    }
    private static List<String> reverse(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            result.add(reverseString(line));
        }
        Collections.reverse(result);
        return result;
    }

    private static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        return sb.append(text).reverse().toString();
    }

    private static List<String> read(String filename) {
        List<String> result;
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("src/main/resources/" + filename))) {
            result = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    }
