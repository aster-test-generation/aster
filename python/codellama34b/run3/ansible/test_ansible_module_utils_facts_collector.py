import unittest
from ansible.module_utils.facts.collector import BaseFactCollector



class TestGetCollectorNames(unittest.TestCase):
    def test_get_collector_names(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

    def test_get_collector_names_2(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

    def test_get_collector_names_3(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

    def test_get_collector_names_4(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

    def test_get_collector_names_5(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

    def test_get_collector_names_6(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

if __name__ == '__main__':
    unittest.main()