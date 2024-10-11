/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BeiderMorseEncoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsConcat_HwkU0() throws Exception {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    assertTrue(encoder.isConcat());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetConcat_pvfu0() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetConcatFalse_IBnr1() throws Exception {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        beiderMorseEncoder.setConcat(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getNameTypeTest_kXKG0() throws Exception {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    NameType nameType = encoder.getNameType();
    assertEquals(NameType.class, nameType.getClass());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullSource_EVvT0() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String actual = encoder.encode(null);
        assertEquals(null, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidSource_Hjko1() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String actual = encoder.encode("TEST");
        assertEquals(". .... / .. ... .... .", actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleType_APPROX_rLxN0() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.APPROX);
        assertEquals(RuleType.APPROX, encoder.getRuleType());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleType_EXACT_xshm1() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.EXACT);
        assertEquals(RuleType.EXACT, encoder.getRuleType());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleType_RULES_ETPE2() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.RULES);
        assertEquals(RuleType.RULES, encoder.getRuleType());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EUHd0() throws EncoderException {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String source = "Hello, World!";
        Object encoded = encoder.encode(source);
        assertEquals(".... . .-.. .-.. ---  .-- --- .-. .-.. -..", encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidInput_nyJm1() throws Exception {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        Object source = 123;
        try {
            encoder.encode(source);
        } catch (EncoderException e) {
            assertEquals("BeiderMorseEncoder encode parameter is not of type String", e.getMessage());
        }
    }
}