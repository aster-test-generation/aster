import unittest
from ansible.module_utils.common.yaml import RoleMetadata


class TestRoleMetadata(unittest.TestCase):
    def test_load(self):
        data = {'dependencies': ['role1', 'role2']}
        owner = object()
        metadata = RoleMetadata.load(data, owner)
        self.assertEqual(metadata._dependencies, ['role1', 'role2'])

    def test_load_dependencies(self):
        data = ['role1', 'role2']
        metadata = RoleMetadata()
        roles = metadata._load_dependencies('_dependencies', data)
        self.assertEqual(len(roles), 2)
        self.assertEqual(roles[0].name, 'role1')
        self.assertEqual(roles[1].name, 'role2')

    def test_load_galaxy_info(self):
        data = {'author': 'John Doe'}
        metadata = RoleMetadata()
        galaxy_info = metadata._load_galaxy_info('_galaxy_info', data)
        self.assertEqual(galaxy_info.author, 'John Doe')

    def test_serialize(self):
        metadata = RoleMetadata()
        metadata._allow_duplicates = True
        metadata._dependencies = ['role1', 'role2']
        data = metadata.serialize()
        self.assertEqual(data['allow_duplicates'], True)
        self.assertEqual(data['dependencies'], ['role1', 'role2'])

if __name__ == '__main__':
    unittest.main()