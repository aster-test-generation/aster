import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test___init__(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test__ensure_invocation(self):
        instance = ActionModule()
        result = {'invocation': {'module_args': {'content': 'test'}}}
        instance._play_context = {'no_log': False}
        instance._task = {'args': {'content': 'test'}}
        self.assertEqual(instance._ensure_invocation(result), result)

    def test__copy_file(self):
        instance = ActionModule()
        source_full = 'test_source'
        source_rel = 'test_rel'
        content = 'test_content'
        content_tempfile = 'test_tempfile'
        dest = 'test_dest'
        task_vars = {'test_var': 'test_value'}
        follow = True
        result = instance._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIsInstance(result, dict)

    def test__create_content_tempfile(self):
        instance = ActionModule()
        content = 'test_content'
        content_tempfile = instance._create_content_tempfile(content)
        self.assertIsInstance(content_tempfile, str)

    def test__remove_tempfile_if_content_defined(self):
        instance = ActionModule()
        content = 'test_content'
        content_tempfile = 'test_tempfile'
        instance._remove_tempfile_if_content_defined(content, content_tempfile)
        self.assertTrue(os.path.exists(content_tempfile) is False)

    def test___str__(self):
        instance = ActionModule()
        self.assertEqual(str(instance), 'ActionModule')

    def test___repr__(self):
        instance = ActionModule()
        self.assertEqual(repr(instance), 'ActionModule()')

if __name__ == '__main__':
    unittest.main()