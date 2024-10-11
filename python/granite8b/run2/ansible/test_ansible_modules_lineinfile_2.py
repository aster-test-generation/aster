import unittest
from ansible.modules.lineinfile import LineinfileModule


class TestLineinfileModule(unittest.TestCase):
    def test_write_changes(self):
        module = LineinfileModule()
        b_lines = [b'line1\n', b'line2\n', b'line3\n']
        dest = '/tmp/test.txt'
        module.write_changes(b_lines, dest)
        with open(dest, 'r') as f:
            lines = f.readlines()
        self.assertEqual(lines, ['line1\n', 'line2\n', 'line3\n'])

if __name__ == '__main__':
    unittest.main()