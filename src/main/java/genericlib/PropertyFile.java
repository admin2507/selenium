package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements Autoconstant {
    public static String getData(String key) throws FileNotFoundException, IOException {
	Properties p = new Properties();
    p.load(new FileInputStream(datapropertyfilepath));
	return p.getProperty(key);
    }
}
