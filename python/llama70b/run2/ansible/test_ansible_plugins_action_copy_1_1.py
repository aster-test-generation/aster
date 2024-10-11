import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test___init__(self):
        instance = copy.ActionModule()
        self.assertIsInstance(instance, copy.ActionBase)

    def test__ensure_invocation(self):
        instance = copy.ActionModule()
        result = {'invocation': {}}
        instance._play_context = mock.Mock(no_log=True)
        instance._task = mock.Mock(args={'module_args': {}})
        instance._ensure_invocation(result)
        self.assertEqual(result['invocation'], 'CENSORED: no_log is set')

    def test__copy_file(self):
        instance = copy.ActionModule()
        instance._loader = mock.Mock(get_real_file=mock.Mock(return_value='source_full'))
        instance._connection = mock.Mock(_shell=mock.Mock(path_has_trailing_slash=mock.Mock(return_value=False), join_path=mock.Mock(return_value='dest_file')))
        instance._task = mock.Mock(args={'decrypt': True, 'force': 'yes', 'raw': 'no'})
        instance._play_context = mock.Mock(diff=True, check_mode=False)
        task_vars = {}
        follow = False
        result = instance._copy_file('source_full', 'source_rel', None, None, 'dest', task_vars, follow)
        self.assertIsInstance(result, dict)

    def test__create_content_tempfile(self):
        instance = copy.ActionModule()
        content = 'some content'
        content_tempfile = instance._create_content_tempfile(content)
        self.assertIsInstance(content_tempfile, str)

    def test__remove_tempfile_if_content_defined(self):
        instance = copy.ActionModule()
        content = 'some content'
        content_tempfile = instance._create_content_tempfile(content)
        instance._remove_tempfile_if_content_defined(content, content_tempfile)
        self.assertFalse(os.path.exists(content_tempfile))

    def test___str__(self):
        instance = copy.ActionModule()
        self.assertEqual(str(instance), 'ActionModule')

    def test___repr__(self):
        instance = copy.ActionModule()
        self.assertEqual(repr(instance), 'ActionModule()')

if __name__ == '__main__':
    unittest.main()