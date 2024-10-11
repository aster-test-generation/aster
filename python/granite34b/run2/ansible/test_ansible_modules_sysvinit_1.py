import unittest
from ansible.module_utils.service import sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestSysVInit(unittest.TestCase):
    def test_sysv_is_enabled(self):
        self.assertTrue(sysv_is_enabled('apache2'))

    def test_get_sysv_script(self):
        self.assertEqual(get_sysv_script('apache2'), '/etc/init.d/apache2')

    def test_sysv_exists(self):
        self.assertTrue(sysv_exists('httpd'))

    def test_fail_if_missing(self):
        self.assertTrue(fail_if_missing('apache2', 'httpd'))

    def test_get_ps(self):
        self.assertEqual(get_ps('apache2'), 'apache2')

    def test_daemonize(self):
        self.assertTrue(daemonize('apache2', 'apache2'))

if __name__ == '__main__':
    unittest.main()