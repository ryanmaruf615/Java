import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class FileOrganizer {

    private HashMap<String, Integer> count;
    private List<String> folderNames;
    private String directoryPath;

    public FileOrganizer(HashMap<String,Integer> count ,List<String> folderNames, String directoryPath) 
    {
        this.count = count;
        this.folderNames = folderNames;
        this.directoryPath = directoryPath;
        checkFolders();
        createDirectory();
        
    }
    

    public void checkFolders(){

        //checking the folder is exsisted or not
        for(String fName : folderNames)
        {
             Path folderPath = Paths.get(directoryPath, fName);
            if (Files.exists(folderPath) && Files.isDirectory(folderPath)) {
                System.out.println("Folder " + fName + " already exists.");
            } 
            else 
            { 
                System.out.println("Folder " + fName + " does not exists.");
                
            }    
            }
        }
    
        public void createDirectory()
        {
            for(Map.Entry<String,Integer> entry : count.entrySet())
            {
                String folderName = entry.getKey();
                int fileCount = entry.getValue();

                if(fileCount > 0)
                {
                    Path folderPath = Paths.get(directoryPath, folderName);
                    if (!Files.exists(folderPath)) {
                        try {
                            Files.createDirectories(folderPath);
                            System.out.println("Created folder: " + folderName);
                        } catch (Exception e) {
                            System.err.println("Error creating folder " + folderName + ": " + e.getMessage());
                        }
                    } else {
                        System.out.println("Folder " + folderName + " already exists.");
                    }
                }
            }
        }
    
            
    }

