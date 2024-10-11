import unittest
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_init(self):
        instance = FcWwnInitiatorFactCollector()
        self.assertIsInstance(instance, FcWwnInitiatorFactCollector)

    def test_name(self):
        instance = FcWwnInitiatorFactCollector()
        self.assertEqual(instance.name, 'fibre_channel_wwn')

    def test_fact_ids(self):
        instance = FcWwnInitiatorFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_collect_linux(self):
        instance = FcWwnInitiatorFactCollector()
        instance.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', instance.fc_facts)

    def test_collect_sunOS(self):
        instance = FcWwnInitiatorFactCollector()
        instance.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', instance.fc_facts)

    def test_collect_aix(self):
        instance = FcWwnInitiatorFactCollector()
        instance.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', instance.fc_facts)

    def test_collect_hpux(self):
        instance = FcWwnInitiatorFactCollector()
        instance.collect(module=None, collected_facts=None)
        self.assertIn('fibre_channel_wwn', instance.fc_facts)

    def test_str_method(self):
        instance = FcWwnInitiatorFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'FcWwnInitiatorFactCollector')

    def test_repr_method(self):
        instance = FcWwnInitiatorFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'FcWwnInitiatorFactCollector()')

if __name__ == '__main__':
    unittest.main()