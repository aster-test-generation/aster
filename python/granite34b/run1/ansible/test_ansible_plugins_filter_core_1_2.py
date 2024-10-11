import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_mandatory(self):
        self.assertEqual(mandatory(1), 1)
        with self.assertRaises(AnsibleFilterError):
            mandatory(AnsibleUndefined())

    def test_combine(self):
        self.assertEqual(combine({'a': 1}, {'b': 2}), {'a': 1, 'b': 2})
        self.assertEqual(combine({'a': 1}, {'a': 2}), {'a': 2})
        self.assertEqual(combine({'a': 1}, {'a': 2}, recursive=True), {'a': 2})
        self.assertEqual(combine({'a': [1, 2]}, {'a': [3, 4]}, list_merge='append'), {'a': [1, 2, 3, 4]})

    def test_comment(self):
        self.assertEqual(comment('This is a test'), '# This is a test')
        self.assertEqual(comment('This is a test', decoration='**'), '** This is a test')
        self.assertEqual(comment('This is a test', style='plain', decoration='**'), '** This is a test')
        self.assertEqual(comment('This is a test', style='plain', decoration='**', prefix='--', prefix_count=2), '-- This is a test')

    def test_extract(self):
        self.assertEqual(extract({}, 'a', {'a': 1}), {'a': 1})
        self.assertEqual(extract({}, 'a', {'b': 1}), 1)
        self.assertEqual(extract({}, 'a', {'a': 1, 'b': 2}, 'c'), 1)
        self.assertEqual(extract({}, 'a', {'a': 1, 'b': 2}, 'c'), 1)

    def test_groupby(self):
        self.assertEqual(do_groupby({}, [{'a': 1}, {'a': 2}], 'a'), {(1, [{'a': 1}]), (2, [{'a': 2}])})
        self.assertEqual(do_groupby({}, [{'a': 1}, {'a': 2}], 'b'), [(1, [{'a': 1}]), (2, [{'a': 2}])])

    def test_b64encode(self):
        self.assertEqual(b64encode('test'), 'dGVzdA==')
        self.assertEqual(b64encode('test', encoding='ascii'), 'dGVzdA==')

    def test_b64decode(self):
        self.assertEqual(b64decode('dGVzdA=='), 'test')
        self.assertEqual(b64decode('dGVzdA==', encoding='ascii'), 'test')

    def test_flatten(self):
        self.assertEqual(flatten([1, 2, 3]), [1, 2, 3])
        self.assertEqual(flatten([[1, 2], [3, 4]]), [1, 2, 3, 4])
        self.assertEqual(flatten([[1, 2], [3, [4, 5]]]), [1, 2, 3, 4, 5])
        self.assertEqual(flatten([[1, 2], [3, [4, 5]]], levels=1), [1, 2, 3, [4, 5]])

    def test_subelements(self):
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], 'a'), [1, 2, 3, 4])
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], ['a']), [(1, 1), (1, 2), (2, 3), (2, 4)])
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], 'a', skip_missing=True), [(1, 1), (1, 2), (2, 3), (2, 4)])
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], ['a'], skip_missing=True), [(1, 1), (1, 2), (2, 3), (2, 4)])

if __name__ == '__main__':
    unittest.main()