import unittest
import ansible.plugins.action as ActionBas
from ansible.module_utils.basic import FILE_COMMON_ARGUMENTS
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.module_utils.hashing import checksum
from ansible.plugins.action.copy import ActionModule


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertEqual(instance.__class__, ActionModule)

    def test_ensure_invocation(self):
        instance = ActionModule()
        result = instance._ensure_invocation({})
        self.assertIn('invocation', result)

    def test_copy_file(self):
        instance = ActionModule()
        source_full = 'source_full'
        source_rel = 'source_rel'
        content = 'content'
        content_tempfile = 'content_tempfile'
        dest = 'dest'
        task_vars = {}
        follow = True
        result = instance._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIn('diff', result)
        self.assertIn('changed', result)

    def test_create_content_tempfile(self):
        instance = ActionModule()
        content = 'content'
        content_tempfile = instance._create_content_tempfile(content)
        self.assertIsInstance(content_tempfile, str)

    def test_remove_tempfile_if_content_defined(self):
        instance = ActionModule()
        content = 'content'
        content_tempfile = 'content_tempfile'
        instance._remove_tempfile_if_content_defined(content, content_tempfile)

    def test_str_method(self):
        instance = ActionModule()
        result = str(instance)
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        instance = ActionModule()
        result = repr(instance)
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()