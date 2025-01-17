/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveStructSparse_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_JpVt0() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(100L, 500L);
    assertEquals(100L, tarArchiveStructSparse.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSelf_lIfh0() {
    TarArchiveStructSparse sparse = new TarArchiveStructSparse(100, 200);
    assertTrue(sparse.equals(sparse));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithIdenticalObject_MImr1() {
    TarArchiveStructSparse sparse1 = new TarArchiveStructSparse(100, 200);
    TarArchiveStructSparse sparse2 = new TarArchiveStructSparse(100, 200);
    assertTrue(sparse1.equals(sparse2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentObject_JRVL2() {
    TarArchiveStructSparse sparse1 = new TarArchiveStructSparse(100, 200);
    TarArchiveStructSparse sparse2 = new TarArchiveStructSparse(101, 200);
    assertFalse(sparse1.equals(sparse2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_zeSQ3() {
    TarArchiveStructSparse sparse = new TarArchiveStructSparse(100, 200);
    assertFalse(sparse.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_aoLc4() {
    TarArchiveStructSparse sparse = new TarArchiveStructSparse(100, 200);
    Object other = new Object();
    assertFalse(sparse.equals(other));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentNumBytes_INhB5() {
    TarArchiveStructSparse sparse1 = new TarArchiveStructSparse(100, 200);
    TarArchiveStructSparse sparse2 = new TarArchiveStructSparse(100, 201);
    assertFalse(sparse1.equals(sparse2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_bCjm0() {
    TarArchiveStructSparse tarArchiveStructSparse = new TarArchiveStructSparse(100L, 500L);
    String expected = "TarArchiveStructSparse{offset=100, numbytes=500}";
    assertEquals(expected, tarArchiveStructSparse.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumbytes_pGGY0() {
    TarArchiveStructSparse tarArchive = new TarArchiveStructSparse(100, 500);
    assertEquals(500, tarArchive.getNumbytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_JduX0() {
    TarArchiveStructSparse tarSparse1 = new TarArchiveStructSparse(100L, 500L);
    TarArchiveStructSparse tarSparse2 = new TarArchiveStructSparse(100L, 500L);
    assertEquals(tarSparse1.hashCode(), tarSparse2.hashCode());
}
}