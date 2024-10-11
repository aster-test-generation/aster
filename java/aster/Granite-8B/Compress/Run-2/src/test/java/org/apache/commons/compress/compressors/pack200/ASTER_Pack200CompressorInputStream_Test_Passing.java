/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200CompressorInputStream_Test_Passing {
    private Pack200CompressorInputStream pack200CompressorInputStream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithoutSignature_wrJW1() {
		byte[] signature = { (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00 };
		boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithInvalidSignature_THNj2() {
		byte[] signature = { (byte) 0xCA, (byte) 0xFE, (byte) 0xB0, (byte) 0x0A };
		boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithNullSignature_ZtUc3() {
		byte[] signature = null;
		boolean result = Pack200CompressorInputStream.matches(signature, 0);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithEmptySignature_YErh4() {
		byte[] signature = new byte[0];
		boolean result = Pack200CompressorInputStream.matches(signature, 0);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseWithFileAndMap_Tmto1() throws IOException {
        Pack200CompressorInputStream pack200CompressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), new HashMap<>());
        pack200CompressorInputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseWithFileAndStrategyAndMap_BzHI2() throws IOException {
        Pack200CompressorInputStream pack200CompressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY, new HashMap<>());
        pack200CompressorInputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseWithFileAndStrategy_tNrx5() throws IOException {
        Pack200CompressorInputStream pack200CompressorInputStream = new Pack200CompressorInputStream(new File("test.txt"), Pack200Strategy.IN_MEMORY);
        pack200CompressorInputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseWithFile_aPKU6() throws IOException {
        Pack200CompressorInputStream pack200CompressorInputStream = new Pack200CompressorInputStream(new File("test.txt"));
        pack200CompressorInputStream.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setUp_IVXx1() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchesWithSignature_aaYv0_fid2() {
		byte[] signature = { (byte) 0xCA, (byte) 0xFE, (byte) 0xB0, (byte) 0x0B };
		boolean result = Pack200CompressorInputStream.matches(signature, signature.length);
		assertFalse(result);
	}
}