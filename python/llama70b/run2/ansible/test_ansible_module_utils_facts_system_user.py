import unittest
from ansible.module_utils.facts.system.user import UserFactCollector


class TestUserFactCollector(unittest.TestCase):
    def test___init__(self):
        instance = UserFactCollector()
        self.assertIsInstance(instance, UserFactCollector)

    def test_name(self):
        instance = UserFactCollector()
        self.assertEqual(instance.name, 'user')

    def test__fact_ids(self):
        instance = UserFactCollector()
        self.assertEqual(instance._fact_ids, set(['user_id', 'user_uid', 'user_gid',
                                                  'user_gecos', 'user_dir', 'user_shell',
                                                  'real_user_id', 'effective_user_id',
                                                  'effective_group_ids']))

    def test_collect(self):
        instance = UserFactCollector()
        result = instance.collect()
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

    def test___str__(self):
        instance = UserFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'UserFactCollector')

    def test___repr__(self):
        instance = UserFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'UserFactCollector()')

if __name__ == '__main__':
    unittest.main()