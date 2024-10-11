/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipSplitReadOnlySeekableByteChannel_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFiles_sLuu0() throws IOException {
    File lastSegmentFile = new File("lastSegmentFile");
    lastSegmentFile.createNewFile();
    File file1 = new File("file1");
    file1.createNewFile();
    File file2 = new File("file2");
    file2.createNewFile();
    Iterable<File> files = Arrays.asList(file1, file2);
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_zooT0() throws IOException {
    File lastSegmentFile = new File("testFile.zip");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_xGhp0_nCUN0() throws IOException {
    File lastSegmentFile = new File("lastSegmentPath.zip");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_MultipleChannels_neKC1_UoOO0_1() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    java.nio.file.OpenOption[] openOptions = new java.nio.file.OpenOption[] { java.nio.file.StandardOpenOption.READ };
    java.util.List<java.nio.file.Path> paths = java.util.Arrays.asList(path1, path2);
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new java.io.File("lastSegmentFile.zip"));
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForOrderedSeekableByteChannels_pYTr0_SBII0() throws IOException {
    File lastSegmentFile = new File("lastSegmentFile.zip"); // Added .zip extension
    SeekableByteChannel lastSegmentChannel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    List<SeekableByteChannel> channelsList = new ArrayList<>();
    channelsList.add(lastSegmentChannel);
    ZipSplitReadOnlySeekableByteChannel result = new ZipSplitReadOnlySeekableByteChannel(channelsList);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_NullParent_qWwf1_PQqV0() throws IOException {
    Path lastSegmentPath = mock(Path.class);
    when(lastSegmentPath.getParent()).thenReturn(null);
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentPath);
        fail("Expected IOException");
    } catch (IOException e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_NhcX0_jCNX0() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1.zip");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new java.io.File("path1.zip"));
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFiles_sLuu0_fid1() throws IOException {
    File lastSegmentFile = new File("lastSegmentFile");
    File file1 = new File("file1");
    File file2 = new File("file2");
    Iterable<File> files = Arrays.asList(file1, file2);
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.forFiles(lastSegmentFile, files);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFiles_yeHW0_fid1() throws IOException {
    File file1 = new File("file1.zip");
    File file2 = new File("file2.zip");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.forFiles(file1, file2);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_zooT0_fid1() throws IOException {
    File lastSegmentFile = new File("testFile");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_xGhp0_nCUN0_fid1() throws IOException {
    File lastSegmentFile = new File("lastSegmentPath");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_MultipleChannels_neKC1_UoOO0_1_fid1() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    java.nio.file.OpenOption[] openOptions = new java.nio.file.OpenOption[] { java.nio.file.StandardOpenOption.READ };
    java.util.List<java.nio.file.Path> paths = java.util.Arrays.asList(path1, path2);
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new java.io.File("lastSegmentFile"));
    assertNotNull(channel);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_MultipleChannels_neKC1_UoOO0_2_fid1() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    java.nio.file.OpenOption[] openOptions = new java.nio.file.OpenOption[] { java.nio.file.StandardOpenOption.READ };
    java.util.List<java.nio.file.Path> paths = java.util.Arrays.asList(path1, path2);
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new java.io.File("lastSegmentFile"));
    assertTrue(channel instanceof SeekableByteChannel);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForOrderedSeekableByteChannels_pYTr0_SBII0_fid1() throws IOException {
    File lastSegmentFile = new File("lastSegmentFile");
    SeekableByteChannel lastSegmentChannel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    List<SeekableByteChannel> channelsList = new ArrayList<>();
    channelsList.add(lastSegmentChannel);
    ZipSplitReadOnlySeekableByteChannel result = new ZipSplitReadOnlySeekableByteChannel(channelsList);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_InvalidExtension_xfUN0_GQzh0_fid1() throws IOException {
    Path lastSegmentPath = java.nio.file.Paths.get("test.txt");
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentPath);
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_NullParent_qWwf1_PQqV0_fid1() throws IOException {
    java.nio.file.Path lastSegmentPath = java.nio.file.Paths.get("", "test.zip");
    java.nio.file.Path parent = null;
    when(lastSegmentPath.getParent()).thenReturn(parent);
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentPath);
        fail("Expected IOException");
    } catch (IOException e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_NhcX0_jCNX0_fid1() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new java.io.File("path1"));
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_NullPaths_avvS2_CLPP0_fid1() {
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new File("dummy"));
        try {
            ZipSplitReadOnlySeekableByteChannel.forPaths(null, new OpenOption[] { StandardOpenOption.READ });
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFilesNull_vHPT1_wvix0_fid1() {
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(new File("dummy"));
        try {
            ZipSplitReadOnlySeekableByteChannel.forFiles((File[]) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    } catch (IOException e) {
    }
}
}