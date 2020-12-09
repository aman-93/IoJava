package Test;

import java.io.File;
import java.util.Arrays;
import java.util.Enumeration;

public class DirUtil {

	public static void main(String[] args) {//valori provenienti dalla riga di comando 
//array che viene riempito dalla riga di comando 
		
		if(args==null && args.length==0) {
			System.out.println("Null");
		}else{
			System.out.println(Arrays.deepToString(args));
		}
		
		Enumeration<Object> en= System.getProperties().keys();
		
		//while(en.hasMoreElements()) {
			//String key=(String)en.nextElement();
			System.out.println("java.class.path"+"__val__"+System.getProperties().getProperty("java.class.path"));
		//}
			
		//System.out.println(System.getProperties());
		
		File dir_curr=new File(".");//in realtà è una directory
		File filet=new File("filet.txt");//un file
		
		System.out.println(filet.getAbsolutePath());
	
		System.out.println(Arrays.deepToString(dir_curr.list()));
	
		System.out.println(Arrays.deepToString(filet.list()));
		
		System.out.println(filet.isFile());
		
		System.out.println(dir_curr.isFile());
	
		String z=null;
	}
	
	
	
	//riceve un oinsieme di stringhe e crea un insieme di direectory
	//cancella le direcotry con quel nome
	
}
