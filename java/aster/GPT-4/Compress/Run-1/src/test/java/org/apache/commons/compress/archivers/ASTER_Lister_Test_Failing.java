/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lister_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGoWithValidPath_HnqZ0_ijzI0() throws ArchiveException, IOException {
    Lister.main(new String[]{"valid/path/to/directory"});
    assertFalse(new java.io.File("valid/path/to/directory").exists());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGoWithValidPath_HnqZ0_ijzI0_fid2() throws ArchiveException, IOException {
    Lister.main(new String[]{"valid/path/to/directory"});
    assertTrue(new java.io.File("valid/path/to/directory").exists());
}
}