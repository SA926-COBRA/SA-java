package com.corejava.file;

import java.io.*;
import java.util.Scanner;

public class WritingToFilesTryWIthResources {
    public static void main(String[] args) {
        File file = new File("src/com/corejava/file/hello.txt");
        writeToFile(file, true);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeToFile(File file, boolean append) {
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            writer.println("Hello, ");
            writer.println("Daddy");
            writer.println("How are you?");
            writer.println("I miss you!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
