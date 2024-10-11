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
        self.assertIn('selinux', result)
        self.assertIn('status', result['selinux'])
        self.assertEqual(result['selinux']['status'], 'Missing selinux Python library')
        self.assertFalse(result['selinux_python_present'])

    def test_collect_selinux_enabled(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        result = instance.collect()
        self.assertIn('selinux', result)
        self.assertIn('status', result['selinux'])
        self.assertEqual(result['selinux']['status'], 'enabled')
        self.assertTrue(result['selinux_python_present'])

    def test_collect_selinux_disabled(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        selinux.is_selinux_enabled = lambda: False
        result = instance.collect()
        self.assertIn('selinux', result)
        self.assertIn('status', result['selinux'])
        self.assertEqual(result['selinux']['status'], 'disabled')
        self.assertTrue(result['selinux_python_present'])

    def test_collect_policyvers(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        selinux.security_policyvers = lambda: 123
        result = instance.collect()
        self.assertIn('policyvers', result['selinux'])
        self.assertEqual(result['selinux']['policyvers'], 123)

    def test_collect_config_mode(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        selinux.selinux_getenforcemode = lambda: (0, 1)
        result = instance.collect()
        self.assertIn('config_mode', result['selinux'])
        self.assertEqual(result['selinux']['config_mode'], 'enforcing')

    def test_collect_mode(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        selinux.security_getenforce = lambda: 1
        result = instance.collect()
        self.assertIn('mode', result['selinux'])
        self.assertEqual(result['selinux']['mode'], 'enforcing')

    def test_collect_type(self):
        instance = SelinuxFactCollector()
        HAVE_SELINUX = True
        selinux.selinux_getpolicytype = lambda: (0, 'targeted')
        result = instance.collect()
        self.assertIn('type', result['selinux'])
        self.assertEqual(result['selinux']['type'], 'targeted')

    def test_str_method(self):
        instance = SelinuxFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'SelinuxFactCollector')

    def test_repr_method(self):
        instance = SelinuxFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'SelinuxFactCollector()')

if __name__ == '__main__':
    unittest.main()