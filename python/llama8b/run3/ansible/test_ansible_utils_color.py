import unittest
from ansible.utils.color import ANSIBLE_COLOR, C, parsecolor, stringc, colorize, hostcolor


class TestColor(unittest.TestCase):
    def test_parsecolor(self):
        result = parsecolor('color1')
        self.assertEqual(result, u'38;5;1')

    def test_parsecolor_rgb(self):
        result = parsecolor('rgb(1,2,3)')
        self.assertEqual(result, u'38;5;17')

    def test_parsecolor_gray(self):
        result = parsecolor('gray1')
        self.assertEqual(result, u'38;5;233')

    def test_stringc(self):
        result = stringc('Hello', 'color1')
        self.assertEqual(result, u'\033[38;5;1Hello\033[0m')

    def test_colorize(self):
        result = colorize('lead', 1, 'color1')
        self.assertEqual(result, u'lead = 1')

    def test_hostcolor(self):
        result = hostcolor('host', {'failures': 0, 'unreachable': 0, 'changed': 0})
        self.assertEqual(result, u'host')

    def test_hostcolor_error(self):
        result = hostcolor('host', {'failures': 1, 'unreachable': 0, 'changed': 0})
        self.assertEqual(result, u"%-37s" % stringc('host', C.COLOR_ERROR))

    def test_hostcolor_changed(self):
        result = hostcolor('host', {'failures': 0, 'unreachable': 0, 'changed': 1})
        self.assertEqual(result, u"%-37s" % stringc('host', C.COLOR_CHANGED))

    def test_hostcolor_ok(self):
        result = hostcolor('host', {'failures': 0, 'unreachable': 0, 'changed': 0})
        self.assertEqual(result, u"%-37s" % stringc('host', C.COLOR_OK))

if __name__ == '__main__':
    unittest.main()