import uuid
import unittest
from ansible.module_utils._text import to_native


class TestFilterModule(unittest.TestCase):
    def test___init__(self):
        instance = FilterModule()
        self.assertIsInstance(instance, FilterModule)

    def test_filters(self):
        instance = FilterModule()
        filters = instance.filters()
        self.assertIsInstance(filters, dict)
        self.assertGreater(len(filters), 0)

    def test___str__(self):
        instance = FilterModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = FilterModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_b64decode(self):
        instance = FilterModule()
        result = instance.filters()['b64decode']('SGVsbG8gd29ybGQh')
        self.assertEqual(result, b'Hello world!')

    def test_b64encode(self):
        instance = FilterModule()
        result = instance.filters()['b64encode'](b'Hello world!')
        self.assertEqual(result, b'SGVsbG8gd29ybGQh')

    def test_to_uuid(self):
        instance = FilterModule()
        result = instance.filters()['to_uuid']('361E6D51-FAEC-444A-9079-341386DA8E2E')
        self.assertIsInstance(result, uuid.UUID)

    def test_to_json(self):
        instance = FilterModule()
        result = instance.filters()['to_json']({'a': 1, 'b': 2})
        self.assertIsInstance(result, str)

    def test_to_nice_json(self):
        instance = FilterModule()
        result = instance.filters()['to_nice_json']({'a': 1, 'b': 2})
        self.assertIsInstance(result, str)

    def test_from_json(self):
        instance = FilterModule()
        result = instance.filters()['from_json']('{"a": 1, "b": 2}')
        self.assertIsInstance(result, dict)

    def test_to_yaml(self):
        instance = FilterModule()
        result = instance.filters()['to_yaml']({'a': 1, 'b': 2})
        self.assertIsInstance(result, str)

    def test_to_nice_yaml(self):
        instance = FilterModule()
        result = instance.filters()['to_nice_yaml']({'a': 1, 'b': 2})
        self.assertIsInstance(result, str)

    def test_from_yaml(self):
        instance = FilterModule()
        result = instance.filters()['from_yaml']('a: 1\nb: 2')
        self.assertIsInstance(result, dict)

    def test_from_yaml_all(self):
        instance = FilterModule()
        result = instance.filters()['from_yaml_all']('a: 1\nb: 2\n---\nc: 3\nd: 4')
        self.assertIsInstance(result, list)

    def test_basename(self):
        instance = FilterModule()
        result = instance.filters()['basename']('/path/to/file.txt')
        self.assertEqual(result, 'file.txt')

    def test_dirname(self):
        instance = FilterModule()
        result = instance.filters()['dirname']('/path/to/file.txt')
        self.assertEqual(result, '/path/to')

    def test_expanduser(self):
        instance = FilterModule()
        result = instance.filters()['expanduser']('~')
        self.assertIsInstance(result, str)

    def test_expandvars(self):
        instance = FilterModule()
        result = instance.filters()['expandvars']('$PATH')
        self.assertIsInstance(result, str)

    def test_path_join(self):
        instance = FilterModule()
        result = instance.filters()['path_join']('/path', 'to', 'file.txt')
        self.assertEqual(result, '/path/to/file.txt')

    def test_realpath(self):
        instance = FilterModule()
        result = instance.filters()['realpath']('/path/to/file.txt')
        self.assertIsInstance(result, str)

    def test_relpath(self):
        instance = FilterModule()
        result = instance.filters()['relpath']('/path/to/file.txt', '/path/to')
        self.assertEqual(result, 'file.txt')

    def test_splitext(self):
        instance = FilterModule()
        result = instance.filters()['splitext']('/path/to/file.txt')
        self.assertEqual(result, ('/path/to/file', '.txt'))

    def test_win_basename(self):
        instance = FilterModule()
        result = instance.filters()['win_basename']('C:\\path\\to\\file.txt')
        self.assertEqual(result, 'file.txt')

    def test_win_dirname(self):
        instance = FilterModule()
        result = instance.filters()['win_dirname']('C:\\path\\to\\file.txt')
        self.assertEqual(result, 'C:\\path\\to')

if __name__ == '__main__':
    unittest.main()