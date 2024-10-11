import unittest
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = FcWwnInitiatorFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = FcWwnInitiatorFactCollector()
        result = instance.name
        self.assertEqual(result, 'fibre_channel_wwn')

    def test__fact_ids(self):
        instance = FcWwnInitiatorFactCollector()
        result = instance._fact_ids
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()