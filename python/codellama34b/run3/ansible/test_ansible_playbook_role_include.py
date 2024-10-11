import unittest
from ansible.playbook.role.include import *



class TestRoleInclude(unittest.TestCase):
    def test_load(self):
        data = "data"
        play = "play"
        current_role_path = "current_role_path"
        parent_role = "parent_role"
        variable_manager = "variable_manager"
        loader = "loader"
        collection_list = "collection_list"
        result = RoleInclude.load(data, play, current_role_path, parent_role, variable_manager, loader, collection_list)
        self.assertEqual(result, "result")

    def test___init__(self):
        play = "play"
        role_basedir = "role_basedir"
        variable_manager = "variable_manager"
        loader = "loader"
        collection_list = "collection_list"
        instance = RoleInclude(play, role_basedir, variable_manager, loader, collection_list)
        self.assertEqual(instance._delegate_to, "delegate_to")
        self.assertEqual(instance._delegate_facts, False)

    def test_load_data(self):
        data = "data"
        variable_manager = "variable_manager"
        loader = "loader"
        instance = RoleInclude()
        result = instance.load_data(data, variable_manager, loader)
        self.assertEqual(result, "result")

    def test_get_role_path(self):
        instance = RoleInclude()
        result = instance.get_role_path()
        self.assertEqual(result, "result")

    def test_get_role_name(self):
        instance = RoleInclude()
        result = instance.get_role_name()
        self.assertEqual(result, "result")

    def test_get_search_path(self):
        instance = RoleInclude()
        result = instance.get_search_path()
        self.assertEqual(result, "result")

    def test_get_parent_role(self):
        instance = RoleInclude()
        result = instance.get_parent_role()
        self.assertEqual(result, "result")

    def test_get_collection_list(self):
        instance = RoleInclude()
        result = instance.get_collection_list()
        self.assertEqual(result, "result")

    def test_get_default_vars(self):
        instance = RoleInclude()
        result = instance.get_default_vars()
        self.assertEqual(result, "result")

    def test_get_vars(self):
        instance = RoleInclude()
        result = instance.get_vars()
        self.assertEqual(result, "result")

    def test_get_dep_chain(self):
        instance = RoleInclude()
        result = instance.get_dep_chain()
        self.assertEqual(result, "result")

    def test_get_include_params(self):
        instance = RoleInclude()
        result = instance.get_include_params()
        self.assertEqual(result, "result")

    def test_get_name(self):
        instance = RoleInclude()
        result = instance.get_name()
        self.assertEqual(result, "result")

    def test_get_relative_path(self):
        instance = RoleInclude()
        result = instance.get_relative_path()
        self.assertEqual(result, "result")

    def test_get_allow_duplicates(self):
        instance = RoleInclude()
        result = instance.get_allow_duplicates()
        self.assertEqual(result, "result")

    def test_get_block(self):
        instance = RoleInclude()
        result = instance.get_block()
        self.assertEqual(result, "result")

    def test_get_delegate_facts(self):
        instance = RoleInclude()
        result = instance.get_delegate_facts()
        self.assertEqual(result, "result")

if __name__ == '__main__':
    unittest.main()