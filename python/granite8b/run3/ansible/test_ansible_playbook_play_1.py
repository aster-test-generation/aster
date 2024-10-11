import unittest
from ansible.playbook.play import Play


class TestPlay(unittest.TestCase):
    def test_get_name(self):
        play = Play()
        play.name = "test_play"
        self.assertEqual(play.get_name(), "test_play")
        play.hosts = ["host1", "host2"]
        self.assertEqual(play.get_name(), "host1,host2")

    def test_preprocess_data(self):
        play = Play()
        play.preprocess_data({})
        self.assertEqual(play.vars, {})

    def test_load(self):
        play = Play.load({})
        self.assertIsInstance(play, Play)

    def test_preprocess_data(self):
        play = Play()
        play.preprocess_data({})
        self.assertEqual(play.vars, {})

    def test__load_tasks(self):
        play = Play()
        play._load_tasks("tasks", {})
        self.assertEqual(play.tasks, [])

    def test__load_pre_tasks(self):
        play = Play()
        play._load_pre_tasks("pre_tasks", {})
        self.assertEqual(play.pre_tasks, [])

    def test__load_post_tasks(self):
        play = Play()
        play._load_post_tasks("post_tasks", {})
        self.assertEqual(play.post_tasks, [])

    def test__load_handlers(self):
        play = Play()
        play._load_handlers("handlers", {})
        self.assertEqual(play.handlers, [])

    def test__load_roles(self):
        play = Play()
        play._load_roles("roles", {})
        self.assertEqual(play.roles, [])

    def test__load_vars_prompt(self):
        play = Play()
        play._load_vars_prompt("vars_prompt", {})
        self.assertEqual(play.vars_prompt, [])

    def test__compile_roles(self):
        play = Play()
        play._compile_roles()
        self.assertEqual(play.tasks, [])

    def test_compile_roles_handlers(self):
        play = Play()
        play.compile_roles_handlers()
        self.assertEqual(play.handlers, [])

if __name__ == '__main__':
    unittest.main()