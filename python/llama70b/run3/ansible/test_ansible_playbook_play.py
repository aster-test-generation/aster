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
        result = play.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        play = Play()
        result = play.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        play1 = Play()
        play2 = Play()
        self.assertTrue(play1 == play2)

    def test__action_groups(self):
        play = Play()
        result = play._action_groups
        self.assertIsInstance(result, dict)

    def test__group_actions(self):
        play = Play()
        result = play._group_actions
        self.assertIsInstance(result, dict)

    def test_included_conditional(self):
        play = Play()
        result = play._included_conditional
        self.assertIsNone(result)

    def test_included_path(self):
        play = Play()
        result = play._included_path
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()