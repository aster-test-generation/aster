import unittest
from ansible.module_utils import role_util


class TestRoleMetadata(unittest.TestCase):
    def test_init(self):
        instance = RoleMetadata(owner=None)
        self.assertEqual(instance._owner, None)
        self.assertEqual(instance._allow_duplicates, False)
        self.assertEqual(instance._dependencies, [])
        self.assertEqual(instance._galaxy_info, None)
        self.assertEqual(instance._argument_specs, {})

    def test_load(self):
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        instance = RoleMetadata(owner=None)
        result = instance.load(data, owner=None)
        self.assertEqual(result._allow_duplicates, True)
        self.assertEqual(result._dependencies, ['role1', 'role2'])
        self.assertEqual(result._galaxy_info, None)
        self.assertEqual(result._argument_specs, {})

    def test_load_dependencies(self):
        instance = RoleMetadata(owner=None)
        roles = instance._load_dependencies('dependencies', ['role1', 'role2'])
        self.assertEqual(roles, ['role1', 'role2'])

    def test_load_galaxy_info(self):
        instance = RoleMetadata(owner=None)
        galaxy_info = instance._load_galaxy_info('galaxy_info', {'name': 'role1'})
        self.assertEqual(galaxy_info, {'name': 'role1'})

    def test_serialize(self):
        instance = RoleMetadata(owner=None)
        instance._allow_duplicates = True
        instance._dependencies = ['role1', 'role2']
        serialized = instance.serialize()
        self.assertEqual(serialized, {'allow_duplicates': True, 'dependencies': ['role1', 'role2']})

    def test_deserialize(self):
        instance = RoleMetadata(owner=None)
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        instance.deserialize(data)
        self.assertEqual(instance._allow_duplicates, True)
        self.assertEqual(instance._dependencies, ['role1', 'role2'])

    def test_str(self):
        instance = RoleMetadata(owner=None)
        result = str(instance)
        self.assertEqual(result, 'RoleMetadata')

    def test_repr(self):
        instance = RoleMetadata(owner=None)
        result = repr(instance)
        self.assertEqual(result, 'RoleMetadata(None)')

    def test_eq(self):
        instance1 = RoleMetadata(owner=None)
        instance2 = RoleMetadata(owner=None)
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()