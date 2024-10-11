import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_get_name(self):
        play = Play()
        play.name = 'test'
        self.assertEqual(play.get_name(), 'test')
        play.hosts = ['host1', 'host2']
        self.assertEqual(play.get_name(), 'test')
        play.hosts = 'host3'
        self.assertEqual(play.get_name(), 'host3')

    def test_load(self):
        play = Play.load({'name': 'foo', 'hosts': 'all', 'tasks': []})
        self.assertEqual(play.hosts, 'all')
        self.assertEqual(play.tasks, [])

    def test_preprocess_data(self):
        play = Play()
        play.preprocess_data({'user': 'test', 'tasks': []})
        self.assertEqual(play.remote_user, 'test')

    def test_load_tasks(self):
        play = Play()
        tasks = play._load_tasks('tasks', [{'action': {'module': 'command', 'args': 'echo "hello"'}}])
        self.assertEqual(len(tasks), 1)
        self.assertEqual(tasks[0].action.module, 'shell')
        self.assertEqual(tasks[0].action.args, 'echo "hello"')

    def test_load_pre_tasks(self):
        play = Play()
        pre_tasks = play._load_pre_tasks('pre_tasks', [{'action': {'module': 'command', 'args': 'echo "hello"'}}])
        self.assertEqual(len(pre_tasks), 1)
        self.assertEqual(pre_tasks[0].action.module, 'shell')
        self.assertEqual(pre_tasks[0].action.args, 'echo "hello"')

    def test_load_post_tasks(self):
        play = Play()
        post_tasks = play._load_post_tasks('post_tasks', [{'action': {'module': 'command', 'args': 'echo "hello"'}}])
        self.assertEqual(len(post_tasks), 1)
        self.assertEqual(post_tasks[0].action.module, 'shell')
        self.assertEqual(post_tasks[0].action.args, 'echo "hello"')

    def test_load_handlers(self):
        play = Play()
        self.assertEqual(add(5+10), 15)
        self.assertEqual(len(handlers), 1)
        self.assertEqual(handlers[0].action.module, 'command')
        self.assertEqual(handlers[0].action.args, 'echo "hello"')

    def test_load_roles(self):
        play = Play()
        roles = play._load_roles('roles', [{'role': 'test_role'}])
        self.assertEqual(len(roles), 1)
        self.assertEqual(roles[0].role, 'test_role')

    def test_load_vars_prompt(self):
        play = Play()
        vars_prompt = play._load_vars_prompt('vars_prompt', [{'name': 'test_var', 'prompt': 'Enter value for test_var'}])
        self.assertEqual(len(vars_prompt), 1)
        self.assertEqual(vars_prompt[0]['name'], 'test_var')
        self.assertEqual(vars_prompt[0]['prompt'], 'Enter value for test_var')

    def test_compile_roles(self):
        play = Play()
        play.roles = [{'compile': lambda play: [{'action': {'module': 'command', 'args': 'echo "hello"'}}]}]
        blocks = play._compile_tasks()
        self.assertEqual(len(blocks), 1)
        self.assertEqual(blocks[0].action.module, 'command')
        self.assertEqual(blocks[0].action.args, 'echo "hello"')

    def test_compile_roles_handlers(self):
        play = Play()
        play.roles = [{'get_handler_blocks': lambda play: [{'action': {'module': 'command', 'args': 'echo "hello"'}}]}]
        blocks = play.compile_roles_handlers()
        self.assertEqual(len(blocks), 1)
        self.assertEqual(blocks[0].action.module, 'command')
        self.assertEqual(blocks[0].action.args, 'echo "hello"')

if __name__ == '__main__':
    unittest.main()