package com.core;
import java.nio.file.*;
import java.util.List;
import java.util.Map;

public class FileMover {
    private Map<String, List<Path>> categorizedFiles;
  
    public FileMover(Map<String, List<Path>> categorizedFiles) {
      this.categorizedFiles = categorizedFiles;
    }

    // method to move files to their respective folders
    public void moveFiles(String baseDir)
    {
        boolean fileMoved = false;

        // iterate through the categorized files and move them
        for (Map.Entry<String, List<Path>> entry : categorizedFiles.entrySet()) {
            String folderName = entry.getKey();
            List<Path> files = entry.getValue();
            
            // only attempt to move if there are files in the category
            if(!files.isEmpty()){
                Path targetDir = Paths.get(baseDir, folderName);

                // create target directory if it doesn't exist
                try{
                    if(!Files.exists(targetDir)){
                        Files.createDirectories(targetDir);
                    }
                    // move each file to the target directory
                    // overwrite if file with same name exists
                    for (Path file : files) {
                        Path targetPath = targetDir.resolve(file.getFileName());
                        Files.move(file, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        fileMoved = true;
                        
                    }
                    System.out.println("Moved files" + files.size() + " to folder: " + folderName);
                }catch(Exception e){
                    System.err.println("Error moving files: " + e.getMessage());
                }
            }
        }
                if(!fileMoved){
                        System.out.println("No files to move.");
                }
    }   
}
