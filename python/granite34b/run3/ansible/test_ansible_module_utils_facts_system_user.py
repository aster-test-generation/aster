import unittest
from ansible.module_utils.facts.system.user import UserFactCollector


class TestUserFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = UserFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('user_id', result)
        self.assertIn('user_uid', result)
        self.assertIn('user_gid', result)
        self.assertIn('user_gecos', result)
        self.assertIn('user_dir', result)
        self.assertIn('user_shell', result)
        self.assertIn('real_user_id', result)
        self.assertIn('effective_user_id', result)
        self.assertIn('real_group_id', result)
        self.assertIn('effective_group_id', result)

if __name__ == '__main__':
    unittest.main()