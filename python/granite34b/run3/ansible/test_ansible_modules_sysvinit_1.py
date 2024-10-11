import unittest
from ansible.module_utils.service import sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestSysVInit(unittest.TestCase):
    def test_sysv_is_enabled(self):
        self.assertTrue(sysv_is_enabled("service_name"))

    def test_get_sysv_script(self):
        self.assertEqual(get_sysv_script("service_name"), "/etc/init.d/service_name")

    def test_sysv_exists(self):
        self.assertTrue(sysv_exists("service_name"))

    def test_fail_if_missing(self):
        self.assertRaises(Exception, fail_if_missing, "service_name")

    def test_get_ps(self):
        self.assertEqual(get_ps("service_name"), "process_status")

    def test_daemonize(self):
        self.assertEqual(daemonize("command"), "daemonized_command")

if __name__ == '__main__':
    unittest.main()