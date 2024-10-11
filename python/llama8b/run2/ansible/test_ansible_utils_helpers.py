import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestAnsibleHelpers(unittest.TestCase):
    def test_pct_to_int(self):
        result = pct_to_int("50%", 100)
        self.assertEqual(result, 50)
        result = pct_to_int(50, 100)
        self.assertEqual(result, 50)
        result = pct_to_int("100%", 100)
        self.assertEqual(result, 100)
        result = pct_to_int("200%", 100)
        self.assertEqual(result, 200)
        result = pct_to_int("abc", 100)
        self.assertEqual(result, 1)
        result = pct_to_int(200, 100)
        self.assertEqual(result, 200)

    def test_object_to_dict(self):
        class TestClass:
            def __init__(self, a, b):
                self.a = a
                self.b = b

        obj = TestClass(1, 2)
        result = object_to_dict(obj)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_deduplicate_list(self):
        original_list = [1, 2, 2, 3, 4, 4, 5]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1, 2, 3, 4, 5])

if __name__ == '__main__':
    unittest.main()