/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BeiderMorseEncoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameType_TnNn0() {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    NameType nameType = encoder.getNameType();
    assertNotNull(nameType);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRuleType_ZyWs0() {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    RuleType ruleType = encoder.getRuleType();
    assertNotNull(ruleType);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsConcat_AuzM0() {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    boolean result = encoder.isConcat();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_String_bEAf0_ZzYW0() {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    String source = "Hello";
    try {
        String result = encoder.encode(source);
        assertNotNull(result);
    } catch (EncoderException e) {
        fail("EncoderException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeNull_ggFH0_izQZ1() throws EncoderException {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    String result = encoder.encode(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeString_YtKu1_NVLC0() {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    String source = "Hello World";
    try {
        String result = encoder.encode(source);
        assertNotNull(result);
    } catch (EncoderException e) {
        fail("EncoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeString_YtKu1_obku1() throws EncoderException {
    BeiderMorseEncoder encoder = new BeiderMorseEncoder();
    String source = "Hello World";
    String result = encoder.encode(source);
    assertNotNull(result);
}
}