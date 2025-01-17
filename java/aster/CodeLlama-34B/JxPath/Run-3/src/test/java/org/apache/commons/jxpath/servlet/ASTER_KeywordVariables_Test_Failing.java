/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeywordVariables_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_Null_yeAr2() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertFalse(keywordVariables.isDeclaredVariable(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_Keyword_CHGf0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", "value");
        assertEquals("value", keywordVariables.getVariable("variable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_Object_fhEK1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", new Object());
        assertEquals(new Object(), keywordVariables.getVariable("variable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_Null_OmWL2() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", null);
        assertNull(keywordVariables.getVariable("variable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_InvalidVariableName_Cgzv3() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        try {
            keywordVariables.declareVariable("", "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Variable name cannot be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_InvalidValue_sGqy4() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        try {
            keywordVariables.declareVariable("variable", new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Value cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_DuplicateVariable_OvKP5() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", "value");
        try {
            keywordVariables.declareVariable("variable", "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Variable 'variable' already exists", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_DuplicateValue_UHPz6() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", "value");
        try {
            keywordVariables.declareVariable("variable", "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Value 'value' already exists", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_DuplicateVariableAndValue_ZOiC7() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", "value");
        try {
            keywordVariables.declareVariable("variable", "value");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Variable 'variable' and value 'value' already exist", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_DeclaredVariable_HvLy0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object variable = keywordVariables.getVariable("variable");
        assertEquals("object", variable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_NullVariable_EoQm4() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object variable = keywordVariables.getVariable(null);
        assertNull(variable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariableWithSameVariableThreeTimes_JddP12() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.undeclareVariable("variable");
        keywordVariables.undeclareVariable("variable");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_Null_yeAr2_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertTrue(keywordVariables.isDeclaredVariable(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_Object_fhEK1_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", new Object());
        assertNull(keywordVariables.getVariable("variable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_Null_OmWL2_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", null);
        assertNotNull(keywordVariables.getVariable("variable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_InvalidValue_sGqy4_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        try {
            keywordVariables.declareVariable("variable", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Value cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_NullVariable_EoQm4_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object variable = keywordVariables.getVariable(null);
        assertNotNull(variable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariableWithSameVariableThreeTimes_JddP12_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.undeclareVariable("variable");
        keywordVariables.undeclareVariable("variable");
        keywordVariables.undeclareVariable("variable");
    }
}