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
public class Aster_BeiderMorseEncoder_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonStringParameter_LJFv0() throws EncoderException {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        try {
            beiderMorseEncoder.encode(123);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("BeiderMorseEncoder encode parameter is not of type String", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringParameter_DSVN1_1() throws EncoderException {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        String source = "Hello";
        Object result = beiderMorseEncoder.encode(source);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringParameter_DSVN1_2() throws EncoderException {
        BeiderMorseEncoder beiderMorseEncoder = new BeiderMorseEncoder();
        String source = "Hello";
        Object result = beiderMorseEncoder.encode(source);
        assertEquals("Expected result", result, "Expected result");}
}