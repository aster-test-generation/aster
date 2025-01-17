/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnicodeCommentExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_rLWd0() {
        UnicodeCommentExtraField unicodeCommentExtraField = new UnicodeCommentExtraField();
        ZipShort zipShort = unicodeCommentExtraField.getHeaderId();
        assertEquals(zipShort, UnicodeCommentExtraField.UCOM_ID);
    }
}