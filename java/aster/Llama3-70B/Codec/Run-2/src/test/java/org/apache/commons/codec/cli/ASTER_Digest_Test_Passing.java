/**
 * Generated by Aster
 */
package org.apache.commons.codec.cli;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Digest_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMain_Belr0_fid1() throws IOException {
    String[] args = new String[] {"MD5", "FILE"};
    Digest.main(args);
}
}