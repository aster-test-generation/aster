/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Sha2Crypt_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_empty_SeSP1() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), ""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_length_exceeds_16_vkYM3() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$1234567890123456789012345678901234567890"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_prefix_CyWu4() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$7$1234567890123456"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_salt_eDPe5() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$1234567890123456$"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_salt_length_EcNn6() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$12345678901234"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_salt_length_2_LPKK7() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$123456789012345678901234567890123456789"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_salt_length_3_TiaL8() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$12345678901234567890123456789012345678901"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_salt_length_4_caZc9() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$123456789012345678901234567890123456789012"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_sha256Crypt_salt_invalid_salt_length_5_uSPx10() {
		Sha2Crypt crypt = new Sha2Crypt();
		Assertions.assertThrows(IllegalArgumentException.class, () -> crypt.sha256Crypt("password".getBytes(), "$6$1234567890123456789012345678901234567890123"));
	}
}