import unittest
from ansible.utils.color import *


class TestAnsibleUtilsColor(unittest.TestCase):
    def test_parsecolor(self):
        result = parsecolor("color1")
        self.assertEqual(result, u'38;5;1')

    def test_stringc(self):
        result = stringc("test", "color1")
        self.assertEqual(result, u'\033[38;5;1mtest\033[0m')

    def test_colorize(self):
        result = colorize("lead", 1, "color1")
        self.assertEqual(result, u'lead=1')

    def test_hostcolor(self):
        result = hostcolor("host", {"failures": 1, "unreachable": 1, "changed": 1})
        self.assertEqual(result, u'host                                 ')

if __name__ == '__main__':
    unittest.main()