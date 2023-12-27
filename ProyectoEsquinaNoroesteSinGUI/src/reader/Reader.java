package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	protected BufferedReader br;
	protected File file;
	
	public Reader(String ruta) {
		this.br=null;
		this.file=new File (ruta);
	}
	
	public void leerArchivo(ArrayList<String[]>data) throws IOException{
		if(this.file.exists()) {
			this.br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while(line!=null) {
				data.add(line.split(","));
				line=br.readLine();
			}
			br.close();
		}
		else {
			throw new IOException("No se encuentra el archivo");
		}
	}	
}
