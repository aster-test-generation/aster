/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMA2Decoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getOptionsAsPropertiesTest_OTxi0() {
        LZMA2Decoder decoder = new LZMA2Decoder();
        Object opts = new Object(); // Assuming opts is an instance of Object
        byte[] result = decoder.getOptionsAsProperties(opts);
    }
}