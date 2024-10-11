import unittest
from ansible.playbook.role.include import RoleInclude


class TestRoleInclude(unittest.TestCase):
    def test_init(self):
        play = object()
        role_basedir = object()
        variable_manager = object()
        loader = object()
        collection_list = object()
        ri = RoleInclude(play=play, role_basedir=role_basedir, variable_manager=variable_manager, loader=loader, collection_list=collection_list)
        self.assertEqual(ri._play, play)
        self.assertEqual(ri._role_basedir, role_basedir)
        self.assertEqual(ri._variable_manager, variable_manager)
        self.assertEqual(ri._loader, loader)
        self.assertEqual(ri._collection_list, collection_list)

    def test_load(self):
        data = object()
        play = object()
        current_role_path = object()
        parent_role = object()
        variable_manager = object()
        loader = object()
        collection_list = object()
        ri = RoleInclude.load(data, play, current_role_path=current_role_path, parent_role=parent_role, variable_manager=variable_manager, loader=loader, collection_list=collection_list)
        self.assertEqual(ri._data, data)
        self.assertEqual(ri._play, play)
        self.assertEqual(ri._role_path, current_role_path)
        self.assertEqual(ri._parent_role, parent_role)
        self.assertEqual(ri._variable_manager, variable_manager)
        self.assertEqual(ri._loader, loader)
        self.assertEqual(ri._collection_list, collection_list)

if __name__ == '__main__':
    unittest.main()