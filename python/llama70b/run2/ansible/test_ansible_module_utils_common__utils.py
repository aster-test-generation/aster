import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestUtils(unittest.TestCase):
    def test_get_all_subclasses(self):
        class ParentClass: pass
        class ChildClass(ParentClass): pass
        class GrandChildClass(ChildClass): pass
        result = get_all_subclasses(ParentClass)
        self.assertEqual(result, {ChildClass, GrandChildClass})

    def test_get_all_subclasses_single_level(self):
        class ParentClass: pass
        class ChildClass(ParentClass): pass
        result = get_all_subclasses(ParentClass)
        self.assertEqual(result, {ChildClass})

    def test_get_all_subclasses_no_subclasses(self):
        class ParentClass: pass
        result = get_all_subclasses(ParentClass)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()