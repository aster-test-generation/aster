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
        result = RoleInclude(play, role_basedir, variable_manager, loader, collection_list)
        self.assertEqual(result, "result")

    def test_load_data(self):
        data = "data"
        variable_manager = "variable_manager"
        loader = "loader"
        result = RoleInclude.load_data(data, variable_manager, loader)
        self.assertEqual(result, "result")

    def test_get_role_path(self):
        result = RoleInclude.get_role_path()
        self.assertEqual(result, "result")

    def test_get_role_params(self):
        result = RoleInclude.get_role_params()
        self.assertEqual(result, "result")

    def test_get_role_vars(self):
        result = RoleInclude.get_role_vars()
        self.assertEqual(result, "result")

    def test_get_role_path_relative_to_playbook(self):
        result = RoleInclude.get_role_path_relative_to_playbook()
        self.assertEqual(result, "result")

    def test_get_search_path(self):
        result = RoleInclude.get_search_path()
        self.assertEqual(result, "result")

    def test_get_parent_role(self):
        result = RoleInclude.get_parent_role()
        self.assertEqual(result, "result")

    def test_get_collection_list(self):
        result = RoleInclude.get_collection_list()
        self.assertEqual(result, "result")

    def test_get_default_vars(self):
        result = RoleInclude.get_default_vars()
        self.assertEqual(result, "result")

    def test_get_vars(self):
        result = RoleInclude.get_vars()
        self.assertEqual(result, "result")

    def test_get_role_dependencies(self):
        result = RoleInclude.get_role_dependencies()
        self.assertEqual(result, "result")

    def test_get_task_blocks(self):
        result = RoleInclude.get_task_blocks()
        self.assertEqual(result, "result")

    def test_get_handler_blocks(self):
        result = RoleInclude.get_handler_blocks()
        self.assertEqual(result, "result")

    def test_get_default_tags(self):
        result = RoleInclude.get_default_tags()
        self.assertEqual(result, "result")

    def test_get_role_metadata(self):
        result = RoleInclude.get_role_metadata()
        self.assertEqual(result, "result")

    def test_get_role_files(self):
        result = RoleInclude.get_role_files()
        self.assertEqual(result, "result")

    def test_get_role_file_vars(self):
        result = RoleInclude.get_role_file_vars()
        self.assertEqual(result, "result")

if __name__ == '__main__':
    unittest.main()