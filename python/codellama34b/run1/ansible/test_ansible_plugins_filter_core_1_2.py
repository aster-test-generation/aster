import unittest
from ansible.plugins.filter.yaml import *


class TestMandatory(unittest.TestCase):
    def test_mandatory(self):
        result = mandatory(1)
        self.assertEqual(result, 1)

class TestCombine(unittest.TestCase):
    def test_combine(self):
        result = combine({'a': 1}, {'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

class TestComment(unittest.TestCase):
    def test_comment(self):
        result = comment('test')
        self.assertEqual(result, 'test')

class TestExtract(unittest.TestCase):
    def test_extract(self):
        result = extract({'a': 1}, 'a')
        self.assertEqual(result, 1)

class TestDoGroupby(unittest.TestCase):
    def test_do_groupby(self):
        result = do_groupby({'a': 1}, 'a')
        self.assertEqual(result, [('a', 1)])

class TestB64encode(unittest.TestCase):
    def test_b64encode(self):
        result = b64encode('test')
        self.assertEqual(result, 'dGVzdA==')

class TestB64decode(unittest.TestCase):
    def test_b64decode(self):
        result = b64decode('dGVzdA==')
        self.assertEqual(result, 'test')

class TestFlatten(unittest.TestCase):
    def test_flatten(self):
        result = flatten([1, [2, 3]])
        self.assertEqual(result, [1, 2, 3])

class TestSubelements(unittest.TestCase):
    def test_subelements(self):
        result = subelements({'a': 1}, 'a')
        self.assertEqual(result, [({'a': 1}, 1)])

if __name__ == '__main__':
    unittest.main()