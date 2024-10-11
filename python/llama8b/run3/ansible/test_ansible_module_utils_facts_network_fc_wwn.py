import unittest
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = FcWwnInitiatorFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIsInstance(result, dict)
        self.assertIn('fibre_channel_wwn', result)
        self.assertIsInstance(result['fibre_channel_wwn'], list)

    def test_collect_linux(self):
        collector = FcWwnInitiatorFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', result)
        self.assertIsInstance(result['fibre_channel_wwn'], list)
        self.assertEqual(len(result['fibre_channel_wwn']), 1)

    def test_collect_sunos(self):
        collector = FcWwnInitiatorFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', result)
        self.assertIsInstance(result['fibre_channel_wwn'], list)
        self.assertEqual(len(result['fibre_channel_wwn']), 1)

    def test_collect_aix(self):
        collector = FcWwnInitiatorFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', result)
        self.assertIsInstance(result['fibre_channel_wwn'], list)
        self.assertEqual(len(result['fibre_channel_wwn']), 1)

    def test_collect_hpux(self):
        collector = FcWwnInitiatorFactCollector()
        result = collector.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', result)
        self.assertIsInstance(result['fibre_channel_wwn'], list)
        self.assertEqual(len(result['fibre_channel_wwn']), 1)

    def test_str_method(self):
        collector = FcWwnInitiatorFactCollector()
        result = str(collector)
        self.assertEqual(result, 'FcWwnInitiatorFactCollector')

    def test_repr_method(self):
        collector = FcWwnInitiatorFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'FcWwnInitiatorFactCollector()')

if __name__ == '__main__':
    unittest.main()