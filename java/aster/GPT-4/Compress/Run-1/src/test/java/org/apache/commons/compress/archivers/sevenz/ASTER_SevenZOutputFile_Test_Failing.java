/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SevenZOutputFile_Test_Failing {
@Mock
    private SeekableByteChannel channel;
private SevenZOutputFile sevenZOutputFile;
    private final CRC32 crc32 = new CRC32();
    private boolean finished;
}