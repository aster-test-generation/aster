import unittest
from ansible.utils.color import *


class TestAnsibleColor(unittest.TestCase):
    def test_parsecolor(self):
        color = "color1"
        result = parsecolor(color)
        self.assertEqual(result, C.COLOR_CODES[color])

    def test_stringc(self):
        text = "test"
        color = "color1"
        wrap_nonvisible_chars = False
        result = stringc(text, color, wrap_nonvisible_chars)
        self.assertEqual(result, u"\033[%sm%s\033[0m" % (parsecolor(color), text))

    def test_colorize(self):
        lead = "lead"
        num = 1
        color = "color1"
        result = colorize(lead, num, color)
        self.assertEqual(result, u"%s=%-4s" % (lead, str(num)))

    def test_hostcolor(self):
        host = "host"
        stats = {"failures": 0, "unreachable": 0, "changed": 0}
        color = True
        result = hostcolor(host, stats, color)
        self.assertEqual(result, u"%-26s" % host)

if __name__ == '__main__':
    unittest.main()