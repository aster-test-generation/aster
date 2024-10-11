import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_lineinfile(self):
        instance = Lineinfile()
        result = instance.lineinfile()
        self.assertEqual(result, None)

    def test_main(self):
        instance = Lineinfile()
        result = instance.main()
        self.assertEqual(result, None)

    def test_run_command(self):
        instance = Lineinfile()
        result = instance.run_command()
        self.assertEqual(result, None)

    def test_backup_file(self):
        instance = Lineinfile()
        result = instance.backup_file()
        self.assertEqual(result, None)

    def test_write_changes(self):
        instance = Lineinfile()
        result = instance.write_changes()
        self.assertEqual(result, None)

    def test_get_diff_data(self):
        instance = Lineinfile()
        result = instance.get_diff_data()
        self.assertEqual(result, None)

    def test_get_backup_path(self):
        instance = Lineinfile()
        result = instance.get_backup_path()
        self.assertEqual(result, None)

    def test_get_dest_path(self):
        instance = Lineinfile()
        result = instance.get_dest_path()
        self.assertEqual(result, None)

    def test_get_real_dest_path(self):
        instance = Lineinfile()
        result = instance.get_real_dest_path()
        self.assertEqual(result, None)

    def test_get_real_backup_path(self):
        instance = Lineinfile()
        result = instance.get_real_backup_path()
        self.assertEqual(result, None)

    def test_get_unique_filename(self):
        instance = Lineinfile()
        result = instance.get_unique_filename()
        self.assertEqual(result, None)

    def test_get_backup_file_path(self):
        instance = Lineinfile()
        result = instance.get_backup_file_path()
        self.assertEqual(result, None)

    def test_get_backup_file_name(self):
        instance = Lineinfile()
        result = instance.get_backup_file_name()
        self.assertEqual(result, None)

    def test_get_backup_file_extension(self):
        instance = Lineinfile()
        result = instance.get_backup_file_extension()
        self.assertEqual(result, None)

    def test_get_backup_file_timestamp(self):
        instance = Lineinfile()
        result = instance.get_backup_file_timestamp()
        self.assertEqual(result, None)

    def test_get_backup_file_name_with_timestamp(self):
        instance = Lineinfile()
        result = instance.get_backup_file_name_with_timestamp()
        self.assertEqual(result, None)

    def test_get_backup_file_path_with_timestamp(self):
        instance = Lineinfile()
        result = instance.get_backup_file_path_with_timestamp()
        self.assertEqual(result, None)

    def test_get_backup_file_name_without_timestamp(self):
        instance = Lineinfile()
        result = instance.get_backup_file_name_without_timestamp()
        self.assertEqual(result, None)

    def test_get_backup_file_path_without_timestamp(self):
        instance = Lineinfile()
        result = instance.get_backup_file_path_without_timestamp()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()