import unittest
from ansible.modules.apt_repository import SourcesList



class TestAptRepository(unittest.TestCase):
    def test_apt_repository(self):
        self.assertTrue(apt_repository)

    def test_apt_repository_main(self):
        self.assertTrue(apt_repository_main)

    def test_apt_repository_debian(self):
        self.assertTrue(apt_repository_debian)

    def test_apt_repository_ubuntu(self):
        self.assertTrue(apt_repository_ubuntu)

    def test_apt_repository_suse(self):
        self.assertTrue(apt_repository_suse)

    def test_apt_repository_yum(self):
        self.assertTrue(apt_repository_yum)

    def test_apt_repository_zypper(self):
        self.assertTrue(apt_repository_zypper)

    def test_apt_repository_portage(self):
        self.assertTrue(apt_repository_portage)

    def test_apt_repository_pacman(self):
        self.assertTrue(apt_repository_pacman)

    def test_apt_repository_apk(self):
        self.assertTrue(apt_repository_apk)

    def test_apt_repository_homebrew(self):
        self.assertTrue(apt_repository_homebrew)

    def test_apt_repository_macports(self):
        self.assertTrue(apt_repository_macports)

    def test_apt_repository_update_cache(self):
        self.assertTrue(apt_repository_update_cache)

    def test_apt_repository_update_cache_default(self):
        self.assertTrue(apt_repository_update_cache_default)

    def test_apt_repository_update_cache_yes(self):
        self.assertTrue(apt_repository_update_cache_yes)

    def test_apt_repository_update_cache_no(self):
        self.assertTrue(apt_repository_update_cache_no)

    def test_apt_repository_update_cache_always(self):
        self.assertTrue(apt_repository_update_cache_always)

    def test_apt_repository_update_cache_missing(self):
        self.assertTrue(apt_repository_update_cache_missing)

    def test_apt_repository_update_cache_failed(self):
        self.assertTrue(apt_repository_update_cache_failed)

    def test_apt_repository_update_cache_retries(self):
        self.assertTrue(apt_repository_update_cache_retries)

    def test_apt_repository_update_cache_retry_max_delay(self):
        self.assertTrue(apt_repository_update_cache_retry_max_delay)

    def test_apt_repository_update_cache_retry_backoff(self):
        self.assertTrue(apt_repository_update_cache_retry_backoff)

    def test_apt_repository_update_cache_retry_jitter(self):
        self.assertTrue(apt_repository_update_cache_retry_jitter)

    def test_apt_repository_update_cache_retry_factor(self):
        self.assertTrue(apt_repository_update_cache_retry_factor)

    def test_apt_repository_update_cache_retry_sleep(self):
        self.assertTrue(apt_repository_update_cache_retry_sleep)

    def test_apt_repository_update_cache_retry_sleep_default(self):
        self.assertTrue(apt_repository_update_cache_retry_sleep_default)

    def test_apt_repository_update_cache_retry_sleep_yes(self):
        self.assertTrue(apt_repository_update_cache_retry_sleep_yes)

    def test_apt_repository_update_cache_retry_sleep_no(self):
        self.assertTrue(apt_repository_update_cache_retry_sleep_no)

if __name__ == '__main__':
    unittest.main()