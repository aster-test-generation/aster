import unittest
from youtube_dl.swfinterp import *


class Test_AVMClass_Object(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        obj = _AVMClass_Object(avm_class)
        self.assertEqual(obj.avm_class, avm_class)

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        obj = _AVMClass_Object(avm_class)
        self.assertEqual(repr(obj), '%s' % avm_class.name)

class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        avm_

if __name__ == '__main__':
    unittest.main()