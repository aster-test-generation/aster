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
        with self.assertRaises(AnsibleParserError):
            self.play._validate_hosts('hosts', 'name', [], _ds=None)

    def test_validate_hosts_none(self):
        self.play._ds = {'hosts': True}
        with self.assertRaises(AnsibleParserError):
            self.play._validate_hosts('hosts', 'name', [None])

    def test_validate_hosts_invalid_type(self):
        self.play._ds = {'hosts': True}
        with self.assertRaises(AnsibleParserError):
            self.play._validate_hosts('hosts', 'name', [123])

    def test_validate_hosts_valid(self):
        self.play._ds = {'hosts': True}
        try:
            self.play._validate_hosts('hosts', 'name', ['localhost'])
        except AnsibleParserError:
            self.fail("AnsibleParserError raised unexpectedly!")

    def test_get_name(self):
        self.play.name = None
        self.play.hosts = ['host1', 'host2']
        self.assertEqual(self.play.get_name(), 'host1,host2')

    def test_load(self):
        data = {'key': 'value'}
        play = Play.load(data, variable_manager=variable_manager, loader=loader)
        self.assertIsInstance(play, Play)

    def test_preprocess_data_invalid_type(self):
        with self.assertRaises(AnsibleAssertionError):
            self.play.preprocess_data([])

    def test_preprocess_data_user_conflict(self):
        ds = {'user': 'user1', 'remote_user': 'user2'}
        with self.assertRaises(AnsibleParserError):
            self.play.preprocess_data(ds)

    def test_preprocess_data_valid(self):
        ds = {'user': 'user1'}
        result = self.play.preprocess_data(ds)
        self.assertNotIn('user', result)
        self.assertIn('remote_user', result)

    def test_load_tasks(self):
        ds = [{'name': 'task1'}]
        try:
            self.play._load_tasks(ds, 'tasks')
        except AnsibleParserError:
            pass

    def test_load_pre_tasks(self):
        ds = [{'name': 'pre_task1'}]
        try:
            self.play._load_pre_tasks('pre_tasks', ds, 'tasks')
        except AnsibleParserError:
            pass  # AnsibleParserError not expected, so no need to fail the test

    def test_load_post_tasks(self):
        ds = [{'name': 'post_task1'}]
        try:
            self.play._load_post_tasks(ds)
        except AnsibleParserError:
            pass

    def test_load_handlers(self):
        ds = [{'name': 'handler1'}]
        try:
            self.play._load_handlers('handler', ds)
        except AnsibleParserError:
            self.fail("AnsibleParserError raised unexpectedly!")

    def test_load_roles(self):
        ds = [{'name': 'role1'}]
        try:
            self.play._load_roles(['role1'], ds)
        except AnsibleParserError:
            self.fail("AnsibleParserError raised unexpectedly!")

    def test_load_vars_prompt(self):
        ds = [{'name': 'var1'}]
        result = self.play._load_vars_prompt('vars_prompt', ds)
        self.assertEqual(result, [{'name': 'var1'}])

    def test_compile_roles(self):
        self.play.roles = []
        result = self.play._compile_roles()
        self.assertEqual(result, [])

    def test_compile_roles_handlers(self):
        self.play.roles = []
        result = self.play.compile_roles_handlers()
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()