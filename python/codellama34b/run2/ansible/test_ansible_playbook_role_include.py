import unittest
from ansible.playbook.role.include import *



class TestRoleInclude(unittest.TestCase):
    def test_load(self):
        data = "test_data"
        play = "test_play"
        current_role_path = "test_current_role_path"
        parent_role = "test_parent_role"
        variable_manager = "test_variable_manager"
        loader = "test_loader"
        collection_list = "test_collection_list"
        result = RoleInclude.load(data, play, current_role_path, parent_role, variable_manager, loader, collection_list)
        self.assertEqual(result, "test_result")

    def test_init(self):
        play = "test_play"
        role_basedir = "test_role_basedir"
        variable_manager = "test_variable_manager"
        loader = "test_loader"
        collection_list = "test_collection_list"
        ri = RoleInclude(play, role_basedir, variable_manager, loader, collection_list)
        self.assertEqual(ri._delegate_to, "test_delegate_to")
        self.assertEqual(ri._delegate_facts, "test_delegate_facts")

    def test_load_data(self):
        data = "test_data"
        variable_manager = "test_variable_manager"
        loader = "test_loader"
        ri = RoleInclude()
        result = ri.load_data(data, variable_manager, loader)
        self.assertEqual(result, "test_result")

    def test_get_role_path(self):
        ri = RoleInclude()
        result = ri.get_role_path()
        self.assertEqual(result, "test_result")

    def test_get_role_params(self):
        ri = RoleInclude()
        result = ri.get_role_params()
        self.assertEqual(result, "test_result")

    def test_get_search_path(self):
        ri = RoleInclude()
        result = ri.get_search_path()
        self.assertEqual(result, "test_result")

    def test_get_parent_role(self):
        ri = RoleInclude()
        result = ri.get_parent_role()
        self.assertEqual(result, "test_result")

    def test_get_collection_list(self):
        ri = RoleInclude()
        result = ri.get_collection_list()
        self.assertEqual(result, "test_result")

    def test_get_default_vars(self):
        ri = RoleInclude()
        result = ri.get_default_vars()
        self.assertEqual(result, "test_result")

    def test_get_vars(self):
        ri = RoleInclude()
        result = ri.get_vars()
        self.assertEqual(result, "test_result")

    def test_get_role_dependencies(self):
        ri = RoleInclude()
        result = ri.get_role_dependencies()
        self.assertEqual(result, "test_result")

    def test_get_task_blocks(self):
        ri = RoleInclude()
        result = ri.get_task_blocks()
        self.assertEqual(result, "test_result")

    def test_get_handler_blocks(self):
        ri = RoleInclude()
        result = ri.get_handler_blocks()
        self.assertEqual(result, "test_result")

    def test_get_templates(self):
        ri = RoleInclude()
        result = ri.get_templates()
        self.assertEqual(result, "test_result")

    def test_get_files(self):
        ri = RoleInclude()
        result = ri.get_files()
        self.assertEqual(result, "test_result")

    def test_get_vars_files(self):
        ri = RoleInclude()
        result = ri.get_vars_files()
        self.assertEqual(result, "test_result")

if __name__ == '__main__':
    unittest.main()