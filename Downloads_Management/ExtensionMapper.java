public class ExtensionMapper {
    public static void printFilesExtentions(java.util.List<String> fileNames)
    {
        for (String names : fileNames) {
            int dotIndex = names.lastIndexOf('.');
            String extension = (dotIndex != -1) ? names.substring(dotIndex + 1) : "";
            System.out.println("File: " + names + " | Extension: " + extension);
        }

    }
    
}
