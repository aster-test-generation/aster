import unittest
from ansible.playbook.role.include import RoleInclude


class TestRoleInclude(unittest.TestCase):
    def test_init(self):
        play = None
        role_basedir = None
        variable_manager = None
        loader = None
        collection_list = None
        ri = RoleInclude(play, role_basedir, variable_manager, loader, collection_list)
        self.assertEqual(ri._play, play)
        self.assertEqual(ri._role_basedir, role_basedir)
        self.assertEqual(ri._variable_manager, variable_manager)
        self.assertEqual(ri._loader, loader)
        self.assertEqual(ri._collection_list, collection_list)

    def test_load_data(self):
        data = "example_data"
        variable_manager = None
        loader = None
        ri = RoleInclude()
        ri.load_data(data, variable_manager, loader)
        self.assertEqual(ri._data, data)
        self.assertEqual(ri._variable_manager, variable_manager)
        self.assertEqual(ri._loader, loader)

if __name__ == '__main__':
    unittest.main()