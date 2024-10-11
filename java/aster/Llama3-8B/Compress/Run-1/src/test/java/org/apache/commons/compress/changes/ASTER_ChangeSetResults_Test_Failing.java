/**
 * Generated by Aster
 */
package org.apache.commons.compress.changes;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChangeSetResults_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddedFromStream_zxAh0() {
        ChangeSetResults changeSetResults = new ChangeSetResults();
        List<String> expected = new ArrayList<>();
        expected.add("Added1");
        expected.add("Added2");
        List<String> actual = changeSetResults.getAddedFromStream();
        assert actual.equals(expected);
    }
}