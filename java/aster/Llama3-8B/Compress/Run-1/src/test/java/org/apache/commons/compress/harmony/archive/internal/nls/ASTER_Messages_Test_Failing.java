/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.archive.internal.nls;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Messages_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStringBundleNotNull_REbz0() {
        String result = Messages.getString("msg");
        assertEquals("expected message", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_jopk1() {
        String result = Messages.getString("Hello, %d", 10);
        assert result.equals("Hello, 10");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetString_tMkl1() {
        String result = Messages.getString("Hello %c", 'a');
        assertEquals("Hello a", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat1_OZvg0() {
        assertEquals("Hello {0}!", Messages.format("Hello {0}!", new Object[] {"World"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat2_elmj1() {
        assertEquals("Hello {0}! {1}", Messages.format("Hello {0}! {1}", new Object[] {"World", "Java"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat3_QBII2() {
        assertEquals("Hello {0}! {1} {2}", Messages.format("Hello {0}! {1} {2}", new Object[] {"World", "Java", "Programming"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat4_fHqq3() {
        assertEquals("Hello {0}! {1} {2} {3}", Messages.format("Hello {0}! {1} {2} {3}", new Object[] {"World", "Java", "Programming", "Language"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat5_WnxK4() {
        assertEquals("Hello {0}! {1} {2} {3} {4}", Messages.format("Hello {0}! {1} {2} {3} {4}", new Object[] {"World", "Java", "Programming", "Language", "Framework"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat6_hUUM5() {
        assertEquals("Hello {0}! {1} {2} {3} {4} {5}", Messages.format("Hello {0}! {1} {2} {3} {4} {5}", new Object[] {"World", "Java", "Programming", "Language", "Framework", "Development"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat7_nAqp6() {
        assertEquals("Hello {0}! {1} {2} {3} {4} {5} {6}", Messages.format("Hello {0}! {1} {2} {3} {4} {5} {6}", new Object[] {"World", "Java", "Programming", "Language", "Framework", "Development", "Testing"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat8_AcZI7() {
        assertEquals("Hello {0}! {1} {2} {3} {4} {5} {6} {7}", Messages.format("Hello {0}! {1} {2} {3} {4} {5} {6} {7}", new Object[] {"World", "Java", "Programming", "Language", "Framework", "Development", "Testing", "Debugging"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat9_TMsS8() {
        assertEquals("Hello {0}! {1} {2} {3} {4} {5} {6} {7} {8}", Messages.format("Hello {0}! {1} {2} {3} {4} {5} {6} {7} {8}", new Object[] {"World", "Java", "Programming", "Language", "Framework", "Development", "Testing", "Debugging", "Deployment"}));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFormat10_OBYw9() {
        assertEquals("Hello {0}! {1} {2} {3} {4} {5} {6} {7} {8} {9}", Messages.format("Hello {0}! {1} {2} {3} {4} {5} {6} {7} {8} {9}", new Object[] {"World", "Java", "Programming", "Language", "Framework", "Development", "Testing", "Debugging", "Deployment", "Maintenance"}));
    }
}