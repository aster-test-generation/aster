/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNodePointer_Coverage_Test_Failing {
private Object node;
private JDOMNodePointer jdomnodepointer;
    private Text textNode;
    private Element elementNode;
    private Document document;
    private CDATA cdata;
    private ProcessingInstruction pi;
    private Comment comment;
    private JXPathContext context;
    private JDOMNodePointer nodePointer;
    private QName name;
    private int index;
    private Object value;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_GXXL1() {
        NodePointer ptr = nodePointer.createChild(context, name, index, value);
        assertNotNull(ptr);
    }
}