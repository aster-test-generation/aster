/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;
import java.io.InputStream;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DocumentContainer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_XmlURLIsNull_BQdx2() throws Exception {
        URL xmlURL = null;
        DocumentContainer documentContainer = new DocumentContainer(xmlURL);
        documentContainer.getValue();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_InputStreamIsNull_vwYS1_DXDH0() throws Exception {
    URL xmlURL = new URL("http://example.com/xml");
    DocumentContainer documentContainer = new DocumentContainer(xmlURL);
    InputStream stream = null;
    try {
        documentContainer.parseXML(stream);
        fail("Expected RuntimeException to be thrown");
    } catch (RuntimeException e) {
        assertEquals("JXPath DOM parser error; InputStream cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_InputStreamIsNull_vwYS1_DXDH0_fid3() throws Exception {
    URL xmlURL = new URL("http://example.com/xml");
    DocumentContainer documentContainer = new DocumentContainer(xmlURL);
    InputStream stream = null;
    try {
        documentContainer.parseXML(stream);
        fail("Expected NullPointerException to be thrown");
    } catch (NullPointerException e) {
    }
}
}