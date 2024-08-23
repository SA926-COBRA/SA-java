package com.corejava.exception.checked;

import java.io.File;
import java.io.IOException;

public class IOorCompileTimeException {
    public static void main(String[] args) {

        try {
            File file = new File("src/dai.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
    }
}
