import unittest
from ansible.module_utils.facts.collector import get_collector_names, find_collectors_for_platform, build_fact_id_to_collector_map, select_collector_classes, _get_requires_by_collector_name, find_unresolved_requires, resolve_requires, build_dep_data, tsort, collector_classes_from_gather_subset


class TestGetCollectorNames(unittest.TestCase):
    def test_get_collector_names(self):
        valid_subsets = {'subset1', 'subset2'}
        minimal_gather_subset = {'subset1'}
        gather_subset = ['subset1', 'subset2']
        aliases_map = defaultdict(set)
        aliases_map['subset1'].add('alias1')
        aliases_map['subset2'].add('alias2')
        result = get_collector_names(valid_subsets, minimal_gather_subset, gather_subset, aliases_map)
        self.assertEqual(result, {'subset1', 'subset2', 'alias1', 'alias2'})

class TestFindCollectorsForPlatform(unittest.TestCase):
    def test_find_collectors_for_platform(self):
        all_collector_classes = [CollectorClass1, CollectorClass2]
        compat_platforms = [{'system': 'Linux'}, {'system': 'Windows'}]
        result = find_collectors_for_platform(all_collector_classes, compat_platforms)
        self.assertEqual(result, [CollectorClass1])

class TestBuildFactIdToCollectorMap(unittest.TestCase):
    def test_build_fact_id_to_collector_map(self):
        all_collector_classes = [CollectorClass1, CollectorClass2]
        collectors_for_platform = [CollectorClass1]
        result = build_fact_id_to_collector_map(collectors_for_platform)
        self.assertEqual(result, {'collector1': [CollectorClass1], 'collector2': [CollectorClass2]})

class TestSelectCollectorClasses(unittest.TestCase):
    def test_select_collector_classes(self):
        collector_names = {'collector1'}
        all_fact_subsets = {'collector1': [CollectorClass1]}
        result = select_collector_classes(collector_names, all_fact_subsets)
        self.assertEqual(result, [CollectorClass1])

class TestGetRequiresByCollectorName(unittest.TestCase):
    def test_get_requires_by_collector_name(self):
        collector_name = 'collector1'
        all_fact_subsets = {'collector1': [CollectorClass1]}
        result = _get_requires_by_collector_name(collector_name, all_fact_subsets)
        self.assertEqual(result, {'fact1', 'fact2'})

class TestFindUnresolvedRequires(unittest.TestCase):
    def test_find_unresolved_requires(self):
        collector_names = {'collector1'}
        all_fact_subsets = {'collector1': [CollectorClass1]}
        result = find_unresolved_requires(collector_names, all_fact_subsets)
        self.assertEqual(result, {'fact1', 'fact2'})

class TestResolveRequires(unittest.TestCase):
    def test_resolve_requires(self):
        unresolved_requires = {'fact1', 'fact2'}
        all_fact_subsets = {'collector1': [CollectorClass1]}
        result = resolve_requires(unresolved_requires, all_fact_subsets)
        self.assertEqual(result, {'collector1'})

class TestBuildDepData(unittest.TestCase):
    def test_build_dep_data(self):
        collector_names = {'collector1'}
        all_fact_subsets = {'collector1': [CollectorClass1]}
        result = build_dep_data(collector_names, all_fact_subsets)
        self.assertEqual(result, {'collector1': {'fact1', 'fact2'}})

class TestTsort(unittest.TestCase):
    def test_tsort(self):
        dep_map = {'collector1': {'fact1'}, 'collector2': {'fact2'}}
        result = tsort(dep_map)
        self.assertEqual(result, [('collector1', {'fact1'}), ('collector2', {'fact2'})])


if __name__ == '__main__':
    unittest.main()