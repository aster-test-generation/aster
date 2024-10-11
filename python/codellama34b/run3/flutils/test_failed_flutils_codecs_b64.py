import unittest
from flutils.codecs.b64 import *

class TestB64(unittest.TestCase):
    def test_encode(self):
        text = "test"
        errors = "strict"
        result = encode(text, errors)
        self.assertEqual(result, (b'\xb5\xeb-', 4))

    def test_decode(self):
        data = b"dGVzdA=="
        errors = "strict"
        result = decode(data, errors)
        self.assertEqual(result, ('ZEdWemRBPT0=', 8))

    def test_register(self):
        register()
        self.assertTrue(True)

if __name__ == '__main__':
    unittest.main()