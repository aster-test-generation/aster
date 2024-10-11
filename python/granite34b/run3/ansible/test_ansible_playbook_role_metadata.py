import os
import unittest
from ansible.errors import AnsibleParserError, AnsibleError
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types
from ansible.playbook.attribute import FieldAttribute
from ansible.playbook.base import Base
from ansible.playbook.collectionsearch import CollectionSearch
from ansible.playbook.helpers import load_list_of_roles
from ansible.playbook.role.metadata import RoleMetadata
from ansible.playbook.role.requirement import RoleRequirement


class TestRoleMetadata(unittest.TestCase):
    def test_load_dependencies(self):
        # Test case for loading dependencies
        data = {
            'dependencies': [
                'role1',
                {'name': 'role2', 'version': '1.0'},
                {'role': 'role3', 'version': '2.0', 'source': 'github.com/user/repo'},
            ]
        }
        role_metadata = RoleMetadata()
        role_metadata.load(data, None)
        self.assertEqual(len(role_metadata.dependencies), 3)
        self.assertEqual(role_metadata.dependencies[0].name, 'role1')
        self.assertEqual(role_metadata.dependencies[1].name, 'role2')
        self.assertEqual(role_metadata.dependencies[1].version, '1.0')
        self.assertEqual(role_metadata.dependencies[2].name, 'role3')
        self.assertEqual(role_metadata.dependencies[2].version, '2.0')
        self.assertEqual(role_metadata.dependencies[2].source, 'github.com/user/repo')

    def test_load_galaxy_info(self):
        # Test case for loading galaxy info
        data = {
            'galaxy_info': {
                'author': 'John Doe',
                'description': 'This is a test role',
                'company': 'ACME Inc.',
                'license': 'MIT',
                'min_ansible_version': '2.9',
                'platforms': [
                    {'name': 'Ubuntu', 'versions': ['18.04', '20.04']},
                    {'name': 'CentOS', 'versions': ['7', '8']}
                ],
                'dependencies': ['role1', 'role2']
            }
        }
        role_metadata = RoleMetadata()
        role_metadata.load(data, None)
        self.assertEqual(role_metadata.galaxy_info.author, 'John Doe')
        self.assertEqual(role_metadata.galaxy_info.description, 'This is a test role')
        self.assertEqual(role_metadata.galaxy_info.company, 'ACME Inc.')
        self.assertEqual(role_metadata.galaxy_info.license, 'MIT')
        self.assertEqual(role_metadata.galaxy_info.min_ansible_version, '2.9')
        self.assertEqual(len(role_metadata.galaxy_info.platforms), 2)
        self.assertEqual(role_metadata.galaxy_info.platforms[0].name, 'Ubuntu')
        self.assertEqual(role_metadata.galaxy_info.platforms[0].versions, ['18.04', '20.04'])
        self.assertEqual(role_metadata.galaxy_info.platforms[1].name, 'CentOS')
        self.assertEqual(role_metadata.galaxy_info.platforms[1].versions, ['7', '8'])
        self.assertEqual(len(role_metadata.galaxy_info.dependencies), 2)
        self.assertEqual(role_metadata.galaxy_info.dependencies[0], 'role1')
        self.assertEqual(role_metadata.galaxy_info.dependencies[1], 'role2')

    def test_serialize(self):
        # Test case for serializing role metadata
        role_metadata = RoleMetadata()
        role_metadata.allow_duplicates = True
        role_metadata.dependencies = ['role1', 'role2']
        serialized_data = role_metadata.serialize()
        self.assertEqual(serialized_data['allow_duplicates'], False)
        self.assertEqual(serialized_data['dependencies'], ['role1', 'role2'])

if __name__ == '__main__':
    unittest.main()