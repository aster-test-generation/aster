import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_main(self):
        instance = lineinfile.Lineinfile()
        result = instance.main()
        self.assertEqual(result, None)

    def test_run_command(self):
        instance = lineinfile.Lineinfile()
        result = instance.run_command()
        self.assertEqual(result, None)

    def test_backup_file(self):
        instance = lineinfile.Lineinfile()
        result = instance.backup_file()
        self.assertEqual(result, None)

    def test_write_changes(self):
        instance = lineinfile.Lineinfile()
        result = instance.write_changes()
        self.assertEqual(result, None)

    def test_get_diff(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff()
        self.assertEqual(result, None)

    def test_get_backup_path(self):
        instance = lineinfile()
        result = instance.get_backup_path()
        self.assertEqual(result, None)

    def test_get_dest_path(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_dest_path()
        self.assertEqual(result, None)

    def test_get_real_dest_path(self):
        instance = lineinfile()
        result = instance.get_real_dest_path()
        self.assertEqual(result, None)

    def test_get_src_path(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_src_path()
        self.assertEqual(result, None)

    def test_get_real_src_path(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_real_src_path()
        self.assertEqual(result, None)

    def test_get_unique_id(self):
        instance = lineinfile()
        result = instance.get_unique_id()
        self.assertEqual(result, None)

    def test_get_module_name(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_module_name()
        self.assertEqual(result, None)

    def test_get_module_name_short(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_module_name_short()
        self.assertEqual(result, None)

    def test_get_module_version(self):
        instance = Lineinfile()
        result = instance.get_module_version()
        self.assertEqual(result, None)

    def test_get_module_path(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_module_path()
        self.assertEqual(result, None)

    def test_get_module_utils(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_module_utils()
        self.assertEqual(result, None)

    def test_get_module_args(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_module_args()
        self.assertEqual(result, None)

    def test_get_module_supports_check_mode(self):
        from ansible.modules.files import Lineinfile
        result = instance.get_module_supports_check_mode()
        self.assertEqual(result, None)

    def test_get_module_supports_async(self):
        instance = Lineinfile()
        result = instance.get_module_supports_async()
        self.assertEqual(result, None)

    def test_get_module_min_ansible_version(self):
        instance = lineinfile()
        result = instance.get_module_min_ansible_version()
        self.assertEqual(result, None)

    def test_get_module_short_description(self):
        instance = lineinfile()
        result = instance.get_module_short_description()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()