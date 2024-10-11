/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseXML_ykTw0() {
        JDOMParser parser = new JDOMParser();
        parser.setNamespaceAware(true);
        parser.setExpandEntityReferences(true);
        parser.setIgnoringElementContentWhitespace(true);
        parser.setValidating(true);
        Object result = parser.parseXML(new java.io.ByteArrayInputStream("<root><child>test</child></root>".getBytes()));
    }
}