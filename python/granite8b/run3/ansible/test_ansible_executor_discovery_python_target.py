import unittest
from ansible.executor.discovery.python_target import *


class TestPythonTarget(unittest.TestCase):
    def test_read_utf8_file(self):
        result = read_utf8_file('/path/to/file.txt')
        self.assertEqual(result, 'file content')

    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertEqual(result['platform_dist_result'], ('dist_name', 'dist_version', 'dist_id'))
        self.assertEqual(result['osrelease_content'], 'osrelease content')

    def test_main(self):
        with self.assertRaises(SystemExit) as cm:
            main()
        self.assertEqual(cm.exception.code, 0)

if __name__ == '__main__':
    unittest.main()