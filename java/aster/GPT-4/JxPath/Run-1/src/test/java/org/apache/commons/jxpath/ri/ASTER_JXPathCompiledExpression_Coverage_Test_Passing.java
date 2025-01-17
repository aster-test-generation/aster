/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import java.util.Iterator;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.Constant;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathCompiledExpression_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringReturnsXpath_sGMF0() {
        String expectedXpath = "some/xpath/expression";
        Constant expression = new Constant("Some expression");
        JXPathCompiledExpression jXPathCompiledExpression = new JXPathCompiledExpression(expectedXpath, expression);
        String actualXpath = jXPathCompiledExpression.toString();
        assertEquals(expectedXpath, actualXpath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithValidContext_urwH0() {
        JXPathContext context = mock(JXPathContextReferenceImpl.class);
        Object value = new Object();
        String xpath = "/test/path";
        Constant expression = new Constant("expression");
        JXPathCompiledExpression expressionInstance = new JXPathCompiledExpression(xpath, expression);
        expressionInstance.setValue(context, value);
        verify((JXPathContextReferenceImpl) context).setValue(xpath, expression, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNullValue_bBpY2() {
        JXPathContext context = mock(JXPathContextReferenceImpl.class);
        Object value = null;
        String xpath = "/test/path";
        Constant expression = new Constant("expression");
        JXPathCompiledExpression expressionInstance = new JXPathCompiledExpression(xpath, expression);
        expressionInstance.setValue(context, value);
        verify((JXPathContextReferenceImpl) context).setValue(xpath, expression, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathAndSetValueWithValidContext_rspt0() {
        String xpath = "/some/path";
        Constant expression = new Constant("expression");
        Object value = "value";
        JXPathContextReferenceImpl mockContext = mock(JXPathContextReferenceImpl.class);
        JXPathCompiledExpression expressionUnderTest = new JXPathCompiledExpression(xpath, expression);
        expressionUnderTest.createPathAndSetValue(mockContext, value);
        verify(mockContext).createPathAndSetValue(xpath, expression, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAllValidContext_CaUH0() {
        String xpath = "/some/path";
        Constant expression = new Constant("some expression");
        JXPathContext mockContext = mock(JXPathContextReferenceImpl.class);
        JXPathCompiledExpression expressionUnderTest = new JXPathCompiledExpression(xpath, expression);
        expressionUnderTest.removeAll(mockContext);
        verify((JXPathContextReferenceImpl) mockContext).removeAll(xpath, expression);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithValidContext_AKFd0() {
        JXPathContext mockContext = mock(JXPathContextReferenceImpl.class);
        Constant mockExpression = mock(Constant.class);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("some/xpath", mockExpression);
        when(((JXPathContextReferenceImpl) mockContext).getValue("some/xpath", mockExpression)).thenReturn("ExpectedValue");
        Object result = expression.getValue(mockContext);
        assertEquals("ExpectedValue", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithValidContextAndType_ZrRY0() {
        String xpath = "/some/path";
        Constant expression = new Constant("expression");
        JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
        JXPathContextReferenceImpl context = mock(JXPathContextReferenceImpl.class);
        Class<String> requiredType = String.class;
        String expectedValue = "expected result";
        when(context.getValue(xpath, expression, requiredType)).thenReturn(expectedValue);
        Object result = compiledExpression.getValue(context, requiredType);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithValidContext_Brdg0() {
        String xpath = "/some/path";
        Constant expression = new Constant("expression");
        JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
        JXPathContextReferenceImpl mockContext = mock(JXPathContextReferenceImpl.class);
        Iterator expectedIterator = mock(Iterator.class);
        when(mockContext.iterate(xpath, expression)).thenReturn(expectedIterator);
        Iterator result = compiledExpression.iterate(mockContext);
        verify(mockContext).iterate(xpath, expression);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointersWithValidContext_kPle0() {
        JXPathContext context = mock(JXPathContextReferenceImpl.class);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("some/xpath", new Constant("expression"));
        Iterator expectedIterator = mock(Iterator.class);
        when(((JXPathContextReferenceImpl) context).iteratePointers("some/xpath", new Constant("expression"))).thenReturn(expectedIterator);
        JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("some/xpath", new Constant("expression"));
        Iterator result = compiledExpression.iteratePointers(context);
        verify((JXPathContextReferenceImpl) context).iteratePointers("some/xpath", new Constant("expression"));
        assert result == expectedIterator; // Check that the returned iterator is the expected one
    }
@Test
    public void testRemovePathWithInvalidContext_SUDI1_qycC0() {
        assertThrows(ClassCastException.class, () -> {
            JXPathContext context = mock(JXPathContext.class); // This context is not an instance of JXPathContextReferenceImpl
            JXPathCompiledExpression expression = new JXPathCompiledExpression("some/xpath", new Constant("expression"));
            expression.removePath(context);
        });
    }
@Test
    public void testCreatePathAndSetValueWithInvalidContext_uGJo1_YICP0() {
        assertThrows(ClassCastException.class, () -> {
            String xpath = "/some/path";
            Constant expression = new Constant("expression");
            Object value = "value";
            JXPathContext mockContext = mock(JXPathContext.class); // This is not an instance of JXPathContextReferenceImpl
            JXPathCompiledExpression expressionUnderTest = new JXPathCompiledExpression(xpath, expression);
            expressionUnderTest.createPathAndSetValue(mockContext, value);
        });
    }
@Test
    public void testGetValueWithInvalidContextType_dHHs1_nKvu0() {
        JXPathContext mockContext = mock(JXPathContext.class); // Not a JXPathContextReferenceImpl
        Constant mockExpression = mock(Constant.class);
        JXPathCompiledExpression expression = new JXPathCompiledExpression("some/xpath", mockExpression);
        assertThrows(ClassCastException.class, () -> expression.iterate(mockContext));
    }
@Test
    public void testRemoveAllInvalidContext_yrXT1_Vtri0() {
        assertThrows(ClassCastException.class, () -> {
            String xpath = "/some/path";
            Constant expression = new Constant("some expression");
            JXPathContext mockContext = mock(JXPathContext.class); // This is not a JXPathContextReferenceImpl
            JXPathCompiledExpression expressionUnderTest = new JXPathCompiledExpression(xpath, expression);
            expressionUnderTest.removeAll(mockContext);
        });
    }
@Test
    public void testGetPointerWithInvalidContextType_jFvQ1_KhgA0() {
        assertThrows(ClassCastException.class, () -> {
            JXPathContext context = mock(JXPathContext.class); // This is not a JXPathContextReferenceImpl
            String xpath = "/test/path";
            Constant expression = new Constant("expression");
            JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
            compiledExpression.iterate(context);
        });
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemovePathWithValidContext_RWQO0_Cdkt0() {
    JXPathContext context = mock(JXPathContextReferenceImpl.class);
    JXPathCompiledExpression expression = new JXPathCompiledExpression("some/xpath", new Constant("expression"));
    String xpath = "some/xpath";
    expression.removePath(context);
    verify((JXPathContextReferenceImpl) context).removePath(xpath);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithValidContext_WSAe0_Enew0() {
    String xpath = "/some/path";
    Constant expression = new Constant("expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
    JXPathContextReferenceImpl mockContext = mock(JXPathContextReferenceImpl.class);
    Pointer expectedPointer = mock(Pointer.class); // Use mock for the abstract class
    when(mockContext.createPath(xpath, expression)).thenReturn(expectedPointer);
    Pointer result = compiledExpression.createPath(mockContext);
    assertEquals(expectedPointer, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPointerWithValidContext_jgGu0_iDjl0() {
    JXPathContext context = mock(JXPathContextReferenceImpl.class);
    String xpath = "/test/path";
    Constant expression = new Constant("expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
    Pointer expectedPointer = mock(Pointer.class); // Correctly use mock for the abstract class
    when(((JXPathContextReferenceImpl) context).getPointer(xpath, expression)).thenReturn(expectedPointer);
    Pointer result = compiledExpression.getPointer(context, xpath);
    assertEquals(expectedPointer, result);
}
}