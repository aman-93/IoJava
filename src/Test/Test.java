package Test;

import java.io.File;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		if(args==null && args.length==0) {
			System.out.println("Nessun parametro");
		}else {
			
			if(args[0].equals("-d")) {
				for(int i=1;i<args.length;i++) {
					File dir=new File(args[i]);
					
					if(dir.exists()) {
						dir.delete();
						System.out.println("Cancello la directory"+dir);
					}else {
						System.out.println("Inesistente la directory"+dir);
					}

				}
			}else {
				for(int i=0;i<args.length;i++) {
					File dir=new File(args[i]);
			
					System.out.println("Creo la directory "+dir);
					dir.mkdir();
			}
		}
		
		}
	}
}

