import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
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
        data = {}
        play.deserialize(data)

    def test_copy(self):
        play = Play()
        result = play.copy()
        self.assertIsInstance(result, Play)

if __name__ == '__main__':
    unittest.main()