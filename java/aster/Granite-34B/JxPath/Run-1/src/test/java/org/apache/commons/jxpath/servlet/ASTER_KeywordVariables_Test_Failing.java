/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_KeywordVariables_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_jXlW0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.declareVariable("variable", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_apsy0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        keywordVariables.undeclareVariable("variable");
    }
}