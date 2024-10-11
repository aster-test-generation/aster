import unittest
from ansible.modules.lineinfile import *


class TestLineInFile(unittest.TestCase):
    def test_absent(self):
        instance = LineInFile()
        result = instance.absent(dest, regexp, search_string, line, backup)
        self.assertEqual(result, (changed, msg, backupdest, difflist))

    def test_present(self):
        instance = LineInFile(None, None)
        result = instance.present(dest, regexp, search_string, line, backup)
        self.assertEqual(result, (changed, msg, backupdest, difflist))

    def test_backup_local(self):
        instance = LineInFile()
        result = instance.backup_local(dest)
        self.assertEqual(result, backupdest)

    def test_write_changes(self):
        instance = LineInFile()
        result = instance.write_changes(b_lines, dest)
        self.assertEqual(result, None)

    def test_check_file_attrs(self):
        instance = LineInFile()
        result = instance.check_file_attrs(changed, msg, attr_diff)
        self.assertEqual(result, (changed, msg))

if __name__ == '__main__':
    unittest.main()