
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;


public class FileScanner {
    private String directoryPath = "../test_download_folder";
    int folderCounter = 0;
    
    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }
    public String getDirectoryPath() {
        return directoryPath;
    }



    // method to scan directory and count number of files and list files
    public void scanDirectory() {
        Path p = Paths.get(getDirectoryPath());
        
        
        try
        {
            
        //to count files numbers
        //long count = Files.list(p).count();
        //System.out.println("Total files: " + count);


        // to list files
        List<String> fileNames = new ArrayList<>();
        List<String> folderNames = new ArrayList<>();

        //retrive the list of files and add to arraylist
        Files.list(p).forEach(file -> {

            if(Files.isDirectory(file))
            {
                String fNames = file.getFileName().toString();
                folderNames.add(fNames);
            }
            else if(Files.isRegularFile(file))
            {
                String names =  file.getFileName().toString();
                fileNames.add(names);
            }
        });


        // sent the list of extensions to FileExtensionMapper class 
        // Create an instance of ExtensionMapper and call the method
        ExtensionMapper extensionMapper = new ExtensionMapper();
        extensionMapper.printFilesExtentions(fileNames,folderNames,directoryPath);


    } 
        catch (Exception e) {
            System.out.println("Error scanning directory: " + e.getMessage());
        }
        
    }


}
