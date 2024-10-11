import unittest
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        result = get_all_subclasses(object)
        self.assertIsInstance(result, set)
        self.assertTrue(result)

    def test_get_all_subclasses_with_subclass(self):
        class Parent:
            pass

        class Child(Parent):
            pass

        result = get_all_subclasses(Parent)
        self.assertIn(Child, result)

    def test_get_all_subclasses_with_multiple_subclasses(self):
        class Parent:
            pass

        class Child1(Parent):
            pass

        class Child2(Parent):
            pass

        result = get_all_subclasses(Parent)
        self.assertIn(Child1, result)
        self.assertIn(Child2, result)

    def test_get_all_subclasses_with_subclasses_of_subclasses(self):
        class Parent:
            pass

        class Child1(Parent):
            pass

        class Child2(Child1):
            pass

        result = get_all_subclasses(Parent)
        self.assertIn(Child1, result)
        self.assertIn(Child2, result)

    def test_get_all_subclasses_with_no_subclasses(self):
        result = get_all_subclasses(int)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()