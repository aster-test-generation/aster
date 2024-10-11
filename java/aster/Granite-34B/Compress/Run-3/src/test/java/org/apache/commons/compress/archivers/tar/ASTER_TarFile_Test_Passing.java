/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SeekableByteChannel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarFile_Test_Passing {
private SeekableByteChannel archive;
TarFile tarfile;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetInputStream() throws Exception{
        archive = mock(SeekableByteChannel.class);
        tarfile = new TarFile(archive, 512, 512, "UTF-8", true);
        TarArchiveEntry entry = mock(TarArchiveEntry.class);
        when(entry.isDirectory()).thenReturn(false);
        when(entry.isFile()).thenReturn(true);
        when(entry.getSize()).thenReturn(10L);
        InputStream inputStream = tarfile.getInputStream(entry);
        verify(archive, times(1)).position(0);
        verify(archive, times(1)).position(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAtEOFWithContent_MGTg1() throws Exception {
        TarFile tarFile = new TarFile(new byte[] {1, 2, 3}, "encoding");
        assertEquals(false, tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAtEOFWithFile_DhVw6() throws Exception {
        TarFile tarFile = new TarFile(new File("archive"), true);
        assertEquals(false, tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClose_Ayyl1() throws IOException {
		TarFile tarFile = new TarFile(new byte[] {1, 2, 3}, "encoding");
		tarFile.close();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClose_wdNE2() throws IOException {
		TarFile tarFile = new TarFile(new byte[] {1, 2, 3}, true);
		tarFile.close();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClose_Xysv6() throws IOException {
		TarFile tarFile = new TarFile(new byte[] {1, 2, 3});
		tarFile.close();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClose_ErFI10() throws IOException {
		TarFile tarFile = new TarFile(new File("archive"), true);
		tarFile.close();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testClose_NmHR12() throws IOException {
		TarFile tarFile = new TarFile(new File("archive"), "encoding");
		tarFile.close();
	}
}