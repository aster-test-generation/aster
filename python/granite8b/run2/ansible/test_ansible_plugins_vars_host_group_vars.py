import unittest
from ansible.plugins.vars import VarsModule


class TestVarsModule(unittest.TestCase):
    def test_get_vars(self):
        loader = Mock()
        path = 'path'
        entities = [Mock()]
        cache = True
        vars_module = VarsModule()
        vars_module.get_vars(loader, path, entities, cache)
        loader.find_vars_files.assert_called_once_with(os.path.join(vars_module._basedir, 'host_vars'), entities[0].name)

if __name__ == '__main__':
    unittest.main()