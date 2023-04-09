import java.nio.file.*;
import java.util.stream.*;
class FolderDemo
{
     static public void main(String [] rk)
     {
	Path p = Paths.get("D:\\New folder\\fileorganizer\\java");
	//Path p = Paths.get("H:/Dummy/ABC.txt");
	//System.out.println(p.getRoot());
	try {
		Stream<Path> str = Files.list(p);
		str.forEach( x -> {
				String name = x.getFileName().toString();
				String [] tokens = name.split("\\.");
				String ext = tokens[tokens.length-1];
				try{	
				       Path d = Paths.get(x.getParent() + "\\" +ext);
			                        Files.createDirectory(d);
				    }
				catch(Exception e) {}
			           }			    
			);
	     }
	catch(Exception e) {System.out.println(e); }
     }
}