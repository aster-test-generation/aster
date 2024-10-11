import unittest
from ansible.parsing.yaml.objects import *


class TestPlay(unittest.TestCase):
    def test_init(self):
        instance = Play()
        self.assertIsInstance(instance, Play)

    def test_get_name(self):
        instance = Play()
        result = instance.get_name()
        self.assertIsInstance(result, str)

    def test_preprocess_data(self):
        instance = Play()
        ds = {}
        result = instance.preprocess_data(ds)
        self.assertIsInstance(result, dict)

    def test_load(self):
        ds = {}
        variable_manager = None
        loader = None
        vars = None
        result = Play.load(ds, variable_manager, loader, vars)
        self.assertIsInstance(result, Play)

    def test_load_tasks(self):
        instance = Play()
        attr = None
        ds = {}
        result = instance._load_tasks(attr, ds)
        self.assertIsInstance(result, list)

    def test_load_pre_tasks(self):
        instance = Play()
        attr = None
        ds = {}
        result = instance._load_pre_tasks(attr, ds)
        self.assertIsInstance(result, list)

    def test_load_post_tasks(self):
        instance = Play()
        attr = None
        ds = {}
        result = instance._load_post_tasks(attr, ds)
        self.assertIsInstance(result, list)

    def test_load_handlers(self):
        instance = Play()
        attr = None
        ds = {}
        result = instance._load_handlers(attr, ds)
        self.assertIsInstance(result, list)

    def test_load_roles(self):
        instance = Play()
        attr = None
        ds = {}
        result = instance._load_roles(attr, ds)
        self.assertIsInstance(result, list)

    def test_load_vars_prompt(self):
        instance = Play()
        attr = None
        ds = {}
        result = instance._load_vars_prompt(attr, ds)
        self.assertIsInstance(result, list)

    def test_compile_roles(self):
        instance = Play()
        result = instance._compile_roles()
        self.assertIsInstance(result, list)

    def test_compile_roles_handlers(self):
        instance = Play()
        result = instance.compile_roles_handlers()
        self.assertIsInstance(result, list)


if __name__ == '__main__':
    unittest.main()