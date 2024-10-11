import unittest
from ansible.module_utils.common.yaml import FilterModule


class TestFilterModule(unittest.TestCase):
    def setUp(self):
        self.filter = FilterModule()

    def test_groupby(self):
        self.assertEqual(self.filter.filters()['groupby']([1, 2, 3, 4, 5], key=lambda x: x % 2), [(0, [1, 3, 5]), (1, [2, 4])])

    def test_b64decode(self):
        self.assertEqual(self.filter.filters()['b64decode']('SGVsbG8gV29ybGQh'), b'Hello World!')

    def test_b64encode(self):
        self.assertEqual(self.filter.filters()['b64encode']('Hello World!'), b'SGVsbG8gV29ybGQh')

    def test_to_uuid(self):
        self.assertEqual(self.filter.filters()['to_uuid']('Hello World!'), '361e6d51-faec-444a-9079-341386da8e2e')

    def test_to_json(self):
        self.assertEqual(self.filter.filters()['to_json']({'a': 1, 'b': 2}), '{"a": 1, "b": 2}')

    def test_to_nice_json(self):
        self.assertEqual(self.filter.filters()['to_nice_json']({'a': 1, 'b': 2}), '{\n    "a": 1,\n    "b": 2\n}')

    def test_from_json(self):
        self.assertEqual(self.filter.filters()['from_json']('{"a": 1, "b": 2}'), {'a': 1, 'b': 2})

    def test_to_yaml(self):
        self.assertEqual(self.filter.filters()['to_yaml']({'a': 1, 'b': 2}), 'a: 1\nb: 2\n')

    def test_to_nice_yaml(self):
        self.assertEqual(self.filter.filters()['to_nice_yaml']({'a': 1, 'b': 2}), 'a: 1\nb: 2\n')

    def test_from_yaml(self):
        self.assertEqual(self.filter.filters()['from_yaml']('a: 1\nb: 2\n'), {'a': 1, 'b': 2})

    def test_from_yaml_all(self):
        self.assertEqual(self.filter.filters()['from_yaml_all']('a: 1\nb: 2\n'), [{'a': 1, 'b': 2}])

    def test_basename(self):
        self.assertEqual(self.filter.filters()['basename']('/path/to/file'), 'file')

    def test_dirname(self):
        self.assertEqual(self.filter.filters()['dirname']('/path/to/file'), '/path/to')

    def test_expanduser(self):
        self.assertEqual(self.filter.filters()['expanduser']('~/file'), '/home/user/file')

    def test_expandvars(self):
        self.assertEqual(self.filter.filters()['expandvars']('$HOME/file'), '/home/user/file')

    def test_path_join(self):
        self.assertEqual(self.filter.filters()['path_join']('/path/to', 'file'), '/path/to/file')

    def test_realpath(self):
        self.assertEqual(self.filter.filters()['realpath']('/path/to/file'), '/path/to/file')

    def test_relpath(self):
        self.assertEqual(self.filter.filters()['relpath']('/path/to/file', '/path/to'), 'file')

    def test_splitext(self):
        self.assertEqual(self.filter.filters()['splitext']('/path/to/file.txt'), ('/path/to/file', '.txt'))

    def test_win_basename(self):
        self.assertEqual(self.filter.filters()['win_basename']('C:\\path\\to\\file'), 'file')

    def test_win_dirname(self):
        self.assertEqual(self.filter.filters()['win_dirname']('C:\\path\\to\\file'), 'C:\\path\\to')

if __name__ == '__main__':
    unittest.main()