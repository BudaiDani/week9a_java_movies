package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MovieManager {

	public static final String FILE_PATH = "c:\\movies.xml";
	public static void main(String[] args) {

		//actors
		
	try
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(FILE_PATH)));
			StringBuffer sb = new StringBuffer();
			sb.append("<movies>");
			sb.append(titanic.toXMLString());
			sb.append(matrix.toXMLString());
			sb.append(inception.toXMLString());
			sb.append("<movies>");
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		}
 catch (IOException e) {
			e.printStackTrace();
		}
	}
}
