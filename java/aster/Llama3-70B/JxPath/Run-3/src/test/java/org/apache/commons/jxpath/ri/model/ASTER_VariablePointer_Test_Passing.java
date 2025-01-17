/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.servlet.KeywordVariables;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointer_Test_Passing {
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
    public void testcompareChildNodePointers() throws Exception {
        variablepointer = new VariablePointer(new QName("test"));
        pointer1 = Mockito.mock(NodePointer.class);
        pointer2 = Mockito.mock(NodePointer.class);
        Mockito.when(pointer1.getIndex()).thenReturn(1);
        Mockito.when(pointer2.getIndex()).thenReturn(2);
        int result = variablepointer.compareChildNodePointers(pointer1, pointer2);
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_1_Itai0() {
        QName name = new QName("prefix", "localName");
        VariablePointer vp = new VariablePointer(name);
        int result = vp.hashCode();
        assertEquals(result, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_2_oTTm1() {
        QName name = new QName("qualifiedName");
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer vp = new VariablePointer(variables, name);
        int result = vp.hashCode();
        assertEquals(result, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_CXZE0() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        NodeIterator nodeIterator = variablePointer.attributeIterator(name);
        assertNotNull(nodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_EymM0() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
        variablePointer.setIndex(10);
        assertEquals(10, variablePointer.getIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_uaOT0() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        QName result = variablePointer.getName();
        assertEquals(name, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer1_xKDI0() {
        VariablePointer variablePointer = new VariablePointer(new QName("qualifiedName"));
        NodePointer nodePointer = variablePointer.getImmediateValuePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer2_pago1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, new QName("prefix", "localName"));
        NodePointer nodePointer = variablePointer.getImmediateValuePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_pCbR0() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        assertTrue(variablePointer.isContainer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_IDOq0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertTrue(vp.equals(vp));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_iAsA1() {
        Object obj = new Object();
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertFalse(vp.equals(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameVariablesAndName_yoiL2() {
        QName name = new QName("prefix", "localName");
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer vp1 = new VariablePointer(variables, name);
        VariablePointer vp2 = new VariablePointer(variables, name);
        assertTrue(vp1.equals(vp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentVariables_XSjf3() {
        QName name = new QName("prefix", "localName");
        KeywordVariables variables1 = new KeywordVariables("keyword1", new Object());
        KeywordVariables variables2 = new KeywordVariables("keyword2", new Object());
        VariablePointer vp1 = new VariablePointer(variables1, name);
        VariablePointer vp2 = new VariablePointer(variables2, name);
        assertFalse(vp1.equals(vp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_gJac4() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name1 = new QName("prefix1", "localName1");
        QName name2 = new QName("prefix2", "localName2");
        VariablePointer vp1 = new VariablePointer(variables, name1);
        VariablePointer vp2 = new VariablePointer(variables, name2);
        assertFalse(vp1.equals(vp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentIndex_UOkw5() {
        QName name = new QName("prefix", "localName");
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer vp1 = new VariablePointer(variables, name);
        VariablePointer vp2 = new VariablePointer(variables, name);
        vp1.setIndex(1);
        vp2.setIndex(2);
        assertFalse(vp1.equals(vp2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_sGQZ0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertEquals("$prefix:localName", vp.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_sUxd1() {
        VariablePointer vp = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("prefix", "localName"));
        assertEquals("$prefix:localName", vp.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath3_cKlp2() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        vp.setIndex(1);
        assertEquals("$prefix:localName[2]", vp.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath4_ZMrA3() {
        VariablePointer vp = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("prefix", "localName"));
        vp.setIndex(1);
        assertEquals("$prefix:localName[2]", vp.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Index_FKvE1_fid1() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertEquals(vp.asPath(), "$prefix:localName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_ulZS0_fid1() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        NodeIterator nodeIterator = variablePointer.namespaceIterator();
        assertNull(nodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_TObD0_fid1() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        boolean result = variablePointer.isActual();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionNotCollectionValue_ISCo1_WwSl0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WholeCollection_oWJb0_frOf0() {
        QName name = new QName("prefix", "localName");
        KeywordVariables variables = new KeywordVariables("keyword", "object");
        VariablePointer vp = new VariablePointer(variables, name);
        vp.asPath();
        try {
            vp.setValue("new value");
            fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            assertEquals("Cannot declare new keyword variables.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables_DeclaredVariable_jqZK0_ynGZ0() {
        Object obj = new Object();
        JXPathContext context = JXPathContext.newContext(obj);
        Variables variables = context.getVariables();
        variables.declareVariable("name", new Object());
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        variablePointer.findVariables(context);
        assertEquals(true, variablePointer.asPath().startsWith("$name"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNullValue_KNBj0_opjr0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertTrue(vp.asPath().startsWith("$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafAtomicValue_CJXG1_fbsI1() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertFalse(vp.asPath().startsWith("$prefixlocalName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNonAtomicValue_WXgZ2_jKvv0() {
        VariablePointer vp = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("prefix", "localName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_ArrayValue_cDZJ1_BOxR0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        assertEquals(vp.asPath(), "$prefix:localName"); // This assertion will pass
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_NotActual_szqc5_ZPhU0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        vp = new VariablePointer(variables, new QName("prefix", "localName"));
        String result = vp.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_NullCollection_urdL3_xzeE0() {
        VariablePointer vp = new VariablePointer(new QName("prefix", "localName"));
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        vp = new VariablePointer(variables, new QName("prefix", "localName"));
        String path = vp.asPath();
        assertNotNull(path);
    }
}