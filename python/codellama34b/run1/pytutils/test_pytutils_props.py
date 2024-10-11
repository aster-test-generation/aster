import unittest
from pytutils.props import *


class Testroclassproperty(unittest.TestCase):
    def test_roclassproperty(self):
        instance = roclassproperty(lambda x: x)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 2)

class Testclassproperty(unittest.TestCase):
    def test_classproperty(self):
        instance = classproperty(lambda cls: cls())
        result = instance.__get__(1, 2)
        self.assertEqual(result, 2)

class Testsetterproperty(unittest.TestCase):
    def test_setterproperty(self):
        instance = setterproperty(func)
        result = instance.__set__(1, 2)
        self.assertEqual(result, 2)

class Testlazyperclassproperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        instance = lazyperclassproperty(lambda cls: cls())
        result = instance.__get__(1, 2)
        self.assertEqual(result, 2)

class Testlazyclassproperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        instance = lazyclassproperty()
        result = instance.__get__(1, 2)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()