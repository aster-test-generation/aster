import unittest
from youtube_dl.extractor.heise import HeiseIE


class TestHeiseIE(unittest.TestCase):
    def test_private_method(self):
        instance = HeiseIE()
        result = instance._HeiseIE__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = HeiseIE()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_str_method(self):
        instance = HeiseIE()
        result = instance.__str__()
        self.assertEqual(result.IE_NAME, "HeiseIE")

    def test_repr_method(self):
        instance = HeiseIE()
        result = instance.__repr__()
        self.assertEqual(str(result), "HeiseIE(1)")

    def test_eq_method(self):
        instance1 = HeiseIE()
        instance2 = HeiseIE()
        self.assertEqual(instance1.__class__, instance2.__class__)

if __name__ == '__main__':
    unittest.main()