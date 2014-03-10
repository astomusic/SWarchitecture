package pattern_pratice;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Simple {
	@Element
    private String name;
     
    @Attribute
    private int index;
 
    public Simple() {
        super();
    }
 
    public Simple(String name, int index) {
        super();
        this.name = name;
        this.index = index;
    }
 
    public String getName() {
        return name;
    }
 
    public int getIndex() {
        return index;
    }
}
