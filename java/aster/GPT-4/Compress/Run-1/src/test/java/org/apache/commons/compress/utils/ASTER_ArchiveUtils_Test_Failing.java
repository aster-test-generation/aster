/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSanitizeStringWithSpecialChars_LKNu1_fid1() {
    String result = ArchiveUtils.sanitize("Hello@World!");
    assertEquals("Hello?World?", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSanitizeStringExceedingMaxLength_OULd3_fid1() {
    String longString = "ThisIsAVeryLongStringThatExceedsTheMaximumAllowedLengthForSanitization";
    String result = ArchiveUtils.sanitize(longString);
    assertEquals("ThisIsAVeryLongStringThatExceedsTheMaximumAllowedL...", result);
}
}