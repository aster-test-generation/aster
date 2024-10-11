import unittest
from ansible.utils.color import *


class TestAnsibleUtilsColor(unittest.TestCase):
    def test_parsecolor(self):
        result = parsecolor('color1')
        self.assertEqual(result, u'38;5;1')

    def test_stringc(self):
        result = stringc('test', 'color1')
        self.assertEqual(result, u'\033[38;5;1mtest\033[0m')

    def test_colorize(self):
        result = colorize('test', 1, 'color1')
        self.assertEqual(result, u'test=1')

    def test_hostcolor(self):
        result = hostcolor('test', {'failures': 1, 'unreachable': 0, 'changed': 0})
        self.assertEqual(result, u'test                                 ')

if __name__ == '__main__':
    unittest.main()