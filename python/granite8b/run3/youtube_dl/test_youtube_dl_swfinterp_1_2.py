import unittest
from youtube_dl.swfinterp import *


class Test_ScopeDict(unittest.TestCase):
    def test___init__(self):
        scope_dict = _ScopeDict(StringClass)
        self.assertEqual(scope_dict.avm_class, StringClass)

    def test___repr__(self):
        scope_dict = _ScopeDict(StringClass)
        self.assertEqual(repr(scope_dict), 'String__Scope({})')

class Test_Undefined(unittest.TestCase):
    def test___repr__(self):
        undefined = _Undefined()
        self.assertEqual(repr(undefined), 'undefined')

if __name__ == '__main__':
    unittest.main()