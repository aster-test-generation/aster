import unittest
from ansible.module_utils.facts.collector import *


class TestCollector(unittest.TestCase):
    def test_get_collector_names(self):
        collector_names = get_collector_names(valid_subsets=frozenset(), minimal_gather_subset=frozenset(), gather_subset=['all'], aliases_map=defaultdict(set), platform_info={'system': 'Generic'})
        self.assertEqual(collector_names, {'all'})

    def test_get_collector_names_with_subset(self):
        collector_names = get_collector_names(valid_subsets=frozenset(['a', 'b']), minimal_gather_subset=frozenset(), gather_subset=['a', 'b'], aliases_map=defaultdict(set), platform_info={'system': 'Generic'})
        self.assertEqual(collector_names, {'a', 'b'})

    def test_get_collector_names_with_exclude_subset(self):
        collector_names = get_collector_names(valid_subsets=frozenset(['a', 'b']), minimal_gather_subset=frozenset(), gather_subset=['!a'], aliases_map=defaultdict(set), platform_info={'system': 'Generic'})
        self.assertEqual(collector_names, set())

    def test_find_collectors_for_platform(self):
        collectors_for_platform = find_collectors_for_platform([CollectorClass1(), CollectorClass2()], [{'system': 'Generic'}])
        self.assertEqual(len(collectors_for_platform), 2)

    def test_build_fact_id_to_collector_map(self):
        fact_id_to_collector_map, aliases_map = build_fact_id_to_collector_map([CollectorClass1(), CollectorClass2()])
        self.assertEqual(len(fact_id_to_collector_map), 2)

    def test_select_collector_classes(self):
        collector_classes = select_collector_classes(['a', 'b'], {'a': [CollectorClass1()], 'b': [CollectorClass2()]})
        self.assertEqual(len(collector_classes), 2)

    def test_get_requires_by_collector_name(self):
        required_facts = _get_requires_by_collector_name('a', {'a': [CollectorClass1()]})
        self.assertEqual(required_facts, set())

    def test_find_unresolved_requires(self):
        unresolved_requires = find_unresolved_requires(['a', 'b'], {'a': [CollectorClass1()], 'b': [CollectorClass2()]})
        self.assertEqual(unresolved_requires, set())

    def test_resolve_requires(self):
        new_names = resolve_requires(['a', 'b'], {'a': [CollectorClass1()], 'b': [CollectorClass2()]})
        self.assertEqual(new_names, set())

    def test_build_dep_data(self):
        dep_map = build_dep_data(['a', 'b'], {'a': [CollectorClass1()], 'b': [CollectorClass2()]})
        self.assertEqual(dep_map, {'a': set(), 'b': set()})

    def test_tsort(self):
        dep_map = {'a': set(['b']), 'b': set()}
        sorted_list = tsort(dep_map)
        self.assertEqual(sorted_list, [('a', {'b'}), ('b', set())])

    def test_solve_deps(self):
        collector_names = ['a', 'b']
        solutions = _solve_deps(collector_names, {'a': [CollectorClass1()], 'b': [CollectorClass2()]})
        self.assertEqual(solutions, set())

    def test_collector_classes_from_gather_subset(self):
        collector_classes = collector_classes_from_gather_subset(all_collector_classes=[CollectorClass1(), CollectorClass2()], valid_subsets=frozenset(), minimal_gather_subset=frozenset(), gather_subset=['all'], platform_info={'system': 'Generic'})
        self.assertEqual(len(collector_classes), 2)

if __name__ == '__main__':
    unittest.main()