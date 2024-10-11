import unittest
from ansible.playbook.role.include import RoleInclude
from ansible.errors import AnsibleError, AnsibleParserError
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject
from ansible.module_utils.six import string_types


class TestRoleInclude(unittest.TestCase):
    def setUp(self):
        self.play = None
        self.role_basedir = None
        self.variable_manager = None
        self.loader = None
        self.collection_list = None
        self.instance = RoleInclude(play=self.play, role_basedir=self.role_basedir, variable_manager=self.variable_manager, loader=self.loader, collection_list=self.collection_list)

    def test_init(self):
        self.assertIsInstance(self.instance, RoleInclude)

    def test_load_valid_string(self):
        data = "valid_role"
        result = RoleInclude.load(data, self.play, self.role_basedir, 'valid_role', self.variable_manager, self.loader, self.collection_list)
        self.assertIsInstance(result, RoleInclude)

    def test_load_invalid_data_type(self):
        data = 12345
        with self.assertRaises(AnsibleParserError):
            RoleInclude.load(data, self.play, self.role_basedir, None, self.variable_manager, self.loader, self.collection_list)

    def test_load_invalid_old_style_role(self):
        data = "invalid,role"
        with self.assertRaises(AnsibleError):
            RoleInclude.load(data, self.play, self.role_basedir, None, self.variable_manager, self.loader, self.collection_list)

    def test_load_valid_dict(self):
        data = {"name": "valid_role"}
        result = RoleInclude.load(data, self.play, self.role_basedir, 'valid_role', self.variable_manager, self.loader, self.collection_list)
        self.assertIsInstance(result, RoleInclude)

    def test_load_valid_ansible_base_yaml_object(self):
        data = AnsibleBaseYAMLObject()
        result = RoleInclude.load(data, self.play, self.role_basedir, None, self.variable_manager, self.loader, self.collection_list).to_dict()
        self.assertIsInstance(result, RoleInclude)

    def test_delegate_to_field_attribute(self):
        self.assertIsInstance(self.instance._delegate_to, FieldAttribute)

    def test_delegate_facts_field_attribute(self):
        self.assertIsInstance(self.instance._delegate_facts, ansible.playbook.attribute.FieldAttribute)
        self.assertFalse(self.instance._delegate_facts)

if __name__ == '__main__':
    unittest.main()