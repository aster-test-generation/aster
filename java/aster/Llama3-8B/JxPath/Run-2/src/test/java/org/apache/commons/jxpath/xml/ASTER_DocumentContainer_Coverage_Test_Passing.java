/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;
import java.io.IOException;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DocumentContainer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueDocumentNotNull_MbMR0_xhTV0() throws IOException {
    DocumentContainer dc = new DocumentContainer(new URL("https://example.com"));
    dc.getValue();
    assertNotNull(dc);
}
}