import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_init(self):
        play = Play()
        self.assertIsInstance(play, Play)

    def test_repr(self):
        play = Play()
        self.assertEqual(repr(play), play.get_name())

    def test_validate_hosts(self):
        play = Play()
        play._ds = {'hosts': 'localhost'}
        with self.assertRaises(AnsibleParserError):
            play._validate_hosts('hosts', 'hosts', None)

    def test_get_name(self):
        play = Play()
        play._ds = {'hosts': 'localhost'}
        self.assertEqual(play.get_name(), 'localhost')

    @staticmethod
    def test_load():
        play = Play.load({})
        self.assertIsInstance(play, Play)

    def test_preprocess_data(self):
        play = Play()
        play._ds = {'user': 'ansible'}
        play.preprocess_data(play._ds)
        self.assertEqual(play.remote_user, 'ansible')

    def test_load_tasks(self):
        play = Play()
        play._ds = {'tasks': []}
        play._load_tasks('tasks', play._ds)
        self.assertEqual(len(play.tasks), 0)

    def test_load_pre_tasks(self):
        play = Play()
        play._ds = {'pre_tasks': []}
        play._load_pre_tasks('pre_tasks', play._ds)
        self.assertEqual(len(play.pre_tasks), 0)

    def test_load_post_tasks(self):
        play = Play()
        play._ds = {'post_tasks': []}
        play._load_post_tasks('post_tasks', play._ds)
        self.assertEqual(len(play.post_tasks), 0)

    def test_load_handlers(self):
        play = Play()
        play._ds = {'handlers': []}
        play._load_handlers('handlers', play._ds)
        self.assertEqual(len(play.handlers), 0)

    def test_load_roles(self):
        play = Play()
        play._ds = {'roles': []}
        play._load_roles('roles', play._ds)
        self.assertEqual(len(play.roles), 0)

    def test_load_vars_prompt(self):
        play = Play()
        play._ds = {'vars_prompt': []}
        play._load_vars_prompt('vars_prompt', play._ds)
        self.assertEqual(len(play.vars_prompt), 0)

    def test_compile_roles(self):
        play = Play()
        play._ds = {'roles': []}
        play._compile_roles()
        self.assertEqual(len(play.blocks), 0)

    def test_compile_roles_handlers(self):
        play = Play()
        play._ds = {'roles': []}
        play.compile_roles_handlers()
        self.assertEqual(len(play.blocks), 0)

if __name__ == '__main__':
    unittest.main()