import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
 
/**
 * Our Custom Class Loader to load the classes. Any class in the com.journaldev
 * package will be loaded using this ClassLoader. For other classes, it will
 * delegate the request to its Parent ClassLoader.
 *
 */
public class CCLoader extends ClassLoader {

	/**
     * This constructor is used to set the parent ClassLoader
     */
	public CCLoader(ClassLoader parent){
		super(parent);
	}
	
	public static void main(String[] args) {
		

	}

}
