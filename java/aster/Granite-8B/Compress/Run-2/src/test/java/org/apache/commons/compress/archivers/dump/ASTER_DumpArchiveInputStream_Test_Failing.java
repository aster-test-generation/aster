/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DumpArchiveInputStream_Test_Failing {
private DumpArchiveInputStream dumpArchiveInputStream;
private InputStream inputStream;
private DumpArchiveEntry dumpArchiveEntry;
private Queue<DumpArchiveEntry> queue;
private DumpArchiveEntry active;
private byte[] readBuf;
private int readIdx;
private long entryOffset;
    private long filepos;
    private boolean hasHitEOF;
    private final Map<Integer, Dirent> names = new HashMap<>();
    private long entrySize;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntryTest_CqRa1() throws Exception {
        dumpArchiveEntry = dumpArchiveInputStream.getNextEntry();
        assertNotNull(dumpArchiveEntry);
}
}