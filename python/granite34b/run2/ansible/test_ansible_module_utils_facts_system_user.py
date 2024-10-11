import unittest
from ansible.module_utils.facts.system.user import UserFactCollector


class TestUserFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = UserFactCollector()
        user_facts = collector.collect()
        self.assertIsInstance(user_facts, dict)
        self.assertIn('user_id', user_facts)
        self.assertIn('user_uid', user_facts)
        self.assertIn('user_gid', user_facts)
        self.assertIn('user_gecos', user_facts)
        self.assertIn('user_dir', user_facts)
        self.assertIn('user_shell', user_facts)
        self.assertIn('real_user_id', user_facts)
        self.assertIn('effective_user_id', user_facts)
        self.assertIn('real_group_id', user_facts)
        self.assertIn('effective_group_id', user_facts)

    def test_private_method(self):
        collector = UserFactCollector()
        user_facts = collector.collect_user_facts()
        self.assertIsInstance(user_facts, dict)
        self.assertIn('user_id', user_facts)
        self.assertIn('user_uid', user_facts)
        self.assertIn('user_gid', user_facts)
        self.assertIn('user_gecos', user_facts)
        self.assertIn('user_dir', user_facts)
        self.assertIn('user_shell', user_facts)
        self.assertNotIn('real_user_id', user_facts)
        self.assertNotIn('effective_user_id', user_facts)
        self.assertNotIn('real_group_id', user_facts)
        self.assertNotIn('effective_group_id', user_facts)

if __name__ == '__main__':
    unittest.main()