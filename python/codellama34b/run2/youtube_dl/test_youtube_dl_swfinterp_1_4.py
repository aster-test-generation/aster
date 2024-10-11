from youtube_dl.swfinterp import _Multiname, _read_int
import unittest
from youtube_dl.swfinterp import *


class TestMultiname(unittest.TestCase):
    def test_multiname(self):
        result = _Multiname(0x01)
        self.assertEqual(result.kind, 0x01)

if __name__ == '__main__':
    unittest.main()