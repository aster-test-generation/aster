/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XMLDocumentContainer_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithNullDocumentAndNonNullURL_uIhb3_zEqf0() throws Exception {
    URL xmlURL = new URL("http://example.com");
    XMLDocumentContainer container = new XMLDocumentContainer(xmlURL);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueWithNullDocumentAndInvalidURL_KiAG4_bQiQ0() {
    try {
        URL xmlURL = new URL("http://invalid-url");
        XMLDocumentContainer container = new XMLDocumentContainer(xmlURL);
        container.getValue();
        fail("Expected JXPathException was not thrown");
    } catch (Exception ex) {
        assertTrue(ex instanceof JXPathException, "Exception should be a JXPathException");
        assertNotNull(ex.getMessage(), "Exception should have a message");
    }
}
}