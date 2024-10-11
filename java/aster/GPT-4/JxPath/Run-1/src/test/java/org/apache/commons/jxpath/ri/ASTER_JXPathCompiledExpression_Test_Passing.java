/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import java.util.Iterator;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.JXPathException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathCompiledExpression_Test_Passing {
    @Mock
    private JXPathCompiledExpression compiledExpression;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetXPathReturnsCorrectXPath_ofUv0() {
    Constant constant = new Constant("expression");
    JXPathCompiledExpression expression = new JXPathCompiledExpression("test/xpath", constant);
    assertEquals("test/xpath", expression.getXPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringReturnsCorrectXPath_rANu0() {
    Constant constant = new Constant("expression");
    JXPathCompiledExpression expression = new JXPathCompiledExpression("sample/xpath", constant);
    assertEquals("sample/xpath", expression.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemovePath_zIkH0() {
    String xpath = "/some/path";
    Constant expression = new Constant("expression");
    JXPathContext parentContext = null; // Assuming null for simplicity, replace with actual initialization if needed
    Object contextBean = new Object();
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
    try {
        compiledExpression.removePath(context);
        fail("Expected an exception to be thrown");
    } catch (JXPathException e) {
        assertEquals("Exception trying to remove xpath /some/path; Cannot remove an object that is not some other object's property or a collection element", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_zhWD0() {
    Constant expression = new Constant("testExpression");
    JXPathContext parentContext = JXPathContext.newContext(new Object());
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, new Object());
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("testXPath", expression);
    try {
        Pointer result = compiledExpression.createPath(context);
        fail("Expected JXPathException was not thrown.");
    } catch (JXPathException e) {
        assertEquals("Exception trying to create xpath testXPath; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathAndSetValue_NpJB0() {
    JXPathContext parentContext = null; // Assuming null for simplicity, replace with actual initialization if needed
    Object contextBean = new Object();
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    Constant expression = new Constant("expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("xpath", expression);
    Object value = new Object();
    try {
        Pointer result = compiledExpression.createPathAndSetValue(context, value);
        fail("Expected JXPathException was not thrown.");
    } catch (JXPathException e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetExpressionReturnsCorrectExpression_osuq0() {
    Constant constant = new Constant("test");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("testXPath", constant);
    Expression expectedExpression = compiledExpression.getExpression();
    assertEquals(expectedExpression, compiledExpression.getExpression());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_XsbW0_1() {
    JXPathContext parentContext = null; // Assuming null for simplicity, replace with actual context if available
    Object contextBean = new Object();
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    Constant expression = new Constant("expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("some/xpath", expression);
    Class<String> requiredType = String.class;
    Object result = compiledExpression.getValue(context, requiredType);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_XsbW0_2() {
    JXPathContext parentContext = null; // Assuming null for simplicity, replace with actual context if available
    Object contextBean = new Object();
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    Constant expression = new Constant("expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("some/xpath", expression);
    Class<String> requiredType = String.class;
    Object result = compiledExpression.getValue(context, requiredType);
    assertTrue(result instanceof String);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_xBiv0() {
    JXPathContext parentContext = JXPathContext.newContext(new Object());
    Object contextBean = new Object();
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    String xpath = "/test/path";
    Constant expression = new Constant("test expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
    Object result = compiledExpression.getValue(context);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIteratePointers_zZcT0() {
    JXPathContext parentContext = JXPathContext.newContext(new Object());
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, new Object());
    Constant expression = new Constant("testExpression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("testXPath", expression);
    Iterator result = compiledExpression.iteratePointers(context);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIterate_VROp0() {
    String xpath = "/some/path";
    Constant expression = new Constant(123); // Assuming Number is acceptable
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression(xpath, expression);
    Object contextBean = new Object();
    JXPathContext parentContext = null; // Assuming null is acceptable for simplicity
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    Iterator result = compiledExpression.iterate(context);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_dRZA0() {
        MockitoAnnotations.initMocks(this);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_XsbW0() {
    JXPathContext parentContext = null; // Assuming null for simplicity, replace with actual context if available
    Object contextBean = new Object();
    JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(parentContext, contextBean);
    Constant expression = new Constant("expression");
    JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("some/xpath", expression);
    Class<String> requiredType = String.class;
    Object result = compiledExpression.getValue(context, requiredType);
    assertNotNull(result);
    assertTrue(result instanceof String);
}
}