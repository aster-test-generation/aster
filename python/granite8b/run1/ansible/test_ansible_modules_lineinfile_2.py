import unittest
from ansible.modules.lineinfile import Lineinfile


class TestLineinfile(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule(params={'dest': '/tmp/test', 'line': 'test line'})
        b_lines = [b'line 1\n', b'line 2\n', b'line 3\n']
        Lineinfile.write_changes(module, b_lines, '/tmp/test')
        with open('/tmp/test', 'r') as f:
            lines = f.readlines()
        self.assertEqual(lines, [b'test line\n', b'line 2\n', b'line 3\n'])

if __name__ == '__main__':
    unittest.main()