/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_JXPathContextReferenceImpl_Coverage_Test_Passing {
    JXPathContextReferenceImpl jxpathcontextreferenceimpl;
    JXPathContext parentContext;
    Object contextBean;
    NodePointer contextPointer;

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_HtnH0() throws Exception {
        parentContext = mock(JXPathContext.class);
        contextBean = new Object();
        contextPointer = mock(NodePointer.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_XURu0() {
        NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jXPathContextReferenceImpl.namespaceResolver = namespaceResolver;
        when(namespaceResolver.getPrefix("namespaceURI")).thenReturn("prefix");
        String result = jXPathContextReferenceImpl.getPrefix("namespaceURI");
        assertEquals("prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullExpr_xodc5() throws Exception {
        String xpath = "xpath";
        Expression expr = null;
        Object value = new Object();
        try {
            jxpathcontextreferenceimpl.setValue(xpath, expr, value);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_ExprNull_ThrowsNullPointerException_sZYK4() {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(null, null);
        try {
            impl.removePath("xpath", null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathAndSetValue_thenCatchThrowable_YIoF2() throws Exception {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(null, null);
        String xpath = "xpath";
        Expression expr = mock(Expression.class);
        Object value = new Object();
        doThrow(new Throwable()).when(expr).computeValue(any(EvalContext.class));
        try {
            impl.createPathAndSetValue(xpath, expr, value);
            fail("Expected JXPathException to be thrown");
        } catch (JXPathException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ngWq0() throws Exception {
        NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
        when(namespaceResolver.getNamespaceURI("prefix")).thenReturn("namespaceURI");
        JXPathContextReferenceImpl jXPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jXPathContextReferenceImpl.namespaceResolver = namespaceResolver;
        String namespaceURI = jXPathContextReferenceImpl.getNamespaceURI("prefix");
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_Prefix_SAWu0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        QName functionName = new QName("namespace", "name");
        Object[] parameters = new Object[0];
        context.getFunction(functionName, parameters);
    }

    @Test
    public void testGetNamespaceResolver_FlPY0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = context.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointer_ArGQ0_lvsE0() {
        JXPathContextReferenceImpl parentContextReference = new JXPathContextReferenceImpl(null, null);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = new JXPathContextReferenceImpl(parentContextReference, null);
        String xpath = "some_xpath";
        NamespaceResolver namespaceResolver = jXPathContextReferenceImpl.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_tQig00_aGhQ0() throws Exception {
        JXPathContextReferenceImpl parentContext = new JXPathContextReferenceImpl(null, new Object());
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_CQJH0() throws Exception {
        NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = mock(JXPathContextReferenceImpl.class);
        when(jxpathcontextreferenceimpl.getNamespaceResolver()).thenReturn(namespaceResolver);
        NamespaceResolver result = jxpathcontextreferenceimpl.getNamespaceResolver();
        assertEquals(namespaceResolver, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_NodePointerNotNull_RemoveCalled_iKgW0_ffcp0() throws Exception {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(null, null);
        NodePointer pointer = mock(NodePointer.class);
        Expression expression = mock(Expression.class);
        when(impl.getPointer("xpath", expression)).thenReturn(pointer);
        impl.removePath("xpath", expression);
        verify(pointer).remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_ExprNotNullButNotInstanceOfExpression_ThrowsIllegalArgumentException_tvhJ6_sMjc0() {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(null, null);
        try {
            impl.removePath("xpath", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNamespaceContextPointer_NullPointer_XDkF2_QSbu0() {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(null, null), null, null);
        impl.setNamespaceContextPointer(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNamespaceContextPointer_NotNodePointer_swdM3_ctRW0() {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(null, null), null, null);
        Pointer pointer = new VariablePointer(new QName("name"));
        impl.setNamespaceContextPointer(pointer);
    }
}