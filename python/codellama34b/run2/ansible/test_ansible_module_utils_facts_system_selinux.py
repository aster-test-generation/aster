import unittest
from ansible.module_utils.facts.system.selinux import *



class TestSelinuxFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = SelinuxFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('selinux_python_present', result)
        self.assertIsInstance(result['selinux_python_present'], bool)
        self.assertIn('selinux', result)
        self.assertIsInstance(result['selinux'], dict)
        self.assertIn('status', result['selinux'])
        self.assertIsInstance(result['selinux']['status'], str)
        self.assertIn('policyvers', result['selinux'])
        self.assertIsInstance(result['selinux']['policyvers'], int)
        self.assertIn('config_mode', result['selinux'])
        self.assertIsInstance(result['selinux']['config_mode'], str)
        self.assertIn('mode', result['selinux'])
        self.assertIsInstance(result['selinux']['mode'], str)
        self.assertIn('type', result['selinux'])
        self.assertIsInstance(result['selinux']['type'], str)

    def test_name(self):
        instance = SelinuxFactCollector()
        result = instance.name
        self.assertEqual(result, 'selinux')

    def test_get_fact_name(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_name()
        self.assertEqual(result, 'selinux')

    def test_get_fact_ids(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_ids()
        self.assertIsInstance(result, set)
        self.assertEqual(len(result), 0)

    def test_get_fact_type(self):
        instance = SelinuxFactCollector()
        result = instance.fact_type
        self.assertEqual(result, 'system')

    def test_get_fact_class(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_class()
        self.assertEqual(result, 'selinux')

    def test_get_fact_collector(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_collector()
        self.assertIsInstance(result, SelinuxFactCollector)

    def test_get_fact_doc(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_data()
        self.assertEqual(result, 'Returns the SELinux status')

    def test_get_fact_platforms(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_platform()
        self.assertEqual(result, ['Linux'])

    def test_get_fact_data(self):
        instance = SelinuxFactCollector()
        result = instance.collect_fact_data()
        self.assertEqual(result, {})

    def test_get_fact_data_from_facts(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_data_from_facts()
        self.assertEqual(result, {})

    def test_get_fact_data_from_gathered_facts(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_data_from_gathered_facts()
        self.assertEqual(result, {})

    def test_get_fact_data_from_gathered_facts_gather_subset(self):
        instance = SelinuxFactCollector()
        result = instance.get_fact_data_from_gathered_facts()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()