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
public class Aster_RuleType_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_APPROX_viLs0() {
    RuleType ruleType = RuleType.APPROX;
    assertEquals("APPROX", ruleType.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_EXACT_vKZH1() {
    RuleType ruleType = RuleType.EXACT;
    assertEquals("EXACT", ruleType.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_RULES_vyZZ2() {
    RuleType ruleType = RuleType.RULES;
    assertEquals("RULES", ruleType.getName());
}
}