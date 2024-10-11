import unittest
from ansible.modules.sysvinit import *

class TestSysVInit(unittest.TestCase):
    def test_sysv_is_enabled(self):
        self.assertTrue(sysv_is_enabled('apache2'))

    def test_get_sysv_script(self):
        self.assertEqual(get_sysv_script('apache2'), '/etc/init.d/apache2')

    def test_sysv_exists(self):
        self.assertTrue(sysv_exists('apache2'))

    def test_fail_if_missing(self):
        self.assertRaises(Exception, fail_if_missing, 'apache2')

    def test_get_ps(self):
        self.assertTrue(get_ps('apache2'))

    def test_daemonize(self):
        self.assertEqual(daemonize('apache2'), (0, 'daemonized', ''))

if __name__ == '__main__':
    unittest.main()