import unittest
from ansible.plugins.action import copy


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars=None)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'src (or content) is required')

    def test_content_tempfile(self):
        action = ActionModule()
        result = action._create_content_tempfile('test')
        self.assertEqual(result.endswith('.tmp'), True)

    def test_copy_file(self):
        action = ActionModule()
        result = action._copy_file('test', 'test', None, None, 'test', None, False)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'src and content are mutually exclusive')

    def test_copy_directory(self):
        action = ActionModule()
        result = action._copy_file('test', 'test', None, None, 'test', None, True)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'can not use content with a dir as dest')

    def test_copy_symlink(self):
        action = ActionModule()
        result = action._copy_file('test', 'test', None, None, 'test', None, False)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'src and content are mutually exclusive')

if __name__ == '__main__':
    unittest.main()