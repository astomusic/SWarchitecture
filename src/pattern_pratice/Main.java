package pattern_pratice;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Main {
	public static void main(String[] args) {
		Serializer serializer = new Persister();
		File source = new File("/Users/astomusic/Documents/workspace/SWarchitecture/src/sort.xml");
		int[] values = {30, 20, 10, 50, 80, 1};
		
		Simple simple = null;
        try {
        	simple = serializer.read(Simple.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String dispatcherName = simple.getName();
        System.out.println(dispatcherName);
        iSort sort = null;
        try {
			sort = (iSort)Class.forName(dispatcherName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        
        sort.doSort();
        
	}
}
