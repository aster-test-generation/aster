import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        result = get_all_subclasses(object)
        self.assertIsInstance(result, set)

    def test_get_all_subclasses_empty(self):
        result = get_all_subclasses(int)
        self.assertEqual(result, set())

    def test_get_all_subclasses_single_subclass(self):
        class A:
            pass

        class B(A):
            pass

        result = get_all_subclasses(A)
        self.assertEqual(result, {B})

    def test_get_all_subclasses_multiple_subclasses(self):
        class A:
            pass

        class B(A):
            pass

        class C(A):
            pass

        class D(B):
            pass

        result = get_all_subclasses(A)
        self.assertEqual(result, {B, C, D})

    def test_get_all_subclasses_recursive(self):
        class A:
            pass

        class B(A):
            pass

        class C(B):
            pass

        class D(C):
            pass

        result = get_all_subclasses(A)
        self.assertEqual(result, {B, C, D})

    def test_get_all_subclasses_private_method(self):
        class A:
            def __private_method(self):
                pass

        result = get_all_subclasses(A)
        self.assertEqual(result, set())

    def test_get_all_subclasses_protected_method(self):
        class A:
            def _protected_method(self):
                pass

        result = get_all_subclasses(A)
        self.assertEqual(result, set())

    def test_get_all_subclasses_magic_method(self):
        class A:
            def __init__(self):
                pass

        result = get_all_subclasses(A)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()