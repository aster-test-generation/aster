from ansible.playbook.play import AnsibleParserError
import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_validate_hosts(self):
        play = Play()
        play.hosts = []
        with self.assertRaises(AnsibleParserError):
            play._validate_hosts(None, None, [])
        play.hosts = [None]
        with self.assertRaises(AnsibleParserError):
            play._validate_hosts(None, None, None)
        play.hosts = "localhost"
        play._validate_hosts(None, None, None)

    def test_get_name(self):
        play = Play()
        play.name = None
        play.hosts = "localhost"
        self.assertEqual(play.get_name(), "localhost")
        play.hosts = ["localhost", "127.0.0.1"]
        self.assertEqual(play.get_name(), "localhost")

    def test_load(self):
        play = Play.load({})
        self.assertIsInstance(play, Play)

    def test_preprocess_data(self):
        play = Play()
        play.preprocess_data({})

    def test_load_tasks(self):
        play = Play()
        play._load_tasks(None, [], None)

    def test_load_pre_tasks(self):
        play = Play()
        play._load_pre_tasks(None, [])

    def test_load_post_tasks(self):
        play = Play()
        play._load_post_tasks(None, [])

    def test_load_handlers(self):
        play = Play()
        play._load_handlers(None, [])

    def test_load_roles(self):
        play = Play()
        play._load_roles(None, [])

    def test_load_vars_prompt(self):
        play = Play()
        play._load_vars_prompt(None, {'name': 'foo'})

    def test_compile_roles(self):
        play = Play()
        play.compile_roles()

    def test_compile_roles_handlers(self):
        play = Play()
        play.compile_roles()

if __name__ == '__main__':
    unittest.main()