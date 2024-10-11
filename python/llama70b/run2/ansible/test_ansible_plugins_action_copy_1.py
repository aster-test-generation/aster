import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test___init__(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test__ensure_invocation(self):
        instance = ActionModule()
        result = instance._ensure_invocation({'failed': True, 'msg': 'test'})
        self.assertIsInstance(result, dict)

    def test__create_content_tempfile(self):
        instance = ActionModule()
        content = 'test content'
        tempfile = instance._create_content_tempfile(content)
        self.assertIsInstance(tempfile, str)

    def test__find_needle(self):
        instance = ActionModule()
        source = 'test source'
        result = instance._find_needle('files', source)
        self.assertIsInstance(result, str)

    def test__remote_expand_user(self):
        instance = ActionModule()
        dest = '/test/dest'
        result = instance._remote_expand_user(dest)
        self.assertIsInstance(result, str)

    def test__copy_file(self):
        instance = ActionModule()
        source_full = 'test source full'
        source_rel = 'test source rel'
        content = 'test content'
        content_tempfile = 'test content tempfile'
        dest = '/test/dest'
        task_vars = {}
        follow = True
        result = instance._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIsInstance(result, dict)

    def test__execute_module(self):
        instance = ActionModule()
        module_name = 'ansible.legacy.copy'
        task_vars = {}
        result = instance._execute_module(module_name, task_vars=task_vars)
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = ActionModule()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = ActionModule()
        result = repr(instance)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()