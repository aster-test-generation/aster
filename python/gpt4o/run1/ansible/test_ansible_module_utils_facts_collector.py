import unittest
from collections import defaultdict
from ansible.module_utils.facts.collector import BaseFactCollector


class TestCollectorFunctions(unittest.TestCase):

    def test_get_collector_names(self):
        result = get_collector_names(
            valid_subsets=frozenset(['a', 'b', 'c']),
            minimal_gather_subset=frozenset(['a']),
            gather_subset=['all'],
            aliases_map=defaultdict(set, {'b': {'c'}})
        )
        self.assertEqual(result, {'a', 'b', 'c'})

    def test_find_collectors_for_platform(self):
        class MockCollector:
            name = 'mock'
            @staticmethod
            def platform_match(platform_info):
                return platform_info['system'] == 'Linux'

        result = find_collectors_for_platform([MockCollector], [{'system': 'Linux'}])
        self.assertEqual(result, {MockCollector})

    def test_build_fact_id_to_collector_map(self):
        class MockCollector:
            name = 'mock'
            _fact_ids = ['fact1', 'fact2']

        result = build_fact_id_to_collector_map([MockCollector])
        self.assertEqual(result[0]['mock'], [MockCollector])
        self.assertEqual(result[0]['fact1'], [MockCollector])
        self.assertEqual(result[0]['fact2'], [MockCollector])
        self.assertEqual(result[1]['mock'], {'fact1', 'fact2'})

    def test_select_collector_classes(self):
        class MockCollector:
            pass

        result = select_collector_classes(
            ['mock'],
            {'mock': [MockCollector]}
        )
        self.assertEqual(result, [MockCollector])

    def test__get_requires_by_collector_name(self):
        class MockCollector:
            required_facts = {'fact1'}

        result = _get_requires_by_collector_name(
            'mock',
            {'mock': [MockCollector]}
        )
        self.assertEqual(result, {'fact1'})

    def test_find_unresolved_requires(self):
        class MockCollector:
            required_facts = {'fact1'}

        result = find_unresolved_requires(
            {'mock'},
            {'mock': [MockCollector]}
        )
        self.assertEqual(result, {'fact1'})

    def test_resolve_requires(self):
        result = resolve_requires(
            {'fact1'},
            {'fact1': []}
        )
        self.assertEqual(result, {'fact1'})

    def test_build_dep_data(self):
        class MockCollector:
            required_facts = {'fact1'}

        result = build_dep_data(
            {'mock'},
            {'mock': [MockCollector]}
        )
        self.assertEqual(result, {'mock': {'fact1'}})

    def test_tsort(self):
        dep_map = {
            'a': {'b'},
            'b': set()
        }
        result = tsort(dep_map)
        self.assertEqual(result, [('b', set()), ('a', {'b'})])

    def test__solve_deps(self):
        class MockCollector:
            required_facts = {'fact1'}

        result = _solve_deps(
            {'mock'},
            {'mock': [MockCollector], 'fact1': []}
        )
        self.assertEqual(result, {'mock', 'fact1'})

    def test_collector_classes_from_gather_subset(self):
        class MockCollector:
            name = 'mock'
            _fact_ids = ['fact1', 'fact2']
            required_facts = set()
            @staticmethod
            def platform_match(platform_info):
                return platform_info['system'] == 'Linux'

        result = collector_classes_from_gather_subset(
            all_collector_classes=[MockCollector],
            valid_subsets=frozenset(['mock']),
            minimal_gather_subset=frozenset(['mock']),
            gather_subset=['all'],
            platform_info={'system': 'Linux'}
        )
        self.assertEqual(result, [MockCollector])

if __name__ == '__main__':
    unittest.main()