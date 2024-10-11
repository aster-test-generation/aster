import unittest
from ansible.executor.discovery.python_target import *


class TestPythonTarget(unittest.TestCase):
    def test_read_utf8_file(self):
        path = "test_path"
        encoding = "utf-8"
        result = read_utf8_file(path, encoding)
        self.assertEqual(result, None)

    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertEqual(result, dict(platform_dist_result=[]))

    def test_main(self):
        info = get_platform_info()
        print(json.dumps(info))

class TestGetPlatformInfo(unittest.TestCase):
    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertIsInstance(result, dict)
        self.assertIsInstance(result['platform_dist_result'], list)
        self.assertIsInstance(result['osrelease_content'], str)

class TestReadUtf8File(unittest.TestCase):
    def test_read_utf8_file(self):
        result = read_utf8_file('test.txt')
        self.assertIsInstance(result, str)

class TestMain(unittest.TestCase):
    def test_main(self):
        main()

if __name__ == '__main__':
    unittest.main()