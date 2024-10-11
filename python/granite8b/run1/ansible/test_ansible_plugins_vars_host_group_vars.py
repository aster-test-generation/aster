import unittest
from ansible.plugins.vars import VarsModule


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        loader = None
        path = None
        entities = [Host('host1'), Group('group1')]
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir(self):
        loader = None
        path = 'path'
        entities = [Host('host1'), Group('group1')]
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir_and_entity(self):
        loader = None
        path = 'path'
        entities = [Host('host1')]
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir_and_entity_and_found_files(self):
        loader = None
        path = 'path'
        entities = [Host('host1')]
        vars_module = VarsModule()
        found_files = ['file1', 'file2']
        vars_module._find_vars_files = lambda x, y: found_files
        data = vars_module.get_vars(loader, path, entities)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir_and_entity_and_found_files_and_new_data(self):
        loader = None
        path = 'path'
        entities = [Host('host1')]
        vars_module = VarsModule()
        found_files = ['file1', 'file2']
        new_data = {'key1': 'value1', 'key2': 'value2'}
        vars_module._find_vars_files = lambda x, y: found_files
        vars_module._load_from_file = lambda x, y, z: new_data
        data = vars_module.get_vars(loader, path, entities)
        self.assertEqual(data, new_data)

if __name__ == '__main__':
    unittest.main()