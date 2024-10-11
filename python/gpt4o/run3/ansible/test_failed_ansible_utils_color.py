import unittest
from unittest.mock import patch, MagicMock
from ansible.utils.color import parsecolor, stringc, colorize, hostcolor
from ansible import constants as C

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
        self.assertEqual(result, '38;5;67')

    def test_parsecolor_gray(self):
        result = parsecolor('gray10')
        self.assertEqual(result, '38;5;242')

    def test_parsecolor_invalid(self):
        with self.assertRaises(KeyError):
            parsecolor('invalidcolor')

class TestStringC(unittest.TestCase):
    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_stringc_with_color(self):
        with patch('ansible.utils.color.parsecolor', return_value='31'):
            result = stringc('test', 'red')
            self.assertEqual(result, '\033[31mtest\033[0m')

    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_stringc_with_wrap_nonvisible_chars(self):
        with patch('ansible.utils.color.parsecolor', return_value='31'):
            result = stringc('test', 'red', wrap_nonvisible_chars=True)
            self.assertEqual(result, '\001\033[31m\002test\001\033[0m\002')

    @patch('ansible.utils.color.ANSIBLE_COLOR', False)
    def test_stringc_without_color(self):
        result = stringc('test', 'red')
        self.assertEqual(result, 'test')

class TestColorize(unittest.TestCase):
    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_colorize_with_color(self):
        with patch('ansible.utils.color.stringc', return_value='\033[31mtest=1   \033[0m'):
            result = colorize('test', 1, 'red')
            self.assertEqual(result, '\033[31mtest=1   \033[0m')

    @patch('ansible.utils.color.ANSIBLE_COLOR', False)
    def test_colorize_without_color(self):
        result = colorize('test', 1, 'red')
        self.assertEqual(result, 'test=1   ')

class TestHostColor(unittest.TestCase):
    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_hostcolor_failures(self):
        stats = {'failures': 1, 'unreachable': 0, 'changed': 0}
        with patch('ansible.utils.color.stringc', return_value='\033[31mhost\033[0m'):
            result = hostcolor('host', stats)
            self.assertEqual(result.strip(), '\033[31mhost\033[0m')

    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_hostcolor_unreachable(self):
        stats = {'failures': 0, 'unreachable': 1, 'changed': 0}
        with patch('ansible.utils.color.stringc', return_value='\033[31mhost\033[0m'):
            result = hostcolor('host', stats)
            self.assertEqual(result.strip(), '\033[31mhost\033[0m')

    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_hostcolor_changed(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 1}
        with patch('ansible.utils.color.stringc', return_value='\033[33mhost\033[0m'):
            result = hostcolor('host', stats)
            self.assertEqual(result, '\033[33mhost\033[0m                        ')

    @patch('ansible.utils.color.ANSIBLE_COLOR', True)
    def test_hostcolor_ok(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        with patch('ansible.utils.color.stringc', return_value='\033[32mhost\033[0m'):
            result = hostcolor('host', stats)
            self.assertEqual(result.strip(), '\033[32mhost\033[0m')

    @patch('ansible.utils.color.ANSIBLE_COLOR', False)
    def test_hostcolor_no_color(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        result = hostcolor('host', stats)
        self.assertEqual(result, 'host                      ')

if __name__ == '__main__':
    unittest.main()