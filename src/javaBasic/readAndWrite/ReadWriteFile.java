package javaBasic.readAndWrite;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) throws Exception {
        //缓存输入流
        BufferedInputStream in =
                new BufferedInputStream(new FileInputStream("C:\\Users\\lishch\\IdeaProjects\\LeetCode\\src\\javaBasic\\inputFile.txt"));
        //缓存输出流
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lishch\\IdeaProjects\\LeetCode\\src\\javaBasic\\out.txt"));

        //一次性取多少字节
        byte[] bytes = new byte[2048];

        //接受读取的内容(n就代表的相关数据，只不过是数字的形式)
        int n = -1;
        //循环取出数据
        while ((n = in.read(bytes,0,bytes.length)) != -1) {
            //写入相关文件
            out.write(bytes, 0, n);
//            //转换成字符串
//            String str = new String(bytes,0,n,"utf-8");
//            //这里可以实现字节到字符串的转换，比较实用
//            System.out.println(str);

        }
        //关闭流
        in.close();
        out.close();
    }
}
