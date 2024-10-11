import unittest
from ansible.modules import lineinfile


class TestLineinfileModule(unittest.TestCase):
    def test_init(self):
        module = lineinfile.LineinfileModule()
        self.assertIsInstance(module, lineinfile.LineinfileModule)

    def test_absent(self):
        module = lineinfile.LineinfileModule()
        dest = '/path/to/file'
        regexp = 'regex_pattern'
        search_string = 'search_string'
        line = 'line_to_remove'
        backup = True
        result = lineinfile.absent(module, dest, regexp, search_string, line, backup)
        self.assertIsInstance(result, dict)

    def test_write_changes(self):
        module = lineinfile.LineinfileModule()
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/file'
        lineinfile.write_changes(module, b_lines, dest)
        # assert that the file has been written

    def test_check_file_attrs(self):
        module = lineinfile.LineinfileModule()
        changed = True
        msg = 'file attributes changed'
        attr_diff = {}
        result = lineinfile.check_file_attrs(module, changed, msg, attr_diff)
        self.assertIsInstance(result, tuple)

    def test__diff(self):
        module = lineinfile.LineinfileModule()
        module._diff = True
        self.assertTrue(module._diff)

    def test_backup_local(self):
        module = lineinfile.LineinfileModule()
        dest = '/path/to/file'
        result = module.backup_local(dest)
        self.assertIsInstance(result, str)

    def test_exit_json(self):
        module = lineinfile.LineinfileModule()
        changed = True
        msg = 'file changed'
        found = 1
        backup = '/path/to/backup'
        diff = {'before': '', 'after': ''}
        module.exit_json(changed=changed, msg=msg, found=found, backup=backup, diff=diff)
        # assert that the module has exited with the correct JSON output

    def test_to_bytes(self):
        result = lineinfile.to_bytes('string', errors='surrogate_or_strict')
        self.assertIsInstance(result, bytes)

    def test_to_native(self):
        result = lineinfile.to_native(b'bytes', errors='surrogate_or_strict')
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()