/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.Path;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.apache.commons.jxpath.util.ClassLoaderUtil;
import org.apache.commons.jxpath.util.TypeUtils;
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
public class Aster_JXPathContextReferenceImpl_Test_Passing {
    @Mock
    private JXPathContext parentContext;
    @Mock
    private Object contextBean;
    @Mock
    private NodePointer contextPointer;
    @Mock
    private JXPathContextReferenceImpl jxpathcontextreferenceimpl;
    @Mock
    private Pointer pointer;
    @Mock
    private EvalContext evalContext;
    @Mock
    private Expression expression;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private Path path;
    @Mock
    private RootContext rootContext;
    @Mock
    private InitialContext initialContext;
    @Mock
    private NodePointer absoluteRootPointer;
    @Mock
    private Iterator iterator;
    private static Vector nodeFactories = new Vector();
    private static NodePointerFactory[] nodeFactoryArray = null;
    NodePointerFactory nodePointerFactory;
    @Mock
    private ClassLoaderUtil classLoaderUtil;
    @Mock
    private Expression expr;
    @Mock
    private NodePointerFactory nodePointerFactory1;
    @Mock
    private NodePointerFactory nodePointerFactory2;
    @Mock
    private NamespaceResolver namespaceResolver;
    @Mock
    private Pointer namespaceContextPointer;
    private JXPathContext jxpathContext;
    @Mock
    private ExceptionHandler exceptionHandler;
    @Mock
    private TypeUtils typeUtils;
    private static Compiler COMPILER = new TreeCompiler();
    @Mock
    private Functions functions;
    @Mock
    private Function function;
    @Mock
    private QName functionName;
    @Mock
    private VariablePointerFactory variablePointerFactory;
    @Mock
    private Locale locale;
    @Mock
    private QName name;
    private Pointer rootPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointerFactories_1() throws Exception {
        nodeFactoryArray = new NodePointerFactory[]{nodePointerFactory1, nodePointerFactory2};
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        NodePointerFactory[] result = jxpathcontextreferenceimpl.getNodePointerFactories();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_KKuX0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
        NamespaceResolver namespaceResolver = jxpathcontextreferenceimpl.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathAndSetValue_hBZf0_qmAf0() {
        JXPathContextReferenceImpl jXPathContextReferenceImpl = new JXPathContextReferenceImpl(null, new Object());
        try {
            jXPathContextReferenceImpl.createPathAndSetValue("//test", new Object());
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertNotNull(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix_eYlB0() throws Exception {
        JXPathContext jxpathContext = Mockito.mock(JXPathContext.class);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathContext, null);
        NamespaceResolver namespaceResolver = Mockito.mock(NamespaceResolver.class);
        jxpathcontextreferenceimpl.namespaceResolver = namespaceResolver;
        when(namespaceResolver.getPrefix("namespaceURI")).thenReturn("prefix");
        String result = jxpathcontextreferenceimpl.getNamespaceResolver().getPrefix("namespaceURI");
        assertEquals("prefix", result);
        verify(namespaceResolver).getPrefix("namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceContextPointer_LNtK0() throws Exception {
        JXPathContext jxpathContext = Mockito.mock(JXPathContext.class);
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(jxpathContext, new Object()), new Object());
        NamespaceResolver namespaceResolver = Mockito.mock(NamespaceResolver.class);
        jxpathcontextreferenceimpl.namespaceResolver = namespaceResolver;
        Pointer namespaceContextPointer = Mockito.mock(Pointer.class);
        when(namespaceResolver.getNamespaceContextPointer()).thenReturn(namespaceContextPointer);
        Pointer result = jxpathcontextreferenceimpl.getNamespaceResolver().getNamespaceContextPointer();
        assertEquals(namespaceContextPointer, result);
        verify(namespaceResolver).getNamespaceContextPointer();
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testaddNodePointerFactory_uwYN0_1() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl;
        NodePointerFactory nodePointerFactory;
        JXPathContext context = mock(JXPathContext.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(context, null);
        nodePointerFactory = mock(NodePointerFactory.class);
        jxpathcontextreferenceimpl.addNodePointerFactory(nodePointerFactory);
        assertEquals(1, nodeFactories.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testaddNodePointerFactory_uwYN0_2() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl;
        NodePointerFactory nodePointerFactory;
        JXPathContext context = mock(JXPathContext.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(context, null);
        nodePointerFactory = mock(NodePointerFactory.class);
        jxpathcontextreferenceimpl.addNodePointerFactory(nodePointerFactory);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateConditionally_ZymO0() {
        String className = "java.lang.String";
        String existenceCheckClassName = "java.lang.Object";
        Object result = JXPathContextReferenceImpl.allocateConditionally(className, existenceCheckClassName);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetContextPointer_1() throws Exception {
        nodePointer = mock(NodePointer.class);
        jxpathContext = mock(JXPathContext.class);
        contextBean = mock(Object.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathContext, contextBean, nodePointer);
        Pointer contextPointer = jxpathcontextreferenceimpl.getContextPointer();
        assertNotNull(contextPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetContextPointer_2() throws Exception {
        nodePointer = mock(NodePointer.class);
        jxpathContext = mock(JXPathContext.class);
        contextBean = mock(Object.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathContext, contextBean, nodePointer);
        Pointer contextPointer = jxpathcontextreferenceimpl.getContextPointer();
        assertEquals(nodePointer, contextPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompiler_1() throws Exception {
        parentContext = mock(JXPathContext.class);
        contextBean = new Object();
        contextPointer = mock(NodePointer.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
        Compiler compiler = jxpathcontextreferenceimpl.getCompiler();
        assertNotNull(compiler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        namespaceResolver = mock(NamespaceResolver.class);
        JXPathContext parentContext = mock(JXPathContext.class);
        Object contextBean = new Object();
        NodePointer contextPointer = mock(NodePointer.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
        jxpathcontextreferenceimpl.namespaceResolver = namespaceResolver;
        String prefix = "prefix";
        String namespaceURI = "namespaceURI";
        when(namespaceResolver.getNamespaceURI(prefix)).thenReturn(namespaceURI);
        String result = jxpathcontextreferenceimpl.getNamespaceURI(prefix);
        assertEquals(namespaceURI, result);
        verify(namespaceResolver).getNamespaceURI(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceResolver_HAZC0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(null, null);
        NamespaceResolver namespaceResolver = jxpathcontextreferenceimpl.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompilePath_ZcZB0_1() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
        String xpath = "some/xpath";
        CompiledExpression actual = jxpathcontextreferenceimpl.compilePath(xpath);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompilePath_ZcZB0_2() throws Exception {
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
        String xpath = "some/xpath";
        CompiledExpression actual = jxpathcontextreferenceimpl.compilePath(xpath);
        assertEquals(xpath, actual.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testregisterNamespace_AtZY0() throws Exception {
        JXPathContextReferenceImpl jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(null, null), null, null), null, null);
        jxpathcontextreferenceimpl.namespaceResolver = namespaceResolver;
        when(namespaceResolver.isSealed()).thenReturn(true);
        NamespaceResolver clonedNamespaceResolver = mock(NamespaceResolver.class);
        when(namespaceResolver.clone()).thenReturn(clonedNamespaceResolver);
        jxpathcontextreferenceimpl.registerNamespace("prefix", "namespaceURI");
        verify(namespaceResolver).isSealed();
        verify(namespaceResolver).clone();
        verify(clonedNamespaceResolver).registerNamespace("prefix", "namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_notFound_SHmh1_bRfd0() {
        JXPathContextReferenceImpl ctx = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(null, null), null, null);
        QName functionName = new QName("prefix", "localName");
        NamespaceResolver namespaceResolver = ctx.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_nullFunctionName_RiOG2_vPtW0() {
        JXPathContextReferenceImpl ctx = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(null, null), null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace_unsealed_Nrfa0_NeBO0() {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(null, null);
        impl.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", impl.getNamespaceResolver().getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_found_PzYd0_AqQY0() {
        JXPathContextReferenceImpl ctx = new JXPathContextReferenceImpl(new JXPathContextReferenceImpl(null, null), null, null);
        NamespaceResolver namespaceResolver = ctx.getNamespaceResolver();
        QName functionName = new QName("prefix", "localName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace_sealed_rXhx1_FnDn0() {
        JXPathContextReferenceImpl impl = new JXPathContextReferenceImpl(null, null);
        impl.getNamespaceResolver().seal();
        impl.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", impl.getNamespaceResolver().getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetContextPointer() throws Exception {
        nodePointer = mock(NodePointer.class);
        jxpathContext = mock(JXPathContext.class);
        contextBean = mock(Object.class);
        jxpathcontextreferenceimpl = new JXPathContextReferenceImpl(jxpathContext, contextBean, nodePointer);
        Pointer contextPointer = jxpathcontextreferenceimpl.getContextPointer();
        assertNotNull(contextPointer);
        assertEquals(nodePointer, contextPointer);
    }
}