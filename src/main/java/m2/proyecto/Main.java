package m2.proyecto;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Folder root = defineDirectory();

        root.toString("  ");
    }

    private static Folder defineDirectory() {
        Folder root = new Folder("folder1", "0", "/", new Date(), new Date(), new Date());
        Folder folder2 = new Folder("folder2", "0", "/folder1/", new Date(), new Date(), new Date());
        Folder folder3 = new Folder("folder3", "0", "/folder1/folder2/", new Date(), new Date(), new Date());

        File file1 = new File("archivo1", ".mp4", "200 MB (172,928,000 bytes)", "/folder1/", new Date(), new Date(), new Date());
        File file2 = new File("archivo2", ".mp3", "20 MB (17,292,800 bytes)", "/folder1/", new Date(), new Date(), new Date());
        File file3 = new File("archivo3", ".mkv", "2000 MB (1,729,280,000 bytes)", "/folder1/folder2/", new Date(), new Date(), new Date());
        File file4 = new File("archivo4", ".avi", "200 MB (172,928,000 bytes)", "/folder1/folder2/", new Date(), new Date(), new Date());
        File file5 = new File("archivo5", ".jpg", "2 MB (1,729,280 bytes)", "/folder1/folder/2/folder3/", new Date(), new Date(), new Date());

        root.addFileComponent(folder2);
        root.addFileComponent(folder3);
        root.addFileComponent(file1);
        root.addFileComponent(file2);

        folder2.addFileComponent(folder3);
        folder2.addFileComponent(file3);
        folder2.addFileComponent(file4);

        folder3.addFileComponent(file5);
        return root;
    }

//    private static List<SchedulerRule> defineRules(){
//
//    }
}
