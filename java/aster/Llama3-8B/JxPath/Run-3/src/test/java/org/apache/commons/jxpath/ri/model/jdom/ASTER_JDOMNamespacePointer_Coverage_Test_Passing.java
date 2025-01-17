/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMNamespacePointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_NamespaceURINotBeNull_YkLr1() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(new DOMNodePointer(null, null, "id"), "prefix");
        String namespaceURI = jdomNamespacePointer.getNamespaceURI();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_BufferLengthIsZero_rDuc0() {
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(null, "prefix");
    String result = jdomNamespacePointer.asPath();
    assertEquals("namespace::prefix", result);
}
}