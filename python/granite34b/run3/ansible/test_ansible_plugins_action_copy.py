import unittest
from ansible.plugins.action.copy import ActionModule


class TestActionModule(unittest.TestCase):
    def test_init(self):
        action_module = ActionModule()
        self.assertIsInstance(action_module, ActionModule)

    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(None)
        self.assertIsInstance(result, dict)

    def test_run_with_source_and_dest(self):
        action_module = ActionModule()
        task_vars = {'src': 'source_file', 'dest': 'destination_file'}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertFalse(result.get('failed'))

    def test_run_with_content_and_dest(self):
        action_module = ActionModule()
        task_vars = {'content': 'test content', 'dest': 'destination_file'}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertFalse(result.get('failed'))

    def test_run_with_remote_src(self):
        action_module = ActionModule()
        task_vars = {'src': 'source_file', 'dest': 'destination_file', 'remote_src': True}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertFalse(result.get('failed'))

    def test_run_with_local_follow(self):
        action_module = ActionModule()
        task_vars = {'src': 'source_file', 'dest': 'destination_file', 'local_follow': True}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertFalse(result.get('failed'))

    def test_run_with_content_and_dest_as_directory(self):
        action_module = ActionModule()
        task_vars = {'content': 'test content', 'dest': 'destination_directory/'}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertTrue(result.get('failed'))
        self.assertEqual(result.get('msg'), 'can not use content with a dir as dest')

    def test_run_with_source_and_content(self):
        action_module = ActionModule()
        task_vars = {'src': 'source_file', 'content': 'test content'}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertTrue(result.get('failed'))
        self.assertEqual(result.get('msg'), 'src and content are mutually exclusive')

    def test_run_with_no_source_or_content(self):
        action_module = ActionModule()
        task_vars = {'dest': 'destination_file'}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertTrue(result.get('failed'))
        self.assertEqual(result.get('msg'), 'src (or content) is required')

    def test_run_with_no_dest(self):
        action_module = ActionModule()
        task_vars = {'src': 'source_file'}
        result = action_module.run(task_vars=task_vars, play_context=play_context)
        self.assertIsInstance(result, dict)
        self.assertTrue(result.get('failed'))
        self.assertEqual(result.get('msg'), 'dest is required')

if __name__ == '__main__':
    unittest.main()