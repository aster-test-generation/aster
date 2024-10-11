import unittest
from ansible.modules.sysvinit import *


class TestSysvinit(unittest.TestCase):
    def test_sysv_is_enabled(self):
        result = sysv_is_enabled("apache2")
        self.assertEqual(result, False)

    def test_get_sysv_script(self):
        result = get_sysv_script("apache2")
        self.assertEqual(result, "/etc/init.d/apache2")

    def test_sysv_exists(self):
        result = sysv_exists("apache2")
        self.assertEqual(result, False)

    def test_fail_if_missing(self):
        result = fail_if_missing("apache2", "apache2")
        self.assertEqual(result, True)

    def test_get_ps(self):
        result = get_ps("apache2", "apache2")
        self.assertEqual(result, "apache2")

    def test_daemonize(self):
        result = daemonize("apache2", "start")
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()