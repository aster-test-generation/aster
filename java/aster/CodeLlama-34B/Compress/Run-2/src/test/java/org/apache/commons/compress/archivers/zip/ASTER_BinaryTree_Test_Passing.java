/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryTree_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddLeaf_depth2_valueAlreadyAssigned_WWTl5_mvYa0() {
    BinaryTree tree = new BinaryTree(2);
    tree.addLeaf(0, 0, 2, 1);
    assertThrows(IllegalArgumentException.class, () -> tree.addLeaf(0, 0, 2, 1));
}
}