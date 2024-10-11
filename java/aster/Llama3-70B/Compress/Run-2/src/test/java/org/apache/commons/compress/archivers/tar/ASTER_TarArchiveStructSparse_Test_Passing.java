/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveStructSparse_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_HZOL0() {
    TarArchiveStructSparse obj = new TarArchiveStructSparse(10, 20);
    assertTrue(obj.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_gLCE1() {
    Object obj = new Object();
    TarArchiveStructSparse tarObj = new TarArchiveStructSparse(10, 20);
    assertFalse(tarObj.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_IGMy2() {
    TarArchiveStructSparse tarObj = new TarArchiveStructSparse(10, 20);
    assertFalse(tarObj.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_Urhq3() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(10, 20);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(10, 20);
    assertTrue(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOffset_JjIQ4() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(10, 20);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(15, 20);
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentNumBytes_YJek5() {
    TarArchiveStructSparse obj1 = new TarArchiveStructSparse(10, 20);
    TarArchiveStructSparse obj2 = new TarArchiveStructSparse(10, 30);
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_tarN0() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, 20);
    assertEquals("TarArchiveStructSparse{offset=10, numbytes=20}", tarArchiveStructSparse.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytes_iaHg0() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, 20);
    assertEquals(20, tarArchiveStructSparse.getNumbytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_YiWT0() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(10, 20);
    int result = tarArchiveStructSparse.hashCode();
    int expected = Objects.hash(10L, 20L);
    assert result == expected;
}
}