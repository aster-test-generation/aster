import unittest
from ansible.modules.systemd import *



class TestSystemd(unittest.TestCase):
    def test_systemd(self):
        instance = Systemd
        result = instance.systemd()
        self.assertEqual(result, None)

    def test_systemd_daemon_reload(self):
        instance = Systemd
        result = instance.systemd_daemon_reload()
        self.assertEqual(result, None)

    def test_systemd_daemon_reexec(self):
        instance = Systemd()
        result = instance.systemd_daemon_reexec()
        self.assertEqual(result, None)

    def test_systemd_get_enabled(self):
        instance = Systemd
        result = instance.systemd_get_enabled()
        self.assertEqual(result, None)

    def test_systemd_get_service_load_error(self):
        instance = Systemd()
        result = instance.systemd_get_service_load_error()
        self.assertEqual(result, None)

    def test_systemd_get_service_status(self):
        instance = Systemd
        result = instance.systemd_get_service_status()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties(self):
        instance = Systemd()
        result = instance.systemd_get_unit_properties()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail(self):
        instance = Systemd()
        result = instance.systemd_get_unit_properties_fail()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_empty_list(self):
        instance = systemd.Systemd()
        result = instance.systemd_get_unit_properties_fail_on_empty_list()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_missing_name(self):
        instance = Systemd
        result = instance.systemd_get_unit_properties_fail_on_missing_name()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_no_properties(self):
        instance = Systemd
        result = instance.systemd_get_unit_properties_fail_on_no_properties()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_no_unit_file(self):
        instance = systemd.Systemd()
        result = instance.systemd_get_unit_properties_fail_on_no_unit_file()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_not_found(self):
        instance = Systemd
        result = instance.systemd_get_unit_properties_fail_on_not_found()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_not_loaded(self):
        instance = Systemd()
        result = instance.systemd_get_unit_properties_fail_on_not_loaded()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_not_masked(self):
        instance = Systemd()
        result = instance.systemd_get_unit_properties_fail_on_not_masked()
        self.assertEqual(result, None)

    def test_systemd_get_unit_properties_fail_on_not_running(self):
        instance = Systemd
        result = instance.systemd_get_unit_properties_fail_on_not_running()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()