import unittest
from ansible.modules.replace import *


class TestReplace(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict())
        contents = b"Hello, World!"
        path = "/tmp/test.txt"
        write_changes(module, contents, path)
        self.assertEqual(module.atomic_move(tmpfile, path, unsafe_writes=module.params['unsafe_writes']), None)

if __name__ == '__main__':
    unittest.main()