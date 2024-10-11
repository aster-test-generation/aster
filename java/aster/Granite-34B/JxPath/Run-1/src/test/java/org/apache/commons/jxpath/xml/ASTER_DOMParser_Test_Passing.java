/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DOMParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXMLWithNoInputStream_iRyA1_fid1() {
        DOMParser parser = new DOMParser();
        InputStream stream = null;
        try {
            parser.parseXML(stream);
        } catch (JXPathException e) {
            assertEquals("DOM parser error; InputStream cannot be null", e.getMessage());
        }
    }
}