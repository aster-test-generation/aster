/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyDialect_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasStreamIdentifierFalse_TvdH1_Rfrd0() {
    FramedSnappyDialect framedSnappyDialect = FramedSnappyDialect.STANDARD;
    boolean result = framedSnappyDialect.hasStreamIdentifier();
    assert(!result);
}
}