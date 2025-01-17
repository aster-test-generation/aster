/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.examples;

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Expander_Test_Passing {
@Mock
    private SevenZFile sevenZFile;
@Mock
    private Path targetDirectory;
@Mock
    private SevenZArchiveEntry entry;
@Mock
    private InputStreamStatistics statistics;
@Mock
    private OutputStream out;
private Expander expander;
@Mock
	private File archive;
@Mock
    private SeekableByteChannel channel;
@Mock
    private InputStream inputStream;
@Mock
    private CloseableConsumer closeableConsumer;
@Mock
    private Path targetPath;
}