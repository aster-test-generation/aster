import unittest
from ansible.modules.lineinfile import *


class TestLineinfile(unittest.TestCase):
    def test_present(self):
        instance = lineinfile.Lineinfile()
        result = instance.present()
        self.assertEqual(result, None)

    def test_absent(self):
        instance = lineinfile.Lineinfile()
        result = instance.absent()
        self.assertEqual(result, None)

    def test_backup_local(self):
        instance = lineinfile()
        result = instance.backup_local()
        self.assertEqual(result, None)

    def test_write_changes(self):
        instance = lineinfile.Lineinfile()
        result = instance.write_changes()
        self.assertEqual(result, None)

    def test_check_file_attrs(self):
        instance = Lineinfile()
        result = instance.check_file_attrs()
        self.assertEqual(result, None)

    def test_main(self):
        instance = lineinfile()
        result = instance.main()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()