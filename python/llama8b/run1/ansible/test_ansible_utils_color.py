import unittest
from ansible.utils.color import AnsibleColorHelpe


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
        text = 'Hello, World!'
        result = stringc(text, 'color1')
        self.assertEqual(result, u"\033[38;5;1Hello, World!\033[0m")

    def test_stringc_wrap_nonvisible_chars(self):
        text = 'Hello, World!\u200b'
        result = stringc(text, 'color1', wrap_nonvisible_chars=True)
        self.assertEqual(result, u"\001\033[38;5;1Hello, World!\u200b\001\033[0m\002")

    def test_colorize(self):
        result = colorize('lead', 1, 'color1')
        self.assertEqual(result, u"lead=    1")

    def test_colorize_no_color(self):
        result = colorize('lead', 1, None)
        self.assertEqual(result, u"lead=    1")

    def test_hostcolor(self):
        stats = {'failures': 1, 'unreachable': 0, 'changed': 0}
        result = hostcolor('host', stats)
        self.assertEqual(result, u"%-37s" % stringc('host', C.COLOR_ERROR))

    def test_hostcolor_no_color(self):
        stats = {'failures': 0, 'unreachable': 0, 'changed': 0}
        result = hostcolor('host', stats, color=False)
        self.assertEqual(result, u"%-26s" % 'host')

if __name__ == '__main__':
    unittest.main()