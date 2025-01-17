/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
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

    public void testIsContextDependent_True_AVsO0() {
        VariableReference variableReference = new VariableReference(new QName("prefix", "localName"));
        assertTrue(variableReference.isContextDependent());
    }

    public void testIsContextDependent_False_CmsE1() {
        VariableReference variableReference = new VariableReference(new QName("prefix", "localName"));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_Null_qhqe2() {
        VariableReference variableReference = new VariableReference(null);
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_Empty_TyYt3() {
        VariableReference variableReference = new VariableReference(new QName("", ""));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_Whitespace_bsMM4() {
        VariableReference variableReference = new VariableReference(new QName(" ", " "));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_InvalidPrefix_CADC5() {
        VariableReference variableReference = new VariableReference(new QName("invalidPrefix", "localName"));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_InvalidLocalName_msPQ6() {
        VariableReference variableReference = new VariableReference(new QName("prefix", "invalidLocalName"));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_NullPrefix_CDay7() {
        VariableReference variableReference = new VariableReference(new QName(null, "localName"));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_NullLocalName_DgUH8() {
        VariableReference variableReference = new VariableReference(new QName("prefix", null));
        assertFalse(variableReference.isContextDependent());
    }

    public void testIsContextDependent_NullQName_jHyJ9() {
        VariableReference variableReference = new VariableReference(null);
        assertFalse(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName1_BwLE0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName2_xebO1() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName3_yfdn2_1() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName3_yfdn2_2() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getPrefix(), actual.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName4_fjaw3_1() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName4_fjaw3_2() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getPrefix(), actual.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName5_mlDd4_3() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.hashCode(), actual.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName6_KwSl5_3() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.hashCode(), actual.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName7_EoPh6_4() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.toString(), actual.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName8_AgUv7_4() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.toString(), actual.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName9_CKHa8_5() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getClass(), actual.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_hgsb0() {
        QName qName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$prefix:localName";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullQName_vgDm1() {
        QName qName = null;
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$null";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyQName_JFdu2() {
        QName qName = new QName("");
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullPrefix_viQd3() {
        QName qName = new QName(null, "localName");
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$localName";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyPrefix_fmpL4() {
        QName qName = new QName("", "localName");
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$localName";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullLocalName_BAGB5() {
        QName qName = new QName("prefix", null);
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$prefix:null";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyLocalName_JzDl6() {
        QName qName = new QName("prefix", "");
        VariableReference variableReference = new VariableReference(qName);
        String expected = "$prefix:";
        String actual = variableReference.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValueWithNullContext_cSON2() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        Object result = variableReference.computeValue(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent1_yCAj0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertFalse(variableReference.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_nEHj1() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        assertFalse(variableReference.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName3_yfdn2() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName4_fjaw3() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName5_mlDd4() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
        assertEquals(varName.hashCode(), actual.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName6_KwSl5() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
        assertEquals(varName.hashCode(), actual.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName7_EoPh6() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
        assertEquals(varName.hashCode(), actual.hashCode());
        assertEquals(varName.toString(), actual.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName8_AgUv7() {
        QName varName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
        assertEquals(varName.hashCode(), actual.hashCode());
        assertEquals(varName.toString(), actual.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName9_CKHa8() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName actual = variableReference.getVariableName();
        assertEquals(varName.getName(), actual.getName());
        assertEquals(varName.getPrefix(), actual.getPrefix());
        assertEquals(varName.hashCode(), actual.hashCode());
        assertEquals(varName.toString(), actual.toString());
        assertEquals(varName.getClass(), actual.getClass());
    }
}