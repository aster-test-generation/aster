import unittest
from ansible.config.manager import ConfigManager



class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        result = find_ini_config_file()
        self.assertIsNotNone(result)

class TestPlugin(unittest.TestCase):
    def test_plugin(self):
        result = Plugin('name', 'type')
        self.assertEqual(result.name, 'name')
        self.assertEqual(result.type, 'type')

class TestSetting(unittest.TestCase):
    def test_setting(self):
        result = Setting('name', 'value', 'origin', 'type')
        self.assertEqual(result.name, 'name')
        self.assertEqual(result.value, 'value')
        self.assertEqual(result.origin, 'origin')
        self.assertEqual(result.type, 'type')

class TestBaseDefs(unittest.TestCase):
    def test_base_defs(self):
        result = _add_base_defs_deprecations(base_defs)
        self.assertIsNotNone(result)

class TestManager(unittest.TestCase):
    def test_manager(self):
        result = Manager()
        self.assertIsNotNone(result)

class TestConfigData(unittest.TestCase):
    def test_config_data(self):
        result = ConfigData()
        self.assertIsNotNone(result)

class TestAnsibleOptionsError(unittest.TestCase):
    def test_ansible_options_error(self):
        result = AnsibleOptionsError()
        self.assertIsNotNone(result)

class TestAnsibleError(unittest.TestCase):
    def test_ansible_error(self):
        result = AnsibleError()
        self.assertIsNotNone(result)

class TestConfigManager(unittest.TestCase):
    def test_config_manager(self):
        result = ConfigManager()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigData(unittest.TestCase):
    def test_config_manager_load_config_data(self):
        result = ConfigManager.load_config_data()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigFile(unittest.TestCase):
    def test_config_manager_load_config_file(self):
        result = ConfigManager.load_config_file()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigFilePath(unittest.TestCase):
    def test_config_manager_load_config_file_path(self):
        result = ConfigManager.load_config_file_path()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigFilePaths(unittest.TestCase):
    def test_config_manager_load_config_file_paths(self):
        result = ConfigManager.load_config_file_paths()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigFilePathsPath(unittest.TestCase):
    def test_config_manager_load_config_file_paths_path(self):
        result = ConfigManager.load_config_file_paths_path()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigFilePathsPaths(unittest.TestCase):
    def test_config_manager_load_config_file_paths_paths(self):
        result = ConfigManager.load_config_file_paths_paths()
        self.assertIsNotNone(result)

class TestConfigManagerLoadConfigFilePathsPathsPath(unittest.TestCase):
    def test_config_manager_load_config_file_paths_paths_path(self):
        result = ConfigManager.load_config_file_paths_paths_path()
        self.assertIsNotNone(result)


if __name__ == '__main__':
    unittest.main()