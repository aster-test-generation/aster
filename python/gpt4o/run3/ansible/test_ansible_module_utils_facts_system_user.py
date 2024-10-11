import unittest
from unittest.mock import patch, MagicMock
from ansible.module_utils.facts.system.user import UserFactCollector


class TestUserFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = UserFactCollector()

    @patch('getpass.getuser', return_value='testuser')
    @patch('pwd.getpwnam')
    @patch('os.getuid', return_value=1000)
    @patch('os.geteuid', return_value=1000)
    @patch('os.getgid', return_value=1000)
    def test_collect(self, mock_getuid, mock_geteuid, mock_getgid, mock_getpwnam, mock_getuser):
        pwent = MagicMock()
        pwent.pw_uid = 1000
        pwent.pw_gid = 1000
        pwent.pw_gecos = 'Test User'
        pwent.pw_dir = '/home/testuser'
        pwent.pw_shell = '/bin/bash'
        mock_getpwnam.return_value = pwent

        result = self.collector.collect()

        self.assertEqual(result['user_id'], 'testuser')
        self.assertEqual(result['user_uid'], 1000)
        self.assertEqual(result['user_gid'], 1000)
        self.assertEqual(result['user_gecos'], 'Test User')
        self.assertEqual(result['user_dir'], '/home/testuser')
        self.assertEqual(result['user_shell'], '/bin/bash')
        self.assertEqual(result['real_user_id'], 1000)
        self.assertEqual(result['effective_user_id'], 1000)
        self.assertEqual(result['real_group_id'], 1000)
        self.assertEqual(result['effective_group_id'], 1000)

    @patch('getpass.getuser', return_value='testuser')
    @patch('pwd.getpwnam', side_effect=KeyError)
    @patch('pwd.getpwuid')
    @patch('os.getuid', return_value=1000)
    @patch('os.geteuid', return_value=1000)
    @patch('os.getgid', return_value=1000)
    def test_collect_keyerror(self, mock_getuid, mock_geteuid, mock_getgid, mock_getpwuid, mock_getpwnam, mock_getuser):
        pwent = MagicMock()
        pwent.pw_uid = 1000
        pwent.pw_gid = 1000
        pwent.pw_gecos = 'Test User'
        pwent.pw_dir = '/home/testuser'
        pwent.pw_shell = '/bin/bash'
        mock_getpwuid.return_value = pwent

        result = self.collector.collect()

        self.assertEqual(result['user_id'], 'testuser')
        self.assertEqual(result['user_uid'], 1000)
        self.assertEqual(result['user_gid'], 1000)
        self.assertEqual(result['user_gecos'], 'Test User')
        self.assertEqual(result['user_dir'], '/home/testuser')
        self.assertEqual(result['user_shell'], '/bin/bash')
        self.assertEqual(result['real_user_id'], 1000)
        self.assertEqual(result['effective_user_id'], 1000)
        self.assertEqual(result['real_group_id'], 1000)
        self.assertEqual(result['effective_group_id'], 1000)

if __name__ == '__main__':
    unittest.main()