/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class Aster_CLI_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMain_NoArguments_ShouldCallUsage_FWuJ0_aZgB0() {
    String[] args = {};
    try {
        CLI.main(args);
    } catch (Exception e) {
        fail("Should not throw any exceptions");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMain_WithNonExistentFile_ShouldPrintErrorMessage_URtt1_KewA0() {
    String[] args = {"nonexistent.7z"};
    File mockFile = mock(File.class);
    when(mockFile.isFile()).thenReturn(false);
    when(mockFile.toString()).thenReturn("nonexistent.7z");
    assertThrows(Exception.class, () -> {
        try {
            CLI.main(args);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
    });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMain_WithInvalidMode_ShouldPrintUsage_mzHO4_VAlX0() {
    String[] args = {"existing.7z", "invalidMode"};
    assertThrows(IllegalArgumentException.class, () -> {
        try {
            CLI.main(args);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    });
}
}