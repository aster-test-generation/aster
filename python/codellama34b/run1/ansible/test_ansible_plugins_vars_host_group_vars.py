import unittest
from ansible.plugins.vars.yaml import *


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        instance = VarsModule()
        loader = None
        path = None
        entities = None
        cache = True
        result = instance.get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()