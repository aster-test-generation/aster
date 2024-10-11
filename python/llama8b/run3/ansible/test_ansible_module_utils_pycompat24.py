import unittest
from ansible.module_utils import pycompat24


class TestPycompat24(unittest.TestCase):
    def test_get_exception(self):
        result = pycompat24.get_exception()
        self.assertIsInstance(result, Exception)

if __name__ == '__main__':
    unittest.main()