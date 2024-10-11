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
        result = self.filter_module.filters()['groupby']('Hello World!')
        self.assertEqual(result, 'SGVsbG8gV29ybGQh')

    def test_to_uuid(self):
        result = self.filter_module.filters()['do_groupby']('my-uuid')
        self.assertEqual(result, '361e6d51-faec-444a-9079-341386da8e2e')

    def test_to_json(self):
        result = self.filter_module.filters()['do_groupby']({'key': 'value'})
        self.assertEqual(result, '{"key": "value"}')

    def test_to_nice_json(self):
        result = self.filter_module.filters()['do_groupby']({'key': 'value'})
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_from_json(self):
        result = self.filter_module.filters()['do_groupby']('{"key": "value"}')
        self.assertEqual(result, {'key': 'value'})

    def test_to_yaml(self):
        result = self.filter_module.filters()['do_groupby']('item1', 'item2')
        self.assertEqual(result, '- item1\n- item2\n')

    def test_to_nice_yaml(self):
        result = self.filter_module.filters()['do_groupby'](['item1', 'item2'])
        self.assertEqual(result, '[item1, item2]\n')

    def test_from_yaml(self):
        result = self.filter_module.filters()['from_yaml']('- item1\n- item2\n')
        self.assertEqual(result, ['item1', 'item2'])

    def test_from_yaml_all(self):
        result = self.filter_module.filters()['from_yaml_all']('- item1\n- item2\n---\n- item3\n- item4\n')
        self.assertEqual(result, [['item1', 'item2'], ['item3', 'item4']])

    def test_basename(self):
        result = self.filter_module.filters()['groupby']('/path/to/file.txt')
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
        result = self.filter_module.filters()['do_groupby']('/path/to', 'file.txt')
        self.assertEqual(result, '/path/to/file.txt')

    def test_realpath(self):
        result = self.filter_module.filters()['do_groupby']('key', 'list')
        self.assertEqual(result, '/path/to/file.txt')

    def test_relpath(self):
        result = self.filter_module.filters()['relpath']('/path/to/file.txt', '/path/to')
        self.assertEqual(result, 'file.txt')

if __name__ == '__main__':
    unittest.main()