import unittest
from ansible.executor.discovery.python_target import *


class TestPythonTarget(unittest.TestCase):
    def test_read_utf8_file(self):
        result = read_utf8_file(__file__)
        self.assertIsNotNone(result)

    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertIsNotNone(result)
        self.assertIsNotNone(result['platform_dist_result'])
        self.assertIsNotNone(result['osrelease_content'])

    def test_main(self):
        main()

if __name__ == '__main__':
    unittest.main()