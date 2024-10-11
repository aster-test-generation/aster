import unittest
from ansible.module_utils.facts.system.platform import PlatformFactCollector


class TestPlatformFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PlatformFactCollector()
        facts = collector.collect()
        self.assertIn('system', facts)
        self.assertIn('kernel', facts)
        self.assertIn('kernel_version', facts)
        self.assertIn('machine', facts)
        self.assertIn('python_version', facts)
        self.assertIn('architecture', facts)
        self.assertIn('machine_id', facts)

if __name__ == '__main__':
    unittest.main()