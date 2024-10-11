/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointer_Test_Failing {
    @Mock
    private NodePointer nodePointer1;
    @Mock
    private NodePointer nodePointer2;
    private VariablePointer variablepointer;
    @Mock
    private JXPathContext jXPathContext;
    @Mock
    private AbstractFactory abstractFactory;
    @Mock
    private NodePointer nodePointer;
    private Variables variables;
    private boolean actual;
    private QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithoutVariables_yNFw1() {
        QName name = new QName("qualifiedName");
        VariablePointer variablePointer = new VariablePointer(name);
        int result = variablePointer.hashCode();
        assertEquals(result, (0 + name.hashCode() + 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNullValue_Wcoa0() {
        VariablePointer variablePointer = new VariablePointer(new QName("test"));
        Object value = null;
        boolean result = variablePointer.isLeaf();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_TGLD0() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
        NodePointer nodePointer = variablePointer.namespacePointer("name");
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_sPAb0_1() throws Exception {
        MockitoAnnotations.initMocks(this);
        variablepointer = new VariablePointer(new QName("prefix", "localName"));
        when(abstractFactory.createObject(jXPathContext, variablepointer, nodePointer, "name", 0)).thenReturn(true);
        when(abstractFactory.createObject(jXPathContext, variablepointer, nodePointer, "name", 1)).thenReturn(true);
        NodePointer child = variablepointer.createChild(jXPathContext, new QName("prefix", "localName"), 0);
        verify(abstractFactory, times(1)).createObject(jXPathContext, variablepointer, nodePointer, "name", 0);
        verify(abstractFactory, times(1)).createObject(jXPathContext, variablepointer, nodePointer, "name", 1);
        assertEquals(0, child.getIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_sPAb0_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        variablepointer = new VariablePointer(new QName("prefix", "localName"));
        when(abstractFactory.createObject(jXPathContext, variablepointer, nodePointer, "name", 0)).thenReturn(true);
        when(abstractFactory.createObject(jXPathContext, variablepointer, nodePointer, "name", 1)).thenReturn(true);
        NodePointer child = variablepointer.createChild(jXPathContext, new QName("prefix", "localName"), 0);
        verify(abstractFactory, times(1)).createObject(jXPathContext, variablepointer, nodePointer, "name", 0);
        verify(abstractFactory, times(1)).createObject(jXPathContext, variablepointer, nodePointer, "name", 1);
        assertEquals(nodePointer, child.getImmediateParentPointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildActualIndex0_jMOJ0_SqKh0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = variablePointer.createChild(context, new QName("name"), 0);
        assertEquals(variablePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildActualIndexNot0_ztML1_oUTk0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = variablePointer.createChild(context, new QName("name"), 1);
        assertEquals(variablePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildNullCollection_VOre4_HTPJ0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        JXPathContext context = JXPathContext.newContext(new Object());
        Object collection = null;
        NodePointer result = variablePointer.createChild(context, new QName("name"), 0);
        assertEquals(variablePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testchildIterator_Zitl0() throws Exception {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablepointer = new VariablePointer(qName);
        NodePointer nodePointer = Mockito.mock(NodePointer.class);
        NodeIterator nodeIterator = Mockito.mock(NodeIterator.class);
        Mockito.when(nodePointer.childIterator(Mockito.any(), Mockito.anyBoolean(), Mockito.any(NodePointer.class))).thenReturn(nodeIterator);
        NodeIterator result = variablepointer.childIterator(null, true, nodePointer);
        Mockito.verify(nodePointer).childIterator(Mockito.any(), Mockito.anyBoolean(), Mockito.any(NodePointer.class));
        Mockito.verifyNoMoreInteractions();
        Assertions.assertEquals(nodeIterator, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_HWLR0_LtjB1() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = variablePointer.createPath(context, new Object());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathTrue_eXqK0_UZMa1() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = variablePointer.createPath(context);
        assertEquals(NodePointer.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_lNNp0_ZysB0() {
        VariablePointer variablePointer = new VariablePointer(new QName("qualifiedName"));
        JXPathContext jXPathContext = JXPathContext.newContext(new Object());
        QName qName = new QName("prefix", "localName");
        NodePointer nodePointer = variablePointer.createChild(jXPathContext, qName, 0, new Object());
        assertNotNull(nodePointer);
    }
}