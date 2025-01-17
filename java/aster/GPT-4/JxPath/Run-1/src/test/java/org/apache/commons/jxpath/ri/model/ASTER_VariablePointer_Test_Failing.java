/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariablePointer_Test_Failing {
@InjectMocks
    private VariablePointer variablePointer;
@Mock
    private NodePointer pointer1;
@Mock
    private NodePointer pointer2;
@Mock
    private JXPathContext context;
@Mock
    private AbstractFactory factory;
@Mock
    private NodePointer clonedNodePointer;
@Mock
    private Variables variables;
@Mock
    private JXPathContext parentContext;
private QName name;
@Mock
    private NodePointer mockNodePointer;
@Mock
    private NodeIterator mockNodeIterator;
@Mock
    private NodeTest mockNodeTest;
@Mock
    private JXPathContext mockContext;
@Mock
    private QName qName;
    private NodePointer valuePointer;
    private boolean actual;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_SuccessfulCreation() throws Exception {
        QName name = new QName("testName");
        variablePointer = new VariablePointer(name);
        // Setup
        int index = 1;
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        when(factory.createObject(eq(context), eq(variablePointer), any(), eq("testName"), eq(index))).thenReturn(true);
        when(variablePointer.clone()).thenReturn(clonedNodePointer);
        doNothing().when(clonedNodePointer).setIndex(index);
        // Execute
        NodePointer result = variablePointer.createChild(context, new QName("childName"), index);
        // Verify
        verify(factory).createObject(context, variablePointer, null, "testName", index);
        verify(clonedNodePointer).setIndex(index);
        assertEquals(clonedNodePointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_FactoryCreationFailed_1() {
        QName name = new QName("testName");
        variablePointer = new VariablePointer(name);
        // Setup
        int index = 1;
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        when(factory.createObject(eq(context), eq(variablePointer), any(), eq("testName"), eq(index))).thenReturn(false);
        // Execute & Verify
        Exception exception = assertThrows(JXPathAbstractFactoryException.class, () -> {
            variablePointer.createChild(context, new QName("childName"), index);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_IndexZero() throws Exception {
        QName name = new QName("testName");
        variablePointer = new VariablePointer(name);
        // Setup
        int index = 0;
        when(variablePointer.isActual()).thenReturn(true);
        // Execute
        NodePointer result = variablePointer.createChild(context, new QName("childName"), index);
        // Verify
        assertSame(variablePointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables_VariableFoundInCurrentContext() {
        name = new QName("testVariable");
        variablePointer = new VariablePointer(variables, name);
        // Setup
        when(context.getVariables()).thenReturn(variables);
        when(variables.isDeclaredVariable(name.toString())).thenReturn(true);
        when(context.getParentContext()).thenReturn(null);
        // Action
        variablePointer.findVariables(context);
        // Assertion
        assertTrue(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables_VariableFoundInParentContext() {
        name = new QName("testVariable");
        variablePointer = new VariablePointer(variables, name);
        // Setup
        when(context.getVariables()).thenReturn(null);
        when(context.getParentContext()).thenReturn(parentContext);
        when(parentContext.getVariables()).thenReturn(variables);
        when(variables.isDeclaredVariable(name.toString())).thenReturn(true);
        // Action
        variablePointer.findVariables(context);
        // Assertion
        assertTrue(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables_VariableNotFound() {
        name = new QName("testVariable");
        variablePointer = new VariablePointer(variables, name);
        // Setup
        when(context.getVariables()).thenReturn(null);
        when(context.getParentContext()).thenReturn(parentContext);
        when(parentContext.getVariables()).thenReturn(variables);
        when(variables.isDeclaredVariable(name.toString())).thenReturn(false);
        when(parentContext.getParentContext()).thenReturn(null);
        // Action
        variablePointer.findVariables(context);
        // Assertion
        assertFalse(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithVariables_RIcy0() {
        QName qName = new QName("prefix", "localName");
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, qName);
        int expectedHashCode = System.identityHashCode(keywordVariables) + qName.hashCode();
        assertEquals(expectedHashCode, variablePointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithoutVariables_tvIj1() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        int expectedHashCode = qName.hashCode();
        assertEquals(expectedHashCode, variablePointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithValidIndex_ppqi0() {
    QName qName = new QName("testVariable");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    NodePointer result = variablePointer.createChild(context, qName, 1);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithZeroIndex_SREg1() {
    QName qName = new QName("testVariable");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    NodePointer result = variablePointer.createChild(context, qName, 0);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithNegativeIndex_XwCB2() {
    QName qName = new QName("testVariable");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    assertThrows(JXPathInvalidAccessException.class, () -> {
        variablePointer.createChild(context, qName, -1);
    });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithIndexExceedingCollectionSize_yYTR3() {
    QName qName = new QName("testVariable");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    assertThrows(JXPathAbstractFactoryException.class, () -> {
        variablePointer.createChild(context, qName, 100);
    });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithWholeCollectionIndex_kxwE4() {
    QName qName = new QName("testVariable");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    NodePointer result = variablePointer.createChild(context, qName, VariablePointer.WHOLE_COLLECTION);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeWithWholeCollection_qRfL0() {
        QName qName = new QName("testNamespace", "testLocalName");
        KeywordVariables variables = new KeywordVariables("testKeyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, qName);
        Object result = variablePointer.getImmediateNode();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChildIterator_1() throws Exception {
        // Setup the VariablePointer with a mocked QName
        QName qname = new QName("namespace", "localName");
        variablePointer = new VariablePointer(qname);
        // Setup the behavior of getValuePointer to return the mockNodePointer
        when(variablePointer.getValuePointer()).thenReturn(mockNodePointer);
        // Arrange
        boolean reverse = false;
        NodePointer startWith = null;
        // Setup the expected behavior of childIterator on the mockNodePointer
        when(mockNodePointer.childIterator(mockNodeTest, reverse, startWith)).thenReturn(mockNodeIterator);
        // Act
        NodeIterator result = variablePointer.childIterator(mockNodeTest, reverse, startWith);
        // Assert
        verify(mockNodePointer).childIterator(mockNodeTest, reverse, startWith);
        assertNotNull(result, "The result should not be null.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChildIterator_2() throws Exception {
        // Setup the VariablePointer with a mocked QName
        QName qname = new QName("namespace", "localName");
        variablePointer = new VariablePointer(qname);
        // Setup the behavior of getValuePointer to return the mockNodePointer
        when(variablePointer.getValuePointer()).thenReturn(mockNodePointer);
        // Arrange
        boolean reverse = false;
        NodePointer startWith = null;
        // Setup the expected behavior of childIterator on the mockNodePointer
        when(mockNodePointer.childIterator(mockNodeTest, reverse, startWith)).thenReturn(mockNodeIterator);
        // Act
        NodeIterator result = variablePointer.childIterator(mockNodeTest, reverse, startWith);
        // Assert
        verify(mockNodePointer).childIterator(mockNodeTest, reverse, startWith);
        assertEquals(mockNodeIterator, result, "The result should be the same as the mockNodeIterator.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_BaseValueNull_VyYf0() {
        QName qName = new QName("test");
        VariablePointer vp = new VariablePointer(qName);
        assertEquals(1, vp.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ActualFalse_FactoryDeclaresVariable_1() throws Exception {
        variablePointer = new VariablePointer(name);
        // Setup
        when(factory.declareVariable(context, name.toString())).thenReturn(true);
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        // Execute
        NodePointer result = variablePointer.createPath(context);
        // Verify
        verify(factory).declareVariable(context, name.toString());
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ActualFalse_FactoryDeclaresVariable_2() throws Exception {
        variablePointer = new VariablePointer(name);
        // Setup
        when(factory.declareVariable(context, name.toString())).thenReturn(true);
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        // Execute
        NodePointer result = variablePointer.createPath(context);
        // Verify
        verify(factory).declareVariable(context, name.toString());
        assertEquals(variablePointer, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ActualFalse_FactoryCannotDeclareVariable_ThrowsException_1() {
        variablePointer = new VariablePointer(name);
        // Setup
        when(factory.declareVariable(context, name.toString())).thenReturn(false);
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        // Execute & Verify
        Exception exception = assertThrows(JXPathAbstractFactoryException.class, () -> {
            variablePointer.createPath(context);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithValueSet_xJtK0() {
    QName qName = new QName("variableName");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    Object valueToSet = "testValue";
    NodePointer result = variablePointer.createPath(context, valueToSet);
    assertEquals("testValue", result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNullValue_kPwx1() {
    QName qName = new QName("variableName");
    VariablePointer variablePointer = new VariablePointer(qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    Object valueToSet = null;
    NodePointer result = variablePointer.createPath(context, valueToSet);
    assertNull(result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_1() throws Exception {
        variablePointer = new VariablePointer(qName);
        // Arrange
        int index = 1;
        Object value = new Object();
        when(clonedNodePointer.clone()).thenReturn(clonedNodePointer);
        doNothing().when(clonedNodePointer).setIndex(index);
        // Act
        NodePointer result = variablePointer.createChild(context, qName, index, value);
        // Assert
        verify(clonedNodePointer).setIndex(index);
        assertNotNull(result, "The result should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_2() throws Exception {
        variablePointer = new VariablePointer(qName);
        // Arrange
        int index = 1;
        Object value = new Object();
        when(clonedNodePointer.clone()).thenReturn(clonedNodePointer);
        doNothing().when(clonedNodePointer).setIndex(index);
        // Act
        NodePointer result = variablePointer.createChild(context, qName, index, value);
        // Assert
        verify(clonedNodePointer).setIndex(index);
        assertEquals(clonedNodePointer, result, "The result should be the cloned NodePointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_OTDf0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        NodePointer result = variablePointer.namespacePointer("someNamespace");
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithValidIndex_ksvo0_1() {
    QName qName = new QName("variableName");
    KeywordVariables variables = new KeywordVariables("keyword", new Object());
    VariablePointer variablePointer = new VariablePointer(variables, qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    QName childName = new QName("childVariable");
    int index = 0;
    Object value = "value";
    NodePointer result = variablePointer.createChild(context, childName, index, value);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithValidIndex_ksvo0_2() {
    QName qName = new QName("variableName");
    KeywordVariables variables = new KeywordVariables("keyword", new Object());
    VariablePointer variablePointer = new VariablePointer(variables, qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    QName childName = new QName("childVariable");
    int index = 0;
    Object value = "value";
    NodePointer result = variablePointer.createChild(context, childName, index, value);
    assertEquals(index, result.getIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithValidIndex_ksvo0_3() {
    QName qName = new QName("variableName");
    KeywordVariables variables = new KeywordVariables("keyword", new Object());
    VariablePointer variablePointer = new VariablePointer(variables, qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    QName childName = new QName("childVariable");
    int index = 0;
    Object value = "value";
    NodePointer result = variablePointer.createChild(context, childName, index, value);
    assertEquals(value, result.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsActualReturnsTrue_fmUL0() {
    QName qName = new QName("prefix", "localName");
    VariablePointer variablePointer = new VariablePointer(qName);
    assertTrue(variablePointer.isActual());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_WholeCollection_RgEM0() {
        QName qName = new QName("variable");
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertNull(variables.getVariable("variable"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_ValidIndex_crel2_1() {
        QName qName = new QName("variable");
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        KeywordVariables variables = new KeywordVariables("keyword", list);
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertEquals(2, list.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_ValidIndex_crel2_2() {
        QName qName = new QName("variable");
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        KeywordVariables variables = new KeywordVariables("keyword", list);
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertFalse(list.contains(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_EmptyCollection_LKcd3() {
        QName qName = new QName("variable");
        List<Object> list = new ArrayList<>();
        KeywordVariables variables = new KeywordVariables("keyword", list);
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertTrue(list.isEmpty());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_NullCollection_viRq4() {
        QName qName = new QName("variable");
        KeywordVariables variables = new KeywordVariables("keyword", null);
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertNull(variables.getVariable("variable"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_IndexOutOfBounds_TNgx5() {
        QName qName = new QName("variable");
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        KeywordVariables variables = new KeywordVariables("keyword", list);
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertEquals(3, list.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWhenActualIsFalse_ihlm0() throws Exception {
    QName qName = new QName("testName");
    VariablePointer variablePointer = new VariablePointer(qName);
    boolean actual = false; // Assuming this is meant to set the 'actual' state of the variablePointer
    Object value = new Object();
    when(variablePointer.createPath(mockContext)).thenReturn(mockNodePointer);
    NodePointer result = variablePointer.createPath(mockContext, value);
    assertSame(mockNodePointer, result, "Expected returned NodePointer to be the mockNodePointer when actual is false.");
    verify(mockNodePointer, times(1)).setValue(value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIndexResetsValuePointer_imBt0_MoNT0() {
    QName qName = new QName("prefix", "localName");
    VariablePointer variablePointer = new VariablePointer(qName);
    variablePointer.setIndex(5);
    assertNull(variablePointer.getValuePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeafWithNullNode_Zkjf0_TLyk0() {
    QName qName = new QName("testNode");
    VariablePointer vp = new VariablePointer(qName);
    assertTrue(vp.isLeaf(), "Expected to be a leaf when node is null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLeafWithNonAtomicNode_FFIO2_aUbq0() {
    QName qName = new QName("testNode");
    KeywordVariables kv = new KeywordVariables("keyword", new Object());
    VariablePointer vp = new VariablePointer(kv, qName);
    assertFalse(vp.isLeaf(), "Expected not to be a leaf with non-atomic node");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithNullFactory_gsKI2_xhLv0() {
    QName name = new QName("testVariable");
    VariablePointer variablePointer = new VariablePointer(name);
    JXPathContext context = JXPathContext.newContext(new Object());
    context.setFactory(null); // No factory set
    try {
        variablePointer.createPath(context);
        fail("NullPointerException should have been thrown due to null factory");
    } catch (NullPointerException e) {
        assertNotNull(e, "Exception should be not null when factory is not set");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild_FactoryCreationFailed() {
        QName name = new QName("testName");
        variablePointer = new VariablePointer(name);
        // Setup
        int index = 1;
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        when(factory.createObject(eq(context), eq(variablePointer), any(), eq("testName"), eq(index))).thenReturn(false);
        // Execute & Verify
        Exception exception = assertThrows(JXPathAbstractFactoryException.class, () -> {
            variablePointer.createChild(context, new QName("childName"), index);
        });
        assertEquals("Factory could not create object path: null", exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChildIterator() throws Exception {
        // Setup the VariablePointer with a mocked QName
        QName qname = new QName("namespace", "localName");
        variablePointer = new VariablePointer(qname);
        // Setup the behavior of getValuePointer to return the mockNodePointer
        when(variablePointer.getValuePointer()).thenReturn(mockNodePointer);
        // Arrange
        boolean reverse = false;
        NodePointer startWith = null;
        // Setup the expected behavior of childIterator on the mockNodePointer
        when(mockNodePointer.childIterator(mockNodeTest, reverse, startWith)).thenReturn(mockNodeIterator);
        // Act
        NodeIterator result = variablePointer.childIterator(mockNodeTest, reverse, startWith);
        // Assert
        assertNotNull(result, "The result should not be null.");
        assertEquals(mockNodeIterator, result, "The result should be the same as the mockNodeIterator.");
        verify(mockNodePointer).childIterator(mockNodeTest, reverse, startWith);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ActualFalse_FactoryDeclaresVariable() throws Exception {
        variablePointer = new VariablePointer(name);
        // Setup
        when(factory.declareVariable(context, name.toString())).thenReturn(true);
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        // Execute
        NodePointer result = variablePointer.createPath(context);
        // Verify
        verify(factory).declareVariable(context, name.toString());
        assertNotNull(result);
        assertEquals(variablePointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ActualFalse_FactoryCannotDeclareVariable_ThrowsException() {
        variablePointer = new VariablePointer(name);
        // Setup
        when(factory.declareVariable(context, name.toString())).thenReturn(false);
        when(variablePointer.getAbstractFactory(context)).thenReturn(factory);
        // Execute & Verify
        Exception exception = assertThrows(JXPathAbstractFactoryException.class, () -> {
            variablePointer.createPath(context);
        });
        assertEquals("Factory cannot define variable '" + name + "' for path: " + variablePointer.asPath(), exception.getMessage());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild() throws Exception {
        variablePointer = new VariablePointer(qName);
        // Arrange
        int index = 1;
        Object value = new Object();
        when(clonedNodePointer.clone()).thenReturn(clonedNodePointer);
        doNothing().when(clonedNodePointer).setIndex(index);
        // Act
        NodePointer result = variablePointer.createChild(context, qName, index, value);
        // Assert
        assertNotNull(result, "The result should not be null");
        assertEquals(clonedNodePointer, result, "The result should be the cloned NodePointer");
        verify(clonedNodePointer).setIndex(index);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildWithValidIndex_ksvo0() {
    QName qName = new QName("variableName");
    KeywordVariables variables = new KeywordVariables("keyword", new Object());
    VariablePointer variablePointer = new VariablePointer(variables, qName);
    JXPathContext context = JXPathContext.newContext(new Object());
    QName childName = new QName("childVariable");
    int index = 0;
    Object value = "value";
    NodePointer result = variablePointer.createChild(context, childName, index, value);
    assertNotNull(result);
    assertEquals(index, result.getIndex());
    assertEquals(value, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_ValidIndex_crel2() {
        QName qName = new QName("variable");
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        KeywordVariables variables = new KeywordVariables("keyword", list);
        VariablePointer vp = new VariablePointer(variables, qName);
        vp.remove();
        assertEquals(2, list.size());
        assertFalse(list.contains(1));
    }
}