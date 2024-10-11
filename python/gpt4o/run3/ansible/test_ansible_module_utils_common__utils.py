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
    def test_get_all_subclasses_base_class(self):
        result = get_all_subclasses(BaseClass)
        expected = {SubClass1, SubClass2, SubSubClass1}
        self.assertEqual(result, expected)

    def test_get_all_subclasses_subclass1(self):
        result = get_all_subclasses(SubClass1)
        expected = {SubSubClass1}
        self.assertEqual(result, expected)

    def test_get_all_subclasses_subclass2(self):
        result = get_all_subclasses(SubClass2)
        expected = set()
        self.assertEqual(result, expected)

    def test_get_all_subclasses_subsubclass1(self):
        result = get_all_subclasses(SubSubClass1)
        expected = set()
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()