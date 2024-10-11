/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveStructSparse_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOffset_FmmX0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10L, 20L);
        long offset = tarArchiveStructSparse.getOffset();
        assertEquals(10L, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_GAFw0() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(obj1);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_AiLI1() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_PIrt2() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(new Object());
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentOffset_oNch3() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(3, 2);
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentNumbytes_chXO4() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(1, 3);
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectAndValues_hIwI5() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ELFk0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10L, 20L);
        String expected = "TarArchiveStructSparse{offset=10, numbytes=20}";
        assertEquals(expected, tarArchiveStructSparse.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNumbytes_SuLu0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, 20);
        assertEquals(20, tarArchiveStructSparse.getNumbytes());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_vcAn0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10L, 20L);
        int expectedHashCode = Objects.hash(tarArchiveStructSparse.getOffset(), tarArchiveStructSparse.getNumbytes());
        int actualHashCode = tarArchiveStructSparse.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }
}