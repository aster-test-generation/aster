import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestHelpers(unittest.TestCase):
    def test_pct_to_int(self):
        self.assertEqual(pct_to_int(10, 100), 10)
        self.assertEqual(pct_to_int('50%', 100), 50)
        self.assertEqual(pct_to_int('0%', 100), 0)
        self.assertEqual(pct_to_int('101%', 100), 101)
        self.assertEqual(pct_to_int('101', 100), 101)
        self.assertEqual(pct_to_int('101', 100, min_value=0), 101)
        self.assertEqual(pct_to_int('101', 100, min_value=1), 101)
        self.assertEqual(pct_to_int('101', 100, min_value=2), 101)
        self.assertEqual(pct_to_int('101', 100, min_value=3), 101)

    def test_object_to_dict(self):
        class TestObject:
            def __init__(self, a, b, c):
                self.a = a
                self.b = b
                self.c = c

        obj = TestObject(1, 2, 3)
        self.assertEqual(object_to_dict(obj), {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(object_to_dict(obj, exclude=['a', 'c']), {'b': 2})
        self.assertEqual(object_to_dict(obj, exclude=['a', 'b', 'c']), {})

    def test_deduplicate_list(self):
        self.assertEqual(deduplicate_list([1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list([1, 1, 2, 3, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list([1, 1, 1, 2, 3, 3, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list([]), [])
        self.assertEqual(deduplicate_list(None), None)

if __name__ == '__main__':
    unittest.main()