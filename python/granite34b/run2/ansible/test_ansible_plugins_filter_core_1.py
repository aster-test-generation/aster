import unittest
from ansible.plugins.filter.core import FilterModule


class TestFilterModule(unittest.TestCase):
    def setUp(self):
        self.filter_module = FilterModule()

    def test_groupby(self):
        result = self.filter_module.filters()['groupby']([1, 2, 3, 4, 5], 2)
        self.assertEqual(result, [[1, 2], [3, 4], [5]])

    def test_b64decode(self):
        result = self.filter_module.filters()['do_groupby']('SGVsbG8gV29ybGQh')
        self.assertEqual(result, 'Hello World!')

    def test_b64encode(self):
        result = self.filter_module.filters()['do_groupby']('Hello World!')
        self.assertEqual(result, 'SGVsbG8gV29ybGQh')

    def test_to_uuid(self):
        result = self.filter_module.filters()['do_groupby']('my_string')
        self.assertEqual(result, '361e6d51-faec-444a-9079-341386da8e2e')

    def test_to_json(self):
        result = self.filter_module.filters()['do_groupby']([1, 2, 3])
        self.assertEqual(result, '[1, 2, 3]')

    def test_to_nice_json(self):
        result = self.filter_module.filters()['do_groupby']([1, 2, 3])
        self.assertEqual(result, '[\n    1,\n    2,\n    3\n]')

    def test_from_json(self):
        result = self.filter_module.filters()['do_groupby']('[1, 2, 3]')
        self.assertEqual(result, [1, 2, 3])

    def test_to_yaml(self):
        result = self.filter_module.filters()['do_groupby']([1, 2, 3])
        self.assertEqual(result, '[1, 2, 3]\n')

    def test_to_nice_yaml(self):
        result = self.filter_module.filters()['do_groupby']([1, 2, 3])
        self.assertEqual(result, '[\n    1,\n    2,\n    3\n]\n')

    def test_from_yaml(self):
        result = self.filter_module.filters()['do_groupby']('[1, 2, 3]\n')
        self.assertEqual(result, [1, 2, 3])

    def test_from_yaml_all(self):
        result = self.filter_module.filters()['from_yaml_all']('[1, 2, 3]\n---\n[4, 5, 6]\n')
        self.assertEqual(result, [[1, 2, 3], [4, 5, 6]])

    def test_basename(self):
        result = self.filter_module.filters()['do_groupby']('/path/to/file.txt')
        self.assertEqual(result, 'file.txt')

    def test_dirname(self):
        result = self.filter_module.filters()['dirname']('/path/to/file.txt')
        self.assertEqual(result, '/path/to')

    def test_expanduser(self):
        result = self.filter_module.filters()['do_groupby']('~/path/to/file.txt')
        self.assertEqual(result, '/home/user/path/to/file.txt')

    def test_expandvars(self):
        result = self.filter_module.filters()['do_groupby']('key', 'list')
        self.assertEqual(result, '/home/user/path/to/file.txt')

    def test_path_join(self):
        def test_path_join(self):
        self.assertEqual(result, '/path/to/file.txt')

    def test_realpath(self):
        result = self.filter_module.filters()['do_groupby']('key', 'list')
        self.assertEqual(result, '/path/to/file.txt')

if __name__ == '__main__':
    unittest.main()