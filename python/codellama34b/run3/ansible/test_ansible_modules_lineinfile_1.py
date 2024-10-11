import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_lineinfile(self):
        instance = lineinfile()
        result = instance.lineinfile()
        self.assertEqual(result, None)

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

    def test_do_backup(self):
        instance = lineinfile.Lineinfile()
        result = instance.do_backup()
        self.assertEqual(result, None)

    def test_create_backup(self):
        instance = lineinfile.Lineinfile()
        result = instance.create_backup()
        self.assertEqual(result, None)

    def test_get_backup_path(self):
        instance = lineinfile()
        result = instance.get_backup_path()
        self.assertEqual(result, None)

    def test_get_diff_data(self):
        instance = lineinfile()
        result = instance.get_diff_data()
        self.assertEqual(result, None)

    def test_diff_lines(self):
        instance = lineinfile.Lineinfile()
        result = instance.diff_lines()
        self.assertEqual(result, None)

    def test_diff_report(self):
        instance = lineinfile.Lineinfile()
        result = instance.diff_report()
        self.assertEqual(result, None)

    def test_get_diff(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff()
        self.assertEqual(result, None)

    def test_get_diff_text(self):
        instance = lineinfile()
        result = instance.get_diff_text()
        self.assertEqual(result, None)

    def test_get_diff_match_outcome(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff_match_outcome()
        self.assertEqual(result, None)

    def test_get_diff_match_replace(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff_match_replace()
        self.assertEqual(result, None)

    def test_get_diff_match_replace_backrefs(self):
        instance = lineinfile()
        result = instance.get_diff_match_replace_backrefs()
        self.assertEqual(result, None)

    def test_get_diff_match_replace_regexp(self):
        instance = lineinfile()
        result = instance.get_diff_match_replace_regexp()
        self.assertEqual(result, None)

    def test_get_diff_match_replace_regexp_backrefs(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff_match_replace_regexp_backrefs()
        self.assertEqual(result, None)

    def test_get_diff_match_replace_regexp_backrefs_insertafter(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff_match_replace_regexp_backrefs_insertafter()
        self.assertEqual(result, None)

    def test_get_diff_match_replace_regexp_backrefs_insertbefore(self):
        instance = lineinfile.Lineinfile()
        result = instance.get_diff_match_replace_regexp_backrefs_insertbefore()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()