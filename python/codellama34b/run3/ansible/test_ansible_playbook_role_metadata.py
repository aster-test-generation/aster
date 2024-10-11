import unittest
from ansible.playbook.role.requirement import *


class TestRoleMetadata(unittest.TestCase):
    def test_load(self):
        data = {}
        owner = None
        variable_manager = None
        loader = None
        result = RoleMetadata.load(data, owner, variable_manager, loader)
        self.assertEqual(result, None)

    def test_load_dependencies(self):
        attr = None
        ds = []
        result = RoleMetadata._load_dependencies(attr, ds)
        self.assertEqual(result, [])

    def test_load_galaxy_info(self):
        attr = None
        ds = {}
        result = RoleMetadata._load_galaxy_info(attr, ds)
        self.assertEqual(result, {})

    def test_serialize(self):
        result = RoleMetadata.serialize()
        self.assertEqual(result, {'allow_duplicates': False, 'dependencies': []})

    def test_deserialize(self):
        data = {'allow_duplicates': False, 'dependencies': []}
        result = RoleMetadata.deserialize(data)
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()