/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.NodeSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Constant_Test_Passing {
private Object value;
@Mock
    private EvalContext evalContext;
@Mock
    private JXPathContext jxpathContext;
@Mock
    private NodeSet nodeSet;
@Mock
    private Pointer pointer;
@Mock
    private RootContext rootContext;
private Constant constant;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsContextDependent_Tjpi0() throws Exception {
    Constant constant = new Constant("test");
    boolean result = constant.isContextDependent();
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() throws Exception {
        constant = new Constant("test");
        // Given
        when(evalContext.getPosition()).thenReturn(1);
        // When
        Object result = constant.computeValue(evalContext);
        // Then
        assertEquals("test", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNumber_FztZ0() throws Exception {
        Constant constant = new Constant(10);
        assertEquals("10", constant.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithString_NitI1() throws Exception {
        Constant constant = new Constant("Hello");
        assertEquals("'Hello'", constant.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentString_agUw0() throws Exception {
        Constant constant = new Constant("Hello");
        boolean result = constant.computeContextDependent();
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentNumber_yiBA1() throws Exception {
        Constant constant = new Constant(123);
        boolean result = constant.computeContextDependent();
        assertFalse(result);
    }
}