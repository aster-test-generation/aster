import unittest
from ansible.plugins.vars.host_group_vars import VarsModule
from ansible.inventory.host import Host
from ansible.inventory.group import Group
from ansible.errors import AnsibleParserError
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.utils.vars import combine_vars


class TestVarsModule(unittest.TestCase):
    def test_get_vars_for_host(self):
        host = Host('host1')
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'path/to/vars', host)
        self.assertIsInstance(vars_data, dict)

    def test_get_vars_for_group(self):
        group = Group('group1')
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'path/to/vars', group)
        self.assertIsInstance(vars_data, dict)

    def test_get_vars_for_invalid_entity(self):
        invalid_entity = object()
        vars_module = VarsModule()
        with self.assertRaises(AnsibleParserError):
            vars_module.get_vars(None, 'path/to/vars', invalid_entity)

    def test_get_vars_for_non_existent_path(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'non/existent/path', Host('host1'))
        self.assertEqual(vars_data, {})

    def test_get_vars_for_existent_path(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'existent/path', Host('host1'))
        self.assertIsInstance(vars_data, dict)

    def test_get_vars_for_existent_path_with_files(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'existent/path', Host('host1'))
        self.assertIsInstance(vars_data, dict)
        self.assertGreater(len(vars_data), 1)

    def test_get_vars_for_existent_path_with_hidden_files(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'existent/path', Host('host1'))
        self.assertIsInstance(vars_data, dict)
        self.assertEqual(len(vars_data), 0)

    def test_get_vars_for_existent_path_with_backup_files(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'existent/path', Host('host1'))
        self.assertIsInstance(vars_data, dict)
        self.assertEqual(len(vars_data), 0)

    def test_get_vars_for_existent_path_with_invalid_extension(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'existent/path', Host('host1'))
        self.assertIsInstance(vars_data, dict)
        self.assertEqual(len(vars_data), 0)

    def test_get_vars_for_existent_path_with_valid_extension(self):
        vars_module = VarsModule()
        vars_data = vars_module.get_vars(None, 'existent/path', Host('host1'))
        self.assertIsInstance(vars_data, dict)
        self.assertGreater(len(vars_data), 1)

if __name__ == '__main__':
    unittest.main()