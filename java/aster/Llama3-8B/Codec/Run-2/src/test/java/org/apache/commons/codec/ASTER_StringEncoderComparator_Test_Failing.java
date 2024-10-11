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
public class Aster_StringEncoderComparator_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareDifferent_RVqj1_fid2() {
    Nysiis nysiis = new Nysiis();
    StringEncoderComparator comparator = new StringEncoderComparator(nysiis);
    Object o1 = "hello";
    Object o2 = "world";
    assertEquals(-1, comparator.compare(o1, o2));
}
}