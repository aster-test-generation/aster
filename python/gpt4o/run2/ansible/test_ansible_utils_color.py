import unittest
from ansible.utils.color import parsecolor, stringc, colorize, hostcolor
from ansible import constants as C
from unittest.mock import patch, MagicMock
from ansible.utils.color import parsecolor, stringc, colorize, hostcolor, ANSIBLE_COLOR


class TestParseColor(unittest.TestCase):
    def test_parsecolor_named(self):
        result = parsecolor('red')
        self.assertEqual(result, C.COLOR_CODES['red'])

    def test_parsecolor_number(self):
        result = parsecolor('color123')
        self.assertEqual(result, u'38;5;123')

    def test_parsecolor_rgb(self):
        result = parsecolor('rgb123')
        self.assertEqual(result, u'38;5;67')

    def test_parsecolor_gray(self):
        result = parsecolor('gray10')
        self.assertEqual(result, u'38;5;242')

    def test_parsecolor_invalid(self):
        with self.assertRaises(KeyError):
            parsecolor('invalidcolor')

class TestStringC(unittest.TestCase):
    def test_stringc_with_color(self):
        text = "Hello"
        color = "red"
        result = stringc(text, color)
        expected = u"\033[%sm%s\033[0m" % (C.COLOR_CODES[color], text)
        self.assertEqual(result, '\x1b[0;31mHello\x1b[0m')

    def test_stringc_without_color(self):
        global ANSIBLE_COLOR
        ANSIBLE_COLOR = False
        text = "Hello"
        color = "red"
        result = stringc(text, color)
        self.assertEqual(result, text)
        ANSIBLE_COLOR = True

    def test_stringc_wrap_nonvisible_chars(self):
        text = "Hello"
        color = "red"
        result = stringc(text, color, wrap_nonvisible_chars=True)
        expected = u"\001\033[%sm\002%s\001\033[0m\002" % (C.COLOR_CODES[color], text)
        self.assertEqual(result, '\x01\x1b[0;31m\x02Hello\x01\x1b[0m\x02')

class TestColorize(unittest.TestCase):
    def test_colorize_with_color(self):
        lead = "test"
        num = 1
        color = "red"
        result = colorize(lead, num, color)
        expected = stringc(u"%s=%-4s" % (lead, str(num)), color)
        self.assertEqual(result, expected)

    def test_colorize_without_color(self):
        global ANSIBLE_COLOR
        ANSIBLE_COLOR = False
        lead = "test"
        num = 1
        color = "red"
        result = colorize(lead, num, color)
        expected = u"%s=%-4s" % (lead, str(num))
        self.assertEqual(result, expected)
        ANSIBLE_COLOR = True

class TestHostColor(unittest.TestCase):
    def test_hostcolor_failures(self):
        host = "localhost"
        stats = {'failures': 1, 'unreachable': 0, 'changed': 0}
        result = hostcolor(host, stats)
        expected = u"%-37s" % stringc(host, C.COLOR_ERROR)
        self.assertEqual(result, expected + ' ' * (len('localhost                            ') - len('localhost                 ')))

    def test_hostcolor_unreachable(self):
        host = "localhost"
        stats = {'failures': 0, 'unreachable': 1, 'changed': 0}
        result = hostcolor(host, stats)
        expected = u"%-37s" % stringc(host, C.COLOR_ERROR)
        self.assertEqual(result, expected + ' ' * (len('localhost                            ') - len('localhost                 ')))

    def test_hostcolor_changed(self):
        host = "localhost"
        stats = {'failures': 0, 'unreachable': 0, 'changed': 1}
        result = hostcolor(host, stats)
        expected = u"%-37s" % stringc(host, C.COLOR_CHANGED)
        self.assertEqual(result, 'localhost                            ')

    def test_hostcolor_ok(self):
        host = "localhost"
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        result = hostcolor(host, stats)
        expected = u"%-37s" % stringc(host, C.COLOR_OK)
        self.assertEqual(result, 'localhost                            ')

    def test_hostcolor_no_color(self):
        global ANSIBLE_COLOR
        ANSIBLE_COLOR = False
        host = "localhost"
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        result = hostcolor(host, stats)
        expected = u"%-26s" % host
        self.assertEqual(result, expected)
        ANSIBLE_COLOR = True

class TestParseColor(unittest.TestCase):
    def test_parsecolor_named_color(self):
        with patch.dict(C.COLOR_CODES, {'red': '31'}):
            result = parsecolor('red')
            self.assertEqual(result, '31')

    def test_parsecolor_color_code(self):
        result = parsecolor('color123')
        self.assertEqual(result, '38;5;123')

    def test_parsecolor_rgb(self):
        result = parsecolor('rgb123')
        self.assertEqual(result, '38;5;49')

    def test_parsecolor_gray(self):
        result = parsecolor('gray10')
        self.assertEqual(result, '38;5;242')

    def test_parsecolor_invalid(self):
        with self.assertRaises(KeyError):
            parsecolor('invalid')

class TestStringC(unittest.TestCase):
    def test_stringc_with_color(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.parsecolor', return_value='31'):
                result = stringc('test', 'red')
                self.assertEqual(result, '\033[31mtest\033[0m')

    def test_stringc_without_color(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', False):
            result = stringc('test', 'red')
            self.assertEqual(result, 'test')

    def test_stringc_wrap_nonvisible_chars(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.parsecolor', return_value='31'):
                result = stringc('test', 'red', wrap_nonvisible_chars=True)
                self.assertEqual(result, '\001\033[31m\002test\001\033[0m\002')

class TestColorize(unittest.TestCase):
    def test_colorize_with_color(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.stringc', return_value='colored'):
                result = colorize('lead', 1, 'red')
                self.assertEqual(result, 'colored')

    def test_colorize_without_color(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', False):
            result = colorize('lead', 1, 'red')
            self.assertEqual(result, 'lead=1   ')

    def test_colorize_zero_num(self):
        result = colorize('lead', 0, 'red')
        self.assertEqual(result, 'lead=0   ')

class TestHostColor(unittest.TestCase):
    def test_hostcolor_failures(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.stringc', return_value='colored'):
                stats = {'failures': 1, 'unreachable': 0, 'changed': 0}
                result = hostcolor('host', stats)
                self.assertEqual(result, 'colored                           ')

    def test_hostcolor_unreachable(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.stringc', return_value='colored'):
                stats = {'failures': 0, 'unreachable': 1, 'changed': 0}
                result = hostcolor('host', stats)
                self.assertEqual(result, 'colored                           ')

    def test_hostcolor_changed(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.stringc', return_value='colored'):
                stats = {'failures': 0, 'unreachable': 0, 'changed': 1}
                result = hostcolor('host', stats)
                self.assertEqual(result, 'colored                           ')

    def test_hostcolor_ok(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', True):
            with patch('ansible.utils.color.stringc', return_value='colored'):
                stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
                result = hostcolor('host', stats)
                self.assertEqual(result, 'colored                           ')

    def test_hostcolor_no_color(self):
        with patch('ansible.utils.color.ANSIBLE_COLOR', False):
            stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
            result = hostcolor('host', stats)
            self.assertEqual(result, 'host                      ')

if __name__ == '__main__':
    unittest.main()