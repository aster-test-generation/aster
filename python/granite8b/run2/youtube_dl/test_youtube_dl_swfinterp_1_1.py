import unittest
from youtube_dl.swfinterp import _AVMClass, _Undefined


class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.base_class, None)
        self.assertEqual(avm_class.traits, {})

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(repr(avm_class), 'AVMClass((no name idx), String)')

class Test_Undefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertEqual(undefined, None)

    def test_repr(self):
        undefined = _Undefined()
        self.assertEqual(repr(undefined), 'Undefined')

if __name__ == '__main__':
    unittest.main()