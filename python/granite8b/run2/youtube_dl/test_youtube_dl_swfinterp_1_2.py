import unittest
from youtube_dl.swfinterp import *


class Test_ScopeDict(unittest.TestCase):
    def test___init__(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        scope_dict = _ScopeDict(avm_class)
        self.assertEqual(scope_dict.avm_class, avm_class)

    def test___repr__(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        scope_dict = _ScopeDict(avm_class)
        self.assertEqual(repr(scope_dict), '%s__Scope({})' % avm_class.name)

if __name__ == '__main__':
    unittest.main()