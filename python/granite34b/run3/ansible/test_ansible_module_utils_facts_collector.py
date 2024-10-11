import unittest
from ansible.module_utils.facts.collector import BaseFactCollector, get_collector_names, find_collectors_for_platform, build_fact_id_to_collector_map, select_collector_classes, find_unresolved_requires, resolve_requires, build_dep_data, tsort, _solve_deps, _get_requires_by_collector_name, CollectorNotFoundError, UnresolvedFactDep


class TestCollector(unittest.TestCase):
    def test_get_collector_names(self):
        valid_subsets = frozenset(['a', 'b', 'c'])
        minimal_gather_subset = frozenset(['a', 'b'])
        gather_subset = ['a', 'b', 'c']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Generic'}
        result = get_collector_names(valid_subsets, minimal_gather_subset, gather_subset, aliases_map, platform_info)
        self.assertEqual(result, {'a', 'b', 'c'})

    def test_find_collectors_for_platform(self):
        all_collector_classes = [ExampleClass1, ExampleClass2]
        compat_platforms = [{'system': 'Generic'}, {'system': 'ExampleSystem1'}, {'system': 'ExampleSystem2'}]
        result = find_collectors_for_platform(all_collector_classes, compat_platforms)
        self.assertEqual(result, {ExampleClass1, ExampleClass2})

    def test_build_fact_id_to_collector_map(self):
        collectors_for_platform = [ExampleClass1, ExampleClass2]
        result = build_fact_id_to_collector_map(collectors_for_platform)
        self.assertEqual(result, ({'ExampleClass1': [ExampleClass1], 'ExampleClass2': [ExampleClass2]}, defaultdict(set, {'ExampleClass1': {'ExampleClass1'}, 'ExampleClass2': {'ExampleClass2'}})))

    def test_select_collector_classes(self):
        collector_names = ['ExampleClass1', 'ExampleClass2']
        all_fact_subsets = {'ExampleClass1': [ExampleClass1], 'ExampleClass2': [ExampleClass2]}
        result = select_collector_classes(collector_names, all_fact_subsets)
        self.assertEqual(result, [ExampleClass1, ExampleClass2])

    def test_find_unresolved_requires(self):
        collector_names = ['ExampleClass1', 'ExampleClass2']
        all_fact_subsets = {'ExampleClass1': [ExampleClass1], 'ExampleClass2': [ExampleClass2]}
        result = find_unresolved_requires(collector_names, all_fact_subsets)
        self.assertEqual(result, set())

    def test_resolve_requires(self):
        unresolved_requires = ['ExampleClass1', 'ExampleClass2']
        all_fact_subsets = {'ExampleClass1': [ExampleClass1], 'ExampleClass2': [ExampleClass2]}
        result = resolve_requires(unresolved_requires, all_fact_subsets)
        self.assertEqual(result, {'ExampleClass1', 'ExampleClass2'})

    def test_build_dep_data(self):
        collector_names = ['ExampleClass1', 'ExampleClass2']
        all_fact_subsets = {'ExampleClass1': [ExampleClass1], 'ExampleClass2': [ExampleClass2]}
        result = build_dep_data(collector_names, all_fact_subsets)
        self.assertEqual(result, defaultdict(set, {'ExampleClass1': set(), 'ExampleClass2': set()}))

    def test_tsort(self):
        dep_map = defaultdict(set, {'ExampleClass1': {'ExampleClass2'}, 'ExampleClass2': set()})
        result = tsort(dep_map)
        self.assertEqual(result, [('ExampleClass2', set()), ('ExampleClass1', {'ExampleClass2'})])

    def test_solve_deps(self):
        collector_names = ['ExampleClass1', 'ExampleClass2']
        all_fact_subsets = {'ExampleClass1': [ExampleClass1], 'ExampleClass2': [ExampleClass2]}
        result = _solve_deps(collector_names, all_fact_subsets)
        self.assertEqual(result, {'ExampleClass1', 'ExampleClass2'})

if __name__ == '__main__':
    unittest.main()