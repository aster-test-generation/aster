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
        play.name = 'test_name'
        self.assertEqual(play.get_name(), 'test_name')

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
        data = {'user': 'test_user', 'remote_user': 'test_remote_user'}
        with self.assertRaises(AnsibleParserError):
            play.preprocess_data(data)
        data = {'user': 'test_user'}
        play.preprocess_data(data)
        self.assertEqual(data['remote_user'], 'test_user')

    def test__load_tasks(self):
        play = Play()
        data = [{'task': 'task1'}, {'task': 'task2'}]
        tasks = play._load_tasks('attr', data)
        self.assertEqual(len(tasks), 2)

    def test__load_pre_tasks(self):
        play = Play()
        data = [{'task': 'task1'}, {'task': 'task2'}]
        pre_tasks = play._load_pre_tasks('attr', data)
        self.assertEqual(len(pre_tasks), 2)

    def test__load_post_tasks(self):
        play = Play()
        data = [{'task': 'task1'}, {'task': 'task2'}]
        post_tasks = play._load_post_tasks('attr', data)
        self.assertEqual(len(post_tasks), 2)

    def test__load_handlers(self):
        play = Play()
        data = [{'handler': 'handler1'}, {'handler': 'handler2'}]
        handlers = play._load_handlers('attr', data)
        self.assertEqual(len(handlers), 2)

    def test__load_roles(self):
        play = Play()
        data = [{'role': 'role1'}, {'role': 'role2'}]
        roles = play._load_roles('attr', data)
        self.assertEqual(len(roles), 2)

    def test__load_vars_prompt(self):
        play = Play()
        data = [{'name': 'var1', 'prompt': 'prompt1'}]
        vars_prompts = play._load_vars_prompt('attr', data)
        self.assertEqual(len(vars_prompts), 1)

    def test__compile_roles(self):
        play = Play()
        roles = [Role.load({'role': 'role1'}, play=play)]
        play.roles = roles
        block_list = play._compile_roles()
        self.assertEqual(len(block_list), 1)

    def test_compile_roles_handlers(self):
        play = Play()
        roles = [Role.load({'role': 'role1'}, play=play)]
        play.roles = roles
        block_list = play.compile_roles_handlers()
        self.assertEqual(len(block_list), 1)

if __name__ == '__main__':
    unittest.main()