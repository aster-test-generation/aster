import unittest
from ansible.module_utils.facts.system.apparmor import ApparmorFactCollector


class TestApparmorFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = ApparmorFactCollector()
        facts_dict = collector.collect()
        self.assertIn('apparmor', facts_dict)
        self.assertIn('status', facts_dict['apparmor'])
        self.assertIn('enabled', facts_dict['apparmor']['status'])

    def test_private_method(self):
        collector = ApparmorFactCollector()
        result = collector.get_apparmor_profiles()
        self.assertEqual(result, 'private_method_result')

    def test_protected_method(self):
        collector = ApparmorFactCollector()
        result = collector.protected_method()
        self.assertEqual(result, 'protected_method_result')

    def test_magic_methods(self):
        collector = ApparmorFactCollector()
        self.assertEqual(str(collector), '<ansible.module_utils.facts.system.apparm[46 chars]dd0>')
        self.assertEqual(repr(collector), 'ApparmorFactCollector()')

if __name__ == '__main__':
    unittest.main()