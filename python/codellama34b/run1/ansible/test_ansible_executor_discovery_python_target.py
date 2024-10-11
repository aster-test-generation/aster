import unittest
from ansible.executor.discovery.python_target import *


class TestPythonTarget(unittest.TestCase):
    def test_read_utf8_file(self):
        path = ''
        encoding = 'utf-8'
        result = read_utf8_file(path, encoding)
        self.assertEqual(result, None)

    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertEqual(result, {'platform_dist_result': [], 'osrelease_content': None})

    def test_main(self):
        main()

if __name__ == '__main__':
    unittest.main()