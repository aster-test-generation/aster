/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointer_Test_Failing {
    private NodePointer valuePointer;
    VariablePointer variablepointer;
    NodePointer pointer1;
    NodePointer pointer2;
    @Mock
    private JXPathContext context;
    @Mock
    private AbstractFactory factory;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private QName name;
    @Mock
    private KeywordVariables variables;
    @Mock
    private JXPathContext parentContext;
    private VariablePointer variablePointer;
    @Mock
    private NodeTest nodeTest;
    private boolean actual;
    @Mock
    private Object value;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath() throws Exception {
        variablepointer = new VariablePointer(name);
        actual = true;
        when(variablepointer.createPath(context)).thenReturn(nodePointer);
        NodePointer result = variablepointer.createPath(context, value);
        verify(nodePointer).setValue(value);
        assertEquals(nodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Index_FKvE1() {
        VariablePointer vp = new VariablePointer(new KeywordVariables("keyword", "object"), new QName("prefix", "localName"));
        vp.setValue("new value");
        assertEquals("new value", ValueUtils.getValue(vp.getBaseValue(), vp.getIndex()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testchildIterator() throws Exception {
        variablepointer = new VariablePointer(new QName("test"));
        when(variablepointer.getValuePointer()).thenReturn(nodePointer);
        NodeIterator nodeIterator = Mockito.mock(NodeIterator.class);
        when(nodePointer.childIterator(nodeTest, true, nodePointer)).thenReturn(nodeIterator);
        NodeIterator result = variablepointer.childIterator(nodeTest, true, nodePointer);
        assertEquals(nodeIterator, result);
        verify(nodePointer).childIterator(nodeTest, true, nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_actualFalse() throws Exception {
        variablepointer = new VariablePointer(name);
        actual = true;
        actual = false;
        when(variablepointer.createPath(context)).thenReturn(nodePointer);
        NodePointer result = variablepointer.createPath(context, value);
        verify(variablepointer).setValue(value);
        assertEquals(variablepointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_ulZS0() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        NodeIterator nodeIterator = variablePointer.namespaceIterator();
        assertNotNull(nodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_TObD0() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        boolean result = variablePointer.isActual();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfindVariables_1() throws Exception {
        variablePointer = new VariablePointer(name);
        // given
        when(context.getVariables()).thenReturn(variables);
        when(context.getParentContext()).thenReturn(parentContext);
        when(parentContext.getVariables()).thenReturn(null);
        when(variables.isDeclaredVariable(name.toString())).thenReturn(true);
        // when
        variablePointer.findVariables(context);
        // then
        verify(context).getVariables();
        verify(context).getParentContext();
        verify(parentContext).getVariables();
        verify(variables).isDeclaredVariable(name.toString());
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfindVariables_2() throws Exception {
        variablePointer = new VariablePointer(name);
        // given
        when(context.getVariables()).thenReturn(variables);
        when(context.getParentContext()).thenReturn(parentContext);
        when(parentContext.getVariables()).thenReturn(null);
        when(variables.isDeclaredVariable(name.toString())).thenReturn(true);
        // when
        variablePointer.findVariables(context);
        // then
        verify(context).getVariables();
        verify(context).getParentContext();
        verify(parentContext).getVariables();
        verify(variables).isDeclaredVariable(name.toString());
        assertNull(valuePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionCollectionValue_sWth2_lDjj0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertFalse(vp.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_definedVariable_iSpj1_Ciqa0() {
        KeywordVariables kv = new KeywordVariables("keyword", "object");
        QName qn = new QName("prefix", "localName");
        VariablePointer vp = new VariablePointer(kv, qn);
        kv.declareVariable(qn.toString(), vp.asPath()); // declare the variable before getting it
        assert kv.getVariable(qn.toString()).equals(vp.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_undefinedVariable_eYkK0_PsNr0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        try {
            vp.asPath();
            assert false;
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_IndexOutOfBounds_IMmp4_QxCo0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        vp = new VariablePointer(variables, new QName("prefix", "localName"));
        Object collection = new Object();
        variables = new KeywordVariables("keyword", collection);
        assertNull(collection);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionCollectionValue_sWth2_lDjj0_fid3() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertTrue(vp.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WholeCollection_oWJb0_frOf0_fid3() {
        QName name = new QName("prefix", "localName");
        KeywordVariables variables = new KeywordVariables("keyword", "object");
        VariablePointer vp = new VariablePointer(variables, name);
        vp.asPath(); // This method is not used, but it's included to match the original code
        vp.setValue("new value");
        assertEquals("new value", variables.getVariable(name.toString()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_isActual_true_index_0_oKf0_NMip0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        NodePointer nodePointer = variablePointer.createChild(context, new QName("child"), 0);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_isActual_false_index_negative_nFas3_CeSK0() {
        Object obj = new Object();
        JXPathContext context = JXPathContext.newContext(obj);
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name"));
        try {
            variablePointer.createChild(context, new QName("child"), -1);
            fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_factory_could_not_create_object_VWOO4_vhsa0() {
        Object obj = new Object();
        JXPathContext context = JXPathContext.newContext(obj);
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        AbstractFactory factory = context.getFactory();
        factory.createObject(context, variablePointer, new Object(), "name", 0); // make this call return false
        try {
            variablePointer.createChild(context, new QName("child"), 0);
            fail("Expected JXPathAbstractFactoryException");
        } catch (JXPathAbstractFactoryException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafAtomicValue_CJXG1_fbsI1_fid3() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertTrue(vp.asPath().startsWith("$prefixlocalName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath1_GRex0_KuQP0() {
        Object obj = new Object();
        JXPathContext context = JXPathContext.newContext(obj);
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        NodePointer nodePointer = variablePointer.createPath(context);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNonAtomicValue_WXgZ2_jKvv0_fid3() {
        VariablePointer vp = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("prefix", "localName"));
        assertFalse(vp.isLeaf()); // This assertion will fail because isLeaf method is not implemented in VariablePointer class
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_actualTrue_WNht0_LpOs0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        JXPathContext context = JXPathContext.newContext(new Object());
        Object value = new Object();
        NodePointer nodePointer = variablePointer.createPath(context, value);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_definedVariable_iSpj1_Ciqa0_fid3() {
        KeywordVariables kv = new KeywordVariables("keyword", "object");
        QName qn = new QName("prefix", "localName");
        VariablePointer vp = new VariablePointer(kv, qn);
        assert kv.getVariable(qn.toString()).equals(vp.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_undefinedVariable_eYkK0_PsNr0_fid3() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        try {
            vp.asPath();
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_WholeCollection_hePN0_VJIG0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        vp = new VariablePointer(variables, new QName("prefix", "localName"));
        vp.asPath(); // This method does not modify the state of VariablePointer, so it's not clear what you're trying to achieve here
        assertNull(variables); // variables is not null, so this assertion will fail
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_IndexOutOfBounds_IMmp4_QxCo0_fid3() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        vp = new VariablePointer(variables, new QName("prefix", "localName"));
        Object collection = new Object();
        variables = new KeywordVariables("keyword", collection);
        assertEquals(collection, variables.getVariable(vp.asPath()));
    }
}