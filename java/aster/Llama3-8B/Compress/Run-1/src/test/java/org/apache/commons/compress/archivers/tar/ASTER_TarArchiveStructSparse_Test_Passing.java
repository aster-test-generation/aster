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
    public void testGetOffset_UyRd0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10L, 20L);
        long offset = tarArchiveStructSparse.getOffset();
        assertEquals(10L, offset);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_BhYE0() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(obj1);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_TbZS1() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_xSLe2() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    boolean result = obj1.equals(new Object());
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentOffset_Aoxr3() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(3, 2);
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentNumbytes_wGSk4() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(1, 3);
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectWithDifferentReference_xbPR5() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(1, 2);
    TarArchiveStructSparse obj2 = obj1;
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNumbytes_LxZT0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(1L, 2L);
        long numbytes = tarArchiveStructSparse.getNumbytes();
        assert numbytes == 2L;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_oEUz0() {
        TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(1L, 2L);
        int result = tarArchiveStructSparse.hashCode();
        assertEquals(Objects.hash(1L, 2L), result);
    }
}