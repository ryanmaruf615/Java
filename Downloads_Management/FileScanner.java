
import java.nio.file.*;
import java.util.stream.Stream;

public class FileScanner {
    private String directoryPath = "../test_download_folder";


    
    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }
    public String getDirectoryPath() {
        return directoryPath;
    }


    // method to scan directory and count number of files and list files
    public void scanDirectory() {
        System.out.println("Scanning directory: " + getDirectoryPath());
        Path p = Paths.get(getDirectoryPath());
        System.out.println(Files.exists(p));

        //normally would use try with resources

        // try (Stream<Path> stream = Files.list(p)) {
        //     for (Path file : stream.toList()) {
        //     System.out.println(file.getFileName());
        //     }

        // with lambda function
        try
        {
        long count = Files.list(p).count();
        System.out.println("Total files: " + count);
        Files.list(p).forEach(file -> {
            System.out.println(file.getFileName());
        });
    } 
        catch (Exception e) {
            System.out.println("Error scanning directory: " + e.getMessage());
        }
        
    }

    
    

}
