import java.nio.file.*;
import java.util.List;
import java.util.Map;

public class FileMover {
    private Map<String, List<Path>> categorizedFiles;
  
    public FileMover(Map<String, List<Path>> categorizedFiles) {
      this.categorizedFiles = categorizedFiles;
    }

    public void moveFiles(String baseDir)
    {
        boolean fileMoved = false;

        for (Map.Entry<String, List<Path>> entry : categorizedFiles.entrySet()) {
            String folderName = entry.getKey();
            List<Path> files = entry.getValue();
            
            if(!files.isEmpty()){
                Path targetDir = Paths.get(baseDir, folderName);

                try{
                    if(!Files.exists(targetDir)){
                        Files.createDirectories(targetDir);
                    }
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
