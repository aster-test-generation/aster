import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        self.assertEqual(get_bin_path('ls'), '/usr/bin/ls')
        self.assertEqual(get_bin_path('ls', opt_dirs=['/usr/local/bin']), '/usr/local/bin/ls')
        self.assertRaises(ValueError, get_bin_path, 'not_a_command')

if __name__ == '__main__':
    unittest.main()