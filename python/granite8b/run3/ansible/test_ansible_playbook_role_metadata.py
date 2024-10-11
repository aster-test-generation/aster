import unittest
from ansible.module_utils.common.yaml import RoleMetadata


class TestRoleMetadata(unittest.TestCase):
    def test_load_dependencies(self):
        metadata = RoleMetadata()
        dependencies = metadata._load_dependencies('dependencies', ['role1', 'role2'])
        self.assertEqual(len(dependencies), 2)
        self.assertEqual(dependencies[0].name, 'role1')
        self.assertEqual(dependencies[1].name, 'role2')

    def test_load_galaxy_info(self):
        metadata = RoleMetadata()
        galaxy_info = metadata._load_galaxy_info('galaxy_info', {'author': 'John Doe'})
        self.assertEqual(galaxy_info.author, 'John Doe')

    def test_serialize(self):
        metadata = RoleMetadata()
        metadata._allow_duplicates = True
        metadata._dependencies = ['role1', 'role2']
        serialized_data = metadata.serialize()
        self.assertEqual(serialized_data['allow_duplicates'], True)
        self.assertEqual(serialized_data['dependencies'], ['role1', 'role2'])

if __name__ == '__main__':
    unittest.main()