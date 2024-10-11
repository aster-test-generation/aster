/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NullPointer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_ThrowsExceptionWithMessage_WhenParentIsNull_XzvS2_gbVF0() {
    NullPointer nullPointer = new NullPointer(Locale.US, "id");
    JXPathContext context = JXPathContext.newContext(new Object());
    try {
        nullPointer.createPath(context, "value");
        fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
        assertEquals("Cannot create the root object: ", e.getMessage().substring(0, 30));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameIsNotNull_qIxq1_GpoR0() {
    QName name = new QName("qualifiedName");
    NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
    NullPointer nullPointerWithName = new NullPointer(name, new Locale("en", "US"));
    assert nullPointerWithName.hashCode() != name.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameIsNull_BOQm0_SwbS0() {
    NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
    int result = nullPointer.hashCode();
    assert result != 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NameIsNull_BOQm0_SwbS0_fid2() {
    NullPointer nullPointer = new NullPointer(new Locale("en", "US"), "id");
    int result = nullPointer.hashCode();
    assertTrue(result != 0);
}
}