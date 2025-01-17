/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Soundex_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_ioqz0() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object result = soundex.encode("hello");
        assertNotNull(result);
}
}