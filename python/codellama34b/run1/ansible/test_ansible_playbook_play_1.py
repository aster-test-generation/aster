import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_init(self):
        instance = Play()
        self.assertIsInstance(instance, Play)

    def test_validate_hosts(self):
        instance = Play()
        attribute = 'hosts'
        name = 'name'
        value = 'value'
        instance._validate_hosts(attribute, name, value)

    def test_get_name(self):
        instance = Play()
        result = instance.get_name()
        self.assertEqual(result, '')

    def test_load(self):
        data = 'data'
        variable_manager = 'variable_manager'
        loader = 'loader'
        vars = 'vars'
        result = Play.load(data, variable_manager, loader, vars)
        self.assertIsInstance(result, Play)

    def test_preprocess_data(self):
        instance = Play()
        ds = 'ds'
        result = instance.preprocess_data(ds)
        self.assertEqual(result, ds)

    def test_load_tasks(self):
        instance = Play()
        attr = 'attr'
        ds = 'ds'
        result = instance._load_tasks(attr, ds)
        self.assertEqual(result, ds)

    def test_load_pre_tasks(self):
        instance = Play()
        attr = 'attr'
        ds = 'ds'
        result = instance._load_pre_tasks(attr, ds)
        self.assertEqual(result, ds)

    def test_load_post_tasks(self):
        instance = Play()
        attr = 'attr'
        ds = 'ds'
        result = instance._load_post_tasks(attr, ds)
        self.assertEqual(result, ds)

    def test_load_handlers(self):
        instance = Play()
        attr = 'attr'
        ds = 'ds'
        result = instance._load_handlers(attr, ds)
        self.assertEqual(result, ds)

    def test_load_roles(self):
        instance = Play()
        attr = 'attr'
        ds = 'ds'
        result = instance._load_roles(attr, ds)
        self.assertEqual(result, ds)

    def test_load_vars_prompt(self):
        instance = Play()
        attr = 'attr'
        ds = 'ds'
        result = instance._load_vars_prompt(attr, ds)
        self.assertEqual(result, ds)

    def test_compile_roles(self):
        instance = Play()
        result = instance._compile_roles()
        self.assertEqual(result, [])

    def test_compile_roles_handlers(self):
        instance = Play()
        result = instance.compile_roles_handlers()
        self.assertEqual(result, [])

    def test_repr(self):
        instance = Play()
        result = instance.__repr__()
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()