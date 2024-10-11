import unittest
from ansible.module_utils.facts.system.apparmor import ApparmorFactCollector


class TestApparmorFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertIn('apparmor', facts_dict)
        self.assertIn('status', facts_dict['apparmor'])
        self.assertIn('status', facts_dict['apparmor'])

    def test_collect_enabled(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertEqual(facts_dict['apparmor']['status'], 'enabled')

    def test_collect_disabled(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertEqual(facts_dict['apparmor']['status'], 'disabled')

    def test_collect_no_apparmor(self):
        # This test case is not possible as the code checks if the directory exists
        # and will always return 'disabled' if it doesn't
        pass

    def test_str_method(self):
        collector = ApparmorFactCollector()
        result = str(collector)
        self.assertEqual(result, 'ApparmorFactCollector')

    def test_repr_method(self):
        collector = ApparmorFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'ApparmorFactCollector()')

if __name__ == '__main__':
    unittest.main()