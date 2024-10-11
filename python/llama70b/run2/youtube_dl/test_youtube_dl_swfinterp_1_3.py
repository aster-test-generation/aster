import unittest
from youtube_dl.swfinterp import AVMClass, Undefined, ScopeDic


class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(instance.name_idx, '(no name idx)')
        self.assertEqual(instance.name, 'String')
        self.assertEqual(instance.method_names, {})
        self.assertEqual(instance.method_idxs, {})
        self.assertEqual(instance.methods, {})
        self.assertEqual(instance.method_pyfunctions, {})
        self.assertEqual(instance.static_properties, {})
        self.assertIsInstance(instance.variables, _ScopeDict)
        self.assertEqual(instance.constants, {})

    def test_make_object(self):
        instance = _AVMClass('(no name idx)', 'String')
        obj = instance.make_object()
        self.assertIsInstance(obj, _AVMClass_Object)

    def test_repr(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(repr(instance), '_AVMClass(String)')

    def test_register_methods(self):
        instance = _AVMClass('(no name idx)', 'String')
        methods = {'method1': 1, 'method2': 2}
        instance.register_methods(methods)
        self.assertEqual(instance.method_names, methods)
        self.assertEqual(instance.method_idxs, {'1': 'method1', '2': 'method2'})

class Test_Undefined(unittest.TestCase):
    def test_undefined(self):
        instance = _Undefined()
        self.assertEqual(str(instance), 'undefined')

class Test_ScopeDict(unittest.TestCase):
    def test_ScopeDict(self):
        instance = _ScopeDict(_AVMClass('(no name idx)', 'String'))
        self.assertIsInstance(instance, dict)

if __name__ == '__main__':
    unittest.main()