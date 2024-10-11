import unittest
from ansible.modules.replace import AnsibleModule, write_changes


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsNotNone(instance._module_args)

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
        result = instance.run_command(['echo', 'hello'])
        self.assertEqual(result, (0, 'hello\n', ''))

    def test_fail_json(self):
        instance = AnsibleModule()
        with self.assertRaises(SystemExit):
            instance.fail_json(msg='test error')

class TestWriteChanges(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule()
        contents = b'test contents'
        path = '/tmp/test_file'
        write_changes(module, contents, path)
        with open(path, 'rb') as f:
            result = f.read()
        self.assertEqual(result, contents)

if __name__ == '__main__':
    unittest.main()