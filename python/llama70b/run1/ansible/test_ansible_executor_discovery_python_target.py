from ansible.executor.discovery.python_target import main
import io
import os
import unittest
from ansible.executor.discovery.python_target import read_utf8_file, get_platform_info


class TestReadUtf8FileFunction(unittest.TestCase):
    def test_read_utf8_file_exists(self):
        with open('test_file.txt', 'w') as f:
            f.write('Test content')
        result = read_utf8_file('test_file.txt')
        self.assertEqual(result, 'Test content')
        os.remove('test_file.txt')

    def test_read_utf8_file_does_not_exist(self):
        result = read_utf8_file('non_existent_file.txt')
        self.assertIsNone(result)

class TestGetPlatformInfoFunction(unittest.TestCase):
    def test_get_platform_info(self):
        result = get_platform_info()
        self.assertIsInstance(result, dict)
        self.assertIn('platform_dist_result', result)
        self.assertIn('osrelease_content', result)

class TestMainFunction(unittest.TestCase):
    def test_main(self):
        with unittest.mock.patch('sys.stdout', new=io.StringIO()) as fake_stdout:
            main()
            self.assertIsNotNone(fake_stdout.getvalue())

if __name__ == '__main__':
    unittest.main()