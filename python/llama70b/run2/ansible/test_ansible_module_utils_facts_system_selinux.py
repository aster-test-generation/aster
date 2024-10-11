from ansible.module_utils.facts.system.selinux import selinux
import unittest
from ansible.module_utils.facts.system.selinux import SelinuxFactCollector, HAVE_SELINUX, SELINUX_MODE_DICT


class TestSelinuxFactCollector(unittest.TestCase):
    def test_init(self):
        instance = SelinuxFactCollector()
        self.assertIsInstance(instance, SelinuxFactCollector)

    def test_name(self):
        instance = SelinuxFactCollector()
        self.assertEqual(instance.name, 'selinux')

    def test_fact_ids(self):
        instance = SelinuxFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_collect_no_selinux(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = False
        result = instance.collect()
        self.assertEqual(result['selinux']['status'], 'Missing selinux Python library')
        self.assertFalse(result['selinux_python_present'])

    def test_collect_selinux_enabled(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        result = instance.collect()
        self.assertTrue(result['selinux_python_present'])
        self.assertEqual(result['selinux']['status'], 'enabled')
        self.assertIn('policyvers', result['selinux'])
        self.assertIn('config_mode', result['selinux'])
        self.assertIn('mode', result['selinux'])
        self.assertIn('type', result['selinux'])

    def test_collect_selinux_disabled(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        selinux.is_selinux_enabled = lambda: False
        result = instance.collect()
        self.assertTrue(result['selinux_python_present'])
        self.assertEqual(result['selinux']['status'], 'disabled')

    def test_str_method(self):
        instance = SelinuxFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'SelinuxFactCollector')

    def test_repr_method(self):
        instance = SelinuxFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'SelinuxFactCollector()')

    def test_eq_method(self):
        instance1 = SelinuxFactCollector()
        instance2 = SelinuxFactCollector()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()