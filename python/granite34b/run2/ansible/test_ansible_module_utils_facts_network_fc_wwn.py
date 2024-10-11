import unittest
from ansible.module_utils.facts.network.fc_wwn import FcWwnInitiatorFactCollector


class TestFcWwnInitiatorFactCollector(unittest.TestCase):
    def test_collect_on_linux(self):
        collector = FcWwnInitiatorFactCollector()
        from unittest import mock
        collected_facts = {}
        with unittest.mock.patch('ansible.module_utils.facts.network.fc_wwn.get_file_lines') as mock_get_file_lines:
            mock_get_file_lines.return_value = ['0x1234567890abcdef']
            fc_facts = collector.collect(module, collected_facts)
        self.assertEqual(fc_facts['fibre_channel_wwn'], ['1234567890abcdef'])

    def test_collect_on_sunos(self):
        collector = FcWwnInitiatorFactCollector()
        import unittest.mock
        collected_facts = {}
        with unittest.mock.patch('ansible.module_utils.facts.network.fc_wwn.get_file_lines') as mock_get_file_lines:
            mock_get_file_lines.return_value = ['0x1234567890abcdef']
            fc_facts = collector.collect(module, collected_facts)
        self.assertEqual(fc_facts['fibre_channel_wwn'], ['1234567890abcdef'])

    def test_collect_on_aix(self):
        collector = FcWwnInitiatorFactCollector()
        from unittest import mock
        collected_facts = {}
        with unittest.mock.patch('ansible.module_utils.facts.network.fc_wwn.get_file_lines') as mock_get_file_lines:
            mock_get_file_lines.return_value = ['0x1234567890abcdef']
            fc_facts = collector.collect(module, collected_facts)
        self.assertEqual(fc_facts['fibre_channel_wwn'], ['1234567890abcdef'])

    def test_collect_on_hp_ux(self):
        collector = FcWwnInitiatorFactCollector()
        import unittest.mock
        collected_facts = {}
        with unittest.mock.patch('ansible.module_utils.facts.network.fc_wwn.get_file_lines') as mock_get_file_lines:
            mock_get_file_lines.return_value = ['0x1234567890abcdef']
            fc_facts = collector.collect(module, collected_facts)
        self.assertEqual(fc_facts['fibre_channel_wwn'], ['1234567890abcdef'])

if __name__ == '__main__':
    unittest.main()