import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        result = get_all_subclasses(object)
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 0)

    def test_get_all_subclasses_with_subclass(self):
        class A:
            pass

        class B(A):
            pass

        result = get_all_subclasses(A)
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 1)
        self.assertIn(B, result)

    def test_get_all_subclasses_with_multiple_subclasses(self):
        class A:
            pass

        class B(A):
            pass

        class C(A):
            pass

        class D(B):
            pass

        result = get_all_subclasses(A)
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 3)
        self.assertIn(B, result)
        self.assertIn(C, result)
        self.assertIn(D, result)

    def test_get_all_subclasses_with_private_method(self):
        class A:
            def __private_method(self):
                pass

        result = get_all_subclasses(A)
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 0)

    def test_get_all_subclasses_with_protected_method(self):
        class A:
            def _protected_method(self):
                pass

        result = get_all_subclasses(A)
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 0)

    def test_get_all_subclasses_with_magic_method(self):
        class A:
            def __init__(self):
                pass

        result = get_all_subclasses(A)
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 0)

if __name__ == '__main__':
    unittest.main()