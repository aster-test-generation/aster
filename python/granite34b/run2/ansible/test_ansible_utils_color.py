import unittest
from ansible.utils.color import *


class TestColor(unittest.TestCase):
    def test_parsecolor(self):
        self.assertEqual(parsecolor('color1'), u'38;5;1')
        self.assertEqual(parsecolor('rgb000'), u'38;5;16')
        self.assertEqual(parsecolor('gray1'), u'38;5;233')

    def test_stringc(self):
        self.assertEqual(stringc('text', 'color1'), u'\x1b[38;5;1mtext\x1b[0m')
        self.assertEqual(stringc('text', 'rgb000'), u'\033[38;5;16mtext\033[0m')
        self.assertEqual(stringc('text', 'gray1'), u'\033[38;5;233mtext\033[0m')

    def test_colorize(self):
        self.assertEqual(colorize('lead', 1, 'color1'), u'lead=1   ')
        self.assertEqual(colorize('lead', 1, 'rgb000'), u'lead=   1')
        self.assertEqual(colorize('lead', 1, 'gray1'), u'lead=   1')

    def test_hostcolor(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        self.assertEqual(hostcolor('host', stats), u'host                      ')
        stats['failures'] = 1
        self.assertEqual(hostcolor('host', stats), u'\033[38;5;1mhost\033[0m')
        stats['failures'] = 0
        stats['changed'] = 1
        self.assertEqual(hostcolor('host', stats), u'\033[38;5;2mhost\033[0m')

if __name__ == '__main__':
    unittest.main()