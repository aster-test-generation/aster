/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.IOException;
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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAtEOF_EmptyArchive_PdRM0() throws IOException {
    TarFile tarFile = new TarFile(new byte[0]);
    assertFalse(tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAtEOF_NonEmptyArchive_qwet1() throws IOException {
    byte[] content = new byte[10];
    TarFile tarFile = new TarFile(content);
    assertFalse(tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAtEOF_EmptyArchive_Lenient_ihBq2() throws IOException {
    TarFile tarFile = new TarFile(new byte[0], true);
    assertFalse(tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAtEOF_NonEmptyArchive_Lenient_vdvw3() throws IOException {
    byte[] content = new byte[10];
    TarFile tarFile = new TarFile(content, true);
    assertFalse(tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAtEOF_EmptyArchive_NonLenient_rEfq4() throws IOException {
    TarFile tarFile = new TarFile(new byte[0], false);
    assertTrue(tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsAtEOF_NonEmptyArchive_NonLenient_LFvw5() throws IOException {
    byte[] content = new byte[10];
    TarFile tarFile = new TarFile(content, false);
    assertFalse(tarFile.isAtEOF());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_EmptyArchive_DvEK0() throws IOException {
    TarFile tarFile = new TarFile(new byte[0], "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertTrue(entries.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_SingleEntry_tTGg1_1() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(1, entries.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_SingleEntry_tTGg1_2() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(content.length, entries.get(0).getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_MultipleEntries_EEue2_1() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(2, entries.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_MultipleEntries_EEue2_3() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(content.length, entries.get(1).getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_InvalidEntry_aXJt3_3() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(0, entries.get(0).getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_SingleEntry_tTGg1() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(1, entries.size());
    assertEquals(content.length, entries.get(0).getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_MultipleEntries_EEue2() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(2, entries.size());
    assertEquals(content.length, entries.get(0).getSize());
    assertEquals(content.length, entries.get(1).getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_InvalidEntry_aXJt3() throws IOException {
    byte[] content = new byte[1024];
    Arrays.fill(content, (byte) 0xFF);
    TarFile tarFile = new TarFile(content, "UTF-8");
    List<TarArchiveEntry> entries = tarFile.getEntries();
    assertEquals(1, entries.size());
    assertEquals(content.length, entries.get(0).getSize());
    assertEquals(0, entries.get(0).getSize());
}
}