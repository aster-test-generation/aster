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
public class Aster_JXPathContextReferenceImpl_Test_Passing {
    @Mock
    private CompiledExpression compiledExpression;
    @Mock
    private ExceptionHandler exceptionHandler;
    @Mock
    private RootContext rootContext;
    private static NodePointerFactory[] nodeFactoryArray = null;
    @Mock
    private Object contextBean;
    @Mock
    private Pointer rootPointer;
    private static final Vector nodeFactories = new Vector();
    @Mock
    private Expression expression;
    @Mock
    private Iterator iterator;
    @Mock
    private JXPathContext parentContext;
    @Mock
    private Function function;
    @Mock
    private NodePointerFactory nodePointerFactory;
    private JXPathContextReferenceImpl jxpathcontextreferenceimpl;
    @Mock
    private Pointer contextPointer;
    @Mock
    private Pointer pointer;
    @Mock
    private EvalContext evalContext;
    @Mock
    private QName qname;
    private static Compiler COMPILER = new TreeCompiler();
    @Mock
    private NodePointer nodepointer;
    @Mock
    private VariablePointer variablepointer;
    @Mock
    private Functions functions;
    @Mock
    private JXPathContext jxpathcontext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private ClassLoaderUtil classLoaderUtil;
    @Mock
    private NodePointerFactory[] nodeFactoryArrayMock;
    @Mock
    private NamespaceResolver namespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAbsoluteRootContext_Anvd0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        EvalContext result = jxpathContextReferenceImpl.getAbsoluteRootContext();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_kxra0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer result = jxpathContextReferenceImpl.createPath("xpath");
        System.out.println("jxpathContextReferenceImpl.createPath(\"xpath\")");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNamespaceContextPointerNull_cDbh1() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.setNamespaceContextPointer(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariablePointer_sSYU0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        QName qName = new QName("testName");
        NodePointer nodePointer = jxpathContextReferenceImpl.getVariablePointer(qName);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace_UsCq0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.registerNamespace("prefix", "namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveAll() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null, nodepointer);
        // Arrange
        String xpath = "xpath";
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null, nodepointer);
        jxpathcontextreferenceimpl.removeAll(xpath);
        // Assert
        verify(jxpathcontext, times(1)).removeAll(xpath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(expression.computeValue(evalContext)).thenReturn(pointer);
        when(evalContext.getSingleNodePointer()).thenReturn(nodePointer);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        String xpath = "xpath";
        Expression expr = expression;
        Pointer result = jxpathcontextreferenceimpl.createPath(xpath, expr);
        assertEquals(nodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremovePath() throws Exception {
        MockitoAnnotations.initMocks(this);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        // Arrange
        String xpath = "some_xpath";
        Expression expr = Mockito.mock(Expression.class);
        // Act
        jxpathcontextreferenceimpl.removePath(xpath, expr);
        // Assert
        Mockito.verify(nodePointer).remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testiterate() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        // Given
        Iterator iterator = mock(Iterator.class);
        when(expression.iterate(any(EvalContext.class))).thenReturn(iterator);
        // When
        Iterator result = jxpathcontextreferenceimpl.iterate("xpath", expression);
        // Then
        assertEquals(iterator, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        Mockito.when(namespaceResolver.getPrefix(Mockito.anyString())).thenReturn("prefix");
        String namespaceURI = "namespaceURI";
        String expectedPrefix = "prefix";
        String actualPrefix = jxpathcontextreferenceimpl.getPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceContextPointer() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        Pointer expected = Mockito.mock(Pointer.class);
        Mockito.when(namespaceResolver.getNamespaceContextPointer()).thenReturn(expected);
        Pointer actual = jxpathcontextreferenceimpl.getNamespaceContextPointer();
        Mockito.verify(namespaceResolver).getNamespaceContextPointer();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetContextPointer() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
        // Act
        Pointer actual = jxpathcontextreferenceimpl.getContextPointer();
        // Assert
        assertEquals(contextPointer, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetNamespaceContextPointer() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
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
    public void testsetExceptionHandler() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, rootPointer);
        // Arrange
        jxpathcontextreferenceimpl.setExceptionHandler(exceptionHandler);
        // Act
        // Assert
        Mockito.verify(nodePointer, Mockito.times(1)).setExceptionHandler(exceptionHandler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompiler() throws Exception {
        jxpathcontextreferenceimpl = Mockito.mock(JXPathContextReferenceImpl.class);
        Mockito.when(jxpathcontextreferenceimpl.getCompiler()).thenReturn(COMPILER);
        Compiler compiler = jxpathcontextreferenceimpl.getCompiler();
        Assertions.assertEquals(COMPILER, compiler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        when(jxpathcontext.getFunctions()).thenReturn(functions);
        when(functions.getFunction("prefix", "name", new Object[0])).thenReturn(function);
        QName functionName = new QName("prefix", "name");
        Function result = jxpathcontextreferenceimpl.getFunction(functionName, new Object[0]);
        assertEquals(function, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetVariablePointer() throws Exception {
        MockitoAnnotations.initMocks(this);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        QName name = new QName("testName");
        Locale locale = Locale.US;
        NodePointer expected = Mockito.mock(NodePointer.class);
        Mockito.when(jxpathcontextreferenceimpl.getLocale()).thenReturn(locale);
        Mockito.when(jxpathcontextreferenceimpl.getVariablePointer(name)).thenReturn(expected);
        NodePointer actual = jxpathcontextreferenceimpl.getVariablePointer(name);
        Mockito.verify(jxpathcontextreferenceimpl, Mockito.times(1)).getLocale();
        Mockito.verify(jxpathcontextreferenceimpl, Mockito.times(1)).getVariablePointer(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        when(namespaceResolver.getNamespaceURI(anyString())).thenReturn("namespaceURI");
        String prefix = "prefix";
        String result = jxpathcontextreferenceimpl.getNamespaceURI(prefix);
        assertEquals("namespaceURI", result);
        verify(namespaceResolver).getNamespaceURI(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceResolver() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        Mockito.when(jxpathcontextreferenceimpl.getNamespaceResolver()).thenReturn(namespaceResolver);
        NamespaceResolver actual = jxpathcontextreferenceimpl.getNamespaceResolver();
        assertEquals(namespaceResolver, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testiterate_TdhT0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        Iterator iterator = mock(Iterator.class);
        when(expression.iterate(any(EvalContext.class))).thenReturn(iterator);
        Iterator result = jxpathcontextreferenceimpl.iterate("xpath", expression);
        assertEquals(iterator, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceResolver_jafq0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, "contextBean");
        verify(jxpathcontextreferenceimpl, times(1)).getNamespaceResolver();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_KGGY0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, null);
        NamespaceResolver namespaceResolver = jxpathcontextreferenceimpl.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePathAndSetValue_n_hQcC0() throws Exception {
        MockitoAnnotations.initMocks(this);
        String xpath = "xpath";
        Object value = "value";
        Pointer pointer = jxpathcontextreferenceimpl.createPathAndSetValue(xpath, value);
        Mockito.verifyNoMoreInteractions(jxpathcontextreferenceimpl);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_A_SoWf0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, new Object(), nodepointer);
        String xpath = "path";
        Pointer expected = null; // Changed from new Pointer() to null
        Pointer actual = jxpathcontextreferenceimpl.createPath(xpath);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_STtu0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, nodepointer);
        String xpath = "path/to/remove";
        JXPathContextReferenceImpl spy = Mockito.spy(jxpathcontextreferenceimpl);
        spy.getNamespaceResolver();
        Mockito.verify(spy).getNamespaceResolver();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testiterate_c_UeNy0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathcontext, new Object(), nodepointer);
        String xpath = "some_xpath";
        Iterator iterator = mock(Iterator.class);
        when(jxpathcontextreferenceimpl.iterate(xpath)).thenReturn(iterator);
        assertEquals(iterator, jxpathcontextreferenceimpl.iterate(xpath));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointer_r_FaSP0() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getSingleNodePointer()).thenReturn(pointer);
        when(expression.computeValue(any(EvalContext.class))).thenReturn(evalContext);
        when(expression.computeContextDependent()).thenReturn(true);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        NamespaceResolver namespaceResolver = jxpathcontextreferenceimpl.getNamespaceResolver();
        namespaceResolver.seal();
        assertEquals(namespaceResolver, namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAbsoluteRootPointer_NUGH1_gXPb0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate_glNH0_mzIx0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        JXPathContext jxpathContext = new JXPathContextReferenceImpl(jxpathContextReferenceImpl, new Object());
        Iterator iterator = jxpathContextReferenceImpl.iterate("xpath");
        assert iterator != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointer_AQDm0_kYKr0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        JXPathContext jxpathContext = new JXPathContextReferenceImpl(jxpathContextReferenceImpl, new Object());
        Pointer pointer = jxpathContextReferenceImpl.getPointer("xpath");
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointerWithActualPointer_CmxH0_HiXX0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.getPointer("xpath", expression);
        Assertions.assertTrue(pointer instanceof Pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_dlux0_Vgzx0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer result = jxpathContextReferenceImpl.getNamespaceContextPointer();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNamespaceContextPointerNotNull_jYwl0_xasJ0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.setNamespaceContextPointer(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompiler_EBtX0_jWzd0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        JXPathContext jxpathContext = new JXPathContextReferenceImpl(jxpathContextReferenceImpl, new Object());
        Compiler compiler = jxpathContextReferenceImpl.getCompiler();
        assert compiler != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ZcIn0_RKIF0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        JXPathContext jxpathContext = new JXPathContextReferenceImpl(jxpathContextReferenceImpl, null);
        Object result = jxpathContextReferenceImpl.getValue("xpath", String.class);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithNullFunctionName_FfJl1_zcOF0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        QName functionName = null;
        Object[] parameters = new Object[0];
        try {
            jxpathContextReferenceImpl.getFunction(functionName, parameters);
            fail("Expected JXPathFunctionNotFoundException");
        } catch (JXPathFunctionNotFoundException e) {
            assertEquals("Undefined function: null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithInvalidFunctionName_fNII2_gIpi0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        QName functionName = new QName("prefix", "invalidName");
        Object[] parameters = new Object[0];
        try {
            jxpathContextReferenceImpl.getFunction(functionName, parameters);
            fail("Expected JXPathFunctionNotFoundException");
        } catch (JXPathFunctionNotFoundException e) {
            assertEquals("Undefined function: prefix:invalidName", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionWithNoFunctions_BxGt3_mlDD0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        QName functionName = new QName("prefix", "name");
        Object[] parameters = new Object[0];
        Function function = jxpathContextReferenceImpl.getFunction(functionName, parameters);
        assertNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceSealed_SwwO1_wmDU0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = jxpathContextReferenceImpl.getNamespaceResolver();
        namespaceResolver.seal();
        namespaceResolver.registerNamespace("prefix", "namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_DJgj0_qnHz0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        JXPathContext jxpathContext = new JXPathContextReferenceImpl(jxpathContextReferenceImpl, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        QName qName = new QName(null);
        Object result = jxpathContext.getValue("xpath");
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_LfRX0_uNzS0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = jxpathContextReferenceImpl.getNamespaceResolver();
        namespaceResolver.seal();
        assert namespaceResolver != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompiler_vzYf0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = Mockito.mock(JXPathContextReferenceImpl.class);
        NamespaceResolver namespaceResolver = Mockito.mock(NamespaceResolver.class);
        Mockito.when(jxpathcontextreferenceimpl.getNamespaceResolver()).thenReturn(namespaceResolver);
        NamespaceResolver result = jxpathcontextreferenceimpl.getNamespaceResolver();
        Assertions.assertEquals(namespaceResolver, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetExceptionHandler_xUAA0() {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        jxpathcontextreferenceimpl.setExceptionHandler(exceptionHandler);
        Mockito.verify(jxpathcontextreferenceimpl, Mockito.times(1)).setExceptionHandler(exceptionHandler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetContextPointer_OSrN0() {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean);
        NamespaceResolver namespaceResolver = jxpathcontextreferenceimpl.getNamespaceResolver();
        Pointer actual = namespaceResolver.getNamespaceContextPointer();
        assertEquals(contextPointer, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_kTlq0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        MockitoAnnotations.initMocks(this);
        Mockito.when(namespaceResolver.getPrefix(anyString())).thenReturn("prefix");
        String namespaceURI = "namespaceURI";
        String expectedPrefix = "prefix";
        String actualPrefix = jxpathcontextreferenceimpl.getNamespaceResolver().getPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceContextPointer_mnfx0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        Pointer expected = Mockito.mock(Pointer.class);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Mockito.when(namespaceResolver.getNamespaceContextPointer()).thenReturn(expected);
        Pointer actual = jxpathcontextreferenceimpl.getNamespaceContextPointer();
        Mockito.verify(namespaceResolver, Mockito.times(1)).getNamespaceContextPointer();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceResolver_ZRJZ0() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Mockito.when(jxpathcontextreferenceimpl.getNamespaceResolver()).thenReturn(namespaceResolver);
        NamespaceResolver actual = jxpathcontextreferenceimpl.getNamespaceResolver();
        assertEquals(namespaceResolver, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveAll_DHpg0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null, null);
        String xpath = "xpath";
        jxpathcontextreferenceimpl.removeAll(xpath);
        verify(jxpathcontext, times(1)).removeAll(xpath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremovePath_VqXV0() throws Exception {
        MockitoAnnotations.initMocks(this);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        String xpath = "some_xpath";
        jxpathcontextreferenceimpl.getNamespaceResolver();
        Mockito.verify(jxpathcontextreferenceimpl).getNamespaceResolver();
    }
}