/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LangAttributePointer_Coverage_Test {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_BufferLengthZero_CrLH0() {
    LangAttributePointer langAttributePointer = new LangAttributePointer(null);
    String path = langAttributePointer.asPath();
    assertEquals("@xml:lang", path);
}
}