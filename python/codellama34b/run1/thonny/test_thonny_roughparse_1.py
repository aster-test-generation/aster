import unittest
from thonny.roughparse import *


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def test_init(self):
        instance = StringTranslatePseudoMapping(None, None)
        self.assertEqual(instance._non_defaults, None)
        self.assertEqual(instance._default_value, None)

    def test_getitem(self):
        instance = StringTranslatePseudoMapping(None, None)
        result = instance.__getitem__(None)
        self.assertEqual(result, None)

    def test_len(self):
        instance = StringTranslatePseudoMapping(None, None)
        result = instance.__len__()
        self.assertEqual(result, None)

    def test_iter(self):
        instance = StringTranslatePseudoMapping(None, None)
        result = instance.__iter__()
        self.assertEqual(result, None)

    def test_get(self):
        instance = StringTranslatePseudoMapping(None, None)
        result = instance.get(None)
        self.assertEqual(result, None)

class Test_synchre(unittest.TestCase):
    def test_search(self):
        result = synchre(None)
        self.assertEqual(result, None)

class Test_junkre(unittest.TestCase):
    def test_match(self):
        result = junkre(None)
        self.assertEqual(result, None)

class Test_match_stringre(unittest.TestCase):
    def test_match(self):
        result = _match_stringre(None)
        self.assertEqual(result, None)

class Test_itemre(unittest.TestCase):
    def test_match(self):
        result = itemre(None)
        self.assertEqual(result, None)

class Test_closere(unittest.TestCase):
    def test_match(self):
        result = close(None)
        self.assertEqual(result, None)

class Test_chew_ordinaryre(unittest.TestCase):
    def test_match(self):
        result = chew_ordinaryre(None)
        self.assertEqual(result, None)

class Test_IS_ASCII_ID_FIRST_CHAR(unittest.TestCase):
    def test_getitem(self):
        result = _IS_ASCII_ID_FIRST_CHAR[None]
        self.assertEqual(result, None)

class Test_IS_ASCII_ID_CHAR(unittest.TestCase):
    def test_getitem(self):
        result = _IS_ASCII_ID_CHAR[None]
        self.assertEqual(result, None)

class Test_ASCII_ID_FIRST_CHARS(unittest.TestCase):
    def test_getitem(self):
        result = _ASCII_ID_FIRST_CHARS[None]
        self.assertEqual(result, None)

class Test_ASCII_ID_CHARS(unittest.TestCase):
    def test_getitem(self):
        result = _ASCII_ID_CHARS[None]
        self.assertEqual(result, None)

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
        result = _synchre(pattern=None, string=None, flags=None)
        self.assertEqual(result, None)

class Test_junkre(unittest.TestCase):
    def test_match(self):
        result = _junkre(pattern=None, string=None, flags=None)
        self.assertEqual(result, None)

class Test_itemre(unittest.TestCase):
    def test_match(self):
        result = _itemre(pattern=None, string=None, flags=None)
        self.assertEqual(result, None)

class Test_closere(unittest.TestCase):
    def test_match(self):
        result = _closere(pattern=None, string=None, flags=None)
        self.assertEqual(result, None)

class Test_chew_ordinaryre(unittest.TestCase):
    def test_match(self):
        result = _chew_ordinaryre(pattern=None, string=None, flags=None)
        self.assertEqual(result, None)

class Test_ASCII_ID_CHARS(unittest.TestCase):
    def test_frozenset(self):
        result = _ASCII_ID_CHARS
        self.assertEqual(result, frozenset(string.ascii_letters + string.digits + '_'))

class Test_ASCII_ID_FIRST_CHARS(unittest.TestCase):
    def test_frozenset(self):
        result = _ASCII_ID_FIRST_CHARS
        self.assertEqual(result, frozenset(string.ascii_letters + '_'))

class Test_IS_ASCII_ID_CHAR(unittest.TestCase):
    def test_list(self):
        result = _IS_ASCII_ID_CHAR
        self.assertEqual(result, [chr(x) in _ASCII_ID_CHARS for x in range(128)])

class Test_IS_ASCII_ID_FIRST_CHAR(unittest.TestCase):
    def test_list(self):
        result = _IS_ASCII_ID_FIRST_CHAR
        self.assertEqual(result, [chr(x) in _ASCII_ID_FIRST_CHARS for x in range(128)])

if __name__ == '__main__':
    unittest.main()