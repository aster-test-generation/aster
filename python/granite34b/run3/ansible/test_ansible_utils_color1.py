import unittest
from ansible.utils.color import *

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