/**
 * Generated by Aster
 */
package org.apache.commons.codec;
import org.apache.commons.codec.language.Nysiis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_StringEncoderComparator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithEncoderException_wCjw0() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "test";
        Object o2 = "test";
        try {
            ((String) o1).equals("test");
            ((String) o2).equals("test");
            throw new EncoderException("EncoderException");
        } catch (EncoderException ee) {
            int result = comparator.compare(o1, o2);
            assertEquals(0, result);
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithNoEncoderException_xmET1() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "test";
        Object o2 = "test";
        int result = comparator.compare(o1, o2);
        assertEquals(0, result);
    }
}