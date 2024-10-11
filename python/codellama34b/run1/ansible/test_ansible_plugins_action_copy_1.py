import unittest
from ansible.plugins.action.copy import ActionModule
from ansible.plugins.action.copy import _walk_dirs
from ansible.plugins.action.copy import _create_remote_file_args


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_copy_file(self):
        instance = ActionModule()
        result = instance._copy_file(source_full=None, source_rel=None, content=None, content_tempfile=None, dest=None, task_vars=None, follow=None)
        self.assertIsInstance(result, dict)

    def test_find_needle(self):
        instance = ActionModule()
        result = instance._find_needle(needle_type='files', haystack=None)
        self.assertIsInstance(result, str)

    def test_create_content_tempfile(self):
        instance = ActionModule()
        result = instance._create_content_tempfile(content=None)
        self.assertIsInstance(result, str)

    def test_walk_dirs(self):
        result = _walk_dirs(source=None, local_follow=None, trailing_slash_detector=None)
        self.assertIsInstance(result, dict)

    def test_create_remote_file_args(self):
        result = _create_remote_file_args(module_args=None)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()