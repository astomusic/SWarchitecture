package pattern_pratice;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Main {
	public static void main(String[] args) {
		File path = new File(".");
		String filePath = path.getAbsolutePath() + "/src/";
		File source = new File(filePath + "sort.xml");
		Serializer serializer = new Persister();
		
		int[] values = {30, 20, 10, 50, 80, 1};
		
		Simple simple = null;
        try {
        	simple = serializer.read(Simple.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String SortName = simple.getName();
        iSort sort = null;
        
        try {
			sort = (iSort)Class.forName("pattern_pratice." + SortName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        int result[] = sort.doSort(values);
        
        for (int i=0 ; i < result.length ; i++) {
        	System.out.println(result[i]);
        }
        
        
	}
}
