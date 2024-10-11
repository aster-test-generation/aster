import unittest
from ansible.utils.color import *


class TestColor(unittest.TestCase):
    def test_parsecolor(self):
        self.assertEqual(parsecolor('color1'), '38;5;1')
        self.assertEqual(parsecolor('rgb(1,2,3)'), '38;5;17')
        self.assertEqual(parsecolor('gray1'), '38;5;233')

    def test_stringc(self):
        self.assertEqual(stringc('Hello', 'color1'), '\033[38;5;1Hello\033[0m')
        self.assertEqual(stringc('Hello', 'color1', wrap_nonvisible_chars=True), '\001\033[38;5;1Hello\001\033[0m\002')

    def test_colorize(self):
        self.assertEqual(colorize('lead', 1, 'color1'), 'lead=    1')
        self.assertEqual(colorize('lead', 1, 'color1', color=False), 'lead=    1')

    def test_hostcolor(self):
        stats = {'failures': 1, 'unreachable': 0, 'changed': 0}
        self.assertEqual(hostcolor('host', stats), '%-37s' % stringc('host', C.COLOR_ERROR))
        stats = {'failures': 0, 'unreachable': 0, 'changed': 1}
        self.assertEqual(hostcolor('host', stats), '%-37s' % stringc('host', C.COLOR_CHANGED))
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        self.assertEqual(hostcolor('host', stats), '%-26s' % 'host')

if __name__ == '__main__':
    unittest.main()