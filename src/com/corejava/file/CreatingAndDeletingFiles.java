package com.corejava.file;

import java.io.File;
import java.io.IOException;

public class CreatingAndDeletingFiles {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/corejava/file/parwati.txt");
            if (!file.exists()) {
                file.createNewFile();
            } else
                file.delete();
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
    }
}
