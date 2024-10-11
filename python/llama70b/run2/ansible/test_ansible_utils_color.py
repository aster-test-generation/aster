import unittest
from ansible.utils import color 


class TestColorUtils(unittest.TestCase):
    def test_parsecolor(self):
        self.assertEqual(parsecolor("color1"), u'38;5;1')
        self.assertEqual(parsecolor("rgb101"), u'38;5;226')
        self.assertEqual(parsecolor("gray10"), u'38;5;242')
        self.assertEqual(parsecolor("unknown"), None)

    def test_stringc(self):
        self.assertEqual(stringc("Hello World", "color1"), u"\033[38;5;1mHello World\033[0m")
        self.assertEqual(stringc("Hello World", "color1", wrap_nonvisible_chars=True), u"\001\033[38;5;1m\002Hello World\001\033[0m\002")
        self.assertEqual(stringc("Hello World", "unknown"), "Hello World")

    def test_colorize(self):
        self.assertEqual(colorize("Lead", 1, "color1"), u"Lead=   1")
        self.assertEqual(colorize("Lead", 1, "color1", ANSIBLE_COLOR=True), u"\033[38;5;1mLead=   1\033[0m")

    def test_hostcolor(self):
        stats = {"failures": 0, "unreachable": 0, "changed": 0}
        self.assertEqual(hostcolor("host1", stats), u"host1                 ")
        self.assertEqual(hostcolor("host1", stats, color=True), u"\033[38;5;2mhost1                 \033[0m")
        stats["failures"] = 1
        self.assertEqual(hostcolor("host1", stats, color=True), u"\033[38;5;1mhost1                 \033[0m")

    def test_ANSIBLE_COLOR(self):
        self.assertTrue(ANSIBLE_COLOR)

if __name__ == '__main__':
    unittest.main()