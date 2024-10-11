import unittest
from youtube_dl.swfinterp import _read_int



class Test_AVMClass(unittest.TestCase):
    def test_AVMClass(self):
        result = _AVMClass('(no name idx)', 'String')
        self.assertEqual(result, _AVMClass('(no name idx)', 'String'))

    def test_AVMClass_Object(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        self.assertEqual(result, _AVMClass_Object(_AVMClass('(no name idx)', 'String')))

    def test_AVMClass_Object_avm_class(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String')).avm_class
        self.assertEqual(result, _AVMClass('(no name idx)', 'String'))

    def test_AVMClass_Object_repr(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String')).__repr__()
        self.assertEqual(result, 'String')

class Test_AVMClass_Object(unittest.TestCase):
    def test_AVMClass_Object(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String'))
        self.assertEqual(result, _AVMClass_Object(_AVMClass('(no name idx)', 'String')))

    def test_AVMClass_Object_avm_class(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String')).avm_class
        self.assertEqual(result, _AVMClass('(no name idx)', 'String'))

    def test_AVMClass_Object_repr(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String')).__repr__()
        self.assertEqual(result, 'String')

class Test_AVMClass_Object_avm_class(unittest.TestCase):
    def test_AVMClass_Object_avm_class(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String')).avm_class
        self.assertEqual(result, _AVMClass('(no name idx)', 'String'))

class Test_AVMClass_Object_repr(unittest.TestCase):
    def test_AVMClass_Object_repr(self):
        result = _AVMClass_Object(_AVMClass('(no name idx)', 'String')).__repr__()
        self.assertEqual(result, 'String')

class Test_AVMMethod(unittest.TestCase):
    def test_AVMMethod(self):
        result = _AVMMethod('(no name idx)', 'String')
        self.assertEqual(result, _AVMMethod('(no name idx)', 'String'))

    def test_AVMMethod_name(self):
        result = _AVMMethod('(no name idx)', 'String').name
        self.assertEqual(result, 'String')

    def test_AVMMethod_repr(self):
        result = _AVMMethod('(no name idx)', 'String').__repr__()
        self.assertEqual(result, 'String')

class Test_AVMMethod_name(unittest.TestCase):
    def test_AVMMethod_name(self):
        result = _AVMMethod('(no name idx)', 'String').name
        self.assertEqual(result, 'String')

class Test_AVMMethod_repr(unittest.TestCase):
    def test_AVMMethod_repr(self):
        result = _AVMMethod('(no name idx)', 'String').__repr__()
        self.assertEqual(result, 'String')


if __name__ == '__main__':
    unittest.main()