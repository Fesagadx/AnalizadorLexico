package dlince;

import java.io.File;

public class Generador {

	public static void main(String[] args) {

		String path="C://FELIPE/eclipse/eclipse/AnalizadorLexico/AnalizadorLexico/bin/dlince/";
		String archivo = path +"lenguaje.lex";
		
		File file = new File(archivo);
		jflex.Main.generate(file);
		
	}

}