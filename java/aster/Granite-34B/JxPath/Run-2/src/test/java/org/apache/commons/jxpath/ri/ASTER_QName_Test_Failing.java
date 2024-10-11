/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QName_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameTest1_KzEx0() {
        QName qName = new QName(" qualifiedName");
        String name = qName.getName();
        assert name.equals("qualifiedName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameTest2_tmLH1() {
        QName qName = new QName("prefix", "localName");
        String name = qName.getName();
        assert name.equals("prefix:localName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrefix_withNoPrefix_ZLSP2() {
        String localName = "localName";
        QName qName = new QName(localName);
        String prefix = qName.getPrefix();
        assert "".equals(prefix);
    }
}