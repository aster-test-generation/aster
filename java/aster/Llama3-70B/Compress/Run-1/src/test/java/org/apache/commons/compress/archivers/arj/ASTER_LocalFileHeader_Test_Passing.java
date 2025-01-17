/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalFileHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameIsNull_xlgK0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    assertEquals(0, localFileHeader.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_Lhyl0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    assert localFileHeader.equals(localFileHeader);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_sZyo1() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    assert !localFileHeader.equals(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_UhxE2() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    Object obj = new Object();
    assert !localFileHeader.equals(obj);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameIsNotNull_DICZ1_ImNo0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.name = "test";
    assertEquals("test".hashCode(), localFileHeader.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentArchiverVersionNumber_GYxT3_MLwF0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.archiverVersionNumber = 0;
    LocalFileHeader other = new LocalFileHeader();
    other.archiverVersionNumber = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentMinVersionToExtract_ohHK4_rBbj0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    LocalFileHeader other = new LocalFileHeader();
    other.minVersionToExtract = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentHostOS_WvQY5_zoKX0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    LocalFileHeader other = new LocalFileHeader();
    other.hostOS = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentArjFlags_Okwi6_nnMB0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    LocalFileHeader other = new LocalFileHeader();
    other.arjFlags = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentMethod_BizL7_XMhR0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.method = 0; // Initialize method for localFileHeader
    LocalFileHeader other = new LocalFileHeader();
    other.method = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentFileType_wmLd8_Kuqb0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    LocalFileHeader other = new LocalFileHeader();
    other.fileType = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentReserved_Jdfu9_HXCy0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.reserved = 0;
    LocalFileHeader other = new LocalFileHeader();
    other.reserved = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentReserved_Jdfu9_ICtW1() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.reserved = 0;
    LocalFileHeader other = new LocalFileHeader();
    other.reserved = 1;
    assertNotEquals(localFileHeader, other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentCompressedSize_jeGL11_lHuq0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.compressedSize = 0;
    LocalFileHeader other = new LocalFileHeader();
    other.compressedSize = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOriginalSize_OApj12_ZgTb0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.originalSize = 0;
    LocalFileHeader other = new LocalFileHeader();
    other.originalSize = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOriginalCrc32_LHZq13_kSnl0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    LocalFileHeader other = new LocalFileHeader();
    other.originalCrc32 = 1;
    assert !localFileHeader.equals(other);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLastChapter_Yzyc17_ftxP0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    localFileHeader.lastChapter = 0;
    LocalFileHeader other = new LocalFileHeader();
    other.lastChapter = 1;
    assert !localFileHeader.equals(other);
}
}