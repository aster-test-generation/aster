import unittest
from ansible.playbook.play import Play 


class TestPlay(unittest.TestCase):
    def test_init(self):
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

    def test_str_method(self):
        play = Play()
        result = play.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        play = Play()
        result = play.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        play1 = Play()
        play2 = Play()
        self.assertEqual(play1, play2)

    def test_private_method__included_conditional(self):
        play = Play()
        result = play._Play__included_conditional
        self.assertIsNone(result)

    def test_private_method__included_path(self):
        play = Play()
        result = play._Play__included_path
        self.assertIsNone(result)

    def test_protected_method__action_groups(self):
        play = Play()
        result = play._action_groups
        self.assertIsInstance(result, dict)

    def test_protected_method__group_actions(self):
        play = Play()
        result = play._group_actions
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()