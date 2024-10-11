/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_EmptyArchive_bDWC0() throws IOException {
    Path tempArchivePath = Files.createTempFile("empty", ".tar");
    TarFile tarFile = new TarFile(tempArchivePath);
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertTrue(entries.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloseOnNewTarFileWithPath_CbFd0() throws IOException {
    Path tempPath = Files.createTempFile("temp", ".tar");
    TarFile tarFile = new TarFile(tempPath);
    tarFile.close();
    assertTrue(Files.exists(tempPath)); // Check if the file still exists after close
}
}