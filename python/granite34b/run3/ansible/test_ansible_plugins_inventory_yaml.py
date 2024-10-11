import unittest
from ansible.plugins.inventory.yaml import InventoryModule


class TestInventoryModule(unittest.TestCase):

    def setUp(self):
        self.inventory = InventoryModule()

    def test_verify_file(self):
        valid_extensions = ['.yaml', '.yml', '.json']
        invalid_extensions = ['.txt', '.conf']
        for ext in valid_extensions:
            self.assertTrue(self.inventory.verify_file('inventory' + ext))
        for ext in invalid_extensions:
            self.assertFalse(self.inventory.verify_file('inventory' + ext))

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
        self.inventory._load_name(None, None, None, data)
        self.assertEqual(self.inventory.groups['all'].hosts['test1'].name, 'test1')
        self.assertEqual(self.inventory.groups['all'].hosts['test2'].vars['host_var'], 'value')
        self.assertEqual(self.inventory.groups['all'].vars['group_all_var'], 'value')
        self.assertEqual(self.inventory.groups['all'].children['other_group'].children['group_x'].hosts['test5'].name, 'test5')
        self.assertEqual(self.inventory.groups['all'].children['other_group'].children['group_y'].hosts['test6'].name, 'test6')
        self.assertEqual(self.inventory.groups['all'].children['other_group'].vars['g2_var2'], 'value3')
        self.assertEqual(self.inventory.groups['all'].children['other_group'].hosts['test4'].vars['ansible_host'], '127.0.0.1')
        self.assertEqual(self.inventory.groups['all'].children['last_group'].hosts['test1'].name, 'test1')
        self.assertEqual(self.inventory.groups['all'].children['last_group'].vars['group_last_var'], 'value')

if __name__ == '__main__':
    unittest.main()