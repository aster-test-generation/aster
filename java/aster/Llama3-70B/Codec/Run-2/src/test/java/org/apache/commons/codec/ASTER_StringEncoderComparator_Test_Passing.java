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
public class Aster_StringEncoderComparator_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompare_ecGb0() {
    Nysiis stringEncoder = new Nysiis(true);
    StringEncoderComparator comparator = new StringEncoderComparator(stringEncoder);
    String obj1 = "hello";
    String obj2 = "hello";
    int result = comparator.compare(obj1, obj2);
    assertEquals(0, result);
}
}