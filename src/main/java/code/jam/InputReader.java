package code.jam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by DoubleD on 5/10/2015.
 */
public class InputReader {

    public FileReader read(String filename) throws FileNotFoundException {

        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource(filename).getFile());
        FileReader fin = new FileReader(file);
        return fin;
    }
}
