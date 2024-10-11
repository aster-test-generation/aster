/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariablePointer_Coverage_Test_Passing {
private QName name;
    private VariablePointer variablePointer;
    private JXPathContext context;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables_NullContext_PKts0() {
        VariablePointer variablePointer = new VariablePointer(new QName("test"));
        variablePointer.findVariables(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_pjFM0() {
        NodePointer nodePointer = mock(NodePointer.class);
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        when(variablePointer.getValuePointer()).thenReturn(nodePointer);
        NodePointer namespacePointer = mock(NodePointer.class);
        when(nodePointer.namespacePointer("name")).thenReturn(namespacePointer);
        NodePointer result = variablePointer.namespacePointer("name");
        assertEquals(namespacePointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionWithNullValue_FGKe1_pFly0() {
    QName name = new QName("prefix", "localName");
    VariablePointer variablePointer = new VariablePointer(name);
    Object value = null;
    boolean result = variablePointer.isActual();
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_nullValuePointer_HnKb1_ptZn0_fid1() {
    VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
    try {
        variablePointer.setValue("new value");
        fail("Expected JXPathException");
    } catch (JXPathException e) {
        assertEquals("Cannot set undefined variable: prefix:localName", e.getMessage());
    }
}
}