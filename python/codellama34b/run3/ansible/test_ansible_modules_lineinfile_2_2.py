import unittest
from ansible.modules.lineinfile import *


class TestLineinfile(unittest.TestCase):
    def test_present(self):
        instance = lineinfile.Lineinfile()
        result = instance.present(dest, regexp, search_string, line, insertafter, insertbefore, create, backup, backrefs, firstmatch)
        self.assertEqual(result, None)

    def test_write_changes(self):
        instance = lineinfile.Lineinfile()
        result = instance.write_changes(module, b_lines, dest)
        self.assertEqual(result, None)

    def test_check_file_attrs(self):
        instance = lineinfile.Lineinfile()
        result = instance.check_file_attrs(module, changed, msg, attr_diff)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()