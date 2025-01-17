/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPLong_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_XXuJ0() throws IOException {
        CPLong cpLong = new CPLong(100L, 1);
        DataOutputStream dos = new DataOutputStream(System.out);
        cpLong.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithZeroValue_gNxO1() throws IOException {
        CPLong cpLong = new CPLong(0L, 1);
        DataOutputStream dos = new DataOutputStream(System.out);
        cpLong.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithNegativeValue_gGoh2() throws IOException {
        CPLong cpLong = new CPLong(-100L, 1);
        DataOutputStream dos = new DataOutputStream(System.out);
        cpLong.writeBody(dos);
    }
}