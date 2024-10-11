import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_compile(self):
        play = Play()
        block_list = play.compile()
        self.assertIsInstance(block_list, list)
        self.assertGreater(len(block_list), 0)
        for block in block_list:
            self.assertIsInstance(block, Block)

    def test_get_vars(self):
        play = Play()
        vars = play.get_vars()
        self.assertIsInstance(vars, dict)
        self.assertGreater(len(vars), 0)

    def test_get_vars_files(self):
        play = Play()
        vars_files = play.get_vars_files()
        self.assertIsInstance(vars_files, list)
        self.assertGreater(len(vars_files), 0)

    def test_get_handlers(self):
        play = Play()
        handlers = play.get_handlers()
        self.assertIsInstance(handlers, list)
        self.assertGreater(len(handlers), 0)

    def test_get_roles(self):
        play = Play()
        roles = play.get_roles()
        self.assertIsInstance(roles, list)
        self.assertGreater(len(roles), 0)

    def test_get_tasks(self):
        play = Play()
        tasks = play.get_tasks()
        self.assertIsInstance(tasks, list)
        self.assertGreater(len(tasks), 0)

    def test_serialize(self):
        play = Play()
        data = play.serialize()
        self.assertIsInstance(data, dict)
        self.assertIn('roles', data)
        self.assertIn('included_path', data)
        self.assertIn('action_groups', data)
        self.assertIn('group_actions', data)

    def test_deserialize(self):
        play = Play()
        data = play.serialize()
        play.deserialize(data)
        self.assertIsInstance(play.roles, list)
        self.assertGreater(len(play.roles), 0)
        self.assertIsInstance(play._included_path, str)
        self.assertIsInstance(play._action_groups, dict)
        self.assertIsInstance(play._group_actions, dict)

    def test_copy(self):
        play = Play()
        new_play = play.copy()
        self.assertIsInstance(new_play, Play)
        self.assertEqual(new_play.ROLE_CACHE, play.ROLE_CACHE)
        self.assertEqual(new_play._included_conditional, play._included_conditional)
        self.assertEqual(new_play._included_path, play._included_path)
        self.assertEqual(new_play._action_groups, play._action_groups)
        self.assertEqual(new_play._group_actions, play._group_actions)

if __name__ == '__main__':
    unittest.main()