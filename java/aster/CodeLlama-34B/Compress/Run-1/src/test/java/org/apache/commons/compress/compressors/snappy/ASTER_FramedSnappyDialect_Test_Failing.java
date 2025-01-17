/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyDialect_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasStreamIdentifier_Empty_iaJO3_FMqB0_fid3() {
    FramedSnappyDialect dialect = FramedSnappyDialect.STANDARD;
    assertFalse(dialect.hasStreamIdentifier());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUsesChecksumWithCompressedChunks_Null_TwoF2_ETQN0_fid3() {
    FramedSnappyDialect dialect = FramedSnappyDialect.STANDARD;
    assertFalse(dialect.usesChecksumWithCompressedChunks());
}
}