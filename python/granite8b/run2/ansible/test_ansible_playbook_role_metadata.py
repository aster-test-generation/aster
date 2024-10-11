import unittest
from ansible.module_utils.common.yaml import RoleMetadata


class TestRoleMetadata(unittest.TestCase):
    def test_load_dependencies(self):
        metadata = RoleMetadata()
        dependencies = metadata._load_dependencies('dependencies', ['foo', 'bar'])
        self.assertEqual(len(dependencies), 2)
        self.assertEqual(dependencies[0].name, 'foo')
        self.assertEqual(dependencies[1].name, 'bar')

    def test_load_galaxy_info(self):
        metadata = RoleMetadata()
        galaxy_info = metadata._load_galaxy_info('galaxy_info', {'author': 'John Doe'})
        self.assertEqual(galaxy_info.author, 'John Doe')

if __name__ == '__main__':
    unittest.main()