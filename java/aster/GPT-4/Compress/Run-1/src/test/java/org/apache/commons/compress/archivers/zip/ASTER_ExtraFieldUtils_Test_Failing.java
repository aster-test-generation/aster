/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExtraFieldUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_Nism0() {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04}; // Example header for a ZIP file
    boolean local = true;
    try {
        ZipExtraField[] result = ExtraFieldUtils.parse(data, local);
        assertNotNull(result);
        assertTrue(result.length > 0);
    } catch (ZipException e) {
        fail("Should not throw ZipException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_RQAC0_1() throws ZipException {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04}; // Example header for a ZIP file
    ZipExtraField[] result = ExtraFieldUtils.parse(data);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_RQAC0_2() throws ZipException {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04}; // Example header for a ZIP file
    ZipExtraField[] result = ExtraFieldUtils.parse(data);
    assertTrue(result.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_xTuN2_MClT0() {
    byte[] data = {0x50, 0x4b, 0x03, 0x04, 0x05, 0x00};
    try {
        ZipExtraField[] result = ExtraFieldUtils.parse(data);
        assertNotNull(result);
        assertTrue(result.length > 0);
    } catch (ZipException e) {
        fail("Should not throw exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_RQAC0() throws ZipException {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04}; // Example header for a ZIP file
    ZipExtraField[] result = ExtraFieldUtils.parse(data);
    assertNotNull(result);
    assertTrue(result.length > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_Nism0_fid2() {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04}; // Example header for a ZIP file
    boolean local = true;
    try {
        ZipExtraField[] result = ExtraFieldUtils.parse(data, local);
        assertNotNull(result);
        assertTrue(result.length == 0); // Assuming no extra fields are parsed from this data
    } catch (ZipException e) {
        fail("Should not throw ZipException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_RQAC0_1_fid2() throws ZipException {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04, 0x00, 0x00}; // Corrected data with zero-length extra field
    ZipExtraField[] result = ExtraFieldUtils.parse(data);
    assertEquals(0, result.length); // Expecting no extra fields
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_RQAC0_2_fid2() throws ZipException {
    byte[] data = new byte[] {0x50, 0x4b, 0x03, 0x04}; // Example header for a ZIP file
    ZipExtraField[] result = ExtraFieldUtils.parse(data);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseWithValidData_xTuN2_MClT0_fid2() {
    byte[] data = {0x50, 0x4b, 0x03, 0x04, 0x05, 0x00};
    try {
        ZipExtraField[] result = ExtraFieldUtils.parse(data);
        assertNotNull(result);
        assertEquals(0, result.length); // Expecting no fields to be parsed from the given data
    } catch (ZipException e) {
        fail("Should not throw exception");
    }
}
}