import unittest
from ansible.module_utils.common._utils import get_all_subclasses

class BaseClass:
    pass

class SubClass1(BaseClass):
    pass

class SubClass2(BaseClass):
    pass

class SubSubClass1(SubClass1):
    pass

class TestGetAllSubclasses(unittest.TestCase):
    def test_no_subclasses(self):
        class NoSubClass:
            pass
        result = get_all_subclasses(NoSubClass)
        self.assertEqual(result, set())

    def test_direct_subclasses(self):
        result = get_all_subclasses(BaseClass)
        self.assertEqual(result, {SubClass1, SubClass2, SubSubClass1})

    def test_nested_subclasses(self):
        result = get_all_subclasses(BaseClass)
        self.assertEqual(result, {SubClass1, SubClass2, SubSubClass1})

    def test_subclasses_of_subclass(self):
        result = get_all_subclasses(SubClass1)
        self.assertEqual(result, {SubSubClass1})

if __name__ == '__main__':
    unittest.main()