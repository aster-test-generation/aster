import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test__ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'base'))

    def test_list_items_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module.base.sack.query().installed.return_value = ['package1', 'package2']
        result = dnf_module.list_items('installed')
        self.assertEqual(result, [{'name': 'package1', 'state': 'installed'}, {'name': 'package2', 'state': 'installed'}])

    def test_list_items_updates(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module.base.sack.query().upgrades.return_value = ['package1', 'package2']
        result = dnf_module.list_items('updates')
        self.assertEqual(result, [{'name': 'package1', 'state': 'upgradable'}, {'name': 'package2', 'state': 'upgradable'}])

    def test_list_items_repos(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module.base.repos.iter_enabled.return_value = [{'id': 'repo1', 'enabled': True}, {'id': 'repo2', 'enabled': True}]
        result = dnf_module.list_items('repos')
        self.assertEqual(result, [{'repoid': 'repo1', 'state': 'enabled'}, {'repoid': 'repo2', 'state': 'enabled'}])

    def test_list_items_package(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module.base.sack.query().get_best_query.return_value = ['package1', 'package2']
        result = dnf_module.list_items('package')
        self.assertEqual(result, [{'name': 'package1', 'state': 'available'}, {'name': 'package2', 'state': 'available'}])

    def test__package_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        package = {'name': 'package1', 'version': '1.0', 'arch': 'x86_64'}
        result = dnf_module._package_dict(package)
        self.assertEqual(result, {'name': 'package1', 'version': '1.0', 'arch': 'x86_64'})

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule()')

if __name__ == '__main__':
    unittest.main()