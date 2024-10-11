import unittest
from ansible.playbook.role.metadata import RoleMetadata


class TestRoleMetadata(unittest.TestCase):
    def test_load_method(self):
        data = {'key': 'value'}
        role_metadata = RoleMetadata.load(data, None)
        self.assertEqual(role_metadata.key, 'value')

    def test_load_dependencies_method(self):
        ds = ['role1', 'role2']
        role_metadata = RoleMetadata()
        roles = role_metadata._load_dependencies('dependencies', ds)
        self.assertEqual(len(roles), 2)
        self.assertEqual(roles[0], 'role1')
        self.assertEqual(roles[1], 'role2')

    def test_load_galaxy_info_method(self):
        ds = {'key': 'value'}
        role_metadata = RoleMetadata()
        galaxy_info = role_metadata._load_galaxy_info('galaxy_info', ds)
        self.assertEqual(galaxy_info['key'], 'value')

    def test_serialize_method(self):
        role_metadata = RoleMetadata()
        role_metadata.allow_duplicates = True
        role_metadata.dependencies = ['role1', 'role2']
        serialized_data = role_metadata.serialize()
        self.assertEqual(serialized_data['allow_duplicates'], False)
        self.assertEqual(serialized_data['dependencies'], ['role1', 'role2'])

    def test_deserialize_method(self):
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        role_metadata = RoleMetadata()
        role_metadata.deserialize(data)
        self.assertEqual(role_metadata.allow_duplicates, True)
        self.assertEqual(role_metadata.dependencies, ['role1', 'role2'])

if __name__ == '__main__':
    unittest.main()