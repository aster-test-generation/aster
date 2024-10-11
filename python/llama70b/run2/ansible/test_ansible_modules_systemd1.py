import unittest
from ansible.modules.systemd import *

class TestSystemdModule(unittest.TestCase):
    def test_init(self):
        instance = SystemdModule()
        self.assertIsInstance(instance, SystemdModule)

    def test___init__(self):
        instance = SystemdModule()
        self.assertEqual(instance._SystemdModule__name, None)

    def test_parse_systemctl_show(self):
        lines = ["ActiveEnterTimestamp=Sun 2016-05-15 18:28:49 EDT", "ActiveEnterTimestampMonotonic=8135942"]
        result = parse_systemctl_show(lines)
        self.assertEqual(result, {"ActiveEnterTimestamp": "Sun 2016-05-15 18:28:49 EDT", "ActiveEnterTimestampMonotonic": "8135942"})

    def test___str__(self):
        instance = SystemdModule()
        self.assertEqual(str(instance), "SystemdModule")

    def test___repr__(self):
        instance = SystemdModule()
        self.assertEqual(repr(instance), "SystemdModule()")

    def test___eq__(self):
        instance1 = SystemdModule()
        instance2 = SystemdModule()
        self.assertTrue(instance1 == instance2)

    def test_is_chroot(self):
        self.assertTrue(is_chroot())

    def test_sysv_exists(self):
        self.assertTrue(sysv_exists("httpd"))

    def test_sysv_is_enabled(self):
        self.assertTrue(sysv_is_enabled("httpd"))

    def test_fail_if_missing(self):
        with self.assertRaises(SystemExit):
            fail_if_missing("httpd")

    def test_to_native(self):
        self.assertEqual(to_native("hello"), "hello")

if __name__ == '__main__':
    unittest.main()