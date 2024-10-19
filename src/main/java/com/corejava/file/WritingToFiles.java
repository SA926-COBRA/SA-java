package com.corejava.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) {
        File file = createFile("src/com/corejava/file/demo.txt");
        writeToFile(file, true);
    }

    private static void writeToFile(File file, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Hello, ");
            writer.println("Mummy");
            writer.println("How are you?");
            writer.println("I miss you!");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
