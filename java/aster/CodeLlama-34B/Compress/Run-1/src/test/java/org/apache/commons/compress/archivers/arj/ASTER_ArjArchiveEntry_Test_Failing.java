/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjects_oQKX1() {
    ArjArchiveEntry entry1 = new ArjArchiveEntry();
    ArjArchiveEntry entry2 = new ArjArchiveEntry();
    assertFalse(entry1.equals(entry2));
}
}