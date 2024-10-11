import unittest
from ansible.playbook.play import Play
from ansible.errors import AnsibleParserError, AnsibleAssertionError


class TestPlay(unittest.TestCase):
    def setUp(self):
        self.play = Play()

    def test_init(self):
        self.assertIsNone(self.play._included_conditional)
        self.assertIsNone(self.play._included_path)
        self.assertEqual(self.play._removed_hosts, [])
        self.assertEqual(self.play.ROLE_CACHE, {})
        self.assertEqual(self.play.only_tags, frozenset(('all',)))
        self.assertEqual(self.play.skip_tags, set())
        self.assertEqual(self.play._action_groups, {})
        self.assertEqual(self.play._group_actions, {})

    def test_repr(self):
        self.play.name = "test_play"
        self.assertEqual(repr(self.play), "test_play")

    def test_validate_hosts_empty(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play._validate_hosts('hosts', 'hosts', [], _ds=None)
        self.assertEqual(str(context.exception), 'Hosts list cannot be empty. Please check your playbook')

    def test_validate_hosts_none(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play._validate_hosts('hosts', 'hosts', [])
        self.assertEqual(str(context.exception), "Hosts list cannot contain values of 'None'. Please check your playbook")

    def test_validate_hosts_invalid_type(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play._validate_hosts('hosts', 'hosts', ['123'])
        self.assertEqual(str(context.exception), "Hosts list contains an invalid host value: '123'")

    def test_validate_hosts_invalid_sequence(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play._validate_hosts('hosts', 'hosts', 123)
        self.assertEqual(str(context.exception), 'Hosts list must be a sequence or string. Please check your playbook.')

    def test_get_name(self):
        self.play.name = None
        self.play.hosts = ['host1', 'host2']
        self.assertEqual(self.play.get_name(), 'host1,host2')

    def test_load(self):
        data = {'key': 'value'}
        play = Play.load(data, variable_manager=variable_manager, loader=loader)
        self.assertIsInstance(play, Play)

    def test_preprocess_data_invalid_type(self):
        with self.assertRaises(AnsibleAssertionError) as context:
            self.play.preprocess_data([])
        self.assertIn('ds should be a dict but was a', str(context.exception))

    def test_preprocess_data_user_conflict(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play.preprocess_data({'user': 'user1', 'remote_user': 'user2'})
        self.assertIn("both 'user' and 'remote_user' are set for this play", str(context.exception))

    def test_load_tasks(self):
        with self.assertRaises(AnsibleParserError):
            self.play._load_tasks('tasks', [])
        self.assertIn('A malformed block was encountered while loading tasks', str(context.exception))

    def test_load_pre_tasks(self):
        with self.assertRaises(AnsibleParserError, msg="AnsibleParserError not raised") as context:
            self.play._load_pre_tasks('pre_tasks', [])
        self.assertIn('A malformed block was encountered while loading pre_tasks', str(context.exception))

    def test_load_post_tasks(self):
        with self.assertRaises(AnsibleParserError, msg="AnsibleParserError not raised") as context:
            self.play._load_post_tasks('post_tasks', [])
        self.assertIn('A malformed block was encountered while loading post_tasks', str(context.exception))

    def test_load_handlers(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play._load_handlers('handlers', [])
        self.assertIn('A malformed block was encountered while loading handlers', str(context.exception))

    def test_load_roles(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play.load_roles('roles', [])
        self.assertIn('A malformed role declaration was encountered.', str(context.exception))

    def test_load_vars_prompt_invalid(self):
        with self.assertRaises(AnsibleParserError) as context:
            self.play._load_vars_prompt('vars_prompt', [{'invalid_key': 'value'}])
        self.assertIn("Invalid vars_prompt data structure, missing 'name' key", str(context.exception))

    def test_compile_roles(self):
        self.play.roles = []
        self.assertEqual(self.play._compile_roles(), [])

    def test_compile_roles_handlers(self):
        self.play.roles = []
        self.assertEqual(self.play.compile_roles_handlers(), [])

if __name__ == '__main__':
    unittest.main()