package com.ab.facade;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeDemo {
    public static void main(String[] args) throws IOException {
        //URL url = new URL("http","www.pluralsight.com",80,"/author/bryan-hansen");
        URL url = new URL("https://app.pluralsight.com/profile/author/bryan-hansen");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null){
            System.out.println(inputLine);
        }
    }
}
