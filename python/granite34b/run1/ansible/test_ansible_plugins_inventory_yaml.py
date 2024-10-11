import unittest
from ansible.plugins.inventory.yaml import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryModule()

    def test_verify_file(self):
        valid_extensions = ['.yaml', '.yml', '.json']
        invalid_extensions = ['.txt', '.conf']
        valid_path = 'inventory.yaml'
        invalid_path = 'inventory.txt'

        self.assertTrue(self.inventory.verify_file(valid_path))
        self.assertFalse(self.inventory.verify_file(invalid_path))

    def test_parse(self):
        data = {
            'all': {
                'hosts': {
                    'test1': {},
                    'test2': {
                        'host_var': 'value'
                    }
                },
                'vars': {
                    'group_all_var': 'value'
                },
                'children': {
                    'other_group': {
                        'children': {
                            'group_x': {
                                'hosts': {
                                    'test5': {}
                                }
                            },
                            'group_y': {
                                'hosts': {
                                    'test6': {}
                                }
                            }
                        },
                        'vars': {
                            'g2_var2': 'value3'
                        },
                        'hosts': {
                            'test4': {
                                'ansible_host': '127.0.0.1'
                            }
                        }
                    },
                    'last_group': {
                        'hosts': {
                            'test1': {}
                        },
                        'vars': {
                            'group_last_var': 'value'
                        }
                    }
                }
            }
        }

        self.inventory.parse(loader, data)
        self.assertEqual(len(self.inventory.inventory.groups), 4)
        self.assertEqual(len(self.inventory.inventory.hosts), 6)

    def test_parse_group(self):
        group_data = {
            'vars': {
                'group_var': 'value'
            },
            'children': {
                'subgroup': {}
            },
            'hosts': {
                'test1': {},
                'test2': {
                    'host_var': 'value'
                }
            }
        }

        group = self.inventory._parse_group('group', group_data)
        self.assertEqual(group.name, 'group')
        self.assertEqual(len(group.vars), 1)
        self.assertEqual(len(group.children), 1)
        self.assertEqual(len(group.hosts), 2)

    def test_parse_host(self):
        host_pattern = 'test[1:3]'
        hostnames, port = self.inventory._parse_host(host_pattern)
        self.assertEqual(hostnames, ['test1', 'test2', 'test3'])
        self.assertEqual(port, None)

if __name__ == '__main__':
    unittest.main()