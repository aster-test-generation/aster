import unittest
from youtube_dl.swfinterp import _read_int



class Test_AVMClass(unittest.TestCase):
    def test_make_object(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.make_object()
        self.assertIsInstance(result, _AVMClass_Object)

    def test_register_methods(self):
        instance = _AVMClass('(no name idx)', 'String')
        methods = {'method_one': 1, 'method_two': 2}
        instance.register_methods(methods)
        self.assertEqual(instance.method_names, {'method_one': 1, 'method_two': 2})
        self.assertEqual(instance.method_idxs, {1: 'method_one', 2: 'method_two'})

    def test_repr(self):
        instance = _AVMClass('(no name idx)', 'String')
        result = instance.__repr__()
        self.assertEqual(result, '_AVMClass(String)')

class Test_AVMClass_Object(unittest.TestCase):
    def test_repr(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__repr__()
        self.assertEqual(result, '_AVMClass_Object(String)')

    def test_eq(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__eq__(instance)
        self.assertTrue(result)

    def test_ne(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__ne__(instance)
        self.assertFalse(result)

    def test_hash(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__hash__()
        self.assertIsInstance(result, int)

    def test_getattr(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__getattr__('method_one')
        self.assertEqual(result, instance.method_one)

    def test_setattr(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__setattr__('method_one', 1)
        self.assertEqual(result, 1)
        self.assertEqual(instance.method_one, 1)

    def test_delattr(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.method_one = 1
        result = instance.__delattr__('method_one')
        self.assertEqual(result, None)
        self.assertFalse(hasattr(instance, 'method_one'))

    def test_getitem(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__getitem__('method_one')
        self.assertEqual(result, instance.method_one)

    def test_setitem(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        result = instance.__setitem__('method_one', 1)
        self.assertEqual(result, 1)
        self.assertEqual(instance.method_one, 1)

    def test_delitem(self):
        instance = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        instance.method_one = 1
        result = instance.__delitem__('method_one')
        self.assertEqual(result, None)
        self.assertFalse(hasattr(instance, 'method_one'))

if __name__ == '__main__':
    unittest.main()