import java.nio.file.*;
import java.util.stream.*;
import java.util.HashSet;
import java.util.Scanner;

class SearchContent{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String [] args) throws Exception{
        
        Scanner myObj = new Scanner(System.in);  
        System.out.print("Enter Path \t");

        String path = myObj.next(); 

        System.out.print("Enter keyword \t");
        String keyword = myObj.next();

        Path p = Paths.get(path);
        // // System.out.println(p);
        // // System.out.println(keyword);
        // try{
        //     Stream<String> st = Files.lines(p);
        //     st.forEach(x -> System.out.println(x));
        // }
        // catch(Exception e){System.out.println(e);}

        
        // Stream<Path> pstr = Files.walk(p);

        // pstr.forEach(pt -> {
        //     Stream<String> str = Files.lines(pt);
        //     str.forEach(s -> {
        //         if(s.contains(keyword))
        //             set.add(p);
        //     });
        // });

        HashSet<Path> set = new HashSet<>();
        Stream<Path> pstr = Files.walk(p);
        
        pstr.forEach( pt -> {
            try{
                if(!Files.isDirectory(pt)){
                    Stream<String> str = Files.lines(pt);
                    str.forEach(s -> {
                        if(s.contains(keyword))
                            set.add(pt);
                    });
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        });

        for(Path p11: set){
            System.out.println(p11);
        }
         
    }
}


