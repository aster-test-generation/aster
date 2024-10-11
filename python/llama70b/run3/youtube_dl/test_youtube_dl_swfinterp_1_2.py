import unittest
from youtube_dl.swfinterp import _read_in


class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.base, 'String')

    def test___repr__(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(repr(avm_class), '_AVMClass((no name idx), String)')

class Test_ScopeDict(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        scope_dict = _ScopeDict(avm_class)
        self.assertEqual(scope_dict.avm_class, avm_class)

    def test___repr__(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        scope_dict = _ScopeDict(avm_class)
        self.assertEqual(repr(scope_dict), 'String__Scope({})')

class Test_Undefined(unittest.TestCase):
    def test___repr__(self):
        self.assertEqual(repr(undefined), 'undefined')

class Test_BuiltinClasses(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

if __name__ == '__main__':
    unittest.main()