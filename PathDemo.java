import java.nio.file.*;

class PathDemo{
    static public void main(String [] args){
        // we have to use one extra back slash because it is an escape character and to escape character we have to use another slash
        //  Path p = Paths.get("D:\\java\\Path\\abc.txt");
        //  or we can do it in this way
         Path p = Paths.get("D:/java/Path/abc.txt");

         System.out.println(p.getRoot());
         System.out.println(p.getFileName());
         System.out.println(p.getFileSystem());
         System.out.println(p.getName(2));
         System.out.println(p.getNameCount());
         System.out.println(p.getParent());         
    }
}