package dlince;

import java.io.File;

public class Generador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="";
		String archivo = path +"lenguaje.lex";
		
		File file = new File(archivo);
		jflex.Main.generate(file);
	}

}