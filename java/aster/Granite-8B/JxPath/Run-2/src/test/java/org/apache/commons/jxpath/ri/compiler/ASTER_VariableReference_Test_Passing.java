/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariableReference_Test_Passing {
    private QName varName;
    private EvalContext context;
    private VariableReference variablereference;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName_dIcQ0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableNameWithEmptyPrefix_ADie1() {
        QName varName = new QName("localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableNameWithNullPrefix_XKOA2() {
        QName varName = new QName(null, "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableNameWithEmptyLocalName_TGIB3() {
        QName varName = new QName("prefix", "");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableNameWithNullLocalName_shLg4() {
        QName varName = new QName("prefix", null);
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableNameWithNullVariableName_Yiju5() {
        VariableReference variableReference = new VariableReference(null);
        QName result = variableReference.getVariableName();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_YhTv0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertEquals("$prefix:localName", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_pnot0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        boolean result = variableReference.computeContextDependent();
        assertFalse(result);
    }
}