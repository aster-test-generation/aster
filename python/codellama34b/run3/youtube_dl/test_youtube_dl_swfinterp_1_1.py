import unittest
from youtube_dl.swfinterp import _read_int



class Test_AVMClass_Object(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass_Object(StringClass)
        self.assertEqual(instance.avm_class, StringClass)

    def test_repr(self):
        instance = _AVMClass_Object(StringClass)
        result = instance.__repr__()
        self.assertEqual(result, 'String')

class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(instance.name, 'String')

    def test_repr(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.__repr__()
        self.assertEqual(result, 'String')

    def test_get_method(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_method('(no name idx)')
        self.assertEqual(result, None)

    def test_get_property(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property('(no name idx)')
        self.assertEqual(result, None)

    def test_get_property_value(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property_value('(no name idx)')
        self.assertEqual(result, None)

    def test_set_property_value(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.set_property_value('(no name idx)', None)
        self.assertEqual(result, None)

    def test_get_property_name(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property_name('(no name idx)')
        self.assertEqual(result, None)

    def test_get_property_names(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property_names()
        self.assertEqual(result, None)

    def test_get_method_names(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_method_names()
        self.assertEqual(result, None)

    def test_get_property_names_and_values(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property_names_and_values()
        self.assertEqual(result, None)

    def test_get_property_names_and_values_with_types(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property_names_and_values_with_types()
        self.assertEqual(result, None)

    def test_get_method_names_and_types(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_method_names_and_types()
        self.assertEqual(result, None)

    def test_get_method_names_and_types_with_types(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_method_names_and_types_with_types()
        self.assertEqual(result, None)

    def test_get_property_names_and_types(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.get_property_names_and_types()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()