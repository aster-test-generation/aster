import unittest
from ansible.modules.replace import AnsibleModule, write_changes


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test___str__(self):
        instance = AnsibleModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AnsibleModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_run_command(self):
        instance = AnsibleModule()
        result = instance.run_command('echo hello')
        self.assertIsInstance(result, tuple)

    def test_fail_json(self):
        instance = AnsibleModule()
        with self.assertRaises(SystemExit):
            instance.fail_json(msg='test error')

    def test_atomic_move(self):
        instance = AnsibleModule()
        tmpfile = '/tmp/testfile'
        path = '/tmp/destination'
        instance.atomic_move(tmpfile, path, unsafe_writes=True)
        self.assertTrue(os.path.exists(path))

class TestWriteChanges(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule()
        contents = b'test contents'
        path = '/tmp/testfile'
        write_changes(module, contents, path)
        self.assertTrue(os.path.exists(path))

if __name__ == '__main__':
    unittest.main()