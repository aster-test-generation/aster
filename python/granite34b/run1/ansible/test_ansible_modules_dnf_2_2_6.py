import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_split_package_arch(self):
        instance = DnfModule(AnsibleModule)
        packagename = 'httpd'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('httpd', None))

    def test_split_package_arch_with_arch(self):
        instance = DnfModule(AnsibleModule)
        packagename = 'httpd.x86_64'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('httpd', 'x86_64'))

    def test_split_package_arch_with_epoch(self):
        instance = DnfModule(AnsibleModule)
        packagename = '1:httpd.x86_64'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('1:httpd', 'x86_64'))

    def test_split_package_arch_with_epoch_and_release(self):
        instance = DnfModule(AnsibleModule)
        packagename = '1:httpd.x86_64-1.0-1'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('1:httpd-1.0-1', 'x86_64'))

    def test_split_package_arch_with_epoch_release_and_arch(self):
        instance = DnfModule(AnsibleModule)
        packagename = '1:httpd.x86_64-1.0-1.el7'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('1:httpd-1.0-1.el7', 'x86_64'))

    def test_split_package_arch_with_epoch_release_arch_and_epoch(self):
        instance = DnfModule(AnsibleModule)
        packagename = '1:httpd.x86_64-1.0-1.el7-1'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('1:httpd-1.0-1.el7-1', 'x86_64'))

    def test_split_package_arch_with_epoch_release_arch_epoch_and_release(self):
        instance = DnfModule(AnsibleModule)
        packagename = '1:httpd.x86_64-1.0-1.el7-1-1'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('1:httpd-1.0-1.el7-1-1', 'x86_64'))

    def test_split_package_arch_with_epoch_release_arch_epoch_release_and_arch(self):
        instance = DnfModule(AnsibleModule)
        packagename = '1:httpd.x86_64-1.0-1.el7-1-1.el7'
        result = instance._split_package_arch(packagename)
        self.assertEqual(result, ('1:httpd-1.0-1.el7-1-1.el7', 'x86_64'))

if __name__ == '__main__':
    unittest.main()