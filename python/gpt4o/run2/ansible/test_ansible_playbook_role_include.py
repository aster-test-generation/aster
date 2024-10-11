from ansible.playbook.role.include import FieldAttribute
import unittest
from ansible.playbook.role.include import RoleInclude
from ansible.errors import AnsibleError, AnsibleParserError
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject
from ansible.module_utils.six import string_types


class TestRoleInclude(unittest.TestCase):
    def setUp(self):
        self.instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)

    def test_init(self):
        self.assertIsInstance(self.instance, RoleInclude)

    def test_load_valid_string(self):
        data = "valid_role"
        result = RoleInclude.load(data, play=play)
        self.assertIsInstance(result, RoleInclude)

    def test_load_invalid_data_type(self):
        data = 12345
        with self.assertRaises(AnsibleParserError):
            RoleInclude.load(data, play=None)

    def test_load_invalid_old_style_role(self):
        data = "invalid,role"
        with self.assertRaises(AnsibleError):
            RoleInclude.load(data, play=None)

    def test_load_valid_dict(self):
        data = {"name": "valid_role"}
        result = RoleInclude.load(data, play=play)
        self.assertIsInstance(result, RoleInclude)

    def test_load_valid_ansible_base_yaml_object(self):
        data = AnsibleBaseYAMLObject()
        result = RoleInclude.load(data, loader=None)
        self.assertIsInstance(result, RoleInclude)

    def test_delegate_to_field_attribute(self):
        self.assertIsInstance(self.instance._delegate_to, FieldAttribute)

    def test_delegate_facts_field_attribute(self):
        self.assertIsInstance(self.instance._delegate_facts, FieldAttribute)
        self.assertFalse(self.instance._delegate_facts.default)

if __name__ == '__main__':
    unittest.main()