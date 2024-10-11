import unittest
from ansible.playbook.play import Play



class TestPlay(unittest.TestCase):
    def test_init(self):
        instance = Play()
        self.assertIsInstance(instance, Play)

    def test_validate_hosts(self):
        instance = Play()
        instance._validate_hosts('hosts', 'hosts', 'hosts')

    def test_get_name(self):
        instance = Play()
        instance.hosts = 'hosts'
        result = instance.get_name()
        self.assertEqual(result, 'hosts')

    def test_load(self):
        result = Play.load('data', 'variable_manager', 'loader', 'vars')
        self.assertIsInstance(result, Play)

    def test_preprocess_data(self):
        instance = Play()
        result = instance.preprocess_data('ds')
        self.assertEqual(result, 'ds')

    def test_load_tasks(self):
        instance = Play()
        result = instance._load_tasks('attr', 'ds')
        self.assertEqual(result, 'ds')

    def test_load_pre_tasks(self):
        instance = Play()
        result = instance._load_pre_tasks('attr', 'ds')
        self.assertEqual(result, 'ds')

    def test_load_post_tasks(self):
        instance = Play()
        result = instance._load_post_tasks('attr', 'ds')
        self.assertEqual(result, 'ds')

    def test_load_handlers(self):
        instance = Play()
        result = instance._load_handlers('attr', 'ds')
        self.assertEqual(result, 'ds')

    def test_load_roles(self):
        instance = Play()
        result = instance._load_roles('attr', 'ds')
        self.assertEqual(result, 'ds')

    def test_load_vars_prompt(self):
        instance = Play()
        result = instance._load_vars_prompt('attr', 'ds')
        self.assertEqual(result, 'ds')

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
        self.assertEqual(result, 'Play')

    def test_eq(self):
        instance = Play()
        result = instance.__eq__('other')
        self.assertEqual(result, False)

    def test_ne(self):
        instance = Play()
        result = instance.__ne__('other')
        self.assertEqual(result, True)

    def test_hash(self):
        instance = Play()
        result = instance.__hash__()
        self.assertEqual(result, hash(id(instance)))

    def test_str(self):
        instance = Play()
        result = instance.__str__()
        self.assertEqual(result, 'Play')

    def test_get_action_groups(self):
        instance = Play()
        result = instance._get_action_groups()
        self.assertEqual(result, {})

    def test_get_group_actions(self):
        instance = Play()
        result = instance._get_group_actions()
        self.assertEqual(result, {})

    def test_get_included_path(self):
        instance = Play()
        result = instance._get_included_path()
        self.assertEqual(result, None)

    def test_get_included_conditional(self):
        instance = Play()
        result = instance._get_included_conditional()
        self.assertEqual(result, None)

    def test_get_removed_hosts(self):
        instance = Play()
        result = instance._get_removed_hosts()
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()