import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def test_platform_match(self):
        class MockPlatformInfo:
            def __init__(self, system):
                self.system = system
        class MockFactCollector(BaseFactCollector):
            _platform = 'Linux'
        instance = MockFactCollector()
        result = instance.platform_match(MockPlatformInfo('Linux'))
        self.assertIsInstance(result, MockFactCollector)
        result = instance.platform_match(MockPlatformInfo('Windows'))
        self.assertIsNone(result)

    def test_collect_with_namespace(self):
        class MockFactCollector(BaseFactCollector):
            def collect(self):
                return {'key': 'value'}
        instance = MockFactCollector()
        result = instance.collect_with_namespace()
        self.assertEqual(result, {'key': 'value'})

    def test_collect(self):
        class MockFactCollector(BaseFactCollector):
            def collect(self):
                return {'key': 'value'}
        instance = MockFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()