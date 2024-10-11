import unittest
from ansible.utils.helpers import *

class TestHelpers(unittest.TestCase):
    def test_pct_to_int(self):
        self.assertEqual(pct_to_int(100, 10), 100)
        self.assertEqual(pct_to_int('50%', 10), 5)
        self.assertEqual(pct_to_int('0%', 10), 1)
        self.assertEqual(pct_to_int('101%', 10), 10)
        self.assertEqual(pct_to_int('101', 10), 101)

    def test_object_to_dict(self):
        class TestObj:
            def __init__(self, a, b, c):
                self.a = a
                self.b = b
                self.c = c

        obj = TestObj(1, 2, 3)
        self.assertEqual(object_to_dict(obj), {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(object_to_dict(obj, exclude=['a', 'c']), {'b': 2})

    def test_deduplicate_list(self):
        self.assertEqual(deduplicate_list([1, 2, 3, 2, 1]), [1, 2, 3])
        self.assertEqual(deduplicate_list(['a', 'b', 'c', 'b', 'a']), ['a', 'b', 'c'])
        self.assertEqual(deduplicate_list([1, 2, 3, 2, 1]), [1, 2, 3])
        self.assertEqual(deduplicate_list([1, 2, 3, 2, 1]), [1, 2, 3])

if __name__ == '__main__':
    unittest.main()