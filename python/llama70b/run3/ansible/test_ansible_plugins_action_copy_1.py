import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = copy.ActionModule()
        self.assertIsInstance(instance, copy.ActionBase)

    def test_run(self):
        instance = copy.ActionModule()
        task_vars = {'src': 'source', 'dest': 'destination'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('failed', result)
        self.assertIn('msg', result)

    def test__ensure_invocation(self):
        instance = copy.ActionModule()
        result = {'failed': True, 'msg': 'test message'}
        invocation_result = instance._ensure_invocation(result)
        self.assertEqual(invocation_result, result)

    def test__create_content_tempfile(self):
        instance = copy.ActionModule()
        content = 'test content'
        tempfile = instance._create_content_tempfile(content)
        self.assertIsInstance(tempfile, str)

    def test__find_needle(self):
        instance = copy.ActionModule()
        source = 'files/source'
        result = instance._find_needle('files', source)
        self.assertEqual(result, source)

    def test__remote_expand_user(self):
        instance = copy.ActionModule()
        dest = '~/destination'
        expanded_dest = instance._remote_expand_user(dest)
        self.assertEqual(expanded_dest, dest)

    def test__copy_file(self):
        instance = copy.ActionModule()
        source_full = 'source/full/path'
        source_rel = 'source/rel/path'
        content = 'test content'
        dest = 'destination'
        task_vars = {'src': 'source', 'dest': 'destination'}
        result = instance._copy_file(source_full, source_rel, content, None, dest, task_vars, False)
        self.assertIn('changed', result)

    def test__execute_module(self):
        instance = copy.ActionModule()
        module_name = 'ansible.legacy.copy'
        task_vars = {'src': 'source', 'dest': 'destination'}
        result = instance._execute_module(module_name, task_vars=task_vars)
        self.assertIn('failed', result)

    def test___str__(self):
        instance = copy.ActionModule()
        str_result = str(instance)
        self.assertEqual(str_result, 'ActionModule')

    def test___repr__(self):
        instance = copy.ActionModule()
        repr_result = repr(instance)
        self.assertEqual(repr_result, 'ActionModule()')

if __name__ == '__main__':
    unittest.main()