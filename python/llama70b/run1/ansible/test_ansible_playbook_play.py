import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test___init__(self):
        play = Play()
        self.assertIsInstance(play, Play)

    def test_compile(self):
        play = Play()
        result = play.compile()
        self.assertIsInstance(result, list)

    def test_get_vars(self):
        play = Play()
        result = play.get_vars()
        self.assertIsInstance(result, dict)

    def test_get_vars_files(self):
        play = Play()
        result = play.get_vars_files()
        self.assertIsInstance(result, list)

    def test_get_handlers(self):
        play = Play()
        result = play.get_handlers()
        self.assertIsInstance(result, list)

    def test_get_roles(self):
        play = Play()
        result = play.get_roles()
        self.assertIsInstance(result, list)

    def test_get_tasks(self):
        play = Play()
        result = play.get_tasks()
        self.assertIsInstance(result, list)

    def test_serialize(self):
        play = Play()
        result = play.serialize()
        self.assertIsInstance(result, dict)

    def test_deserialize(self):
        play = Play()
        data = {'roles': []}
        play.deserialize(data)
        self.assertEqual(play.roles, [])

    def test_copy(self):
        play = Play()
        new_play = play.copy()
        self.assertIsInstance(new_play, Play)

    def test___str__(self):
        play = Play()
        result = str(play)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        play = Play()
        result = repr(play)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        play1 = Play()
        play2 = Play()
        self.assertEqual(play1, play2)

    def test__included_conditional(self):
        play = Play()
        play._included_conditional = True
        self.assertTrue(play._included_conditional)

    def test__included_path(self):
        play = Play()
        play._included_path = '/path/to/play'
        self.assertEqual(play._included_path, '/path/to/play')

    def test_ROLE_CACHE(self):
        play = Play()
        play.ROLE_CACHE['role1'] = 'role1_data'
        self.assertIn('role1', play.ROLE_CACHE)

    def test__action_groups(self):
        play = Play()
        play._action_groups['group1'] = 'group1_data'
        self.assertIn('group1', play._action_groups)

    def test__group_actions(self):
        play = Play()
        play._group_actions['action1'] = 'action1_data'
        self.assertIn('action1', play._group_actions)

if __name__ == '__main__':
    unittest.main()