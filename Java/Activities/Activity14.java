package Activities;

import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;





public class Activity14 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VeepuriLakshmiBhavan\\IdeaProjects\\fst_java\\src\\main\\java\\Activities\\NewFile.txt");
        boolean fileStatus = file.createNewFile();
        if(fileStatus) {
            System.out.println("File got successfully created");
            FileUtils.writeStringToFile(file,"Welcome");

        } else {
            System.out.println("File not created");
        }

        File fileUtil = FileUtils.getFile("C:\\Users\\VeepuriLakshmiBhavan\\IdeaProjects\\fst_java\\src\\main\\java\\Activities\\NewFile.txt");
        System.out.println("Data in file : " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "NewFile.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Data in new file: " + newFileData);
    }
}