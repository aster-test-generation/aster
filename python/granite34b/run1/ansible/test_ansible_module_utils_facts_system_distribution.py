import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector, get_uname, _file_exists


class TestGetUname(unittest.TestCase):
    def test_get_uname_default(self):
        module = MagicMock()
        module.run_command.return_value = (0, 'output', '')
        result = get_uname(module)
        self.assertEqual(result, 'output')
        module.run_command.assert_called_once_with(['uname', '-v'])

    def test_get_uname_flags(self):
        module = MagicMock()
        module.run_command.return_value = (0, 'output', '')
        result = get_uname(module, flags='-a')
        self.assertEqual(result, 'output')
        module.run_command.assert_called_once_with(['uname', '-a'])

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