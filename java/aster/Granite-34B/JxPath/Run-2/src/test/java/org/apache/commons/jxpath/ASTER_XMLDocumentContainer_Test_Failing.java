/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.xml.transform.Source;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XMLDocumentContainer_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_sSyo0() {
        Source source = null;
        try {
            new XMLDocumentContainer(source);
        } catch (final IllegalArgumentException e) {
        }
        final XMLDocumentContainer xmlDocumentContainer = new XMLDocumentContainer(source);
        try {
            xmlDocumentContainer.setValue(null);
            fail("Expected UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueURL_qeLn1() {
        URL xmlURL = null;
        try {
            new XMLDocumentContainer(xmlURL);
        } catch (final IllegalArgumentException e) {
        }
        final XMLDocumentContainer xmlDocumentContainer = new XMLDocumentContainer(xmlURL);
        try {
            xmlDocumentContainer.setValue(null);
            fail("Expected UnsupportedOperationException");
        } catch (final UnsupportedOperationException e) {
        }
    }
}