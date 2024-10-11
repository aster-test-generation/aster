import unittest
from ansible.modules.lineinfile import *


class TestLineinfileModule(unittest.TestCase):
    def test___init__(self):
        from ansible.modules import LineinfileModule
        self.assertIsInstance(module, AnsibleModule)

    def test_write_changes(self):
        from ansible.modules import LineinfileModule
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/file'
        write_changes(module, b_lines, dest)
        # assert that the file was written correctly

    def test_run_command(self):
        from ansible.modules import LineinfileModule
        cmd = 'echo hello'
        rc, out, err = module.run_command(cmd)
        self.assertEqual(rc, 0)
        self.assertEqual(out, b'hello\n')
        self.assertEqual(err, b'')

    def test_atomic_move(self):
        from ansible.modules import LineinfileModule
        tmpfile = '/path/to/tmpfile'
        dest = '/path/to/destfile'
        module.atomic_move(tmpfile, dest)
        # assert that the file was moved correctly

    def test_validate(self):
        from ansible.modules import LineinfileModule
        validate = 'cat %s'
        tmpfile = '/path/to/tmpfile'
        rc, out, err = module.run_command(to_bytes(validate % tmpfile, errors='surrogate_or_strict'))
        self.assertEqual(rc, 0)
        self.assertEqual(out, b'contents of tmpfile\n')
        self.assertEqual(err, b'')

    def test_fail_json(self):
        from ansible.modules import LineinfileModule
        msg = 'test error message'
        with self.assertRaises(SystemExit):
            module.fail_json(msg=msg)

    def test___str__(self):
        from ansible.modules import LineinfileModule
        self.assertEqual(str(module), 'LineinfileModule')

    def test___repr__(self):
        from ansible.modules import LineinfileModule
        self.assertEqual(repr(module), 'LineinfileModule()')

    def test___eq__(self):
        from ansible.modules import LineinfileModule
        module2 = LineinfileModule()
        self.assertEqual(module1, module2)

if __name__ == '__main__':
    unittest.main()