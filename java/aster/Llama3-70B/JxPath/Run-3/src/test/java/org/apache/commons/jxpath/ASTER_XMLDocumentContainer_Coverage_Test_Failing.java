/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import javax.xml.transform.Source;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XMLDocumentContainer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_DocumentIsNull_SourceIsNull_dRRq0() {
        XMLDocumentContainer container = new XMLDocumentContainer((Source) null);
        assertNull(container.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_UndefinedSource_HRzt11() {
        XMLDocumentContainer container = new XMLDocumentContainer((Source) null);
        assertNotNull(container.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_JXPathException_UhZv12() {
        try {
            XMLDocumentContainer container = new XMLDocumentContainer((Source) null);
            container.getValue();
            fail("Expected exception was not thrown");
        } catch (JXPathException e) {
        }
}
}