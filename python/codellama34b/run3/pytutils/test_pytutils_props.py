import unittest
from pytutils.props import *


class Testroclassproperty(unittest.TestCase):
    def test_roclassproperty(self):
        def func(x):
            return x + 1
        instance = roclassproperty(func)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 3)

class Testclassproperty(unittest.TestCase):
    def test_classproperty(self):
        def func(x):
            return x + 1
        instance = classproperty(func)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 3)

class Testsetterproperty(unittest.TestCase):
    def test_setterproperty(self):
        def func(x, y):
            return x + y
        instance = setterproperty(func)
        result = instance.__set__(1, 2)
        self.assertEqual(result, 3)

class Testlazyperclassproperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        def func(x):
            return x + 1
        instance = lazyperclassproperty(func)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 3)

class Testlazyclassproperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        def func(x):
            return x + 1
        instance = lazyclassproperty(func)
        result = instance.__get__(1, 2)
        self.assertEqual(result, 3)

if __name__ == '__main__':
    unittest.main()