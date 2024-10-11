import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PlatformFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('system', result)
        self.assertIn('kernel', result)
        self.assertIn('kernel_version', result)
        self.assertIn('machine', result)
        self.assertIn('python_version', result)
        self.assertIn('fqdn', result)
        self.assertIn('hostname', result)
        self.assertIn('nodename', result)
        self.assertIn('domain', result)
        self.assertIn('userspace_bits', result)
        self.assertIn('architecture', result)
        self.assertIn('userspace_architecture', result)
        self.assertIn('machine_id', result)

if __name__ == '__main__':
    unittest.main()