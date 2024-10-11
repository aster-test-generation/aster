import unittest
from ansible.plugins.action import copy


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run()
        self.assertEqual(result, {'failed': True, 'msg': 'src (or content) is required'})

    def test_run_with_content(self):
        action = ActionModule()
        result = action.run(content='Hello, World!')
        self.assertEqual(result, {'failed': False, 'changed': True, 'dest': '/tmp/test.txt', 'src': 'Hello, World!', 'checksum': 'b10a8db164e0754105b7a99be72e3fe5'})

    def test_run_with_content_and_dest_directory(self):
        action = ActionModule()
        result = action.run(content='Hello, World!', dest='/tmp/test_dir/')
        self.assertEqual(result, {'failed': True, 'msg': 'can not use content with a dir as dest'})

    def test_run_with_remote_src(self):
        action = ActionModule()
        result = action.run(remote_src=True)
        self.assertEqual(result, {'failed': True, 'msg': 'src (or content) is required'})

    def test_run_with_trailing_slash(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/')
        self.assertEqual(result, {'failed': True, 'msg': 'dest cannot be a directory when src is a directory'})

    def test_run_with_trailing_slash_and_content(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', content='Hello, World!')
        self.assertEqual(result, {'failed': True, 'msg': 'dest cannot be a directory when src is a directory'})

    def test_run_with_trailing_slash_and_remote_src(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', remote_src=True)
        self.assertEqual(result, {'failed': True, 'msg': 'dest cannot be a directory when src is a directory'})

    def test_run_with_trailing_slash_and_follow(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', follow=True)
        self.assertEqual(result, {'failed': True, 'msg': 'dest cannot be a directory when src is a directory'})

    def test_run_with_trailing_slash_and_content_and_dest_directory(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', content='Hello, World!')
        self.assertEqual(result, {'failed': True, 'msg': 'can not use content with a dir as dest'})

    def test_run_with_trailing_slash_and_content_and_remote_src(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', content='Hello, World!', remote_src=True)
        self.assertEqual(result, {'failed': True, 'msg': 'can not use content with a dir as dest'})

    def test_run_with_trailing_slash_and_content_and_follow(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', content='Hello, World!', follow=True)
        self.assertEqual(result, {'failed': True, 'msg': 'can not use content with a dir as dest'})

    def test_run_with_trailing_slash_and_content_and_directory_mode(self):
        action = ActionModule()
        result = action.run(src='/tmp/test_dir/', dest='/tmp/test_dir/', content='Hello, World!', directory_mode='0755')
        self.assertEqual(result, {'failed': True, 'msg': 'can not use content with a dir as dest'})

if __name__ == '__main__':
    unittest.main()