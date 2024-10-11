import unittest
from ansible.config.manager import find_ini_config_file, _add_base_defs_deprecations


class TestFindIniConfigFile(unittest.TestCase):
    def test_find_ini_config_file(self):
        path = find_ini_config_file()
        self.assertIsNotNone(path)

class TestAddBaseDefsDeprecations(unittest.TestCase):
    def test_add_base_defs_deprecations(self):
        base_defs = {
            'module_defaults': {
                'ini': [
                    {
                        'name': 'foo',
                        'type': 'str'
                    }
                ],
                'env': [
                    {
                        'name': 'bar',
                        'type': 'str'
                    }
                ],
                'vars': [
                    {
                        'name': 'baz',
                        'type': 'str'
                    }
                ]
            }
        }
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(base_defs['module_defaults']['ini'][0]['deprecated']['collection_name'], 'ansible.builtin')
        self.assertEqual(base_defs['module_defaults']['env'][0]['deprecated']['collection_name'], 'ansible.builtin')
        self.assertEqual(base_defs['module_defaults']['vars'][0]['deprecated']['collection_name'], 'ansible.builtin')

if __name__ == '__main__':
    unittest.main()