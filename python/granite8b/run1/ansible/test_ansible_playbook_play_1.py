import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_get_name(self):
        play = Play()
        play.name = 'test_play'
        self.assertEqual(play.get_name(), 'test_play')
        play.hosts = ['host1', 'host2']
        self.assertEqual(play.get_name(), 'host1,host2')

    def test_preprocess_data(self):
        play = Play()
        play.preprocess_data({'user': 'test_user'})
        self.assertEqual(play.remote_user, 'test_user')

    def test_load_tasks(self):
        play = Play()
        play._load_tasks('tasks', [{'task1': 'value1'}, {'task2': 'value2'}])
        self.assertEqual(len(play.tasks), 2)
        self.assertEqual(play.tasks[0]['task1'], 'value1')
        self.assertEqual(play.tasks[1]['task2'], 'value2')

    def test_load_pre_tasks(self):
        play = Play()
        play._load_pre_tasks('pre_tasks', [{'pre_task1': 'value1'}, {'pre_task2': 'value2'}])
        self.assertEqual(len(play.pre_tasks), 2)
        self.assertEqual(play.pre_tasks[0]['pre_task1'], 'value1')
        self.assertEqual(play.pre_tasks[1]['pre_task2'], 'value2')

    def test_load_post_tasks(self):
        play = Play()
        play._load_post_tasks('post_tasks', [{'post_task1': 'value1'}, {'post_task2': 'value2'}])
        self.assertEqual(len(play.post_tasks), 2)
        self.assertEqual(play.post_tasks[0]['post_task1'], 'value1')
        self.assertEqual(play.post_tasks[1]['post_task2'], 'value2')

    def test_load_handlers(self):
        play = Play()
        play._load_handlers('handlers', [{'handler1': 'value1'}, {'handler2': 'value2'}])
        self.assertEqual(len(play.handlers), 2)
        self.assertEqual(play.handlers[0]['handler1'], 'value1')
        self.assertEqual(play.handlers[1]['handler2'], 'value2')

    def test_load_roles(self):
        play = Play()
        play._load_roles('roles', [{'role1': 'value1'}, {'role2': 'value2'}])
        self.assertEqual(len(play.roles), 2)
        self.assertEqual(play.roles[0]['role1'], 'value1')
        self.assertEqual(play.roles[1]['role2'], 'value2')

    def test_load_vars_prompt(self):
        play = Play()
        play._load_vars_prompt('vars_prompt', [{'prompt1': 'value1'}, {'prompt2': 'value2'}])
        self.assertEqual(len(play.vars_prompt), 2)
        self.assertEqual(play.vars_prompt[0]['prompt1'], 'value1')
        self.assertEqual(play.vars_prompt[1]['prompt2'], 'value2')

    def test_compile_roles(self):
        play = Play()
        play.roles = [Role(name='role1'), Role(name='role2')]
        block_list = play._compile_roles()
        self.assertEqual(len(block_list), 4)
        self.assertEqual(block_list[0].name, 'role1')
        self.assertEqual(block_list[1].name, 'role1')
        self.assertEqual(block_list[2].name, 'role2')
        self.assertEqual(block_list[3].name, 'role2')

if __name__ == '__main__':
    unittest.main()