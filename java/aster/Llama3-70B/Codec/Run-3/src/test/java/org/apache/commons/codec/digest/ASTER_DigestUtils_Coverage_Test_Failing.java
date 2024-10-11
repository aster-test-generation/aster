/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DigestUtils_Coverage_Test_Failing {
    private static final int BUFFER_SIZE = 1024;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_AUQJ0_SCNh0() throws IOException {
        byte[] data = "Hello, World!".getBytes();
        MessageDigest shaDigest = DigestUtils.getSha512_256Digest();
        shaDigest.update(data);
        byte[] actual = shaDigest.digest();
        byte[] expected = new byte[]{-106, -19, 113, -122, -103, 122, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_AUQJ0_SCNh0_fid2() throws IOException {
        byte[] data = "Hello, World!".getBytes();
        MessageDigest shaDigest = DigestUtils.getSha512_256Digest();
        shaDigest.update(data);
        byte[] actual = shaDigest.digest();
        byte[] expected = new byte[]{-106, -19, 113, -122, -103, 122, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114, -115, -126, -114, -103, -114};
        assertArrayEquals(expected, actual);
    }
}