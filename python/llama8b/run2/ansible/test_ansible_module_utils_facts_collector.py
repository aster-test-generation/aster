import unittest
from ansible.module_utils.facts.collector import *


class TestCollector(unittest.TestCase):
    def test_get_collector_names(self):
        collector_names = get_collector_names(valid_subsets=frozenset(), minimal_gather_subset=frozenset(), gather_subset=['all'], aliases_map=defaultdict(set), platform_info={'system': 'Generic'})
        self.assertEqual(collector_names, {'all'})

    def test_get_collector_names_minimal_gather_subset(self):
        collector_names = get_collector_names(valid_subsets=frozenset(), minimal_gather_subset=frozenset({'min'}), gather_subset=['all'], aliases_map=defaultdict(set), platform_info={'system': 'Generic'})
        self.assertEqual(collector_names, {'min', 'all'})

    def test_get_collector_names_exclude_subset(self):
        collector_names = get_collector_names(valid_subsets=frozenset({'a', 'b', 'c'}), minimal_gather_subset=frozenset({'a', 'b'}), gather_subset=['!a', 'c'], aliases_map=defaultdict(set), platform_info={'system': 'Generic'})
        self.assertEqual(collector_names, {'c'})

    def test_find_collectors_for_platform(self):
        all_collector_classes = [CollectorClass1(), CollectorClass2()]
        collectors_for_platform = find_collectors_for_platform(all_collector_classes, [platform_info, {'system': 'Generic'}])
        self.assertEqual(len(collectors_for_platform), 2)

    def test_build_fact_id_to_collector_map(self):
        collectors_for_platform = [CollectorClass1(), CollectorClass2()]
        fact_id_to_collector_map, aliases_map = build_fact_id_to_collector_map(collectors_for_platform)
        self.assertEqual(len(fact_id_to_collector_map), 2)

    def test_select_collector_classes(self):
        collector_classes = [CollectorClass1(), CollectorClass2()]
        selected_collector_classes = select_collector_classes(['a', 'b'], {k: [collector_classes[0], collector_classes[1]] for k in ['a', 'b']})
        self.assertEqual(len(selected_collector_classes), 2)

    def test_get_requires_by_collector_name(self):
        collector_name = 'a'
        all_fact_subsets = {collector_name: [CollectorClass1(), CollectorClass2()]}
        required_facts = _get_requires_by_collector_name(collector_name, all_fact_subsets)
        self.assertEqual(required_facts, set())

    def test_find_unresolved_requires(self):
        collector_names = ['a', 'b']
        all_fact_subsets = {k: [CollectorClass1(), CollectorClass2()] for k in ['a', 'b']}
        unresolved_requires = find_unresolved_requires(collector_names, all_fact_subsets)
        self.assertEqual(unresolved_requires, set())

    def test_resolve_requires(self):
        unresolved_requires = ['a', 'b']
        all_fact_subsets = {k: [CollectorClass1(), CollectorClass2()] for k in ['a', 'b']}
        new_names = resolve_requires(unresolved_requires, all_fact_subsets)
        self.assertEqual(new_names, set())

    def test_build_dep_data(self):
        collector_names = ['a', 'b']
        all_fact_subsets = {k: [CollectorClass1(), CollectorClass2()] for k in ['a', 'b']}
        dep_map = build_dep_data(collector_names, all_fact_subsets)
        self.assertEqual(len(dep_map), 2)

    def test_tsort(self):
        dep_map = defaultdict(set)
        dep_map['a'].add('b')
        dep_map['b'].add('c')
        dep_map['c'].add('d')
        dep_map['d'].add('e')
        dep_map['e'].add('f')
        dep_map['f'].add('g')
        dep_map['g'].add('h')
        dep_map['h'].add('i')
        dep_map['i'].add('j')
        dep_map['j'].add('k')
        dep_map['k'].add('l')
        dep_map['l'].add('m')
        dep_map['m'].add('n')
        dep_map['n'].add('o')
        dep_map['o'].add('p')
        dep_map['p'].add('q')
        dep_map['q'].add('r')
        dep_map['r'].add('s')
        dep_map['s'].add('t')
        dep_map['t'].add('u')
        dep_map['u'].add('v')
        dep_map['v'].add('w')
        dep_map['w'].add('x')
        dep_map['x'].add('y')
        dep_map['y'].add('z')
        ordered_deps = tsort(dep_map)
        self.assertEqual(len(ordered_deps), 26)

if __name__ == '__main__':
    unittest.main()