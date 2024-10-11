import unittest
import yaml


class TestFilterModule(unittest.TestCase):
    def test_init(self):
        instance = FilterModule()
        self.assertIsInstance(instance, FilterModule)

    def test_filters(self):
        instance = FilterModule()
        filters = instance.filters()
        self.assertIsInstance(filters, dict)
        self.assertEqual(len(filters), 43)  # 43 filters in total

    def test_private_method(self):
        instance = FilterModule()
        result = instance._FilterModule__private_method()  # no private methods in FilterModule
        self.fail("No private methods in FilterModule")

    def test_protected_method(self):
        instance = FilterModule()
        result = instance._filters()  # no protected methods in FilterModule
        self.fail("No protected methods in FilterModule")

    def test_str_method(self):
        instance = FilterModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = FilterModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestFunctions(unittest.TestCase):
    def test_do_groupby(self):
        result = do_groupby([1, 2, 3], 'key')
        self.assertIsInstance(result, list)

    def test_b64decode(self):
        result = b64decode('SGVsbG8gd29ybGQh')
        self.assertEqual(result, b'Hello world!')

    def test_b64encode(self):
        result = b64encode(b'Hello world!')
        self.assertEqual(result, b'SGVsbG8gd29ybGQh')

    def test_to_uuid(self):
        result = to_uuid('hello')
        self.assertIsInstance(result, uuid.UUID)

    def test_to_json(self):
        result = to_json({'a': 1, 'b': 2})
        self.assertIsInstance(result, str)

    def test_to_nice_json(self):
        result = to_nice_json({'a': 1, 'b': 2})
        self.assertIsInstance(result, str)

    def test_from_yaml(self):
        result = from_yaml('a: 1\nb: 2')
        self.assertIsInstance(result, dict)

    def test_from_yaml_all(self):
        result = from_yaml_all('a: 1\nb: 2\n---\nc: 3\nd: 4')
        self.assertIsInstance(result, list)

    def test_basename(self):
        result = basename('/path/to/file.txt')
        self.assertEqual(result, 'file.txt')

    def test_dirname(self):
        result = dirname('/path/to/file.txt')
        self.assertEqual(result, '/path/to')

    def test_expanduser(self):
        result = expanduser('~')
        self.assertIsInstance(result, str)

    def test_expandvars(self):
        result = expandvars('$PATH')
        self.assertIsInstance(result, str)

    def test_path_join(self):
        result = path_join('/path', 'to', 'file.txt')
        self.assertEqual(result, '/path/to/file.txt')

    def test_realpath(self):
        result = realpath('/path/to/file.txt')
        self.assertIsInstance(result, str)

    def test_relpath(self):
        result = relpath('/path/to/file.txt', '/path/to')
        self.assertEqual(result, 'file.txt')

    def test_splitext(self):
        result = splitext('/path/to/file.txt')
        self.assertEqual(result, ('/path/to/file', '.txt'))

    def test_win_basename(self):
        result = win_basename('C:\\path\\to\\file.txt')
        self.assertEqual(result, 'file.txt')

    def test_win_dirname(self):
        result = win_dirname('C:\\path\\to\\file.txt')
        self.assertEqual(result, 'C:\\path\\to')

    def test_win_splitdrive(self):
        result = win_splitdrive('C:\\path\\to\\file.txt')
        self.assertEqual(result, ('C:', '\\path\\to\\file.txt'))

    def test_fileglob(self):
        result = fileglob('/path/to/*.txt')
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()