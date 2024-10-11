import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        loader = None
        path = None
        entities = [Host('host1'), Group('group1')]
        cache = True
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities, cache)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir(self):
        loader = None
        path = None
        entities = [Host('host1'), Group('group1')]
        cache = True
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities, cache)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir_and_file(self):
        loader = None
        path = None
        entities = [Host('host1'), Group('group1')]
        cache = True
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities, cache)
        self.assertEqual(data, {})

    def test_get_vars_with_subdir_and_file_and_data(self):
        loader = None
        path = None
        entities = [Host('host1'), Group('group1')]
        cache = True
        vars_module = VarsModule()
        data = vars_module.get_vars(loader, path, entities, cache)
        self.assertEqual(data, {})

if __name__ == '__main__':
    unittest.main()