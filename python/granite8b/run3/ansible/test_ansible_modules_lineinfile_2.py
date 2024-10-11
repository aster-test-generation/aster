import unittest
from ansible.modules.lineinfile import Lineinfile


class TestLineinfile(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule()
        b_lines = [b'line1', b'line2', b'line3']
        dest = '/tmp/testfile'
        write_changes(module, b_lines, dest)
        with open(dest, 'r') as f:
            lines = f.readlines()
        self.assertEqual(lines, [b'line1', b'line2', b'line3'])

if __name__ == '__main__':
    unittest.main()