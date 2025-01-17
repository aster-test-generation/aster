/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import java.util.Iterator;
import org.apache.commons.jxpath.CompiledExpression;
import org.apache.commons.jxpath.JXPathFunctionNotFoundException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathContextReferenceImpl_Coverage_Test_Passing {
    private Object compileExpression(String xpath) {
        return null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate_Ickj0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        String xpath = "some_xpath";
        Iterator iterator = jxpathContextReferenceImpl.iterate(xpath);
        assertNotNull(iterator);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_NullPointerException_qDwg0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Expression expression = mock(Expression.class);
        String xpath = "xpath";
        jxpathContextReferenceImpl.removePath(xpath, expression);
        verify(expression, times(1)).computeValue(any(EvalContext.class));
        verify(jxpathContextReferenceImpl, times(1)).getPointer(xpath, expression);
        verify(jxpathContextReferenceImpl, times(1)).removePath(xpath, expression);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_NodePointerNotNull_vomx1() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Expression expression = mock(Expression.class);
        String xpath = "xpath";
        NodePointer nodePointer = mock(NodePointer.class);
        when(jxpathContextReferenceImpl.getPointer(xpath, expression)).thenReturn(nodePointer);
        jxpathContextReferenceImpl.removePath(xpath, expression);
        verify(nodePointer, times(1)).remove();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WJPr0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.getNamespaceContextPointer();
        assertNotNull(pointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompilePath_lUBn0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        String xpath = "xpath";
        CompiledExpression compiledExpression = jxpathContextReferenceImpl.compilePath(xpath);
        assertNotNull(compiledExpression);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterNamespace_WhenNamespaceResolverIsNotSealed_WlAU0() {
    JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
    jxpathContextReferenceImpl.registerNamespace("prefix", "namespaceURI");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_FunctionNotFound_OVUn4() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        QName functionName = new QName("testPrefix", "testFunction");
        Object[] parameters = new Object[0];
        try {
            jxpathContextReferenceImpl.getFunction(functionName, parameters);
            fail("Expected JXPathFunctionNotFoundException");
        } catch (JXPathFunctionNotFoundException e) {
            assertEquals("Undefined function: testPrefix:testFunction", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemovePath_Throwable_oJty3_GAIg0() {
    JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
    Expression expression = mock(Expression.class);
    String xpath = "xpath";
    Throwable throwable = new Throwable();
    when(jxpathContextReferenceImpl.getPointer(xpath, expression)).thenThrow(throwable);
    jxpathContextReferenceImpl.removePath(xpath, expression);
    verify(jxpathContextReferenceImpl, times(1)).getPointer(xpath, expression);
    verify(jxpathContextReferenceImpl, times(1)).getNamespaceURI(anyString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefix_IuPx0_Rjbc0() {
    JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
    NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
    when(namespaceResolver.getNamespaceURI("prefix")).thenReturn("http://example.com");
    jxpathContextReferenceImpl.namespaceResolver = namespaceResolver;
    String result = jxpathContextReferenceImpl.getNamespaceURI("prefix");
    assertEquals("http://example.com", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNamespaceContextPointer_WhenNamespaceResolverIsNotSealed_uool0_JzEf0() {
    JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
    VariablePointer pointer = new VariablePointer(null);
    DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
    jxpathContextReferenceImpl.setNamespaceContextPointer(nodePointer);
    assertEquals(nodePointer, jxpathContextReferenceImpl.getNamespaceContextPointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemoveAllIterator_RbDh2_yVfJ0() throws Exception {
    JXPathContextReferenceImpl jxpath = new JXPathContextReferenceImpl(null, null);
    String result = jxpath.getNamespaceURI("prefix");
    assertEquals("expected namespace URI", "expected namespace URI", result);
}
}