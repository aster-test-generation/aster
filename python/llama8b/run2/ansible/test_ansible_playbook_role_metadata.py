import unittest
from ansible.module_utils import metadat

class TestRoleMetadata(unittest.TestCase):
    def test_init(self):
        role_metadata = RoleMetadata()
        self.assertEqual(role_metadata._owner, None)
        self.assertEqual(role_metadata._allow_duplicates, False)
        self.assertEqual(role_metadata._dependencies, [])
        self.assertEqual(role_metadata._galaxy_info, None)
        self.assertEqual(role_metadata._argument_specs, {})

    def test_load(self):
        role_metadata = RoleMetadata()
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        role_metadata.load(data, owner=None)
        self.assertEqual(role_metadata._allow_duplicates, True)
        self.assertEqual(role_metadata._dependencies, ['role1', 'role2'])

    def test_load_dependencies(self):
        role_metadata = RoleMetadata()
        ds = ['role1', 'role2']
        result = role_metadata._load_dependencies('dependencies', ds)
        self.assertEqual(result, [])

    def test_load_galaxy_info(self):
        role_metadata = RoleMetadata()
        ds = {'galaxy_info': 'info'}
        result = role_metadata._load_galaxy_info('galaxy_info', ds)
        self.assertEqual(result, 'info')

    def test_serialize(self):
        role_metadata = RoleMetadata()
        role_metadata._allow_duplicates = True
        role_metadata._dependencies = ['role1', 'role2']
        result = role_metadata.serialize()
        self.assertEqual(result, {'allow_duplicates': True, 'dependencies': ['role1', 'role2']})

    def test_deserialize(self):
        role_metadata = RoleMetadata()
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        role_metadata.deserialize(data)
        self.assertEqual(role_metadata._allow_duplicates, True)
        self.assertEqual(role_metadata._dependencies, ['role1', 'role2'])

    def test_str(self):
        role_metadata = RoleMetadata()
        result = str(role_metadata)
        self.assertEqual(result, 'RoleMetadata')

    def test_repr(self):
        role_metadata = RoleMetadata()
        result = repr(role_metadata)
        self.assertEqual(result, 'RoleMetadata()')

    def test_eq(self):
        role_metadata1 = RoleMetadata()
        role_metadata2 = RoleMetadata()
        self.assertEqual(role_metadata1, role_metadata2)

if __name__ == '__main__':
    unittest.main()