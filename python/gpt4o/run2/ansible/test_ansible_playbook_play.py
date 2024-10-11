import unittest
from ansible.playbook.play import Play
from ansible.playbook.block import Block
from ansible.playbook.role import Role


class TestPlay(unittest.TestCase):
    def setUp(self):
        self.play = Play()

    def test_init(self):
        self.assertIsInstance(self.play, Play)
        self.assertIsNone(self.play._included_conditional)
        self.assertIsNone(self.play._included_path)
        self.assertEqual(self.play._removed_hosts, [])
        self.assertEqual(self.play.ROLE_CACHE, {})
        self.assertEqual(self.play.only_tags, frozenset(('all',)))
        self.assertEqual(self.play.skip_tags, set())
        self.assertEqual(self.play._action_groups, {})
        self.assertEqual(self.play._group_actions, {})

    def test_compile(self):
        self.play.pre_tasks = []
        self.play.tasks = []
        self.play.post_tasks = []
        self.play._variable_manager = None
        self.play._loader = None
        block_list = self.play._compile_roles()
        self.assertIsInstance(block_list, list)

    def test_get_vars(self):
        self.play.vars = {'key': 'value'}
        result = self.play.get_vars()
        self.assertEqual(result, {'key': 'value'})

    def test_get_vars_files(self):
        self.play.vars_files = None
        result = self.play.get_vars_files()
        self.assertEqual(result, [])

        self.play.vars_files = 'file1'
        result = self.play.get_vars_files()
        self.assertEqual(result, ['file1'])

        self.play.vars_files = ['file1', 'file2']
        result = self.play.get_vars_files()
        self.assertEqual(result, ['file1', 'file2'])

    def test_get_handlers(self):
        self.play.handlers = ['handler1', 'handler2']
        result = self.play.get_handlers()
        self.assertEqual(result, ['handler1', 'handler2'])

    def test_get_roles(self):
        self.play.roles = ['role1', 'role2']
        result = self.play.get_roles()
        self.assertEqual(result, ['role1', 'role2'])

    def test_get_tasks(self):
        self.play.pre_tasks = []
        self.play.tasks = []
        self.play.post_tasks = []
        result = self.play.get_tasks()
        self.assertEqual(result, [])

    def test_serialize(self):
        self.play.roles = [Role()]
        data = self.play.serialize()
        self.assertIn('roles', data)
        self.assertIn('included_path', data)
        self.assertIn('action_groups', data)
        self.assertIn('group_actions', data)

    def test_deserialize(self):
        data = {
            'included_path': 'path',
            'action_groups': {'group1': 'action1'},
            'group_actions': {'group2': 'action2'},
            'roles': [{}]
        }
        self.play.deserialize(data)
        self.assertEqual(self.play._included_path, 'path')
        self.assertEqual(self.play._action_groups, {'group1': 'action1'})
        self.assertEqual(self.play._group_actions, {'group2': 'action2'})
        self.assertEqual(len(self.play.roles), 1)
        self.assertIsInstance(self.play.roles[0], Role)

    def test_copy(self):
        new_play = self.play.copy()
        self.assertIsInstance(new_play, Play)
        self.assertEqual(new_play.ROLE_CACHE, self.play.ROLE_CACHE)
        self.assertEqual(new_play._included_conditional, self.play._included_conditional)
        self.assertEqual(new_play._included_path, self.play._included_path)
        self.assertEqual(new_play._action_groups, self.play._action_groups)
        self.assertEqual(new_play._group_actions, self.play._group_actions)

if __name__ == '__main__':
    unittest.main()