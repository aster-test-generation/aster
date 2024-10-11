/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathContextReferenceImpl_Test_Passing {
    private static Vector nodeFactories = new Vector();
    private static NodePointerFactory[] nodeFactoryArray = null;
    @Mock
    private JXPathContext parentContext;
    @Mock
    private Object contextBean;
    @Mock
    private NodePointer contextPointer;
    @Mock
    private Locale locale;
    @Mock
    private QName name;
    @Mock
    private KeywordVariables variables;
    @Mock
    private NodePointerFactory factory;
    @InjectMocks
    private JXPathContextReferenceImpl jxpathcontextreferenceimpl;
    @Mock
    private NodePointer rootPointer;
    @Mock
    private ExceptionHandler exceptionHandler;
    private static Compiler COMPILER = new TreeCompiler();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateConditionallyWithNonExistentClass_Kbby1() throws Exception {
        String className = "com.example.MyClass";
        String existenceCheckClassName = "com.example.NonExistentClass";
        Object result = JXPathContextReferenceImpl.allocateConditionally(className, existenceCheckClassName);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointerWithValidXPath_BGLj0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        String xpath = "//book";
        Pointer pointer = context.getPointer(xpath);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithNullContext_mCVM7() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, new Object());
        String prefix = context.getPrefix("http://www.example.com/namespace");
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithNullContextAndNullContextPointer_HJHG9() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, new Object(), null);
        String prefix = context.getPrefix("http://www.example.com/namespace");
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompilePath_AqtF0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        String xpath = "//book";
        CompiledExpression expression = context.compilePath(xpath);
        assertNotNull(expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompilePathWithParentContext_tZrs1() {
        JXPathContextReferenceImpl parentContext = new JXPathContextReferenceImpl(null, null);
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, null);
        String xpath = "//book";
        CompiledExpression expression = context.compilePath(xpath);
        assertNotNull(expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompilePathWithContextBean_XBjw2() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, new Object());
        String xpath = "//book";
        CompiledExpression expression = context.compilePath(xpath);
        assertNotNull(expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNullContext_QRlt6() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, new Object());
        String prefix = "prefix";
        String namespaceURI = context.getNamespaceURI(prefix);
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterateWithNullContext_KBrv5_fid1() {
        JXPathContextReferenceImpl context = null;
        String xpath = "//book";
        try {
            context.iterate(xpath);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointerWithInvalidXPath_sbBJ1_fid1() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        String xpath = "//book[1]";
        Pointer pointer = context.getPointer(xpath);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompilePathWithInvalidXPath_cPxR4_fid1() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        String xpath = "//book[";
        try {
            context.compilePath(xpath);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetValue_fid1() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        String xpath = "test";
        Expression expr = mock(Expression.class);
        Class requiredType = String.class;
        Object value = jxpathcontextreferenceimpl.getValue(xpath, expr, requiredType);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariablePointer_HFXr0_1() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        QName name = new QName("test");
        NodePointer pointer = context.getVariablePointer(name);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariablePointer_HFXr0_2() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        QName name = new QName("test");
        NodePointer pointer = context.getVariablePointer(name);
        assertEquals(name, pointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithParentContext_OdUZ1_1() {
        JXPathContextReferenceImpl parentContext = new JXPathContextReferenceImpl(null, null);
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, null);
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertNotNull(resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithParentContext_OdUZ1_2() {
        JXPathContextReferenceImpl parentContext = new JXPathContextReferenceImpl(null, null);
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, null);
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithContextBean_xCic3_KDIc0_1() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        Object contextBean = new Object();
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertNotNull(resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithContextBean_xCic3_KDIc0_2() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        Object contextBean = new Object();
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithContextBean_xCic3_KDIc0_3() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        Object contextBean = new Object();
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertSame(context.getNamespaceResolver(), resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithParentContextAndContextBean_WXEw4_BciN0_1() {
        JXPathContextReferenceImpl parentContext = new JXPathContextReferenceImpl(null, null);
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, null);
        Object contextBean = new Object();
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertNotNull(resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithParentContextAndContextBean_WXEw4_BciN0_2() {
        JXPathContextReferenceImpl parentContext = new JXPathContextReferenceImpl(null, null);
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, null);
        Object contextBean = new Object();
        NamespaceResolver resolver = context.getNamespaceResolver();
        assertTrue(resolver.isSealed());
    }
}