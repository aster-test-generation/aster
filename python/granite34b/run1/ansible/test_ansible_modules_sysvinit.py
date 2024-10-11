import unittest
from ansible.modules.sysvinit import sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestSysVInit(unittest.TestCase):
    def test_sysv_is_enabled(self):
        self.assertTrue(sysv_is_enabled('apache2'))
        self.assertFalse(sysv_is_enabled('does_not_exist'))

    def test_get_sysv_script(self):
        self.assertEqual(get_sysv_script('apache2'), '/etc/init.d/apache2')
        self.assertIsNotNone(get_sysv_script('does_not_exist'))

    def test_sysv_exists(self):
        self.assertTrue(sysv_exists('httpd'))
        self.assertFalse(sysv_exists('does_not_exist'))

    def test_fail_if_missing(self):
        self.assertRaises(Exception, fail_if_missing, 'apache2')
        self.assertRaises(Exception, fail_if_missing, 'does_not_exist')

    def test_get_ps(self):
        self.assertTrue(get_ps('apache2', 'pattern'))
        self.assertFalse(get_ps('does_not_exist'))

    def test_daemonize(self):
        self.assertEqual(daemonize('apache2', 'apache2'), (0, 'daemonized', ''))
        self.assertEqual(daemonize('does_not_exist'), (1, 'error', ''))

if __name__ == '__main__':
    unittest.main()