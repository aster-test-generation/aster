import unittest
from ansible.playbook.role.include import RoleInclude


class TestRoleInclude(unittest.TestCase):
    def test_init(self):
        play = "play"
        role_basedir = "role_basedir"
        variable_manager = "variable_manager"
        loader = "loader"
        collection_list = "collection_list"
        role_include = RoleInclude(play, role_basedir, variable_manager, loader, collection_list)
        self.assertEqual(role_include.play, 'play')
        self.assertEqual(role_include.role_basedir, role_basedir)
        self.assertEqual(role_include.variable_manager, variable_manager)
        self.assertEqual(role_include.loader, loader)
        self.assertEqual(role_include.collection_list, collection_list)

    def test_load(self):
        data = "data"
        play = "play"
        current_role_path = "current_role_path"
        parent_role = "parent_role"
        variable_manager = "variable_manager"
        loader = "loader"
        collection_list = "collection_list"
        role_include = RoleInclude.load(data, play, current_role_path, parent_role, variable_manager, loader, collection_list)
        self.assertEqual(role_include.data, data)
        self.assertEqual(role_include.play, play)
        self.assertEqual(role_include.current_role_path, current_role_path)
        self.assertEqual(role_include.parent_role, parent_role)
        self.assertEqual(role_include.variable_manager, variable_manager)
        self.assertEqual(role_include.loader, loader)
        self.assertEqual(role_include.collection_list, collection_list)

if __name__ == '__main__':
    unittest.main()