package activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {

    public static void main(String args[]){
        try {
            String fileLocation = System.getProperty("user.dir") + "\\TestingFST.txt";
            //File file = new File("C:\\Users\\002VNC744\\Documents\\TestingFST.txt");
            File file = new File(fileLocation);
            boolean fStatus = file.createNewFile();
            System.out.println("File is created : " + fStatus);
            FileUtils.write(new File(fileLocation), "Testing", "UTF8");
            File fileUtil = FileUtils.getFile(fileLocation);
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
            File destDir = new File(System.getProperty("user.dir")+"resources");

            FileUtils.copyFileToDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, "TestingFST.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
