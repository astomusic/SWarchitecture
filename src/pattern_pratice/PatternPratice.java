package pattern_pratice;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class PatternPratice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serializer serializer = new Persister();
		File source = new File("/Users/astomusic/Documents/workspace/SWarchitecture/src/pattern_pratice/sort.xml");
		
		Simple simple = null;
        try {
        	simple = serializer.read(Simple.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.print(simple.getIndex());
        System.out.print(simple.getText());
        
	}
}
