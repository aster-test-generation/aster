import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_absent(self):
        instance = lineinfile.Lineinfile()
        result = instance.absent()
        self.assertEqual(result, None)

    def test_present(self):
        instance = lineinfile.Lineinfile()
        result = instance.present()
        self.assertEqual(result, None)

    def test_backup_local(self):
        instance = lineinfile.Lineinfile()
        result = instance.backup_local()
        self.assertEqual(result, None)

    def test_check_file_attrs(self):
        instance = lineinfile()
        result = instance.check_file_attrs()
        self.assertEqual(result, None)

    def test_check_mode(self):
        instance = lineinfile()
        result = instance.check_mode()
        self.assertEqual(result, None)

    def test_diff(self):
        instance = Lineinfile()
        result = instance.diff()
        self.assertEqual(result, None)

    def test_exit_json(self):
        instance = lineinfile()
        result = instance.exit_json()
        self.assertEqual(result, None)

    def test_fail_json(self):
        instance = lineinfile()
        result = instance.fail_json()
        self.assertEqual(result, None)

    def test_get_checksum(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_checksum()
        self.assertEqual(result, None)

    def test_get_diff_data(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff_data()
        self.assertEqual(result, None)

    def test_get_file_args(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_args()
        self.assertEqual(result, None)

    def test_get_file_common_args(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_common_args()
        self.assertEqual(result, None)

    def test_get_file_mode(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_mode()
        self.assertEqual(result, None)

    def test_get_file_owner(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_owner()
        self.assertEqual(result, None)

    def test_get_file_secontext(self):
        instance = lineinfile()
        result = instance.get_file_secontext()
        self.assertEqual(result, None)

    def test_get_file_selevel(self):
        instance = lineinfile()
        result = instance.get_file_selevel()
        self.assertEqual(result, None)

    def test_get_file_serole(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_serole()
        self.assertEqual(result, None)

    def test_get_file_setype(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_setype()
        self.assertEqual(result, None)

    def test_get_file_state(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_state()
        self.assertEqual(result, None)

    def test_get_file_url(self):
        instance = lineinfile()
        result = instance.get_file_url()
        self.assertEqual(result, None)

    def test_get_file_valid_mode(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_valid_mode()
        self.assertEqual(result, None)

    def test_get_file_valid_secontext(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_file_valid_secontext()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()