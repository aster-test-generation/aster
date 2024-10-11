import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector, get_uname, _file_exists


class TestGetUname(unittest.TestCase):
    def test_uname_with_flags(self):
        module = MagicMock()
        module.run_command.return_value = (0, 'output', '')
        result = get_uname(module, flags='-v')
        self.assertEqual(result, 'output')

    def test_uname_without_flags(self):
        module = MagicMock()
        module.run_command.return_value = (0, 'output', '')
        result = get_uname(module)
        self.assertEqual(result, 'output')

class TestFileExists(unittest.TestCase):
    def test_file_exists(self):
        path = '/path/to/file'
        result = _file_exists(path)
        self.assertTrue(result)

    def test_file_not_exists(self):
        path = '/path/to/file'
        result = _file_exists(path)
        self.assertFalse(result)

    def test_file_empty(self):
        path = '/path/to/file'
        result = _file_exists(path, allow_empty=True)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()