package ss16_io_text_file.bai1;

import java.io.*;
import java.util.ArrayList;

public class CopyFileText {
    public static int countVariables(String chainOfMe) {
        char[] charsOfMe = chainOfMe.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < charsOfMe.length; i++) {
            arrayList.add(charsOfMe[i]);
            num++;
        }
        return num;
    }

    public String readFileYouNeed(String fileSource) throws IOException, FileNotFoundException {
        File file = new File(fileSource);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String myString = "";
        String myNewString = "";
        while ((myString = bufferedReader.readLine()) != null) {

            myNewString += myString;
        }
        return myNewString;
    }

    public void writeFileYouNeed(String fileNew, String myString) throws IOException, FileNotFoundException {
        BufferedWriter bufferedWriter;
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileNew)) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            bufferedWriter.write(myString);
            bufferedWriter.close();
        }
    }

    public static void main(String[] args) {
        try {
            final String FILESOURCE = "D:\\A0523I1_Vo_Thi_Tuong_Vy_module_2\\module2\\src\\ss16_io_text_file\\bai1\\SourceFile";
            final String FILETARGET = "D:\\A0523I1_Vo_Thi_Tuong_Vy_module_2\\module2\\src\\ss16_io_text_file\\bai1\\TargetFile";
            CopyFileText copyFile = new CopyFileText();
            copyFile.writeFileYouNeed(FILETARGET, copyFile.readFileYouNeed(FILESOURCE));
            System.out.println("đây là số lượng kí tự có trong file");
            System.out.println(countVariables(copyFile.readFileYouNeed(FILESOURCE)));
        } catch (FileNotFoundException e) {
            System.out.println("file của bạn không thể tìm thấy");
        } catch (IOException e) {
            System.out.println("file không tồn tại không cho phép truy cập");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
