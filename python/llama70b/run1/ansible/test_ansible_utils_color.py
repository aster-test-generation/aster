import unittest
from ansible.utils import color 


class TestColorUtils(unittest.TestCase):
    def test_parsecolor(self):
        self.assertEqual(parsecolor("color1"), u'38;5;1')
        self.assertEqual(parsecolor("rgb100"), u'38;5;16')
        self.assertEqual(parsecolor("gray10"), u'38;5;242')
        self.assertEqual(parsecolor("unknown"), None)

    def test_stringc(self):
        self.assertEqual(stringc("hello", "color1"), u"\033[38;5;1mhello\033[0m")
        self.assertEqual(stringc("hello", "color1", wrap_nonvisible_chars=True), u"\001\033[38;5;1m\002hello\001\033[0m\002")
        self.assertEqual(stringc("hello", "unknown"), "hello")

    def test_colorize(self):
        self.assertEqual(colorize("lead", 1, "color1"), u"lead=    1")
        self.assertEqual(colorize("lead", 1, "color1", ANSIBLE_COLOR=True), u"\033[38;5;1mlead=    1\033[0m")
        self.assertEqual(colorize("lead", 0, "color1"), "lead=    0")

    def test_hostcolor(self):
        stats = {"failures": 0, "unreachable": 0, "changed": 0}
        self.assertEqual(hostcolor("host", stats, color=True), u"%-37s" % u"host")
        stats["failures"] = 1
        self.assertEqual(hostcolor("host", stats, color=True), u"%-37s" % u"\033[38;5;1mhost\033[0m")
        stats["changed"] = 1
        self.assertEqual(hostcolor("host", stats, color=True), u"%-37s" % u"\033[38;5;2mhost\033[0m")

    def test_ANSIBLE_COLOR(self):
        self.assertIsInstance(ANSIBLE_COLOR, bool)

if __name__ == '__main__':
    unittest.main()