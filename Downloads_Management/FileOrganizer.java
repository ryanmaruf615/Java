import java.util.HashMap;
import java.util.Map;

public class FileOrganizer {


    public void createFolders(HashMap<String,Integer> count ){

        for (Map.Entry<String, Integer> entry : count.entrySet())
        {
            //System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getValue() > 0)
            {
                System.out.println("Creating folder for " + entry.getKey() + " files.");
            }

        }
        
    }
}
