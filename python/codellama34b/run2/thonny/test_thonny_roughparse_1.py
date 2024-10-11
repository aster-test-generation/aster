import unittest
from thonny.roughparse import *



class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        instance = StringTranslatePseudoMapping(non_defaults={}, default_value=None)
        self.assertEqual(instance._non_defaults, {})
        self.assertEqual(instance._default_value, None)

    def test_getitem(self):
        instance = StringTranslatePseudoMapping(non_defaults={}, default_value=None)
        result = instance.__getitem__(item=None)
        self.assertEqual(result, None)

    def test_len(self):
        instance = StringTranslatePseudoMapping(non_defaults={}, default_value=None)
        result = instance.__len__()
        self.assertEqual(result, 0)

    def test_iter(self):
        instance = StringTranslatePseudoMapping(non_defaults={}, default_value=None)
        result = instance.__iter__()
        self.assertEqual(result, iter({}))

    def test_get(self):
        instance = StringTranslatePseudoMapping(non_defaults={}, default_value=None)
        result = instance.get(key=None)
        self.assertEqual(result, None)

class Test_synchre(unittest.TestCase):
    def test_search(self):
        result = re.search(pattern='', string='')
        self.assertEqual(result, None)

class Test_junkre(unittest.TestCase):
    def test_match(self):
        result = junkre(string='')
        self.assertEqual(result, None)

class Test_match_stringre(unittest.TestCase):
    def test_match(self):
        result = match_stringre(string='')
        self.assertEqual(result, None)

class Test_itemre(unittest.TestCase):
    def test_match(self):
        import re
        self.assertEqual(result, None)

class Test_closere(unittest.TestCase):
    def test_match(self):
        result = close_re(string='')
        self.assertEqual(result, None)

class Test_chew_ordinaryre(unittest.TestCase):
    def test_match(self):
        result = chew_ordinaryre(string='')
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
        result = _IS_ASCII_ID_FIRST_CHAR = True
        self.assertEqual(result, [chr(x) in _ASCII_ID_FIRST_CHARS for x in range(128)])

class Test_NUM_CONTEXT_LINES(unittest.TestCase):
    def test_NUM_CONTEXT_LINES(self):
        result = 2
        self.assertEqual(result, (50, 500, 5000000))

if __name__ == '__main__':
    unittest.main()