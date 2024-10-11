import unittest
from ansible.module_utils.facts.system.platform import *



class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = PlatformFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = PlatformFactCollector()
        result = instance.name
        self.assertEqual(result, 'platform')

    def test_fact_ids(self):
        instance = PlatformFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, {'system', 'kernel', 'kernel_version', 'machine', 'python_version', 'architecture', 'machine_id'})

    def test_get_file_content(self):
        instance = PlatformFactCollector()
        result = instance.get_file_content('/var/lib/dbus/machine-id')
        self.assertIsNotNone(result)

    def test_get_file_content_2(self):
        instance = PlatformFactCollector()
        result = instance.get_file_content('/etc/machine-id')
        self.assertIsNotNone(result)

    def test_get_bin_path(self):
        instance = PlatformFactCollector()
        result = instance.get_bin_path('getconf')
        self.assertIsNotNone(result)

    def test_get_bin_path_2(self):
        instance = PlatformFactCollector()
        result = instance.get_bin_path('bootinfo')
        self.assertIsNotNone(result)

    def test_run_command(self):
        instance = PlatformFactCollector()
        result = instance.run_command(['getconf', 'MACHINE_ARCHITECTURE'])
        self.assertIsNotNone(result)

    def test_run_command_2(self):
        instance = PlatformFactCollector()
        result = instance.run_command(['bootinfo', '-p'])
        self.assertIsNotNone(result)

    def test_get_file_content_3(self):
        instance = PlatformFactCollector()
        result = instance.get_file_content('/var/lib/dbus/machine-id')
        self.assertIsNotNone(result)

    def test_get_file_content_4(self):
        instance = PlatformFactCollector()
        result = instance.get_file_content('/etc/machine-id')
        self.assertIsNotNone(result)

    def test_get_bin_path_3(self):
        instance = PlatformFactCollector()
        result = instance.get_bin_path('getconf')
        self.assertIsNotNone(result)

    def test_get_bin_path_4(self):
        instance = PlatformFactCollector()
        result = instance.get_bin_path('bootinfo')
        self.assertIsNotNone(result)

    def test_run_command_3(self):
        instance = PlatformFactCollector()
        result = instance.run_command(['getconf', 'MACHINE_ARCHITECTURE'])
        self.assertIsNotNone(result)

    def test_run_command_4(self):
        instance = PlatformFactCollector()
        result = instance.run_command(['bootinfo', '-p'])
        self.assertIsNotNone(result)

    def test_get_file_content_5(self):
        instance = PlatformFactCollector()
        result = instance.get_file_content('/var/lib/dbus/machine-id')
        self.assertIsNotNone(result)

    def test_get_file_content_6(self):
        instance = PlatformFactCollector()
        result = instance.get_file_content('/etc/machine-id')
        self.assertIsNotNone(result)

    def test_get_bin_path_5(self):
        instance = PlatformFactCollector()
        result = instance.get_bin_path('getconf')
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()