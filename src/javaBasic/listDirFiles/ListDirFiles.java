package javaBasic.listDirFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDirFiles {
    public static void main(String[] args) {
        List<String> fileList = new ArrayList<>();
        File path = new File("D:\\個人資料\\00_工作发展\\Java架构\\高级工程师面试\\视频");
        listFiles(path, fileList);

        for (String file:
             fileList) {
            System.out.println(file);
        }
    }

    private static void listFiles(File path, List<String> fileList) {
        File[] files = path.listFiles();
        for (File file:
             files) {
            if (file.isFile()){
                fileList.add(file.toString());
            }else{
                fileList.add(file.toString());
                listFiles(file,fileList);
            }
        }
    }


}
