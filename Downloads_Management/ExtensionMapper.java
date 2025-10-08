import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtensionMapper {

    // Map: category(folderName) -> list of files
    private Map<String,List<Path>> categorizedFiles = new HashMap<>();

    public ExtensionMapper() {
        // Initialize all categories with empty lists
        categorizedFiles.put("pdf", new ArrayList<>());
        categorizedFiles.put("word",new ArrayList<>());
        categorizedFiles.put("excel", new ArrayList<>());
        categorizedFiles.put("ppt", new ArrayList<>());
        categorizedFiles.put("image", new ArrayList<>());
        categorizedFiles.put("video", new ArrayList<>());
        categorizedFiles.put("audio", new ArrayList<>());
        categorizedFiles.put("compressed", new ArrayList<>());
        categorizedFiles.put("unknown", new ArrayList<>());
    }

    // categorize a file based on its extension
    public void categorizeFile(Path file)
    {
        String fileName = file.getFileName().toString();
        int dotIndex = fileName.lastIndexOf('.');
        String extension = (dotIndex != -1) ? fileName.substring(dotIndex + 1).toLowerCase() : "";
        String category = getCategory(extension);
        categorizedFiles.get(category).add(file);
    }

    // map extensions to categories
    private String getCategory(String extension) {
        switch (extension) {
            case "pdf": return "pdf";
            case "doc": case "docx": return "word";
            case "xls": case "xlsx": return "excel";
            case "ppt": case "pptx": return "ppt";
            case "jpg": case "jpeg": case "png": case "gif": return "image";
            case "mp4": case "mkv": case "avi": return "video";
            case "mp3": case "wav": case "flac": return "audio";
            case "zip": case "rar": case "7z": return "compressed";
            default: return "unknown";
        }
    }

    // getter return the categorized map
    public Map<String,List<Path>> getCategorizedFiles() {
        return categorizedFiles;
    }
    
}
