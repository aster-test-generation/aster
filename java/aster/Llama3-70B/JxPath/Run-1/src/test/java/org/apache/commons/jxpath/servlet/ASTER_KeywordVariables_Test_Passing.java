/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeywordVariables_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariableTrue_Bwzf0() {
        KeywordVariables keywordVariables = new KeywordVariables("test", new Object());
        boolean result = keywordVariables.isDeclaredVariable("test");
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariableFalse_tnQj1() {
        KeywordVariables keywordVariables = new KeywordVariables("test", new Object());
        boolean result = keywordVariables.isDeclaredVariable("other");
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_qOcd0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        try {
            keywordVariables.declareVariable("variable", new Object());
            assert false;
        } catch (UnsupportedOperationException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_UndeclaredVariable_HhYX1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object result = keywordVariables.getVariable("unknownVariable");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_ljDW0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        try {
            keywordVariables.undeclareVariable("variable");
            assert false;
        } catch (UnsupportedOperationException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_DeclaredVariable_JxVM0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object result = keywordVariables.getVariable("variable");
        assertNull(result);
    }
}