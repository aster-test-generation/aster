import unittest
from ansible.module_utils.facts import collecto


class TestGetCollectorNames(unittest.TestCase):
    def test_get_collector_names(self):
        result = get_collector_names(valid_subsets=['a', 'b'], minimal_gather_subset=['c'], gather_subset=['all'], aliases_map=defaultdict(set), platform_info={'system': 'Linux'})
        self.assertEqual(result, {'a', 'b', 'c'})

class TestFindCollectorsForPlatform(unittest.TestCase):
    def test_find_collectors_for_platform(self):
        all_collector_classes = [CollectorClass1, CollectorClass2]
        compat_platforms = [{'system': 'Linux'}, {'system': 'Generic'}]
        result = find_collectors_for_platform(all_collector_classes, compat_platforms)
        self.assertEqual(result, {CollectorClass1, CollectorClass2})

class TestBuildFactIdToCollectorMap(unittest.TestCase):
    def test_build_fact_id_to_collector_map(self):
        collectors_for_platform = [CollectorClass1, CollectorClass2]
        result = build_fact_id_to_collector_map(collectors_for_platform)
        self.assertIsInstance(result, tuple)
        self.assertIsInstance(result[0], defaultdict)
        self.assertIsInstance(result[1], defaultdict)

class TestSelectCollectorClasses(unittest.TestCase):
    def test_select_collector_classes(self):
        collector_names = ['a', 'b']
        all_fact_subsets = {'a': [CollectorClass1], 'b': [CollectorClass2]}
        result = select_collector_classes(collector_names, all_fact_subsets)
        self.assertEqual(result, [CollectorClass1, CollectorClass2])

class TestGetRequiresByCollectorName(unittest.TestCase):
    def test_get_requires_by_collector_name(self):
        collector_name = 'a'
        all_fact_subsets = {'a': [CollectorClass1]}
        result = _get_requires_by_collector_name(collector_name, all_fact_subsets)
        self.assertEqual(result, {'required_fact'})

class TestFindUnresolvedRequires(unittest.TestCase):
    def test_find_unresolved_requires(self):
        collector_names = ['a', 'b']
        all_fact_subsets = {'a': [CollectorClass1], 'b': [CollectorClass2]}
        result = find_unresolved_requires(collector_names, all_fact_subsets)
        self.assertEqual(result, {'unresolved_fact'})

class TestResolveRequires(unittest.TestCase):
    def test_resolve_requires(self):
        unresolved_requires = ['a', 'b']
        all_fact_subsets = {'a': [CollectorClass1], 'b': [CollectorClass2]}
        result = resolve_requires(unresolved_requires, all_fact_subsets)
        self.assertEqual(result, {'a', 'b'})

class TestBuildDepData(unittest.TestCase):
    def test_build_dep_data(self):
        collector_names = ['a', 'b']
        all_fact_subsets = {'a': [CollectorClass1], 'b': [CollectorClass2]}
        result = build_dep_data(collector_names, all_fact_subsets)
        self.assertIsInstance(result, defaultdict)

class TestTSort(unittest.TestCase):
    def test_tsort(self):
        dep_map = {'a': {'b'}, 'b': {'c'}, 'c': set()}
        result = tsort(dep_map)
        self.assertEqual(result, [('c', set()), ('b', {'c'}), ('a', {'b'})])

class TestSolveDeps(unittest.TestCase):
    def test_solve_deps(self):
        collector_names = ['a', 'b']
        all_fact_subsets = {'a': [CollectorClass1], 'b': [CollectorClass2]}
        result = _solve_deps(collector_names, all_fact_subsets)
        self.assertEqual(result, {'a', 'b'})

class TestCollectorClassesFromGatherSubset(unittest.TestCase):
    def test_collector_classes_from_gather_subset(self):
        all_collector_classes = [CollectorClass1, CollectorClass2]
        result = collector_classes_from_gather_subset(all_collector_classes=all_collector_classes, valid_subsets=['a', 'b'], minimal_gather_subset=['c'], gather_subset=['all'], gather_timeout=10, platform_info={'system': 'Linux'})
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()