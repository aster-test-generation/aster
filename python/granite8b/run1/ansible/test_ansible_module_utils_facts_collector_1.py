import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def test_platform_match(self):
        class MockPlatformInfo:
            def __init__(self, system):
                self.system = system
        collector = BaseFactCollector()
        self.assertIsNone(collector.platform_match(MockPlatformInfo('not_a_match')))
        self.assertIsInstance(collector.platform_match(MockPlatformInfo('Linux')), BaseFactCollector)

    def test_collect_with_namespace(self):
        collector = BaseFactCollector()
        self.assertEqual(collector.collect_with_namespace(), {})

    def test_collect(self):
        collector = BaseFactCollector()
        self.assertEqual(collector.collect(), {})

if __name__ == '__main__':
    unittest.main()