import unittest
from ansible.module_utils.facts.system.user import UserFactCollector


class TestUserFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = UserFactCollector()
        facts = collector.collect()
        self.assertIn('user_id', facts)
        self.assertIn('user_uid', facts)
        self.assertIn('user_gid', facts)
        self.assertIn('user_gecos', facts)
        self.assertIn('user_dir', facts)
        self.assertIn('user_shell', facts)
        self.assertIn('real_user_id', facts)
        self.assertIn('effective_user_id', facts)
        self.assertIn('effective_group_id', facts)

    def test_private_methods(self):
        collector = UserFactCollector()
        self.assertEqual(collector.get_user_info(), getpass.getuser())
        self.assertEqual(collector._get_user_info_from_uid(os.getuid()), pwd.getpwuid(os.getuid()).pw_name)
        self.assertEqual(collector._get_group_info(), os.getgid())
        self.assertEqual(collector._get_group_info_from_gid(os.getgid()), pwd.getgrgid(os.getgid()).gr_name)

    def test_magic_methods(self):
        collector = UserFactCollector()
        self.assertEqual(str(collector), '<ansible.module_utils.facts.system.user.UserFactCollector object at 0x7fef4dd6ea10>')
        self.assertEqual(repr(collector), 'UserFactCollector()')

if __name__ == '__main__':
    unittest.main()