/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeNameTest_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNull3_QuRe4() {
        NodeNameTest testee = new NodeNameTest(null, null);
        assertTrue(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNull_MgCQ2_fid1() {
        NodeNameTest testee = new NodeNameTest(null, "namespaceURI");
        assertFalse(testee.isWildcard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsWildcardNull3_QuRe4_fid1() {
        NodeNameTest testee = new NodeNameTest(null, null);
        assertFalse(testee.isWildcard());
    }
}