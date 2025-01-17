/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.jar;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JarArchiveOutputStream_Test_Passing {
private boolean jarMarkerAdded;
private ZipArchiveEntry zipArchiveEntry;
private JarArchiveOutputStream jarArchiveOutputStream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry_iPVg0() throws IOException {
        JarArchiveOutputStream jarArchiveOutputStream = new JarArchiveOutputStream(System.out);
        ZipArchiveEntry zipArchiveEntry = new ZipArchiveEntry("entryName");
        jarArchiveOutputStream.putArchiveEntry(zipArchiveEntry);
        jarArchiveOutputStream.closeArchiveEntry();
}
}