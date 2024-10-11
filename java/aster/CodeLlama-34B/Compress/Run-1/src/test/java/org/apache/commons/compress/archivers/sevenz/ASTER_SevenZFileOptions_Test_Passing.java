/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFileOptions_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTryToRecoverBrokenArchives_default_zStv0_MDtn0() {
    SevenZFileOptions options = SevenZFileOptions.builder().build();
    assertFalse(options.getTryToRecoverBrokenArchives());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMaxMemoryLimitInKb_Bwae0_MYea0_fid2() {
    SevenZFileOptions options = SevenZFileOptions.builder().build();
    int maxMemoryLimitKb = options.getMaxMemoryLimitInKb();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUseDefaultNameForUnnamedEntries_OxCn0_jSkn0_fid2() {
    SevenZFileOptions options = SevenZFileOptions.builder().build();
    assertFalse(options.getUseDefaultNameForUnnamedEntries());
}
}