import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = DnfModule({'name': 'httpd', 'state': 'present'})

    def test_init(self):
        self.assertIsInstance(self.module, DnfModule)
        self.assertIsInstance(self.module, YumDnf)

    def test__ensure_dnf(self):
        self.module._ensure_dnf()
        self.assertIsNotNone(self.module.base)

    def test_list_items_installed(self):
        self.module.list_items('installed')
        self.module.exit_json.assert_called_once_with(msg='', results=[])

    def test_list_items_upgrades(self):
        self.module.list_items('upgrades')
        self.module.exit_json.assert_called_once_with(msg='', results=[])

    def test_list_items_available(self):
        self.module.list_items('available')
        self.module.exit_json.assert_called_once_with(msg='', results=[])

    def test_list_items_repos(self):
        self.module.list_items('repos')
        self.module.exit_json.assert_called_once_with(msg='', results=[])

    def test_list_items_package(self):
        self.module.list_items('httpd')
        self.module.exit_json.assert_called_once_with(msg='', results=[])

    def test__package_dict(self):
        package = self.module.base.sack.query().installed()[0]
        result = self.module._package_dict(package)
        self.assertIsInstance(result, dict)

    def test_lockfile(self):
        self.assertEqual(self.module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        self.assertEqual(self.module.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        self.assertIsInstance(self.module.with_modules, bool)

    def test_allowerasing(self):
        self.assertEqual(self.module.allowerasing, self.module.params['allowerasing'])

    def test_nobest(self):
        self.assertEqual(self.module.nobest, self.module.params['nobest'])

    def test___str__(self):
        self.assertEqual(str(self.module), 'DnfModule')

    def test___repr__(self):
        self.assertEqual(repr(self.module), 'DnfModule(module={...})')

    def test___eq__(self):
        other = DnfModule({'name': 'httpd', 'state': 'present'})
        self.assertEqual(self.module, other)

if __name__ == '__main__':
    unittest.main()