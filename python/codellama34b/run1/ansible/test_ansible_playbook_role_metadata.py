import unittest
from ansible.playbook.role.metadata import *


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
        ds = None
        result = RoleMetadata._load_dependencies(attr, ds)
        self.assertEqual(result, None)

    def test_load_galaxy_info(self):
        attr = None
        ds = None
        result = RoleMetadata._load_galaxy_info(attr, ds)
        self.assertEqual(result, None)

    def test_serialize(self):
        result = RoleMetadata.serialize()
        self.assertEqual(result, None)

    def test_deserialize(self):
        data = None
        result = RoleMetadata.deserialize(data)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()