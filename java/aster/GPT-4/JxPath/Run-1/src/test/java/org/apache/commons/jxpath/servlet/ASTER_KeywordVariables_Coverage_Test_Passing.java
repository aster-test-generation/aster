/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_KeywordVariables_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariableMatchesKeyword_WFrg0() {
        String keyword = "testKeyword";
        KeywordVariables kv = new KeywordVariables(keyword, new Object());
    }
}