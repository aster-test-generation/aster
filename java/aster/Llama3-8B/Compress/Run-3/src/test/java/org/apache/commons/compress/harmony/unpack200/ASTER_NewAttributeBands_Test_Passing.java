/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttributeBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls4_KjCO3() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0, true));
    int[] backwardsCalls = new int[2];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_EmptyBackwardsCalls_OrrP0() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = new int[0];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_SingleBackwardsCall_OThm1() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = new int[] {1};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_MultipleBackwardsCalls_keKv2() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = new int[] {1, 2, 3};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_NullBackwardsCalls_PCoU3() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = null;
    try {
        newAttributeBands.setBackwardsCalls(backwardsCalls);
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_EmptyBackwardsCalls_jIzg0() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    newAttributeBands.setBackwardsCalls(new int[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_SingleBackwardsCall_QSmM1() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    newAttributeBands.setBackwardsCalls(new int[]{1});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_MultipleBackwardsCalls_Touw2() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    newAttributeBands.setBackwardsCalls(new int[]{1, 2, 3});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_NullBackwardsCalls_hKZf3() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    newAttributeBands.setBackwardsCalls(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls2_wODW1() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0, true));
    int[] backwardsCalls = new int[] {1, 2, 3};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls4_vyxp3() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0, true));
    int[] backwardsCalls = new int[] {1};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls3_XoYU2() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = new int[]{};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls1_AYIt0() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
    int[] backwardsCalls = new int[] {1, 2, 3};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls2_qwMx1() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1, true));
    int[] backwardsCalls = new int[] {1, 2, 3};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls3_AHqs2() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
    int[] backwardsCalls = new int[] {1};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls4_xpKx3() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
    int[] backwardsCalls = new int[] {};
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls1_lMpb0() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
    int[] backwardsCalls = new int[1];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls2_mrHI1() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1, true));
    int[] backwardsCalls = new int[1];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls3_yrkn2() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
    int[] backwardsCalls = new int[2];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls4_xlmv3() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1, true));
    int[] backwardsCalls = new int[2];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls3_Yowe2() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = new int[2];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls_odsX0() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0));
    int[] backwardsCalls = new int[1];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCallsCallable_sDTw1() throws IOException {
    NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 0, true));
    int[] backwardsCalls = new int[1];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBackwardsCalls1_muju0_dznA0() throws IOException {
    Segment segment = new Segment();
    AttributeLayout attributeLayout = new AttributeLayout("name", 1, "layout", 0);
    NewAttributeBands newAttributeBands = new NewAttributeBands(segment, attributeLayout);
    int[] backwardsCalls = new int[1];
    newAttributeBands.setBackwardsCalls(backwardsCalls);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecO_mShk0_fJCq0() {
    try {
        NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
        assertEquals(BHSDCodec.BRANCH5, newAttributeBands.getCodec("O"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecP_rnWK1_fYzi0() {
    try {
        NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
        assertEquals(BHSDCodec.BCI5, newAttributeBands.getCodec("P"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecDefault_Ubox4_dRYR0() {
    try {
        NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
        assertEquals(BHSDCodec.UNSIGNED5, newAttributeBands.getCodec("default"));
    } catch (IOException e) {
        fail("IOException was expected to be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecNoMatch_yUZE5_nHvy0() {
    try {
        NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
        assertEquals(BHSDCodec.UNSIGNED5, newAttributeBands.getCodec("no match"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCodecNull_Tkbl6_jUtd0() {
    try {
        NewAttributeBands newAttributeBands = new NewAttributeBands(new Segment(), new AttributeLayout("name", 1, "layout", 1));
        assertEquals(BHSDCodec.UNSIGNED5, newAttributeBands.getCodec(null));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBackwardsCallCount_btFy0_OHdr0() {
    Segment segment = new Segment();
    try {
        AttributeLayout attributeLayout = new AttributeLayout("name", 0, "layout", 0);
        try {
            NewAttributeBands newAttributeBands = new NewAttributeBands(segment, attributeLayout);
            assertEquals(0, newAttributeBands.getBackwardsCallCount());
        } catch (IOException e) {
            fail("IOException was thrown");
        }
    } catch (Pack200Exception e) {
        fail("Pack200Exception was thrown");
    }
}
}