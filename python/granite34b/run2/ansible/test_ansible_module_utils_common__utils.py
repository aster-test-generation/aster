import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        class MyClass:
            pass
        class MySubClass(MyClass):
            pass
        class MySubSubClass(MySubClass):
            pass
        subclasses = get_all_subclasses(MyClass)
        self.assertIn(MySubClass, subclasses)
        self.assertIn(MySubSubClass, subclasses)

if __name__ == '__main__':
    unittest.main()