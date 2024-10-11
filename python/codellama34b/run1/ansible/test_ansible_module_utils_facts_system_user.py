import unittest
from ansible.module_utils.facts.system.user import UserFactCollector


class TestUserFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = UserFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = UserFactCollector()
        result = instance.name
        self.assertEqual(result, 'user')

    def test_fact_ids(self):
        instance = UserFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, set(['user_id', 'user_uid', 'user_gid',
                                      'user_gecos', 'user_dir', 'user_shell',
                                      'real_user_id', 'effective_user_id',
                                      'effective_group_ids']))

if __name__ == '__main__':
    unittest.main()