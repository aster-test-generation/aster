/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnicodePathExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_mrhg0_dJZu0() {
    UnicodePathExtraField unicodePathExtraField = new UnicodePathExtraField();
    ZipShort result = unicodePathExtraField.getHeaderId();
    assertEquals(unicodePathExtraField.getHeaderId(), result);
}
}