import unittest
from ansible.module_utils.common.process import *

class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path("arg", "opt_dirs", "required")
        self.assertEqual(result, "arg")

if __name__ == '__main__':
    unittest.main()