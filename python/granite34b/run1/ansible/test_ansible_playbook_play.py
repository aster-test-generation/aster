import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_init(self):
        play = Play()
        self.assertEqual(play._included_conditional, None)
        self.assertEqual(play._included_path, None)
        self.assertEqual(play._removed_hosts, [])
        self.assertEqual(play.ROLE_CACHE, {})
        self.assertEqual(play.only_tags, {'all'})
        self.assertEqual(play.skip_tags, set())
        self.assertEqual(play._action_groups, {})
        self.assertEqual(play._group_actions, {})

    def test_compile(self):
        play = Play()
        flush_block = play.get_tasks()
        self.assertEqual(len(flush_block), 1)
        self.assertEqual(flush_block[0].meta, 'flush_handlers')
        self.assertEqual(flush_block[0].play, play)
        self.assertEqual(flush_block[0].variable_manager, play._variable_manager)
        self.assertEqual(flush_block[0].loader, play._loader)
        for task in flush_block[0].block:
            self.assertTrue(task.implicit)

    def test_get_vars(self):
        play = Play()
        play.vars = {'a': 1, 'b': 2}
        self.assertEqual(play.get_vars(), {'a': 1, 'b': 2})

    def test_get_vars_files(self):
        play = Play()
        play.vars_files = ['file1.yml', 'file2.yml']
        self.assertEqual(play.get_vars_files(), ['file1.yml', 'file2.yml'])

    def test_get_handlers(self):
        play = Play()
        play.handlers = ['handler1', 'handler2']
        self.assertEqual(play.get_handlers(), ['handler1', 'handler2'])

    def test_get_roles(self):
        play = Play()
        play.roles = ['role1', 'role2']
        self.assertEqual(play.get_roles(), ['role1', 'role2'])

    def test_get_tasks(self):
        play = Play()
        play.pre_tasks = ['pre_task1', 'pre_task2']
        play.tasks = ['task1', 'task2']
        play.post_tasks = ['post_task1', 'post_task2']
        tasks = play.get_tasks()
        self.assertEqual(len(tasks), 6)
        self.assertEqual(tasks[0], ['pre_task1', 'pre_task2'])
        self.assertEqual(tasks[1], ['task1', 'task2'])
        self.assertEqual(tasks[2], ['post_task1', 'post_task2'])
        self.assertEqual(tasks[3][0].meta, 'flush_handlers')

    def test_serialize(self):
        play = Play()
        play.roles = ['role1', 'role2']
        play._included_path = '/path/to/file'
        play._action_groups = {'group1': ['action1', 'action2']}
        play._group_actions = {'group2': ['action3', 'action4']}
        data = play.serialize()
        self.assertEqual(data['roles'], ['role1', 'role2'])
        self.assertEqual(data['included_path'], '/path/to/file')
        self.assertEqual(data['action_groups'], {'group1': ['action1', 'action2']})
        self.assertEqual(data['group_actions'], {'group2': ['action3', 'action4']})

    def test_deserialize(self):
        play = Play()
        data = {'roles': ['role1', 'role2'], 'included_path': '/path/to/file',
                'action_groups': {'group1': ['action1', 'action2']},
                'group_actions': {'group2': ['action3', 'action4']}}
        play.deserialize(data.get('data'))
        self.assertEqual(play.roles, ['role1', 'role2'])
        self.assertEqual(play._included_path, '/path/to/file')
        self.assertEqual(play._action_groups, {'group1': ['action1', 'action2']})
        self.assertEqual(play._group_actions, {'group2': ['action3', 'action4']})

if __name__ == '__main__':
    unittest.main()