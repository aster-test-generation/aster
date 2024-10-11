import unittest
from youtube_dl.swfinterp import _read_int



class Test_AVMClass(unittest.TestCase):
    def test_make_object(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.make_object()
        self.assertIsInstance(result, _AVMClass_Object)

    def test_register_methods(self):
        instance = _AVMClass('(no name idx)', 'String')
        methods = {'test': 1}
        instance.register_methods(methods)
        self.assertEqual(instance.method_names, {'test': 1})
        self.assertEqual(instance.method_idxs, {1: 'test'})

class Test_AVMClass_Object(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        self.assertIsInstance(result, _AVMClass_Object)

    def test_get_property(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        self.assertEqual(result.get_property('test'), undefined)

    def test_set_property(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        result.set_property('test', 'test')
        self.assertEqual(result.get_property('test'), 'test')

    def test_del_property(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        result.set_property('test', 'test')
        result.del_property('test')
        self.assertEqual(result.get_property('test'), undefined)

    def test_get_property_this(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        self.assertEqual(result.get_property_this('test'), undefined)

    def test_set_property_this(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        result.set_property_this('test', 'test')
        self.assertEqual(result.get_property_this('test'), 'test')

    def test_del_property_this(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        result.set_property_this('test', 'test')
        result.del_property_this('test')
        self.assertEqual(result.get_property_this('test'), undefined)

    def test_get_property_global(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        self.assertEqual(result.get_property_global('test'), undefined)

    def test_set_property_global(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        result.set_property_global('test', 'test')
        self.assertEqual(result.get_property_global('test'), 'test')

    def test_del_property_global(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        result.set_property_global('test', 'test')
        result.del_property_global('test')
        self.assertEqual(result.get_property_global('test'), undefined)

    def test_get_property_builtin(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = _AVMClass_Object(instance)
        self.assertEqual(result.get_property_builtin('test'), undefined)

if __name__ == '__main__':
    unittest.main()