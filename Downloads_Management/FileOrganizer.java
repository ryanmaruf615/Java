import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class FileOrganizer {


    public void createFolders(HashMap<String,Integer> count ,List<String> folderNames, String directoryPath){


        //checking the folder is exsisted or not
        for(String fName : folderNames)
        {
             Path folderPath = Paths.get(directoryPath, fName);
            if (Files.exists(folderPath) && Files.isDirectory(folderPath)) {
                System.out.println("Folder " + fName + " already exists.");
            } else {
                System.out.println("Folder " + fName + " does not exist."); 
            }
        }


        for (Map.Entry<String, Integer> entry : count.entrySet())
        {
            //System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getValue() > 0)
            {
                System.out.println("Creating folder for " + entry.getKey() + " files.");
                if(entry.getKey() == "pdf" )
                {
                    System.out.println("folder exsisted");
                }
                else{
                    System.out.println("created a PDF folder");
                }
            }

    

        }
        
    }
}
