import unittest
from youtube_dl.swfinterp import _ScopeDict, _AVMClass, _read_int


class TestScopeDict(unittest.TestCase):
    def setUp(self):
        self.avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.scope_dict = _ScopeDict(self.avm_class)

    def test_init(self):
        self.assertEqual(self.scope_dict.avm_class, self.avm_class)

    def test_repr(self):
        self.scope_dict['key'] = 'value'
        result = repr(self.scope_dict)
        self.assertEqual(result, 'TestClass__Scope({\'key\': \'value\'})')

if __name__ == '__main__':
    unittest.main()