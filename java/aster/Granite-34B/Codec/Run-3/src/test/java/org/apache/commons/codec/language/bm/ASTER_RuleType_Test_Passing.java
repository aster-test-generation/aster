/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RuleType_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_APPROX_VRPt0() throws Exception {
        RuleType ruleType = RuleType.APPROX;
        assertEquals("APPROX", ruleType.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_EXACT_xcWu1() throws Exception {
        RuleType ruleType = RuleType.EXACT;
        assertEquals("EXACT", ruleType.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_RULES_JYhx2() throws Exception {
        RuleType ruleType = RuleType.RULES;
        assertEquals("RULES", ruleType.getName());
    }
}