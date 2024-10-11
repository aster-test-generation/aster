import unittest
from thonny.roughparse import *



class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        non_defaults = {}
        default_value = 1
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        self.assertEqual(instance._non_defaults, non_defaults)
        self.assertEqual(instance._default_value, default_value)

    def test_getitem(self):
        non_defaults = {}
        default_value = 1
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        result = instance.__getitem__(1)
        self.assertEqual(result, default_value)

    def test_len(self):
        non_defaults = {}
        default_value = 1
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        result = instance.__len__()
        self.assertEqual(result, 0)

    def test_iter(self):
        non_defaults = {}
        default_value = 1
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        result = instance.__iter__()
        self.assertEqual(result, non_defaults)

    def test_get(self):
        non_defaults = {}
        default_value = 1
        instance = StringTranslatePseudoMapping(non_defaults, default_value)
        result = instance.get(1)
        self.assertEqual(result, default_value)

class Test_synchre(unittest.TestCase):
    def test_search(self):
        result = synchre(1)
        self.assertEqual(result, None)

class Test_junkre(unittest.TestCase):
    def test_match(self):
        result = junkre(1)
        self.assertEqual(result, None)

class Test_match_stringre(unittest.TestCase):
    def test_match(self):
        result = match_stringre(1)
        self.assertEqual(result, None)

class Test_itemre(unittest.TestCase):
    def test_match(self):
        result = itemre(1)
        self.assertEqual(result, None)

class Test_closere(unittest.TestCase):
    def test_match(self):
        result = close(1)
        self.assertEqual(result, None)

class Test_chew_ordinaryre(unittest.TestCase):
    def test_match(self):
        result = chew_ordinaryre(1)
        self.assertEqual(result, None)

class Test_ASCII_ID_CHARS(unittest.TestCase):
    def test_ASCII_ID_CHARS(self):
        result = _ASCII_ID_CHARS
        self.assertEqual(result, frozenset(string.ascii_letters + string.digits + '_'))

class Test_ASCII_ID_FIRST_CHARS(unittest.TestCase):
    def test_ASCII_ID_FIRST_CHARS(self):
        result = _ASCII_ID_FIRST_CHARS
        self.assertEqual(result, frozenset(string.ascii_letters + '_'))

class Test_IS_ASCII_ID_CHAR(unittest.TestCase):
    def test_IS_ASCII_ID_CHAR(self):
        result = _IS_ASCII_ID_CHAR
        self.assertEqual(result, [chr(x) in _ASCII_ID_CHARS for x in range(128)])

class Test_IS_ASCII_ID_FIRST_CHAR(unittest.TestCase):
    def test_IS_ASCII_ID_FIRST_CHAR(self):
        result = _IS_ASCII_ID_FIRST_CHAR
        self.assertEqual(result, [chr(x) in _ASCII_ID_FIRST_CHARS for x in range(128)])

if __name__ == '__main__':
    unittest.main()