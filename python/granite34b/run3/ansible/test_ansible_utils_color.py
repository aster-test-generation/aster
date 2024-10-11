import unittest
from ansible.utils.color import *


class TestColor(unittest.TestCase):
    def test_parsecolor(self):
        self.assertEqual(parsecolor('color1'), '38;5;1')
        self.assertEqual(parsecolor('rgb000'), '38;5;16')
        self.assertEqual(parsecolor('gray1'), '38;5;233')

    def test_stringc(self):
        self.assertEqual(stringc('text', 'color1'), 'text')
        self.assertEqual(stringc('text', 'rgb000'), '\033[38;5;16mtext\033[0m')
        self.assertEqual(stringc('text', 'gray1'), '\033[38;5;233mtext\033[0m')

    def test_colorize(self):
        self.assertEqual(colorize('lead', 1, 'color1'), 'lead=1   ')
        self.assertEqual(colorize('lead', 1, 'rgb000'), 'lead=   1')
        self.assertEqual(colorize('lead', 1, 'gray1'), 'lead=   1')

    def test_hostcolor(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        self.assertEqual(hostcolor('host', stats), 'host                      ')
        stats['failures'] = 1
        self.assertEqual(hostcolor('host', stats), 'host')
        stats['failures'] = 0
        stats['unreachable'] = 1
        self.assertEqual(hostcolor('host', stats), 'host')
        stats['unreachable'] = 0
        stats['changed'] = 1
        self.assertEqual(hostcolor('host', stats), 'host')

class TestColor(unittest.TestCase):
    def test_parsecolor(self):
        self.assertEqual(parsecolor('red'), '31')
        self.assertEqual(parsecolor('31'), '31')
        self.assertEqual(parsecolor('rgb000'), '38;5;16')
        self.assertEqual(parsecolor('gray0'), '38;5;232')

    def test_stringc(self):
        self.assertEqual(stringc('test', 'red'), '\033[31mtest\033[0m')
        self.assertEqual(stringc('test', 'red', True), '\001\033[31m\002test\001\033[0m\002')

    def test_colorize(self):
        self.assertEqual(colorize('test', 1, 'red'), 'test=   1')
        self.assertEqual(colorize('test', 1, 'red'), 'test=   1')

    def test_hostcolor(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        self.assertEqual(hostcolor('test', stats), 'test')
        stats['failures'] = 1
        self.assertEqual(hostcolor('test', stats), 'test')
        stats['failures'] = 0
        stats['unreachable'] = 1
        self.assertEqual(hostcolor('test', stats), 'test')
        stats['unreachable'] = 0
        stats['changed'] = 1
        self.assertEqual(hostcolor('test', stats), 'test')

if __name__ == '__main__':
    unittest.main()