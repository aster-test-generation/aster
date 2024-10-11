/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Lang_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInstanceASHKENAZI_SkfE0() {
        assertEquals(Lang.class, Lang.instance(NameType.ASHKENAZI).getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInstanceGENERIC_bhkc1() {
        assertEquals(Lang.class, Lang.instance(NameType.GENERIC).getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInstanceSEPHARDIC_eICA2() {
        assertEquals(Lang.class, Lang.instance(NameType.SEPHARDIC).getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLoadFromResourceInvalidResource_zUpW1_MSRs0() {
    try {
        Lang.loadFromResource("invalidResourceName", Languages.getInstance("someName"));
        fail("Expected exception");
    } catch (Exception e) {
    }
}
}