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

    def test_collect_module(self):
        collector = UserFactCollector()
        facts = collector.collect(module='test_module', collected_facts={})
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

    def test_collect_collected_facts(self):
        collector = UserFactCollector()
        collected_facts = {'user_id': 'test_user_id'}
        facts = collector.collect(module='test_module', collected_facts=collected_facts)
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

    def test_collect_private_method(self):
        collector = UserFactCollector()
        result = collector._UserFactCollector__collect_private_method()
        self.assertEqual(result, None)

    def test_collect_protected_method(self):
        collector = UserFactCollector()
        result = collector._collect_protected_method()
        self.assertEqual(result, None)

    def test_str_method(self):
        collector = UserFactCollector()
        result = str(collector)
        self.assertEqual(result, 'UserFactCollector')

    def test_repr_method(self):
        collector = UserFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'UserFactCollector()')

if __name__ == '__main__':
    unittest.main()