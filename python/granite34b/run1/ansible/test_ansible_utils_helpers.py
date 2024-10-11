import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestHelpers(unittest.TestCase):
    def test_pct_to_int(self):
        self.assertEqual(pct_to_int("50%", 100), 50)
        self.assertEqual(pct_to_int(50, 100), 50)
        self.assertEqual(pct_to_int("0%", 100), 1)
        self.assertEqual(pct_to_int("100%", 100), 100)
        self.assertEqual(pct_to_int("1000%", 100), 100)

    def test_object_to_dict(self):
        class TestClass:
            def __init__(self):
                self.a = 1
                self.b = 2
                self.c = 3
        obj = TestClass()
        self.assertEqual(object_to_dict(obj), {'a': 1, 'b': 2, 'c': 3})
        self.assertEqual(object_to_dict(obj, exclude=['a']), {'b': 2, 'c': 3})

    def test_deduplicate_list(self):
        self.assertEqual(deduplicate_list([1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list([1, 2, 3, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(deduplicate_list([1, 1, 2, 2, 3, 3, 4, 4, 5, 5]), [1, 2, 3, 4, 5])

if __name__ == '__main__':
    unittest.main()