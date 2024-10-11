import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test___init__(self):
        play = Play()
        self.assertIsInstance(play, Play)

    def test___repr__(self):
        play = Play()
        self.assertEqual(play.__repr__(), play.get_name())

    def test_get_name(self):
        play = Play()
        play.hosts = ['host1', 'host2']
        self.assertEqual(play.get_name(), 'host1,host2')

    def test__validate_hosts(self):
        play = Play()
        play._ds = {'hosts': ['host1', 'host2']}
        play._validate_hosts('attribute', 'name', ['host1', 'host2'])
        with self.assertRaises(AnsibleParserError):
            play._validate_hosts('attribute', 'name', [])

    def test_load(self):
        play = Play.load({}, variable_manager=None, loader=None, vars={})
        self.assertIsInstance(play, Play)

    def test_preprocess_data(self):
        play = Play()
        ds = {'user': 'user1', 'remote_user': 'remote_user1'}
        play.preprocess_data(ds)
        self.assertEqual(ds, {'remote_user': 'remote_user1'})

    def test__load_tasks(self):
        play = Play()
        ds = {'tasks': [{'name': 'task1'}]}
        tasks = play._load_tasks('attr', ds)
        self.assertIsInstance(tasks, list)

    def test__load_pre_tasks(self):
        play = Play()
        ds = {'pre_tasks': [{'name': 'pre_task1'}]}
        pre_tasks = play._load_pre_tasks('attr', ds)
        self.assertIsInstance(pre_tasks, list)

    def test__load_post_tasks(self):
        play = Play()
        ds = {'post_tasks': [{'name': 'post_task1'}]}
        post_tasks = play._load_post_tasks('attr', ds)
        self.assertIsInstance(post_tasks, list)

    def test__load_handlers(self):
        play = Play()
        ds = {'handlers': [{'name': 'handler1'}]}
        handlers = play._load_handlers('attr', ds)
        self.assertIsInstance(handlers, list)

    def test__load_roles(self):
        play = Play()
        ds = [{'name': 'role1'}]
        roles = play._load_roles('attr', ds)
        self.assertIsInstance(roles, list)

    def test__load_vars_prompt(self):
        play = Play()
        ds = [{'name': 'var1', 'prompt': 'prompt1'}]
        vars_prompts = play._load_vars_prompt('attr', ds)
        self.assertIsInstance(vars_prompts, list)

    def test__compile_roles(self):
        play = Play()
        role = Role()
        play.roles = [role]
        block_list = play._compile_roles()
        self.assertIsInstance(block_list, list)

    def test_compile_roles_handlers(self):
        play = Play()
        role = Role()
        play.roles = [role]
        block_list = play.compile_roles_handlers()
        self.assertIsInstance(block_list, list)

if __name__ == '__main__':
    unittest.main()