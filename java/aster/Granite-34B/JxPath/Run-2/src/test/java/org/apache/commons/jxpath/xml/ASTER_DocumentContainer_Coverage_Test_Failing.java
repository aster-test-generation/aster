/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DocumentContainer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueUnsupportedOperationException_eSdd0() {
        DocumentContainer documentContainer = new DocumentContainer(null);
        documentContainer.setValue(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue1_SJZF0() throws Exception {
        DocumentContainer documentContainer0 = new DocumentContainer((URL) null);
        Object object0 = documentContainer0.getValue();
        assertNotNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue2_Tcmf1() throws Exception {
        DocumentContainer documentContainer0 = new DocumentContainer((URL) null, (String) null);
        Object object0 = documentContainer0.getValue();
        assertNotNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue3_esHn2() throws Exception {
        URL uRL0 = null;
        DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
        Object object0 = documentContainer0.getValue();
        assertNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue4_ldcj3() throws Exception {
        URL uRL0 = null;
        DocumentContainer documentContainer0 = new DocumentContainer(uRL0, (String) null);
        Object object0 = documentContainer0.getValue();
        assertNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue5_uouB4() throws Exception {
        URL uRL0 = new URL("http://xmlunit.sourceforge.net/nonsense.xml");
        DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
        Object object0 = documentContainer0.getValue();
        assertNotNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue6_nDuh5() throws Exception {
        URL uRL0 = new URL("http://xmlunit.sourceforge.net/nonsense.xml");
        DocumentContainer documentContainer0 = new DocumentContainer(uRL0, (String) null);
        Object object0 = documentContainer0.getValue();
        assertNotNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue1_SJZF0_fid2() throws Exception {
        DocumentContainer documentContainer0 = new DocumentContainer((URL) null);
        Object object0 = documentContainer0.getValue();
        assertNull(object0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue2_Tcmf1_fid2() throws Exception {
        DocumentContainer documentContainer0 = new DocumentContainer((URL) null, (String) null);
        Object object0 = documentContainer0.getValue();
        assertNull(object0);
    }
}