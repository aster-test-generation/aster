/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DocumentContainer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_XMLURLIsNull_kkje2() throws Exception {
        DocumentContainer documentContainer = new DocumentContainer((URL) null);
        Object result = documentContainer.getValue();
        assertNull(result);
}
}