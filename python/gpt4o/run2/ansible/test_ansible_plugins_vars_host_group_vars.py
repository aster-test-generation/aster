import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.vars.host_group_vars import VarsModule
from ansible.errors import AnsibleParserError
from ansible.inventory.host import Host
from ansible.inventory.group import Group


class TestVarsModule(unittest.TestCase):
    def setUp(self):
        self.loader = MagicMock()
        self.path = "/fake/path"
        self.host = Host(name="test_host")
        self.group = Group(name="test_group")
        self.vars_module = VarsModule()

    def test_get_vars_with_host(self):
        self.loader.find_vars_files.return_value = []
        result = self.vars_module.get_vars(self.loader, self.path, [self.host])
        self.assertEqual(result, {})

    def test_get_vars_with_group(self):
        self.loader.find_vars_files.return_value = []
        result = self.vars_module.get_vars(self.loader, self.path, [self.group])
        self.assertEqual(result, {})

    def test_get_vars_with_invalid_entity(self):
        with self.assertRaises(AnsibleParserError):
            self.vars_module.get_vars(self.loader, self.path, ["invalid_entity"])

    def test_get_vars_with_cache(self):
        self.loader.find_vars_files.return_value = []
        with patch.dict('ansible.plugins.vars.host_group_vars.FOUND', { 'test_host./fake/path/host_vars': [] }):
            result = self.vars_module.get_vars(self.loader, self.path, [self.host])
            self.assertEqual(result, {})

    def test_get_vars_without_cache(self):
        self.loader.find_vars_files.return_value = []
        with patch.dict('ansible.plugins.vars.host_group_vars.FOUND', {}, clear=True):
            result = self.vars_module.get_vars(self.loader, self.path, [self.host])
            self.assertEqual(result, {})

    def test_get_vars_with_found_files(self):
        self.loader.find_vars_files.return_value = ["file1"]
        self.loader.load_from_file.return_value = {"key": "value"}
        result = self.vars_module.get_vars(self.loader, self.path, [self.host])
        self.assertEqual(result, {})

    def test_get_vars_with_exception(self):
        self.loader.find_vars_files.side_effect = Exception("Test Exception")
        with self.assertRaises(AnsibleParserError):
            self.vars_module.get_vars(self.loader, self.path, [self.host])

if __name__ == '__main__':
    unittest.main()