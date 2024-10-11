import unittest
from ansible.plugins.vars.host_group_vars import *


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        loader = None
        path = None
        entities = None
        cache = True
        result = VarsModule().get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()