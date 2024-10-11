import unittest
from ansible.modules.sysvinit import *


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
        with self.assertRaises(AnsibleModuleError):
            fail_if_missing(AnsibleModule, False, 'apache2')

    def test_get_ps(self):
        self.assertTrue(get_ps(AnsibleModule, 'apache2'))
        self.assertFalse(get_ps(AnsibleModule, 'does_not_exist'))

    def test_daemonize(self):
        self.assertEqual(daemonize(AnsibleModule, 'echo "daemonized"'), (0, 'daemonized\n', ''))

if __name__ == '__main__':
    unittest.main()