/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import javax.xml.transform.Source;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XMLDocumentContainer_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_SourceNull_URLNull_IoUK2() {
        XMLDocumentContainer container = new XMLDocumentContainer((Source) null);
        assertNull(container.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_SourceNull_URLNull_IoUK2_fid1() {
        XMLDocumentContainer container = new XMLDocumentContainer((Source) null);
        assertNotNull(container.getValue());
    }
}