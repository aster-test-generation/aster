import unittest
from ansible.config.manager import find_ini_config_file

class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        path = find_ini_config_file()
        self.assertIsNotNone(path)

if __name__ == '__main__':
    unittest.main()