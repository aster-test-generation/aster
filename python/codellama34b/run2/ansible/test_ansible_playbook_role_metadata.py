import unittest
from ansible.parsing.yaml.objects import AnsibleSequence


class TestRoleMetadata(unittest.TestCase):
    def test_load(self):
        data = {}
        owner = None
        variable_manager = None
        loader = None
        result = RoleMetadata.load(data, owner, variable_manager, loader)
        self.assertIsInstance(result, RoleMetadata)

    def test_load_dependencies(self):
        attr = None
        ds = []
        result = RoleMetadata._load_dependencies(attr, ds)
        self.assertIsInstance(result, list)

    def test_load_galaxy_info(self):
        attr = None
        ds = {}
        result = RoleMetadata._load_galaxy_info(attr, ds)
        self.assertIsInstance(result, GalaxyInfo)

    def test_serialize(self):
        result = RoleMetadata.serialize()
        self.assertIsInstance(result, dict)

    def test_deserialize(self):
        data = {}
        result = RoleMetadata.deserialize(data)
        self.assertIsInstance(result, RoleMetadata)

if __name__ == '__main__':
    unittest.main()