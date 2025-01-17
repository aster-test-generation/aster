/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Archive_Test_Passing {
private int logLevel;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnpack_RemovePackFile_Aimf9_fid2() throws Pack200Exception, IOException {
    String inputFile = "inputFile.pack.gz";
    String outputFile = "outputFile.jar";
    Files.createFile(Paths.get(inputFile));
    Archive archive = new Archive(inputFile, outputFile);
    archive.setRemovePackFile(true);
    archive.unpack();
    assertTrue(Files.exists(Paths.get(outputFile)));
    assertFalse(Files.exists(Paths.get(inputFile)));
}
}