import os
import pwd
import getpass
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
        self.assertIn('real_group_id', facts)
        self.assertIn('effective_group_id', facts)

    def test_collect_private_methods(self):
        collector = UserFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['user_id'], getpass.getuser())
        self.assertEqual(facts['user_uid'], pwd.getpwnam(getpass.getuser()).pw_uid)
        self.assertEqual(facts['user_gid'], pwd.getpwnam(getpass.getuser()).pw_gid)
        self.assertEqual(facts['user_gecos'], pwd.getpwnam(getpass.getuser()).pw_gecos)
        self.assertEqual(facts['user_dir'], pwd.getpwnam(getpass.getuser()).pw_dir)
        self.assertEqual(facts['user_shell'], pwd.getpwnam(getpass.getuser()).pw_shell)
        self.assertEqual(facts['real_user_id'], os.getuid())
        self.assertEqual(facts['effective_user_id'], os.geteuid())
        self.assertEqual(facts['real_group_id'], os.getgid())
        self.assertEqual(facts['effective_group_id'], os.getgid())

    def test_str_method(self):
        collector = UserFactCollector()
        result = str(collector)
        self.assertEqual(result, 'UserFactCollector')

    def test_repr_method(self):
        collector = UserFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'UserFactCollector()')

    def test_eq_method(self):
        collector1 = UserFactCollector()
        collector2 = UserFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()