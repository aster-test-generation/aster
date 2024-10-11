import unittest
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info


class TestPythonTarget(unittest.TestCase):
    def test_read_utf8_file(self):
        path = '/path/to/file.txt'
        content = read_utf8_file(path)
        self.assertEqual(content, 'This is the content of the file')

    def test_get_platform_info(self):
        info = get_platform_info()
        self.assertIn('platform_dist_result', info)
        self.assertIn('osrelease_content', info)

if __name__ == '__main__':
    unittest.main()