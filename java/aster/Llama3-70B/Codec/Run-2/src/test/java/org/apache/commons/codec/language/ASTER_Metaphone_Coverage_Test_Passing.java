/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Metaphone_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_cMVj0() throws EncoderException {
        Metaphone metaphone = new Metaphone();
        String input = "Hello";
        metaphone.encode(input); // This test case covers line 3
    }
}