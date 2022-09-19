package com.example.javajungsuk.streamio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\nj\\spring-study\\java-jungsuk\\src\\main\\java\\com\\example\\javajungsuk\\streamio\\hello.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

        for (int i = '1'; i <= '9'; i++) {
            bos.write(i);
        }
        bos.close();
        fos.close();
    }
}
