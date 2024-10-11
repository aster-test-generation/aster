/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.util.ClassLoaderUtil;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathContextReferenceImpl_Test_Failing {
    @Mock
    private JXPathContext jxpathcontext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private Expression expression;
    @Mock
    private EvalContext evalContext;
    @Mock
    private RootContext rootContext;
    @Mock
    private Pointer pointer;
    private static Vector nodeFactories = new Vector();
    private static NodePointerFactory[] nodeFactoryArray = null;
    @Mock
    private NodePointerFactory nodePointerFactory;
    private JXPathContextReferenceImpl jxpathcontextreferenceimpl;
    @Mock
    private Iterator iterator;
    @Mock
    private ClassLoaderUtil classLoaderUtil;
    @Mock
    private JXPathContext jxpathContext;
    @Mock
    private NamespaceResolver namespaceResolver;
    @Mock
    private Pointer contextPointer;
    @Mock
    private CompiledExpression compiledExpression;
    @Mock
    private Pointer rootPointer;
    @Mock
    private ExceptionHandler exceptionHandler;
    @Mock
    private Object contextBean;
    private static Compiler COMPILER = new TreeCompiler();
    @Mock
    private Compiler compiler;
    @Mock
    private QName qName;
    @Mock
    private Functions functions;
    @Mock
    private Function function;
    @Mock
    private VariablePointer variablePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathAndSetValue_NKIV0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.createPathAndSetValue("xpath", null);
        System.out.println(jxpathContextReferenceImpl.createPathAndSetValue("xpath", null, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getSingleNodePointer()).thenReturn(nodePointer);
        when(expression.computeValue(any(EvalContext.class))).thenReturn(pointer);
        when(nodePointer.createPath(any(JXPathContextReferenceImpl.class))).thenReturn(nodePointer);
        Pointer result = jxpathcontextreferenceimpl.createPath("xpath", expression);
        assertEquals(nodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveNodePointerFactory() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        nodeFactories.add(nodePointerFactory);
        nodeFactoryArray = new NodePointerFactory[]{nodePointerFactory};
        boolean result = jxpathcontextreferenceimpl.removeNodePointerFactory(nodePointerFactory);
        Assertions.assertTrue(result);
        Assertions.assertFalse(nodeFactories.contains(nodePointerFactory));
        Assertions.assertNull(nodeFactoryArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointers2_GYsf1() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        String xpath = "xpath";
        Iterator iteratePointers = jxpathContextReferenceImpl.iteratePointers(xpath);
        assert iteratePointers.hasNext();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateConditionally() throws Exception {
        MockitoAnnotations.initMocks(this);
        String className = "test.Class";
        String existenceCheckClassName = "test.ExistenceCheckClass";
        when(classLoaderUtil.getClass(existenceCheckClassName, true)).thenReturn(Class.class);
        when(classLoaderUtil.getClass(className, true)).thenReturn(Class.class);
        Object result = JXPathContextReferenceImpl.allocateConditionally(className, existenceCheckClassName);
        verify(classLoaderUtil, times(2)).getClass(anyString(), anyBoolean());
        verifyNoMoreInteractions(classLoaderUtil);
        assertEquals(Class.class, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointerFactories() throws Exception {
        nodeFactoryArray = new NodePointerFactory[0];
        MockitoAnnotations.initMocks(this);
        // Arrange
        Mockito.when(jxpathcontextreferenceimpl.getNodePointerFactories()).thenReturn(nodeFactoryArray);
        // Act
        NodePointerFactory[] result = jxpathcontextreferenceimpl.getNodePointerFactories();
        // Assert
        Mockito.verify(jxpathcontextreferenceimpl, Mockito.times(1)).getNodePointerFactories();
        Assertions.assertArrayEquals(nodeFactoryArray, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointer_uMfR1() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.getPointer("xpath");
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointerWithCompileExpression_KSZv2() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.getPointer("xpath", null);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        String namespaceURI = "http://example.com";
        String expectedPrefix = "prefix";
        when(namespaceResolver.getPrefix(namespaceURI)).thenReturn(expectedPrefix);
        String actualPrefix = jxpathcontextreferenceimpl.getPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetContextPointer() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, contextPointer);
        // Act
        Pointer result = jxpathcontextreferenceimpl.getContextPointer();
        // Assert
        assertEquals(contextPointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_TAeL0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.createPath("xpath");
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNamespaceContextPointer() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        // Arrange
        when(namespaceResolver.isSealed()).thenReturn(true);
        // Act
        jxpathcontextreferenceimpl.setNamespaceContextPointer(nodePointer);
        // Assert
        verify(namespaceResolver).setNamespaceContextPointer(nodePointer);
        verify(namespaceResolver).clone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompiler() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        Mockito.when(jxpathcontextreferenceimpl.getCompiler()).thenReturn(compiler);
        Compiler returnedCompiler = jxpathcontextreferenceimpl.getCompiler();
        Assertions.assertEquals(compiler, returnedCompiler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetVariablePointer() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        QName qname = new QName("variableName");
        Locale locale = Locale.US;
        when(jxpathcontext.getLocale()).thenReturn(locale);
        NodePointer actual = jxpathcontextreferenceimpl.getVariablePointer(qname);
        assertEquals(nodePointer, actual);
        verify(jxpathcontext).getLocale();
        verify(jxpathcontextreferenceimpl).getLocale();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        when(namespaceResolver.isSealed()).thenReturn(false);
        jxpathcontextreferenceimpl.registerNamespace("prefix", "namespaceURI");
        verify(namespaceResolver).registerNamespace("prefix", "namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        when(namespaceResolver.getNamespaceURI(anyString())).thenReturn("http://example.com");
        String prefix = "prefix";
        String result = jxpathcontextreferenceimpl.getNamespaceURI(prefix);
        assertEquals("http://example.com", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveNodePointerFactory_3() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        nodeFactories.add(nodePointerFactory);
        nodeFactoryArray = new NodePointerFactory[]{nodePointerFactory};
        boolean result = jxpathcontextreferenceimpl.removeNodePointerFactory(nodePointerFactory);
        Assertions.assertNull(nodeFactoryArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_fid1() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        String namespaceURI = "http://example.com";
        String expectedPrefix = "prefix";
        when(namespaceResolver.getPrefix(namespaceURI)).thenReturn(expectedPrefix);
        String actualPrefix = jxpathcontextreferenceimpl.getPrefix(namespaceURI);
        assertNull(expectedPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremovePath_vMgo0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        String xpath = "path";
        jxpathcontextreferenceimpl.removePath(xpath, null);
        verify(nodePointer, times(1)).remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_b_fLhq0() throws Exception {
        MockitoAnnotations.initMocks(this);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, contextBean);
        String xpath = "some_xpath";
        Object value = "some_value";
        when(jxpathcontext.getValue(xpath)).thenReturn(value);
        Object result = jxpathcontextreferenceimpl.getValue(xpath);
        assertEquals(value, result);
        verify(jxpathcontext, times(1)).getValue(xpath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testiterate_B_ZdLh0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, nodePointer);
        String xpath = "some_xpath";
        Iterator iterator = mock(Iterator.class);
        when(jxpathcontextreferenceimpl.iterate(xpath)).thenReturn(iterator);
        assertEquals(iterator, jxpathcontextreferenceimpl.iterate(xpath));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueInt_hxZD1_LWVq0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        JXPathContext jxpathContext = jxpathContextReferenceImpl.getParentContext();
        Object value = jxpathContext.getValue("xpath", Integer.class);
        Assertions.assertNotNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveNodePointerFactory_1_fid3() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        nodeFactories.add(nodePointerFactory);
        nodeFactoryArray = new NodePointerFactory[]{nodePointerFactory};
        boolean result = jxpathcontextreferenceimpl.removeNodePointerFactory(nodePointerFactory);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveNodePointerFactory_2_fid3() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        nodeFactories.add(nodePointerFactory);
        nodeFactoryArray = new NodePointerFactory[]{nodePointerFactory};
        boolean result = jxpathcontextreferenceimpl.removeNodePointerFactory(nodePointerFactory);
        Assertions.assertFalse(nodeFactories.contains(nodePointerFactory));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix2_UEEl1_jZTP0_fid3() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = jxpathContextReferenceImpl.getNamespaceResolver();
        String namespaceURI = "namespaceURI";
        String prefix = namespaceResolver.getPrefix(namespaceURI);
        assertEquals("prefix", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointer1_nmMP0_IqUG0_fid3() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.getPointer("xpath", expression);
        assertEquals(Pointer.class, pointer.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceContextPointer_ButT1_fid3() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        when(namespaceResolver.getNamespaceContextPointer()).thenReturn(null);
        Pointer result = jxpathcontextreferenceimpl.getNamespaceContextPointer();
        assertEquals(null, result);
    }
}