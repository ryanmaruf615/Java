import java.util.HashMap;
import java.util.List;

public class ExtensionMapper {

    
    public void printFilesExtentions(java.util.List<String> fileNames, java.util.List<String> folderNames, String directoryPath)
    {
        int pdfCount = 0, wordCount = 0, excelCount = 0, pptCount = 0, 
        imageCount = 0, videoCount = 0, audioCount = 0, compressedCount = 0, 
        unknownCount = 0; 

        for (String names : fileNames) {
            int dotIndex = names.lastIndexOf('.');
            String extension = (dotIndex != -1) ? names.substring(dotIndex + 1) : "";
            //System.out.println("File: " + names + " | Extension: " + extension);

            if(extension.equalsIgnoreCase("pdf"))
                pdfCount++; 
            else if(extension.equalsIgnoreCase("docx") || extension.equalsIgnoreCase("doc"))
                wordCount++;                
            else if(extension.equalsIgnoreCase("xlsx") || extension.equalsIgnoreCase("xls"))
                excelCount++;
            else if(extension.equalsIgnoreCase("pptx") || extension.equalsIgnoreCase("ppt"))
                pptCount++;
            else if(extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("gif"))
                imageCount++;
            else if(extension.equalsIgnoreCase("mp4") || extension.equalsIgnoreCase("mkv") || extension.equalsIgnoreCase("avi"))
                videoCount++;
            else if(extension.equalsIgnoreCase("mp3") || extension.equalsIgnoreCase("wav") || extension.equalsIgnoreCase("flac"))
                audioCount++;              
            else if(extension.equalsIgnoreCase("zip") || extension.equalsIgnoreCase("rar") || extension.equalsIgnoreCase("7z")) 
                compressedCount++;
            else
                unknownCount++;
        }
        // Create an instance of FileOrganizer and call createFolders method
       
       HashMap<String,Integer> count = new HashMap<>();
         count.put("pdf", pdfCount);
         count.put("word", wordCount);
         count.put("excel", excelCount);    
         count.put("ppt", pptCount);     
         count.put("image", imageCount);
         count.put("video", videoCount);
         count.put("audio", audioCount);
         count.put("compressed", compressedCount);
         count.put("unknown", unknownCount);
 
        FileOrganizer fileOrganizer = new FileOrganizer();  
        fileOrganizer.createFolders(count, folderNames, directoryPath);   
        

    }
    
}
