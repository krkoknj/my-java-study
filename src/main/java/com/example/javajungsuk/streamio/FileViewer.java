package com.example.javajungsuk.streamio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\nj\\spring-study\\java-jungsuk\\src\\main\\java\\com\\example\\javajungsuk\\streamio\\hello.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\nj\\spring-study\\java-jungsuk\\src\\main\\java\\com\\example\\javajungsuk\\streamio\\world.bak");

        int data = 0;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
