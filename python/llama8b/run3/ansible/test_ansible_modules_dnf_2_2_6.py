import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, dn


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_packagename_dict(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7-1.el7.centos.x86_64.rpm')
        self.assertEqual(result, {'name': 'httpd', 'epoch': '0', 'release': '1.el7.centos', 'version': '2.4.7'})

    def test_packagename_dict_no_version(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd')
        self.assertIsNone(result)

    def test_packagename_dict_no_version_digits(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7-1.el7.centos.x86_64.rpm')
        self.assertIsNone(result)

    def test_packagename_dict_no_epoch(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7-1.el7.centos.x86_64.rpm')
        self.assertEqual(result, {'name': 'httpd', 'epoch': '0', 'release': '1.el7.centos', 'version': '2.4.7'})

    def test_packagename_dict_no_release(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7-1.x86_64.rpm')
        self.assertEqual(result, {'name': 'httpd', 'epoch': '0', 'release': '1', 'version': '2.4.7'})

    def test_packagename_dict_no_arch(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7.rpm')
        self.assertEqual(result, {'name': 'httpd', 'epoch': '0', 'release': '', 'version': '2.4.7'})

    def test_packagename_dict_invalid_package(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('invalid_package')
        self.assertIsNone(result)

    def test_packagename_dict_invalid_package_arch(self):
        dnf_module = dnf.DnfModule(AnsibleModule())
        result = dnf_module._packagename_dict('httpd-2.4.7-1.x86_64.rpm_invalid')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()