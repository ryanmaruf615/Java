package com.core;
import java.nio.file.*;


public class FileScanner {
    private String directoryPath = "../test_download_folder";
    private ExtensionMapper extensionMapper = new ExtensionMapper();
    int folderCounter = 0;
    
    // setter and getter for directoryPath
    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    // method to scan directory and count number of files and list files
    public void scanDirectory() {
        Path p = Paths.get(getDirectoryPath());

        try {
            Files.list(p).forEach(file -> {
                if (Files.isRegularFile(file)) {
                    extensionMapper.categorizeFile(file);
                }
            });

            // after scanning, pass categorized files to FileMover
              FileMover fileMover = new FileMover(extensionMapper.getCategorizedFiles());
              fileMover.moveFiles(directoryPath);

        } catch (Exception e) {
            System.out.println("Error scanning directory: " + e.getMessage());
        }
    }
}