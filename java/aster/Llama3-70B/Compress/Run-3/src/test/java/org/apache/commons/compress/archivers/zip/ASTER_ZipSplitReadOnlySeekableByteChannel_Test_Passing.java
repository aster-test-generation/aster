/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipSplitReadOnlySeekableByteChannel_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFiles_MwpJ0() throws IOException {
    File lastSegmentFile = new File("lastSegmentFile");
    File file1 = new File("file1");
    File file2 = new File("file2");
    Iterable<File> files = Arrays.asList(file1, file2);
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.forFiles(lastSegmentFile, files);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForFiles_Izfd0() throws IOException {
    File file1 = new File("file1.zip");
    File file2 = new File("file2.zip");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.forFiles(file1, file2);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_ugXk0() throws IOException {
    File lastSegmentFile = new File("testFile");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_MekK0_rnec0() throws IOException {
    File lastSegmentFile = new File("lastSegmentPath");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2"); 
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_SingleChannel_kbfl0_gjfo0() throws IOException {
    java.nio.file.Path path = java.nio.file.Paths.get("");
    OpenOption[] openOptions = new OpenOption[] { java.nio.file.StandardOpenOption.READ };
    SeekableByteChannel channel = java.nio.file.Files.newByteChannel(path, openOptions);
    assertEquals(channel, ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(path.toFile()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_MultipleChannels_QkqK1_tFEI0() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    java.nio.file.OpenOption[] openOptions = new java.nio.file.OpenOption[] { java.nio.file.StandardOpenOption.READ };
    java.util.List<java.nio.file.Path> paths = java.util.Arrays.asList(path1, path2);
    java.io.File lastSegmentFile = new java.io.File("lastSegmentFile");
    java.nio.channels.SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertTrue(channel instanceof java.nio.channels.SeekableByteChannel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForOrderedSeekableByteChannels_cTkE0_NsRW0() throws IOException {
    File lastSegmentFile = new File("lastSegmentFile");
    SeekableByteChannel result = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_2_PrGj1_tzjZ0() {
    java.nio.file.Path lastSegmentPath = java.nio.file.Paths.get("path/to/last.txt");
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentPath.toFile());
        fail("Expected IOException");
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_4_VdpO3_lzTb0() throws IOException {
    File lastSegmentFile = new File("path/to/last.zip");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentFile);
    assertNotNull(channel);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuildFromLastSplitSegment_5_hvfe4_KPxa0() {
    java.nio.file.Path lastSegmentPath = java.nio.file.Paths.get("path/to/last.zip");
    try {
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(lastSegmentPath.toFile());
        fail("Expected IOException");
    } catch (java.io.IOException e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testForPaths_ZGRU0_atQA0() throws IOException {
    java.nio.file.Path path1 = java.nio.file.Paths.get("path1");
    java.nio.file.Path path2 = java.nio.file.Paths.get("path2");
    SeekableByteChannel channel = ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(java.io.File.createTempFile("temp", ".zip"));
    assertNotNull(channel);
}
}