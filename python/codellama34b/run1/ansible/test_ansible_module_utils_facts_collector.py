import unittest
from ansible.module_utils.facts.collector import BaseFactCollector



class TestCollector(unittest.TestCase):
    def test_get_collector_names(self):
        valid_subsets = frozenset()
        minimal_gather_subset = frozenset()
        gather_subset = ['all']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        self.assertEqual(result, frozenset())

    def test_find_collectors_for_platform(self):
        all_collector_classes = []
        compat_platforms = [{'system': 'Generic'}]
        result = find_collectors_for_platform(all_collector_classes, compat_platforms)
        self.assertEqual(result, set())

    def test_build_fact_id_to_collector_map(self):
        collectors_for_platform = set()
        result = build_fact_id_to_collector_map(collectors_for_platform)
        self.assertEqual(result, (defaultdict(list), defaultdict(set)))

    def test_select_collector_classes(self):
        collector_names = set()
        all_fact_subsets = defaultdict(list)
        result = select_collector_classes(collector_names, all_fact_subsets)
        self.assertEqual(result, [])

    def test__get_requires_by_collector_name(self):
        collector_name = 'Generic'
        all_fact_subsets = defaultdict(list)
        result = _get_requires_by_collector_name(collector_name, all_fact_subsets)
        self.assertEqual(result, set())

    def test_find_unresolved_requires(self):
        collector_names = set()
        all_fact_subsets = defaultdict(list)
        result = find_unresolved_requires(collector_names, all_fact_subsets)
        self.assertEqual(result, set())

    def test_resolve_requires(self):
        unresolved_requires = set()
        all_fact_subsets = defaultdict(list)
        result = resolve_requires(unresolved_requires, all_fact_subsets)
        self.assertEqual(result, set())

    def test_build_dep_data(self):
        collector_names = set()
        all_fact_subsets = defaultdict(list)
        result = build_dep_data(collector_names, all_fact_subsets)
        self.assertEqual(result, defaultdict(set))

    def test_tsort(self):
        dep_map = defaultdict(set)
        result = tsort(dep_map)
        self.assertEqual(result, [])

    def test__solve_deps(self):
        collector_names = set()
        all_fact_subsets = defaultdict(list)
        result = _solve_deps(collector_names, all_fact_subsets)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()