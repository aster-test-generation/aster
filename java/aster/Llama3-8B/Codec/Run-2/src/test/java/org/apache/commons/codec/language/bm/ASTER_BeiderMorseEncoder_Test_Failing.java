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
public class Aster_BeiderMorseEncoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleTypeRules_qAMt2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.RULES);
        assertEquals(RuleType.RULES, encoder.getRuleType());
    }
}