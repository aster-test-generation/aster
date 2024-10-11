import unittest
from ansible_collections.ansible.builtin.plugins.vars.host_group_vars import VarsModule, FOUN


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        instance = VarsModule()
        loader = object()
        path = 'path'
        entities = [object()]
        result = instance.get_vars(loader, path, entities)
        self.assertIsInstance(result, dict)

    def test_REQUIRES_WHITELIST(self):
        instance = VarsModule()
        result = instance.REQUIRES_WHITELIST
        self.assertTrue(result)

    def test__init__(self):
        instance = VarsModule()
        self.assertIsInstance(instance, VarsModule)

    def test___str__(self):
        instance = VarsModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = VarsModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_get_vars_private_method(self):
        instance = VarsModule()
        loader = object()
        path = 'path'
        entities = [object()]
        result = instance._VarsModule__get_vars(loader, path, entities)
        self.assertIsInstance(result, dict)

    def test_get_vars_protected_method(self):
        instance = VarsModule()
        loader = object()
        path = 'path'
        entities = [object()]
        result = instance._get_vars(loader, path, entities)
        self.assertIsInstance(result, dict)

class TestFOUND(unittest.TestCase):
    def test_FOUND(self):
        result = FOUND
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()