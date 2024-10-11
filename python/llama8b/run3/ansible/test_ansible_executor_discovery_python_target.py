import unittest
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info


class TestReadUtf8File(unittest.TestCase):
    def test_read_utf8_file_valid_path(self):
        path = 'path/to/file.txt'
        content = read_utf8_file(path)
        self.assertIsNotNone(content)

    def test_read_utf8_file_invalid_path(self):
        path = 'non_existent_file.txt'
        content = read_utf8_file(path)
        self.assertIsNone(content)

    def test_read_utf8_file_encoding(self):
        path = 'path/to/file.txt'
        content = read_utf8_file(path, encoding='latin1')
        self.assertIsNotNone(content)

class TestGetPlatformInfo(unittest.TestCase):
    def test_get_platform_info(self):
        info = get_platform_info()
        self.assertIsNotNone(info)

    def test_get_platform_info_dist_result(self):
        info = get_platform_info()
        self.assertIn('platform_dist_result', info)

    def test_get_platform_info_osrelease_content(self):
        info = get_platform_info()
        self.assertIn('osrelease_content', info)

if __name__ == '__main__':
    unittest.main()