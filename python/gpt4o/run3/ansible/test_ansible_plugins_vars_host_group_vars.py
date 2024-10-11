import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.vars.host_group_vars import VarsModule
from ansible.errors import AnsibleParserError
from ansible.inventory.host import Host
from ansible.inventory.group import Group
from ansible.utils.vars import combine_vars


class TestVarsModule(unittest.TestCase):
    def setUp(self):
        self.vars_module = VarsModule()
        self.loader = MagicMock()
        self.path = "/some/path"
        self.host = Host(name="test_host")
        self.group = Group(name="test_group")
        self.entities = [self.host, self.group]

    def test_get_vars_with_host(self):
        self.loader.find_vars_files.return_value = []
        result = self.vars_module.get_vars(self.loader, self.path, self.host)
        self.assertEqual(result, {})

    def test_get_vars_with_group(self):
        self.loader.find_vars_files.return_value = []
        result = self.vars_module.get_vars(self.loader, self.path, self.group)
        self.assertEqual(result, {})

    def test_get_vars_with_invalid_entity(self):
        with self.assertRaises(AnsibleParserError):
            self.vars_module.get_vars(self.loader, self.path, "invalid_entity")

    def test_get_vars_with_found_files(self):
        self.loader.find_vars_files.return_value = ["file1", "file2"]
        self.loader.load_from_file.side_effect = [{"key1": "value1"}, {"key2": "value2"}]
        result = self.vars_module.get_vars(self.loader, self.path, self.host)
        self.assertEqual(result, {})

    def test_get_vars_with_exception(self):
        self.loader.find_vars_files.side_effect = Exception("Test Exception")
        with self.assertRaises(AnsibleParserError):
            self.vars_module.get_vars(self.loader, self.path, self.host)

    def test_requires_whitelist(self):
        self.assertTrue(self.vars_module.REQUIRES_WHITELIST)

    def test_get_vars_cache(self):
        key = 'test_host./some/path/host_vars'
        with patch.dict('ansible.plugins.vars.host_group_vars.FOUND', {key: ["file1"]}):
            self.loader.load_from_file.return_value = {"key1": "value1"}
            result = self.vars_module.get_vars(self.loader, self.path, self.host)
            self.assertEqual(result, {})

    def test_get_vars_no_cache(self):
        key = 'test_host./some/path/host_vars'
        with patch.dict('ansible.plugins.vars.host_group_vars.FOUND', {key: ["file1"]}):
            self.loader.load_from_file.return_value = {"key1": "value1"}
            result = self.vars_module.get_vars(self.loader, self.path, self.host, cache=False)
            self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()