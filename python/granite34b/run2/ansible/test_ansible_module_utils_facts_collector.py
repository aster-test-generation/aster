import unittest
from ansible.module_utils.facts.collector import BaseFactCollector, get_collector_names, find_collectors_for_platform, build_fact_id_to_collector_map, select_collector_classes, _get_requires_by_collector_name, find_unresolved_requires, resolve_requires, build_dep_data, tsort, _solve_deps, collector_classes_from_gather_subset


class TestGetCollectorNames(unittest.TestCase):
    def test_get_collector_names(self):
        valid_subsets = frozenset(['subset1', 'subset2', 'subset3'])
        minimal_gather_subset = frozenset(['min1', 'min2'])
        gather_subset = ['subset1', 'subset2', 'min1']
        aliases_map = defaultdict(set)
        platform_info = {'system': 'Windows'}
        result = get_collector_names(valid_subsets=valid_subsets, minimal_gather_subset=minimal_gather_subset, gather_subset=gather_subset, aliases_map=aliases_map, platform_info=platform_info)
        expected = ['subset1', 'subset2', 'min1', 'min2']
        self.assertEqual(result, expected)

class TestFindCollectorsForPlatform(unittest.TestCase):
    def test_find_collectors_for_platform(self):
        all_collector_classes = [Collector1, Collector2, Collector3]
        compat_platforms = [{'system': 'Windows'}, {'system': 'Linux'}]
        result = find_collectors_for_platform(all_collector_classes, compat_platforms)
        expected = {Collector1, Collector2}
        self.assertEqual(result, expected)

class TestBuildFactIdToCollectorMap(unittest.TestCase):
    def test_build_fact_id_to_collector_map(self):
        collectors_for_platform = [Collector1, Collector2, Collector3]
        result, aliases_map = build_fact_id_to_collector_map(collectors_for_platform)
        expected = {
            'collector1': [Collector1],
            'collector2': [Collector2],
            'collector3': [Collector3]
        }
        self.assertEqual(result, expected)

class TestSelectCollectorClasses(unittest.TestCase):
    def test_select_collector_classes(self):
        collector_names = ['collector1', 'collector2', 'collector3']
        all_fact_subsets = {
            'collector1': [Collector1],
            'collector2': [Collector2],
            'collector3': [Collector3]
        }
        result = select_collector_classes(collector_names, all_fact_subsets)
        expected = [Collector1, Collector2, Collector3]
        self.assertEqual(result, expected)

class TestGetRequiresByCollectorName(unittest.TestCase):
    def test_get_requires_by_collector_name(self):
        collector_name = 'collector1'
        all_fact_subsets = {
            'collector1': [Collector1],
            'collector2': [Collector2],
            'collector3': [Collector3]
        }
        result = _get_requires_by_collector_name(collector_name, all_fact_subsets)
        expected = {'fact1', 'fact2'}
        self.assertEqual(result, expected)

class TestFindUnresolvedRequires(unittest.TestCase):
    def test_find_unresolved_requires(self):
        collector_names = ['collector1', 'collector2', 'collector3']
        all_fact_subsets = {
            'collector1': [Collector1],
            'collector2': [Collector2],
            'collector3': [Collector3]
        }
        result = find_unresolved_requires(collector_names, all_fact_subsets)
        expected = {'fact1', 'fact2'}
        self.assertEqual(result, expected)

class TestResolveRequires(unittest.TestCase):
    def test_resolve_requires(self):
        unresolved_requires = {'fact1', 'fact2'}
        all_fact_subsets = {
            'collector1': [Collector1],
            'collector2': [Collector2],
            'collector3': [Collector3]
        }
        result = resolve_requires(unresolved_requires, all_fact_subsets)
        expected = {'collector1', 'collector2'}
        self.assertEqual(result, expected)


if __name__ == '__main__':
    unittest.main()