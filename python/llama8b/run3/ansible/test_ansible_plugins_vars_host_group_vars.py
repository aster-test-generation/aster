import unittest
from ansible.module_utils.basic import AnsibleModul


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        loader = object()
        path = object()
        entities = [object()]
        cache = True
        result = VarsModule().get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    def test_get_vars_host(self):
        loader = object()
        path = object()
        entities = [Host()]
        cache = True
        result = VarsModule().get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    def test_get_vars_group(self):
        loader = object()
        path = object()
        entities = [Group()]
        cache = True
        result = VarsModule().get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    def test_get_vars_host_vars(self):
        loader = object()
        path = object()
        entities = [Host()]
        cache = True
        result = VarsModule().get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    def test_get_vars_group_vars(self):
        loader = object()
        path = object()
        entities = [Group()]
        cache = True
        result = VarsModule().get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    def test_found_files(self):
        loader = object()
        path = object()
        entities = [object()]
        cache = True
        result = VarsModule().found_files(loader, path, entities, cache)
        self.assertEqual(result, [])

    def test_found_files_host(self):
        loader = object()
        path = object()
        entities = [Host()]
        cache = True
        result = VarsModule().found_files(loader, path, entities, cache)
        self.assertEqual(result, [])

    def test_found_files_group(self):
        loader = object()
        path = object()
        entities = [Group()]
        cache = True
        result = VarsModule().found_files(loader, path, entities, cache)
        self.assertEqual(result, [])

    def test_found_files_host_vars(self):
        loader = object()
        path = object()
        entities = [Host()]
        cache = True
        result = VarsModule().found_files(loader, path, entities, cache)
        self.assertEqual(result, [])

    def test_found_files_group_vars(self):
        loader = object()
        path = object()
        entities = [Group()]
        cache = True
        result = VarsModule().found_files(loader, path, entities, cache)
        self.assertEqual(result, [])

    def test_combine_vars(self):
        data = {}
        new_data = {}
        result = VarsModule().combine_vars(data, new_data)
        self.assertEqual(result, {})

    def test_combine_vars_host(self):
        data = {}
        new_data = {}
        result = VarsModule().combine_vars(data, new_data)
        self.assertEqual(result, {})

    def test_combine_vars_group(self):
        data = {}
        new_data = {}
        result = VarsModule().combine_vars(data, new_data)
        self.assertEqual(result, {})

    def test_combine_vars_host_vars(self):
        data = {}
        new_data = {}
        result = VarsModule().combine_vars(data, new_data)
        self.assertEqual(result, {})

    def test_combine_vars_group_vars(self):
        data = {}
        new_data = {}
        result = VarsModule().combine_vars(data, new_data)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()