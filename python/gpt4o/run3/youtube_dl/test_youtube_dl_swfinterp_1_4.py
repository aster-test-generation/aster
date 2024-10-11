import unittest
from youtube_dl.swfinterp import _Multiname, _read_int


class TestMultiname(unittest.TestCase):
    def test_init(self):
        instance = _Multiname(0x10)
        self.assertEqual(instance.kind, 0x10)

    def test_repr(self):
        instance = _Multiname(0x10)
        result = instance.__repr__()
        self.assertEqual(result, '[MULTINAME kind: 0x10]')

if __name__ == '__main__':
    unittest.main()