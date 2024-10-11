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

public class Aster_KeywordVariables_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_True_arQQ0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertTrue(keywordVariables.isDeclaredVariable("keyword"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_False_oFgv1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        assertFalse(keywordVariables.isDeclaredVariable("not_a_keyword"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_UndeclaredVariable_vngn3() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object variable = keywordVariables.getVariable("undeclaredVariable");
        assertNull(variable);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariable_DeclaredVariable_HvLy0_fid1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", "object");
        Object variable = keywordVariables.getVariable("variable");
        assertNull(variable);
    }
}