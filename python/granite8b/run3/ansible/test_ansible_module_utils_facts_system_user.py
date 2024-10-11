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

    def test_get_user_id(self):
        collector = UserFactCollector()
        user_id = collector.get_user_id()
        self.assertEqual(user_id, getpass.getuser())

    def test_get_user_info(self):
        collector = UserFactCollector()
        user_info = collector.get_user_info()
        self.assertEqual(user_info.pw_name, getpass.getuser())

    def test_get_user_uid(self):
        collector = UserFactCollector()
        user_uid = collector.get_user_uid()
        self.assertEqual(user_uid, pwd.getpwnam(getpass.getuser()).pw_uid)

    def test_get_user_gid(self):
        collector = UserFactCollector()
        user_gid = collector._get_user_gid()
        self.assertEqual(user_gid, pwd.getpwnam(getpass.getuser()).pw_gid)

    def test_get_user_gecos(self):
        collector = UserFactCollector()
        user_gecos = collector.get_user_gecos()
        self.assertEqual(user_gecos, pwd.getpwnam(getpass.getuser()).pw_gecos)

    def test_get_user_dir(self):
        collector = UserFactCollector()
        user_dir = collector._get_user_dir()
        self.assertEqual(user_dir, pwd.getpwnam(getpass.getuser()).pw_dir)

    def test_get_user_shell(self):
        collector = UserFactCollector()
        user_shell = collector._get_user_shell()
        self.assertEqual(user_shell, pwd.getpwnam(getpass.getuser()).pw_shell)

    def test_get_real_user_id(self):
        collector = UserFactCollector()
        real_user_id = collector.get_real_user_id()
        self.assertEqual(real_user_id, os.getuid())

    def test_get_effective_user_id(self):
        collector = UserFactCollector()
        effective_user_id = collector.get_effective_user_id()
        self.assertEqual(effective_user_id, os.geteuid())

    def test_get_real_group_id(self):
        collector = UserFactCollector()
        real_group_id = collector.get_real_group_id()
        self.assertEqual(real_group_id, os.getgid())

    def test_get_effective_group_id(self):
        collector = UserFactCollector()
        effective_group_id = collector.get_effective_group_id()
        self.assertEqual(effective_group_id, os.getgid())

if __name__ == '__main__':
    unittest.main()