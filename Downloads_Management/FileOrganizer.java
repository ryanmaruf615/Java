import java.util.HashMap;
import java.util.Map;

public class FileOrganizer {


    public void createFolders(HashMap<String,Integer> count ,String folderNames, String directoryPath){

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
