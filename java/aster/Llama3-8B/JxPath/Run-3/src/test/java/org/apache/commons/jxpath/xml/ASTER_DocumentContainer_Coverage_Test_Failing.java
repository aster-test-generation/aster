/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DocumentContainer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueInputStreamNull_TrRk2_eVPk1() throws IOException {
    DocumentContainer dc = new DocumentContainer(null, "model");
    dc.parseXML(null);
}
}