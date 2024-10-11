import unittest
from unittest.mock import Mock, patch
from ansible.playbook.role.metadata import RoleMetadata
from ansible.errors import AnsibleParserError, AnsibleError


class TestRoleMetadata(unittest.TestCase):
    def setUp(self):
        self.owner_mock = Mock()
        self.role_metadata = RoleMetadata(owner=self.owner_mock)

    def test_init(self):
        self.assertEqual(self.role_metadata._owner, self.owner_mock)

    def test_load_valid_data(self):
        data = {'key': 'value'}
        with patch.object(RoleMetadata, 'load_data', return_value='loaded_data') as mock_load_data:
            result = RoleMetadata.load(data, self.owner_mock)
            self.assertEqual(result, 'loaded_data')
            mock_load_data.assert_called_once_with(data, variable_manager=None, loader=None)

    def test_load_invalid_data(self):
        data = ['not', 'a', 'dict']
        with self.assertRaises(AnsibleParserError):
            RoleMetadata.load(data, self.owner_mock)

    def test_load_dependencies_valid(self):
        ds = [{'role': 'test_role'}]
        with patch('ansible.playbook.role.metadata.load_list_of_roles', return_value='loaded_roles') as mock_load_list_of_roles:
            result = self.role_metadata._load_dependencies('attr', ds())
            self.assertEqual(result, 'loaded_roles')
            mock_load_list_of_roles.assert_called_once()

    def test_load_dependencies_invalid(self):
        ds = 'not_a_list'
        with self.assertRaises(AnsibleParserError):
            self.role_metadata.load_dependencies('attr', ds)

    def test_load_dependencies_with_error(self):
        ds = [{'role': 'test_role'}]
        with patch('ansible.playbook.role.metadata.load_list_of_roles', side_effect=AssertionError):
            with self.assertRaises(AnsibleParserError):
                self.role_metadata._load_dependencies('attr', ds())

    def test_load_galaxy_info(self):
        ds = {'galaxy_info': 'info'}
        result = self.role_metadata._load_galaxy_info('attr', ds)
        self.assertEqual(result, ds)

    def test_serialize(self):
        self.role_metadata._allow_duplicates = True
        self.role_metadata._dependencies = ['dep1', 'dep2']
        result = self.role_metadata.serialize()
        self.assertEqual(result, {'allow_duplicates': True, 'dependencies': ['dep1', 'dep2']})

    def test_deserialize(self):
        data = {'allow_duplicates': True, 'dependencies': ['dep1', 'dep2']}
        self.role_metadata.deserialize(data)
        self.assertTrue(self.role_metadata.allow_duplicates)
        self.assertEqual(self.role_metadata.dependencies, ['dep1', 'dep2'])

if __name__ == '__main__':
    unittest.main()