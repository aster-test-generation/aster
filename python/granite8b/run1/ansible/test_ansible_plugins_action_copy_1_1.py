import unittest
from ansible.plugins.action import copy


class TestActionModule(unittest.TestCase):
    def test_ensure_invocation(self):
        action = ActionModule()
        result = action._ensure_invocation({})
        self.assertEqual(result['invocation'], {})

    def test_copy_file(self):
        action = ActionModule()
        result = action._copy_file('source_full', 'source_rel', 'content', 'content_tempfile', 'dest', {}, False)
        self.assertEqual(result['diff'], [])

    def test_create_content_tempfile(self):
        action = ActionModule()
        content_tempfile = action._create_content_tempfile('content')
        self.assertTrue(os.path.exists(content_tempfile))
        os.remove(content_tempfile)

    def test_remove_tempfile_if_content_defined(self):
        action = ActionModule()
        content_tempfile = action._create_content_tempfile('content')
        action._remove_tempfile_if_content_defined('content', content_tempfile)
        self.assertFalse(os.path.exists(content_tempfile))

if __name__ == '__main__':
    unittest.main()