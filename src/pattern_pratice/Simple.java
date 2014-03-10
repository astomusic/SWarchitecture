package pattern_pratice;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Simple {
	@Element
    private String name;
     
    @Attribute
    private String index;
 
    public Simple() {
        super();
    }
 
    public Simple(String name, String index) {
        super();
        this.name = name;
        this.index = index;
    }
 
    public String getText() {
        return name;
    }
 
    public String getIndex() {
        return index;
    }
}
