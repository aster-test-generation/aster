import unittest
from ansible.modules.replace import ReplaceModule, DOCUMENTATION, EXAMPLES, RETURN


class TestReplaceModule(unittest.TestCase):
    def test___init__(self):
        instance = ReplaceModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test_run(self):
        instance = ReplaceModule()
        result = instance.run({'path': '/tmp/test', 'regexp': 'old', 'replace': 'new'})
        self.assertIsInstance(result, dict)

    def test__load_params(self):
        instance = ReplaceModule()
        instance._load_params({'path': '/tmp/test', 'regexp': 'old', 'replace': 'new'})
        self.assertEqual(instance.path, '/tmp/test')
        self.assertEqual(instance.regexp, 'old')
        self.assertEqual(instance.replace, 'new')

    def test__validate_params(self):
        instance = ReplaceModule()
        instance._validate_params({'path': '/tmp/test', 'regexp': 'old', 'replace': 'new'})
        self.assertTrue(True)  # no exception raised

    def test__read_file(self):
        instance = ReplaceModule()
        with tempfile.NamedTemporaryFile() as f:
            f.write(b'old content')
            f.flush()
            result = instance._read_file(f.name)
            self.assertEqual(result, 'old content')

    def test__write_file(self):
        instance = ReplaceModule()
        with tempfile.NamedTemporaryFile() as f:
            instance._write_file(f.name, 'new content')
            with open(f.name, 'r') as ff:
                self.assertEqual(ff.read(), 'new content')

    def test__replace(self):
        instance = ReplaceModule()
        result = instance._replace('old content', 'old', 'new')
        self.assertEqual(result, 'new content')

    def test___str__(self):
        instance = ReplaceModule()
        result = instance.__str__()
        self.assertEqual(result, 'replace')

    def test___repr__(self):
        instance = ReplaceModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ReplaceModule()')

class TestDOCUMENTATION(unittest.TestCase):
    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

class TestEXAMPLES(unittest.TestCase):
    def test_EXAMPLES(self):
        self.assertIsInstance(EXAMPLES, str)

class TestRETURN(unittest.TestCase):
    def test_RETURN(self):
        self.assertIsInstance(RETURN, str)

if __name__ == '__main__':
    unittest.main()