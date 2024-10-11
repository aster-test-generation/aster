import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        class A(object):
            pass
        class B(A):
            pass
        class C(A):
            pass
        class D(B):
            pass
        class E(C):
            pass
        subclasses = get_all_subclasses(A)
        self.assertEqual(subclasses, {B, C, D, E})

if __name__ == '__main__':
    unittest.main()