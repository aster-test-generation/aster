import unittest
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info


class TestReadUtf8File(unittest.TestCase):
    def test_read_utf8_file(self):
        path = 'path/to/file.txt'
        content = 'This is a test file content.'
        with open(path, 'w') as fd:
            fd.write(content)
        result = read_utf8_file(path)
        self.assertEqual(result, content)

    def test_read_utf8_file_not_readable(self):
        path = 'path/to/non_readable_file.txt'
        result = read_utf8_file(path)
        self.assertIsNone(result)

class TestGetPlatformInfo(unittest.TestCase):
    def test_get_platform_info(self):
        info = get_platform_info()
        self.assertIn('platform_dist_result', info)
        self.assertIn('osrelease_content', info)

    def test_get_platform_info_osrelease_content_empty(self):
        info = get_platform_info()
        self.assertIn('osrelease_content', info)
        self.assertEqual(info['osrelease_content'], '')

if __name__ == '__main__':
    unittest.main()