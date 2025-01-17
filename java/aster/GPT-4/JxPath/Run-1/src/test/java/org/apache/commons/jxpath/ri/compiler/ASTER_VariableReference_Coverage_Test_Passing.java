/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_VariableReference_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependent_vmyy0() {
        QName qName = new QName("prefix", "localName");
        VariableReference varRef = new VariableReference(qName);
        assertFalse(varRef.isContextDependent());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_jOvJ0() {
        QName qName = new QName("prefix", "localName");
        VariableReference varRef = new VariableReference(qName);
        assertEquals("$" + qName.toString(), varRef.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependentReturnsFalse_vKkb0_leMK0() {
    QName qName = new QName("testVariable");
    VariableReference variableReference = new VariableReference(qName);
    assertFalse(variableReference.computeContextDependent(), "computeContextDependent should return false");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompute_pZtU0_uXXc0() {
    QName varName = new QName("testVariable");
    VariableReference variableReference = new VariableReference(varName);
    EvalContext context = mock(EvalContext.class);
    Object expectedValue = new Object();
    when(context.getValue()).thenReturn(expectedValue);
    Object result = variableReference.compute(context);
    assertEquals(expectedValue, result);
    verify(context).getValue();
}
}