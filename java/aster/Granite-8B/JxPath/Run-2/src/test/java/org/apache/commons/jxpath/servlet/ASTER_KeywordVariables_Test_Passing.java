/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeywordVariables_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableWhenVariableIsNotDeclared_YFoz1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        Object variable = keywordVariables.getVariable("notVariable");
        assertNull(variable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableWhenKeywordIsBlank_ZBZe2() {
        KeywordVariables keywordVariables = new KeywordVariables("", new Object());
        Object variable = keywordVariables.getVariable("variable");
        assertNull(variable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_sdHP0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        boolean result = keywordVariables.isDeclaredVariable("variable");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableWhenVariableIsDeclared_hBuQ0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        Object variable = keywordVariables.getVariable("variable");
    }
}