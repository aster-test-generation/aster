/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
public class Aster_X0015_CertificateIdForFile_Test_Failing {
@Test
	public void testParseException_Ogxj0() {
		X0015_CertificateIdForFile certificateIdForFile = new X0015_CertificateIdForFile();
		byte[] data = new byte[4];
		int offset = 0;
		int length = 4;
		assertThrows(ZipException.class, () -> certificateIdForFile.parseFromCentralDirectoryData(data, offset, length));
	}
}