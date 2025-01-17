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
    public void testDeclareVariable_JFiM0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableWhenVariableIsDeclared_Rmlv0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        Object result = keywordVariables.getVariable("variable");
        assertNull(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_CRvC0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", "value");
        keywordVariables.undeclareVariable("variable");
        assertEquals("value", keywordVariables.getVariable("variable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_LQBm0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        boolean result = keywordVariables.isDeclaredVariable("variable");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableWhenVariableIsDeclared_Rmlv0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        Object result = keywordVariables.getVariable("variable");
        assertEquals(new Object(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_CRvC0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.undeclareVariable("variable");
    }
}