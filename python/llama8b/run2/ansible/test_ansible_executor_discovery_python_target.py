import unittest
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info


class TestReadUtf8File(unittest.TestCase):
    def test_read_utf8_file_valid_path(self):
        path = 'path/to/file.txt'
        content = 'Hello, World!'
        with open(path, 'w') as fd:
            fd.write(content)
        result = read_utf8_file(path)
        self.assertEqual(result, content)

    def test_read_utf8_file_invalid_path(self):
        path = 'non_existent_file.txt'
        result = read_utf8_file(path)
        self.assertIsNone(result)

    def test_read_utf8_file_encoding(self):
        path = 'path/to/file.txt'
        content = 'Hello, World!'
        with open(path, 'w') as fd:
            fd.write(content.encode('utf-8'))
        result = read_utf8_file(path, encoding='utf-8')
        self.assertEqual(result, content)

class TestGetPlatformInfo(unittest.TestCase):
    def test_get_platform_info(self):
        info = get_platform_info()
        self.assertIn('platform_dist_result', info)
        self.assertIn('osrelease_content', info)

    def test_get_platform_info_dist_result(self):
        info = get_platform_info()
        self.assertIsInstance(info['platform_dist_result'], tuple)

    def test_get_platform_info_osrelease_content(self):
        info = get_platform_info()
        self.assertIsInstance(info['osrelease_content'], str)

if __name__ == '__main__':
    unittest.main()