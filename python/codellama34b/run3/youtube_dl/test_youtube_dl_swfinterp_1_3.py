import unittest
from youtube_dl.swfinterp import _read_int



class Test_AVMClass(unittest.TestCase):
    def test_make_object(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.make_object()
        self.assertEqual(result, _AVMClass_Object(instance))

    def test_register_methods(self):
        instance = _AVMClass('(no name idx)', 'String')
        methods = {'method_one': 1, 'method_two': 2}
        instance.register_methods(methods)
        self.assertEqual(instance.method_names, {'method_one': 1, 'method_two': 2})
        self.assertEqual(instance.method_idxs, {1: 'method_one', 2: 'method_two'})

class Test_AVMClass_Object(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        self.assertEqual(instance.class_name, 'String')
        self.assertEqual(instance.class_id, '(no name idx)')
        self.assertEqual(instance.variables, _ScopeDict(instance.class_id))

    def test_get_variable(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.variables['var_name'] = 'var_value'
        result = instance.get_variable('var_name')
        self.assertEqual(result, 'var_value')

    def test_set_variable(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.set_variable('var_name', 'var_value')
        self.assertEqual(instance.variables, {'var_name': 'var_value'})

    def test_get_method(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.class_.methods['method_one'] = 'method_one'
        result = instance.get_method('method_one')
        self.assertEqual(result, 'method_one')

    def test_set_method(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.set_method('method_one', 'method_one')
        self.assertEqual(instance.class_.methods, {'method_one': 'method_one'})

    def test_get_constant(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.class_.constants['constant_one'] = 'constant_one'
        result = instance.get_constant('constant_one')
        self.assertEqual(result, 'constant_one')

    def test_set_constant(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.set_constant('constant_one', 'constant_one')
        self.assertEqual(instance.class_.constants, {'constant_one': 'constant_one'})

    def test_get_static_property(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.class_.static_properties['static_property_one'] = 'static_property_one'
        result = instance.get_static_property('static_property_one')
        self.assertEqual(result, 'static_property_one')

    def test_set_static_property(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.set_static_property('static_property_one', 'static_property_one')
        self.assertEqual(instance.class_.static_properties, {'static_property_one': 'static_property_one'})

if __name__ == '__main__':
    unittest.main()