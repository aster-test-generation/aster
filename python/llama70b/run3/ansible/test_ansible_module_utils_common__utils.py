import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestUtils(unittest.TestCase):
    def test_get_all_subclasses(self):
        class ParentClass:
            pass

        class ChildClass1(ParentClass):
            pass

        class ChildClass2(ParentClass):
            pass

        class GrandChildClass(ChildClass1):
            pass

        result = get_all_subclasses(ParentClass)
        self.assertEqual(result, {ChildClass1, ChildClass2, GrandChildClass})

if __name__ == '__main__':
    unittest.main()