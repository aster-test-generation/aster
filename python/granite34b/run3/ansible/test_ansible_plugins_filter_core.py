import unittest
from ansible.plugins.filter.core import *


class TestCoreFilters(unittest.TestCase):
    def test_mandatory(self):
        self.assertEqual(mandatory(1), 1)
        with self.assertRaises(AnsibleFilterError):
            mandatory(None)

    def test_combine(self):
        self.assertEqual(combine({'a': 1}, {'b': 2}), {'a': 1, 'b': 2})
        self.assertEqual(combine({'a': 1}, {'a': 2}), {'a': 2})
        self.assertEqual(combine({'a': 1}, {'a': 2}, recursive=True), {'a': 2})
        self.assertEqual(combine({'a': 1}, {'a': 2}, list_merge='append'), {'a': [1, 2, 2]})

    def test_comment(self):
        self.assertEqual(comment('This is a comment'), '# This is a comment')
        self.assertEqual(comment('This is a comment', style='plain', decoration='###'), '### This is a comment')

    def test_extract(self):
        self.assertEqual(extract({'a': 1}, 'a', {'a': 1}), 1)
        self.assertEqual(extract({'a': 1}, 'b', {'a': 1}), None)

    def test_groupby(self):
        self.assertEqual(groupby([1, 2, 3], lambda x: x), [(1, 2, 3)])
        self.assertEqual(groupby([1, 2, 3], 'b'), [(1, 2, 3)])

    def test_b64encode(self):
        self.assertEqual(b64encode('Hello, World!'), 'SGVsbG8sIFdvcmxkIQ==')

    def test_b64decode(self):
        self.assertEqual(b64decode('SGVsbG8sIFdvcmxkIQ=='), 'Hello, World!')

    def test_flatten(self):
        self.assertEqual(flatten([1, 2, 3]), [1, 2, 3])
        self.assertEqual(flatten([1, [2, 3], 4]), [1, 2, 3, 4])
        self.assertEqual(flatten([1, [2, [3, 4]], 5]), [1, 2, 3, 4, 5])

    def test_subelements(self):
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], 'a'), [({'a': [1, 2]}, 1), ({'a': [1, 2]}, 2), ({'a': [3, 4]}, 3), ({'a': [3, 4]}, 4)])
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], ['a']), [(1, 2), (3, 4)])
        self.assertEqual(subelements([{'a': [1, 2]}, {'a': [3, 4]}], 'a', skip_missing=True), [(1, 2), (3, 4)])

if __name__ == '__main__':
    unittest.main()