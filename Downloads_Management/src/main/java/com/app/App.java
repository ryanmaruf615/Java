package com.app;
import com.core.FileScanner;

public class App {
    public static void main(String[] args) {
        FileScanner fileScanner = new FileScanner();
        fileScanner.setDirectoryPath("../test_download_folder");
        fileScanner.scanDirectory();
        
    }
}
