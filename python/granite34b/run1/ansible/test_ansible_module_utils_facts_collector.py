import unittest
from ansible.module_utils.facts.collector import BaseFactCollector, get_collector_names, find_collectors_for_platform, build_fact_id_to_collector_map, select_collector_classes, _get_requires_by_collector_name, find_unresolved_requires, resolve_requires, build_dep_data, tsort, _solve_deps, collector_classes_from_gather_subset


class TestGetCollectorNames(unittest.TestCase):
    def test_get_collector_names(self):
        valid_subsets = frozenset(['subset1', 'subset2'])
        minimal_gather_subset = frozenset(['min1', 'min2'])
        gather_subset = ['subset1', 'min1']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Windows'}

        result = get_collector_names(valid_subsets, minimal_gather_subset, gather_subset, aliases_map, platform_info)

        self.assertEqual(result, {'subset1', 'min1'})

class TestFindCollectorsForPlatform(unittest.TestCase):
    def test_find_collectors_for_platform(self):
        all_collector_classes = [Collector1, Collector2]
        compat_platforms = [{'system': 'Windows'}, {'system': 'Linux'}]

        result = find_collectors_for_platform(all_collector_classes, compat_platforms)

        self.assertEqual(result, {Collector1, Collector2})

class TestBuildFactIdToCollectorMap(unittest.TestCase):
    def test_build_fact_id_to_collector_map(self):
        collectors_for_platform = [Collector1, Collector2]

        fact_id_to_collector_map, aliases_map = build_fact_id_to_collector_map(collectors_for_platform)

        self.assertEqual(fact_id_to_collector_map, {'collector1': [Collector1], 'collector2': [Collector2]})
        self.assertEqual(aliases_map, {'collector1': {'alias1', 'alias2'}, 'collector2': {'alias3', 'alias4'}})

class TestSelectCollectorClasses(unittest.TestCase):
    def test_select_collector_classes(self):
        collector_names = ['collector1', 'collector2']
        all_fact_subsets = {'collector1': [Collector1], 'collector2': [Collector2]}

        result = select_collector_classes(collector_names, all_fact_subsets)

        self.assertEqual(result, [Collector1, Collector2])

class TestGetRequiresByCollectorName(unittest.TestCase):
    def test_get_requires_by_collector_name(self):
        collector_name = 'collector1'
        all_fact_subsets = {'collector1': [Collector1]}

        result = _get_requires_by_collector_name(collector_name, all_fact_subsets)

        self.assertEqual(result, {'fact1', 'fact2'})

class TestFindUnresolvedRequires(unittest.TestCase):
    def test_find_unresolved_requires(self):
        collector_names = ['collector1', 'collector2']
        all_fact_subsets = {'collector1': [Collector1], 'collector2': [Collector2]}

        result = find_unresolved_requires(collector_names, all_fact_subsets)

        self.assertEqual(result, {'fact3', 'fact4'})

class TestResolveRequires(unittest.TestCase):
    def test_resolve_requires(self):
        unresolved_requires = {'fact3', 'fact4'}
        all_fact_subsets = {'collector1': [Collector1], 'collector2': [Collector2]}

        result = resolve_requires(unresolved_requires, all_fact_subsets)

        self.assertEqual(result, {'collector1', 'collector2'})

class TestBuildDepData(unittest.TestCase):
    def test_build_dep_data(self):
        collector_names = ['collector1', 'collector2']
        all_fact_subsets = {'collector1': [Collector1], 'collector2': [Collector2]}

        result = build_dep_data(collector_names, all_fact_subsets)

        self.assertEqual(result, {'collector1': {'fact1', 'fact2'}, 'collector2': {'fact3', 'fact4'}})


if __name__ == '__main__':
    unittest.main()