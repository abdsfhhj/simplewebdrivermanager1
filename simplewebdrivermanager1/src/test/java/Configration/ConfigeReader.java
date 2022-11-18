package Configration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigeReader {

	public static void main(String[] args) throws IOException {
		File fs = new File("./Configrartion/confi.properties");
		FileInputStream fins = new FileInputStream(fs);
		Properties prop = new Properties();
		prop.load(fins);

		String url = prop.getProperty("url");
		System.out.println(url);

		String uname = prop.getProperty("username");
		System.out.println(uname);

		String upas = prop.getProperty("password");
		System.out.println(upas);



	}

}
