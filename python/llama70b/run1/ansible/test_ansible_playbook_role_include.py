import unittest
from ansible.playbook.role.include import RoleInclude 


class TestRoleInclude(unittest.TestCase):
    def test_init(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        self.assertIsInstance(instance, RoleInclude)

    def test_delegate_to(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        instance._delegate_to = 'test_delegate_to'
        self.assertEqual(instance._delegate_to, 'test_delegate_to')

    def test_delegate_facts(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        instance._delegate_facts = True
        self.assertTrue(instance._delegate_facts)

    def test_load(self):
        data = {'role': 'test_role'}
        play = None
        current_role_path = None
        parent_role = None
        variable_manager = None
        loader = None
        collection_list = None
        instance = RoleInclude.load(data, play, current_role_path, parent_role, variable_manager, loader, collection_list)
        self.assertIsInstance(instance, RoleInclude)

    def test_load_data(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        data = {'role': 'test_role'}
        instance.load_data(data, variable_manager=None, loader=None)
        self.assertEqual(instance.role, 'test_role')

    def test_str_method(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        instance2 = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        self.assertTrue(instance1 == instance2)

    def test_private_method(self):
        instance = RoleInclude(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        result = instance._RoleInclude__init_subclass__()
        self.assertIsNone(result)

class TestRoleDefinition(unittest.TestCase):
    def test_init(self):
        instance = RoleDefinition(play=None, role_basedir=None, variable_manager=None, loader=None, collection_list=None)
        self.assertIsInstance(instance, RoleDefinition)

class TestFieldAttribute(unittest.TestCase):
    def test_init(self):
        instance = FieldAttribute(isa='string')
        self.assertIsInstance(instance, FieldAttribute)

if __name__ == '__main__':
    unittest.main()