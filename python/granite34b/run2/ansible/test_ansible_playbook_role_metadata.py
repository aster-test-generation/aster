import unittest
from ansible.playbook.role.metadata import RoleMetadata


class TestRoleMetadata(unittest.TestCase):
    def test_load(self):
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        metadata = RoleMetadata.load(data, None)
        self.assertTrue(metadata.allow_duplicates)
        self.assertEqual(metadata.dependencies, ['role1', 'role2'])

    def test_load_dependencies(self):
        data = ['role1', 'role2']
        metadata = RoleMetadata()
        metadata._owner = 'owner'
        metadata._variable_manager = 'variable_manager'
        metadata._loader = 'loader'
        result = metadata._load_dependencies('dependencies', data)
        self.assertEqual(result, ['role1', 'role2'])

    def test_load_galaxy_info(self):
        data = {'galaxy_info': {'author': 'John', 'description': 'Test'}}
        metadata = RoleMetadata()
        result = metadata._load_galaxy_info('galaxy_info', data)
        self.assertEqual(result, {'galaxy_info': {'author': 'John', 'description': 'Test'}})

    def test_serialize(self):
        metadata = RoleMetadata()
        metadata.allow_duplicates = True
        metadata.dependencies = ['role1', 'role2']
        result = metadata.serialize()
        self.assertEqual(result, {'allow_duplicates': True, 'dependencies': ['role1', 'role2'], 'priority': 100})

    def test_deserialize(self):
        data = {'allow_duplicates': True, 'dependencies': ['role1', 'role2']}
        metadata = RoleMetadata()
        metadata.deserialize(data)
        self.assertTrue(metadata.allow_duplicates)
        self.assertEqual(metadata.dependencies, ['role1', 'role2'])

if __name__ == '__main__':
    unittest.main()