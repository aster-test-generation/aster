/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MatchRatingApproachEncoder_Coverage_Test_Failing {
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_eFsg1() throws EncoderException {
        MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
        Object input = new Object();
        encoder.encode(input);
    }
}