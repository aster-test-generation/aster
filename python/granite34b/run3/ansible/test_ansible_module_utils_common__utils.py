import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        class A:
            pass

        class B(A):
            pass

        class C(A):
            pass

        class D(B, C):
            pass

        class E(D):
            pass

        class F(D):
            pass

        expected_subclasses = {B, C, D, E, F}
        actual_subclasses = get_all_subclasses(A)
        self.assertEqual(expected_subclasses, actual_subclasses)

if __name__ == '__main__':
    unittest.main()