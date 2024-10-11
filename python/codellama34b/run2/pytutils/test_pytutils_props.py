import unittest
from pytutils.props import *


class Testroclassproperty(unittest.TestCase):
    def test_roclassproperty(self):
        instance = roclassproperty(lambda x: x)
        self.assertEqual(instance.f, None)

    def test___get__(self):
        instance = roclassproperty(lambda x: x)
        result = instance.__get__(None, None)
        self.assertEqual(result, None)

class Testclassproperty(unittest.TestCase):
    def test_classproperty(self):
        instance = classproperty(lambda cls: cls())
        self.assertEqual(instance.f, None)

    def test___get__(self):
        instance = classproperty(lambda cls: cls())
        result = instance.__get__(None, None)
        self.assertEqual(result, None)

class Testsetterproperty(unittest.TestCase):
    def test_setterproperty(self):
        instance = setterproperty()
        self.assertEqual(instance.func, None)

    def test___set__(self):
        instance = setterproperty()
        result = instance.__set__(None, None)
        self.assertEqual(result, None)

class Testlazyperclassproperty(unittest.TestCase):
    def test_lazyperclassproperty(self):
        instance = lazyperclassproperty()
        self.assertEqual(instance.fn, None)

    def test___get__(self):
        instance = lazyperclassproperty()
        result = instance.__get__(None, None)
        self.assertEqual(result, None)

class Testlazyclassproperty(unittest.TestCase):
    def test_lazyclassproperty(self):
        instance = lazyclassproperty()
        self.assertEqual(instance.fn, None)

    def test___get__(self):
        instance = lazyclassproperty()
        result = instance.__get__(None, None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()