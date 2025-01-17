/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BZip2CompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_ValidSignature_Pfam0() throws Exception {
        byte[] signature = {'B', 'Z', 'h'};
        assertTrue(BZip2CompressorInputStream.matches(signature, 3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_InvalidSignatureWrongLength_tNeJ1() throws Exception {
        byte[] signature = {'B', 'Z'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_InvalidSignatureWrongChars_PnRY2() throws Exception {
        byte[] signature = {'X', 'Y', 'Z'};
        assertFalse(BZip2CompressorInputStream.matches(signature, 3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_ValidSignatureWithExtraBytes_Snil3() throws Exception {
        byte[] signature = {'B', 'Z', 'h', '9'};
        assertTrue(BZip2CompressorInputStream.matches(signature, 4));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatches_EmptySignature_BFyP4() throws Exception {
        byte[] signature = new byte[0];
        assertFalse(BZip2CompressorInputStream.matches(signature, 0));
    }
}