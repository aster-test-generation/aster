import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestHelpers(unittest.TestCase):
    def test_pct_to_int(self):
        self.assertEqual(pct_to_int('50%', 100), 50)
        self.assertEqual(pct_to_int(50, 100), 50)
        self.assertEqual(pct_to_int('0%', 100), 1)
        self.assertEqual(pct_to_int('100%', 100), 100)
        self.assertEqual(pct_to_int('100.5%', 100), 100.5)
        self.assertEqual(pct_to_int('100.5', 100), 100)
        self.assertEqual(pct_to_int('100.5', 100, min_value=0), 100)
        self.assertEqual(pct_to_int('100.5', 100, min_value=10), 100)

    def test_object_to_dict(self):
        class ExampleClass:
            def __init__(self, x, y):
                self.x = x
                self.y = y
        obj = ExampleClass(1, 2)
        self.assertEqual(object_to_dict(obj), {'x': 1, 'y': 2})
        self.assertEqual(object_to_dict(obj, exclude=['x']), {'y': 2})

    def test_deduplicate_list(self):
        self.assertEqual(deduplicate_list([1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list([1, 1, 2, 2, 3, 3, 4, 4, 5, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list(['a', 'b', 'c', 'd', 'e']), ['a', 'b', 'c', 'd', 'e'])
        self.assertEqual(deduplicate_list(['a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e']), ['a', 'b', 'c', 'd', 'e'])
        self.assertEqual(deduplicate_list([1, 2, 3, 4, 5, 1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list(['a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e']), ['a', 'b', 'c', 'd', 'e'])

if __name__ == '__main__':
    unittest.main()