import unittest
from youtube_dl.swfinterp import _read_in


class Test_ScopeDict(unittest.TestCase):
    def test___init__(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        scope_dict = _ScopeDict(avm_class)
        self.assertIsInstance(scope_dict, dict)
        self.assertEqual(scope_dict.avm_class, avm_class)

    def test___repr__(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        scope_dict = _ScopeDict(avm_class)
        self.assertEqual(repr(scope_dict), 'TestClass__Scope({})')

class Test_AVMClass(unittest.TestCase):
    def test___init__(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

    def test___repr__(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(repr(avm_class), '_AVMClass(TestClass)')

class Test_Undefined(unittest.TestCase):
    def test___init__(self):
        undefined_obj = _Undefined()
        self.assertIsInstance(undefined_obj, _Undefined)

    def test___repr__(self):
        undefined_obj = _Undefined()
        self.assertEqual(repr(undefined_obj), '_Undefined')

class Test_BuiltinClasses(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

if __name__ == '__main__':
    unittest.main()